package org.ks.util;

import com.jcraft.jsch.*;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.yz.ZA.util.DateUtil;
import org.apache.log4j.Logger;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class SFTPUtils {

	private static Logger log = Logger.getLogger(SFTPUtils.class.getName());
	private  String host;//服务器连接ip
    private  String username;//用户名
    private  String password;//密码
    private  int port = 22;//端口号
    private static  ChannelSftp sftp = null;
    private  Session sshSession = null; 
    
    public SFTPUtils(){}
    
    public SFTPUtils(String host, int port, String username, String password) 
    { 
        this.host = host; 
        this.username = username; 
        this.password = password; 
        this.port = port; 
    }
    
    public static void main(String[] args) {
    	SFTPUtils sftp = null;
    	try {
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
    		String htmc = "C00190227001001";// 合同名称
    		String date = DateUtil.getCurrentDate()+DateUtil.getCurrentTime();
    		System.out.println(date);
    		String dirPath = "data1/hplftp/qhxb/upload/C01190227001001/"+date;// ftp文件存放路径
//    		sftp = new SFTPUtils("192.168.1.19",22,"test", "test_2019");//cqdb/cqdbzaq1!@
    		sftp = new SFTPUtils("103.28.213.146",22,"cqdb", "cqdbzaq1!@");//
            boolean connect = sftp.connect();
            log.info("sftp登录:"+connect);
            //上传 测试
            String FileName = "测试11.pdf";
//            uploadFile("/"+dirPath+"/", new String(FileName.getBytes("gbk"),"ISO-8859-1"), "D://upload//20190124//1c737e01-e6b6-4e74-9166-8905df6aaf62.pdf");
//            //下载 测试
            String directory="/upload/ipload/"+df.format(new Date())+"/";


            String templatePath = "E:/file/voluntarilytemplate/";
            if("L".equals(Constant.osName())){
                templatePath="root/local/file/voluntarilytemplate/";
            }
            templatePath+=df.format(new Date());
            List<String> list = SFTPUtils.batchDownLoadFile(directory, templatePath);


//            List<String> list = batchDownLoadFile(directory, "Z:\\work_file\\sgxz"+"\\"+df.format(new Date()));
            for (int i = 0; i < list.size(); i++) {
            	System.out.println(list.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally 
        { 
            sftp.disconnect(); 
        } 
	}
    
    /**
     * 通过SFTP连接服务器
     */ 
    public boolean connect() 
    { 
    	boolean falg = true;
        try 
        { 
            JSch jsch = new JSch(); 
            jsch.getSession(username, host, port); 
            sshSession = jsch.getSession(username, host, port); 
            if (log.isInfoEnabled()) 
            { 
                log.info("Session created."); 
            } 
            sshSession.setPassword(password); 
            Properties sshConfig = new Properties(); 
            sshConfig.put("StrictHostKeyChecking", "no"); 
            sshSession.setConfig(sshConfig); 
            sshSession.connect(); 
            if (log.isInfoEnabled()) 
            { 
                log.info("Session connected."); 
            } 
            Channel channel = sshSession.openChannel("sftp"); 
            channel.connect(); 
            if (log.isInfoEnabled()) 
            { 
                log.info("Opening Channel."); 
            } 
            sftp = (ChannelSftp) channel; 
            if (log.isInfoEnabled()) 
            { 
                log.info("Connected to " + host + "."); 
            } 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
            falg = false;
        } 
        return falg;
    } 
    
    
    /**
     * 关闭连接
     */ 
    @SuppressWarnings("static-access")
	public void disconnect() 
    { 
        if (this.sftp != null) 
        { 
            if (this.sftp.isConnected()) 
            { 
                this.sftp.disconnect(); 
                if (log.isInfoEnabled()) 
                { 
                    log.info("sftp is closed already"); 
                } 
            } 
        } 
        if (this.sshSession != null) 
        { 
            if (this.sshSession.isConnected()) 
            { 
                this.sshSession.disconnect(); 
                if (log.isInfoEnabled()) 
                { 
                    log.info("sshSession is closed already"); 
                } 
            } 
        } 
    } 
    
    
    /**
     * 列出目录下的文件
     * 
     * @param directory：要列出的目录
     * @param sftp
     * @return
     * @throws SftpException
     */
    public static Vector listFiles(String directory) throws SftpException
    {
      return sftp.ls(directory);
    }
    
    /**
     * 批量下载文件
     * @param remotePath：远程下载目录(以路径符号结束/assess/sftp/jiesuan_2/2014/)
     * @param localPath：本地保存目录(以路径符号结束,D:\Duansha\sftp\)
     * @return
     * @throws UnsupportedEncodingException 
     */
    public static List<String> batchDownLoadFile(String remotePath, String localPath) throws UnsupportedEncodingException
    {
      List<String> filenames = new ArrayList<String>();
      try
      {
        Vector v = listFiles(remotePath);
        if (v.size() > 0)
        {
          log.info("本次处理文件个数不为零,开始下载...fileSize=" + v.size());
          Iterator it = v.iterator();
          while (it.hasNext())
          {
            LsEntry entry = (LsEntry) it.next();
            String filename = entry.getFilename();
            SftpATTRS attrs = entry.getAttrs();
            if (!attrs.isDir())
            {
              boolean flag = false;
              String localFileName = localPath + filename;
              flag = downloadFile(remotePath, filename,localPath, filename);
              if (flag)
              {
                filenames.add(localFileName);
              }
            }
          }
        }
        if (log.isInfoEnabled())
        {
          log.info("download file is success:remotePath=" + remotePath
              + "and localPath=" + localPath + ",file size is"
              + v.size());
        }
      }
      catch (SftpException e)
      {
        e.printStackTrace();
      }
      return filenames;
    } 


    /**
     * 下载单个文件
     * @param remotPath：远程下载目录(以路径符号结束)
     * @param remoteFileName：下载文件名
     * @param localPath：本地保存目录(以路径符号结束)
     * @param localFileName：保存文件名
     * @return
     * @throws IOException 
     */
    public static boolean downloadFile(String remotePath, String remoteFileName,String localPath, String localFileName)
    {
      FileOutputStream fieloutput = null;
      try
      {
        File file = new File(localPath);
        if(!file.exists()){
        	file.mkdirs();
        }
        fieloutput = new FileOutputStream(file+"//"+localFileName);
        sftp.get(remotePath + remoteFileName, fieloutput);
        if (log.isInfoEnabled())
        {
          log.info("===DownloadFile:" + remoteFileName + " success from sftp.");
        }
        return true;
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
      finally
      {
        if (null != fieloutput)
        {
          try
          {
            fieloutput.close();
          }
          catch (IOException e)
          {
            e.printStackTrace();
          }
        }
      }
      return false;
    }
    
    
    /**
     * 删除本地文件
     * @param filePath
     * @return
     */
    public static boolean deleteFile(String filePath)
    {
      File file = new File(filePath);
      if (!file.exists())
      {
        return false;
      }
   
      if (!file.isFile())
      {
        return false;
      }
      boolean rs = file.delete();
      if (rs && log.isInfoEnabled())
      {
        log.info("delete file success from local.");
      }
      return rs;
    }
    
    private static String JSSFTPURL = "E:/JS_File_SFTP";
    public static void addByFile(String date) {
    	String qdbh = "";// 渠道编号
    	date = DateUtil.getCurrentDate();
		String filePath = JSSFTPURL+"/"+date;
		File file = new File(filePath);
		if(!file.exists()) {
			file.mkdirs();
		}
		//文件列表
		List<String> fileList = new ArrayList<String>();
		fileList = readAllFile(filePath,fileList);
		for (int i = 0; i < fileList.size(); i++) {
			File f = new File(fileList.get(i));
			System.out.println(f);
		}
	}
    
	/**
	 * 读取目录下的所有文件
	 * @param filepath
	 * @return 返回文件列表
	 */
	public static List<String> readAllFile(String filepath,List<String> listname) {
        File file= new File(filepath);  
        if(!file.isDirectory()){  
            listname.add(file.getPath());  
        }else if(file.isDirectory()){  
            String[] filelist=file.list();  
            for(int i = 0;i<filelist.length;i++){  
                File readfile = new File(filepath);  
                if (!readfile.isDirectory()) {  
                    listname.add(file.getPath());  
                } else if (readfile.isDirectory()) {  
                    readAllFile(filepath + "\\" + filelist[i],listname);//递归  
                }  
            }  
        }  
        return listname;
    }
	
    /**
     * 上传单个文件
     * @param remotePath：sftp保存目录
     * @param remoteFileName：保存文件名
     * @param localPath：本地上传目录(文件全路径)
     * @return
     */ 
    public static boolean uploadFile(String remotePath, String remoteFileName,String localPath) 
    { 
        FileInputStream in = null; 
        try 
        { 
//        	 反射修改server_version的默认值
//        	Field f = sftp.getClass().getDeclaredField("server_version");
//        	f.setAccessible(true);
//        	f.set(sftp, 2);
//        	 判断sftp目录是否存在,不存在则创建
        	boolean Dir = createDir(remotePath);
        	log.info("创建目录:"+Dir);
            // 设置编码
//            sftp.setFilenameEncoding("gbk");
            File file = new File(localPath); 
            in = new FileInputStream(file); 
            String str= new String(remoteFileName);
            sftp.put(in, str);
            return true; 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        finally 
        { 
            if (in != null) 
            { 
                try 
                { 
                    in.close(); 
                } 
                catch (IOException e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        } 
        return false; 
    }
    
    
    /**
     * 创建目录
     * @param createpath
     * @return
     */ 
    public static boolean createDir(String createpath) 
    { 
        try 
        { 
            if (isDirExist(createpath)) 
            { 
                sftp.cd(createpath); 
                return true; 
            } 
            String pathArry[] = createpath.split("/"); 
            StringBuffer filePath = new StringBuffer("/"); 
            for (String path : pathArry) 
            { 
                if (path.equals("")) 
                { 
                    continue; 
                } 
                filePath.append(path + "/"); 
                if (isDirExist(filePath.toString())) 
                { 
                    sftp.cd(filePath.toString()); 
                } 
                else 
                { 
                    // 建立目录 
                    sftp.mkdir(filePath.toString());
                    // 进入并设置为当前目录 
                    sftp.cd(filePath.toString()); 
                } 
            } 
            sftp.cd(createpath); 
            return true; 
        } 
        catch (SftpException e) 
        { 
            e.printStackTrace(); 
        } 
        return false; 
    }
    
    /**
     * 判断目录是否存在
     * @param directory
     * @return
     */ 
    public static boolean isDirExist(String directory) 
    { 
        boolean isDirExistFlag = false; 
        try 
        { 
            SftpATTRS sftpATTRS = sftp.lstat(directory); 
            isDirExistFlag = true; 
            return sftpATTRS.isDir(); 
        } 
        catch (Exception e) 
        { 
            if (e.getMessage().toLowerCase().equals("no such file")) 
            { 
                isDirExistFlag = false; 
            } 
        } 
        return isDirExistFlag; 
    } 
}
