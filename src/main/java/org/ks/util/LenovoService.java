package org.ks.util;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lenovo.css.boxsdk.client.BoxClient;
import com.lenovo.css.boxsdk.client.ClientFactory;
import com.lenovo.css.boxsdk.exception.BoxException;
import com.lenovo.css.boxsdk.file.FileClient;
import com.lenovo.css.boxsdk.file.model.FileModel;
import com.lenovo.css.boxsdk.file.model.PreviewModel;
import com.lenovo.css.boxsdk.user.UserClient;
import com.lenovo.css.boxsdk.user.model.UserModel;
import com.yz.ZA.util.WebLogs;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class LenovoService {

    public static final Logger log = LoggerFactory.getLogger(LenovoService.class);

//    @Autowired
//    private BaseService baseService;
//    @Autowired
//    private FapierrorLogMapper fapierrorLogMapper;


    @Value("${lxy.addr}")
    private String lxyAddr;
    @Value("${lxy.user}")
    private String lxyUser;
    @Value("${lxy.pwd}")
    private String lxyPwd;
    @Value("${lxy.pathType}")
    private String lxyPathType;

    @Value("${manualOperationPath}")
    private String manualOperationPath;


    @Value("${voluntarilyPath}")
    private String voluntarilyPath;



    public String getLxyAddr() {
        return lxyAddr;
    }

    public void setLxyAddr(String lxyAddr) {
        this.lxyAddr = lxyAddr;
    }

    public String getLxyUser() {
        return lxyUser;
    }

    public void setLxyUser(String lxyUser) {
        this.lxyUser = lxyUser;
    }

    public String getLxyPwd() {
        return lxyPwd;
    }

    public void setLxyPwd(String lxyPwd) {
        this.lxyPwd = lxyPwd;
    }

    public void setLxyPathType(String lxyPathType) {
        this.lxyPathType = lxyPathType;
    }

    public String getLxyPathType() {
        return lxyPathType;
    }

    private static ObjectMapper objectMapper = new ObjectMapper();
    private BoxClient boxClient;
    private UserClient userClient;
    private UserModel userModel;
    private FileClient fileClient;

//    public UserModel getUserModel() {
//        if (fileClient == null || userModel == null) {
//            getFileClient();
//        }
//        return userModel;
//    }

//    public FileClient getFileClient() {
//        if (fileClient == null) {
//            boxClient = new BoxClient(lxyAddr);
//            userClient = new ClientFactory(boxClient).getUserClient();
//            try {
//                userModel = userClient.login(lxyUser, lxyPwd);
//                log.info(objectMapper.writeValueAsString(userModel));
//            } catch (Exception e) {
//                log.error("?????????????????????", e);
//            }
//            fileClient = new ClientFactory(boxClient).getFileClient();
//        }
//        return fileClient;
//    }
	
	public LenovoService(){
        Thread t = new Thread(new Runnable(){  
            public void run(){
             long refreshTokenIdTime = 1 * 60 * 60 * 1000; // tokenId????????????(??????ms) ??????1??????;
             while (true) {
                    try {
                     WebLogs.getLogger().info("*******************Lenovo file login*************");
                     boxClient = new BoxClient(lxyAddr);
                     userClient = new ClientFactory(boxClient).getUserClient();
                     userModel = userClient.login(lxyUser, lxyPwd);
                     WebLogs.getLogger().info(JSON.toJSONString(userModel));
                     
                     fileClient = new ClientFactory(boxClient).getFileClient();
                     WebLogs.getLogger().info("*******************Lenovo file login success*************");
                    } catch (Exception e) {
                     WebLogs.getLogger().error("LenovoFileClient login login error",e);
                    }finally{
                     try {
       Thread.sleep(refreshTokenIdTime);
      } catch (InterruptedException e) {
       e.printStackTrace();
      }
                    }
             }
            }
        });  
        t.start();
    }

    public  String getUUID() {
        String s = UUID.randomUUID().toString();
        // ?????????-?????????
        return s.substring(0, 8)
                + s.substring(9, 13)
                + s.substring(14, 18)
                + s.substring(19, 23)
                + s.substring(24);
    }

    //????????????pdf?????? ?????????pdf?????? ??????????????????????????????
    public String lenvoFileUpload(String  filePath, String suffixName) {
        try{
            InputStream fileInputStream = new FileInputStream(filePath);
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");//??????????????????
            System.out.println(df.format(new Date()));// new Date()???????????????????????????
            String lenovoname = manualOperationPath+df.format(new Date())+"/"+ System.currentTimeMillis()+"";
            String lenovoPath=lenovoname+suffixName;
            String pathType = getLxyPathType();
            FileModel fileModel = fileClient.uploadFile(lenovoPath, pathType, fileInputStream, userModel.getSession());
            log.info("????????????");
            log.info(lenovoPath);
           deleteFiles(filePath);
            return lenovoPath;
        }catch (Exception e){
            deleteFiles(filePath);
            return "";
        }
    }


    //??????????????????pdf??????
    public String lenvoFileUploadall(String  filePath) {
        try{
            InputStream fileInputStream = new FileInputStream(filePath);
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//??????????????????
            Calendar calendar = Calendar.getInstance();
            calendar.add(calendar.DATE, -1);
            System.out.println(df.format(calendar.getTime()));// new Date()???????????????????????????
            String pathname=filePath.substring(filePath.lastIndexOf("\\")+1);
            if("L".equals(Constant.osName())){
                pathname=filePath.substring(filePath.lastIndexOf("/")+1);
            }
            String lenovoPath = voluntarilyPath+df.format(calendar.getTime())+"/"+pathname;
            log.info("?????????pdf ??????==="+lenovoPath);
            String pathType = getLxyPathType();
            FileModel fileModel = fileClient.uploadFile(lenovoPath, pathType, fileInputStream, userModel.getSession());
            log.info("????????????");
            log.info(lenovoPath);
            return fileModel.getResult();
        }catch (Exception e){
            return "losing";
        }
    }

    /***
     * ??????????????????
     * @param pathName
     * @return
     */
    public boolean deleteFiles(String pathName){
        boolean flag = false;
        //??????????????????????????????
        File file = new File(pathName);
        //?????????????????????????????????????????????
        if(file.isFile()&&file.exists()){
            flag = file.delete();
        }
        //????????????????????????false
        return flag;
    }
    public boolean existFiles(String pathName){
        boolean flag = false;
        //??????????????????????????????
        File file = new File(pathName);
        //????????????
        if(file.exists()){
            flag = true;
        }
        //???????????????????????????false
        return flag;
    }




    /**
     * ??????????????????????????????????????????---????????????????????????
     * @param filePathName ???????????????
     */
    public String getPreviewUrlForPath(String filePathName)throws Exception{
        FileModel fileModel = downFileClick(filePathName);
        if(fileModel == null){
            throw new XFRuntimeException("???????????????["+filePathName+"]");
        }
        if(fileModel.getDir()){
            throw new XFRuntimeException("?????????????????????["+filePathName+"]");
        }
        PreviewModel previewModel = fileClient.getPreviewUrl(fileModel.getPath(), lxyPathType,userModel.getSession());
        return previewModel.getPreviewUrl();
    }

    //???????????????
    private static final String[] rootDrives = {"/E","/D","/F","/G"};
    //???????????????click
    public FileModel downFileClick(String filePathName) throws BoxException {
        FileModel fileModel=null;
        for (int i = 0; i < rootDrives.length; i++) {
            try{
                fileModel = fileClient.getFileByPath(filePathName, lxyPathType, userModel.getSession());
                if(fileModel != null){
                    break;
                }
            }catch (Exception e) {
                WebLogs.getLogger().error(e.getMessage());
            }
        }
        return fileModel;
    }

    //pdf????????????
    /**
     * ??????????????????????????????????????????
     * @param filePathName ???????????????
     */
    public void downFileForInputStream(String filePathName, HttpServletRequest request, HttpServletResponse response)throws Exception{
        //??????????????????(???????????????????????? ?????????????????????)
        FileModel fileModel = downFileClick(filePathName);
        if(fileModel == null){
            throw new XFRuntimeException("???????????????["+filePathName+"]");
        }
        if(fileModel.getDir()){
            //????????????????????????
            //throw new XFRuntimeException("????????????????????????["+filePathName+"]");
            return;
        }
        InputStream ins = fileClient.downloadFile(fileModel.getPath(), lxyPathType, null, null, userModel.getSession());
        writeToLocal(ins, request, response);
    }

    /**
     * ???InputStream??????????????????
//     * @param destination ??????????????????
     * @param input ?????????
     * @throws IOException IOException
     */
    public void writeToLocal(InputStream input, HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("multipart/form-data");
        try{
            request.setCharacterEncoding("UTF-8");
            response.reset();
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/force-download");
            String fileName = System.currentTimeMillis()+".pdf";
            response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
            byte[] bytes = new byte[1024 * 10];
            int len;
            while ((len = input.read(bytes)) != -1) {
                response.getOutputStream().write(bytes, 0, len);
            }
            response.getOutputStream().flush();
            response.flushBuffer();
            input.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    /**
     * ??????????????????????????????
     * @param filePathName ??????????????????(???????????????)
     * @param toPathName ??????????????????????????? (???????????????)
     */
    public void downFile(String filePathName,String toPathName,HttpServletResponse response)throws Exception{
        //??????????????????(???????????????????????? ?????????????????????)
        FileModel fileModel = downFileClick(filePathName);
        if(fileModel == null){
            throw new XFRuntimeException("???????????????["+filePathName+"]");
        }
        if(fileModel.getDir()){
            //????????????????????????
            //throw new XFRuntimeException("????????????????????????["+filePathName+"]");
            return;
        }
        InputStream ins = fileClient.downloadFile(fileModel.getPath(), lxyPathType, null, null, userModel.getSession());
        writeToLocal1(toPathName,ins,response);
    }

    /**
     * ???InputStream??????????????????
     * @param destination ??????????????????
     * @param input ?????????
     * @throws IOException IOException
     */
    public void writeToLocal1(String destination, InputStream input,HttpServletResponse response)
            throws IOException {
        //destination????????????????????????
        File fPath = new File(destination);
        File f = new File(fPath.getParent());
        if(!f.exists()){
            f.mkdirs();
        }
        int index;
        byte[] bytes = new byte[1024];
        FileOutputStream downloadFile = new FileOutputStream(destination);
        while ((index = input.read(bytes)) != -1) {
            downloadFile.write(bytes, 0, index);
            downloadFile.flush();
        }
        input.close();
        downloadFile.close();

        FileInputStream is = new FileInputStream(destination);
        int i = is.available(); // ??????????????????
        byte data[] = new byte[i];
        is.read(data); // ?????????
        is.close();
        response.setContentType("image/*"); // ???????????????????????????
        OutputStream toClient = response.getOutputStream(); // ????????????????????????????????????????????????
        toClient.write(data); // ????????????
        toClient.close();
    }

    public static void main(String[] args) {
       HashMap map=new HashMap();
       Hashtable hashtable=new Hashtable();
       map.put(null,null);
//       map.put(null,"cesji");
        hashtable.put("null","null");

        System.out.println(map);
        System.out.println(hashtable);

    }
}
