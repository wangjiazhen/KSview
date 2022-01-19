package org.ks.util;


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

    public UserModel getUserModel() {
        if (fileClient == null || userModel == null) {
            getFileClient();
        }
        return userModel;
    }

    public FileClient getFileClient() {
        if (fileClient == null) {
            boxClient = new BoxClient(lxyAddr);
            userClient = new ClientFactory(boxClient).getUserClient();
            try {
                userModel = userClient.login(lxyUser, lxyPwd);
                log.info(objectMapper.writeValueAsString(userModel));
            } catch (Exception e) {
                log.error("联想云登录异常", e);
            }
            fileClient = new ClientFactory(boxClient).getFileClient();
        }
        return fileClient;
    }

    private static String getUUID() {
        String s = UUID.randomUUID().toString();
        // 去掉“-”符号
        return s.substring(0, 8)
                + s.substring(9, 13)
                + s.substring(14, 18)
                + s.substring(19, 23)
                + s.substring(24);
    }

    //用户上传pdf文件 在通过pdf文件 转成图片上传到联想云
    public String lenvoFileUpload(String  filePath, String suffixName) {
        try{
            InputStream fileInputStream = new FileInputStream(filePath);
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");//设置日期格式
            System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

            String lenovoname = "/Application/1.153/G/filepdf/"+df.format(new Date())+"/"+ System.currentTimeMillis()+"";
            String lenovoPath=lenovoname+suffixName;
            String pathType = getLxyPathType();
            FileModel fileModel = getFileClient().uploadFile(lenovoPath, pathType, fileInputStream, getUserModel().getSession());
            log.info("上传成功");
//            PreviewModel previewUrl = getFileClient().getPreviewUrl(fileModel.getNeid(), null, getUserModel().getSession());
            log.info(lenovoPath);
            //pdf转成图片
            String images=pdfToPng(lenovoname,filePath);
//            boolean bl=deleteFiles(filePath);
            return lenovoPath+"&"+images;
        }catch (Exception e){
            deleteFiles(filePath);
            return "";
        }
    }

    /***
     * 删除指定文件
     * @param pathName
     * @return
     */
    public boolean deleteFiles(String pathName){
        boolean flag = false;
        //根据路径创建文件对象
        File file = new File(pathName);
        //路径是个文件且不为空时删除文件
        if(file.isFile()&&file.exists()){
            flag = file.delete();
        }
        //删除失败时，返回false
        return flag;
    }

    /**
     * 根据文件路径获取文件预览地址
     * @param filePathName 文件全路径
     */
    public String getPreviewUrlForPath(String filePathName)throws Exception{
        FileModel fileModel = downFileClick(filePathName);
        if(fileModel == null){
            throw new XFRuntimeException("文件不存在["+filePathName+"]");
        }
        if(fileModel.getDir()){
            throw new XFRuntimeException("文件夹不能预览["+filePathName+"]");
        }
        PreviewModel previewModel = fileClient.getPreviewUrl(fileModel.getPath(), lxyPathType,getUserModel().getSession());
        return previewModel.getPreviewUrl();
    }

    //根目录盘符
    private static final String[] rootDrives = {"/E","/D","/F","/G"};
    //文件下载前click
    public FileModel downFileClick(String filePathName) throws BoxException {
        FileModel fileModel=null;
        for (int i = 0; i < rootDrives.length; i++) {
            try{
//                G/filepdf/2022/01/18/1642503359538.png
                fileModel = fileClient.getFileByPath(filePathName, lxyPathType, getUserModel().getSession());
                if(fileModel != null){
                    break;
                }
            }catch (Exception e) {
                WebLogs.getLogger().error(e.getMessage());
            }
        }
        return fileModel;
    }

    /**
     * pdf转png图片
     * @param sourceFilePath 源文件路径
     * @param targetFilePath 目标文件路径
     * @return
     */
    public static final String IMAGE_PNG = "png";
    public  String  pdfToPng(String sourceFilePath,String targetFilePath) {
        String prefixName = targetFilePath.substring(0, targetFilePath.lastIndexOf("."))+"."+IMAGE_PNG;
        String flag = "";
        PDDocument doc = null;
        try {
            String dir = targetFilePath.substring(0, targetFilePath.lastIndexOf("\\"));
            File dirfile = new File(dir);
            if(!dirfile.exists()){
                dirfile.mkdirs();
            }
//            dir+filename+"."+IMAGE_PNG
            FileInputStream fis = new FileInputStream(new File(targetFilePath));
            doc = PDDocument.load(fis);
            PDFRenderer renderer = new PDFRenderer(doc);
            int pages = doc.getNumberOfPages();
            //设置最大宽度和总长度
            int maxWidth = 0;
            int sumHeight = 0;
            List<BufferedImage> listbi = new ArrayList<BufferedImage>();
            // 获取pdf文件流
            for(int i = 0 ; i < pages; i++){
                BufferedImage imageBuffer = renderer.renderImageWithDPI(i, 150, ImageType.RGB);
                int width = imageBuffer.getWidth();
                int height = imageBuffer.getHeight();
                if (width > maxWidth){
                    maxWidth = width;
                }
                sumHeight += height;
                listbi.add(imageBuffer);
            }
            //pdf分别转图片后合并
            BufferedImage imageNew = new BufferedImage(maxWidth,sumHeight,BufferedImage.TYPE_INT_RGB);
            int nowHeight = 0;
            for (BufferedImage bi : listbi) {
                int width = bi.getWidth();
                int height = bi.getHeight();
                int[] imageRgbArray = new int[width *  height];
                imageRgbArray = bi.getRGB(0, 0, width, height, imageRgbArray, 0, width);
                imageNew.setRGB(0, nowHeight, width, height, imageRgbArray, 0, width);
                nowHeight += height;
            }
            ImageIO.write(imageNew, IMAGE_PNG, new File(prefixName));
            String imagesurl=lenvoFileUploadimages(prefixName,"."+IMAGE_PNG);
            flag = imagesurl;
        } catch (IOException e) {
            System.out.println("CommonUtils.pdfToPng error");
            e.printStackTrace();
        }finally{
            if(doc != null){
                try {
                    doc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return flag;

    }


//pdf转成的图片上传到联想云
    public String lenvoFileUploadimages(String  filePath, String suffixName) {
        try{
            InputStream fileInputStream = new FileInputStream(filePath);
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");//设置日期格式
            System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

            String lenovoname = "/Application/1.153/G/filepdf/"+df.format(new Date())+"/"+ System.currentTimeMillis()+"";
            String lenovoPath=lenovoname+suffixName;
            String pathType = getLxyPathType();
            FileModel fileModel = getFileClient().uploadFile(lenovoPath, pathType, fileInputStream, getUserModel().getSession());
            log.info("上传成功");
//            PreviewModel previewUrl = getFileClient().getPreviewUrl(fileModel.getNeid(), null, getUserModel().getSession());
            log.info(lenovoPath);
//            boolean bl=deleteFiles(filePath);
            return lenovoPath;
        }catch (Exception e){
            deleteFiles(filePath);
            return "";
        }
    }

    //pdf文件下载
    /**
     * 页面单个文件下载文件（流式）
     * @param filePathName 文件全路径
     */
    public void downFileForInputStream(String filePathName, HttpServletRequest request, HttpServletResponse response)throws Exception{
        //获取文件信息(判断文件是否存在 不存在抛出异常)
        FileModel fileModel = downFileClick(filePathName);
        if(fileModel == null){
            throw new XFRuntimeException("文件不存在["+filePathName+"]");
        }
        if(fileModel.getDir()){
            //不能下载文件目录
            //throw new XFRuntimeException("不能下载文件目录["+filePathName+"]");
            return;
        }
        InputStream ins = fileClient.downloadFile(fileModel.getPath(), lxyPathType, null, null, getUserModel().getSession());
        writeToLocal(ins, request, response);
    }

    /**
     * 将InputStream写入本地文件
//     * @param destination 写入本地目录
     * @param input 输入流
     * @throws IOException IOException
     */
    public void writeToLocal(InputStream input, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
//        //destination路径不存在则新建
//        File fPath = new File(destination);
//        File f = new File(fPath.getParent());
//        if(!f.exists()){
//            f.mkdirs();
//        }
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

    private ResponseEntity<OutputStream> export(OutputStream os, String fileName) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", "attachment; filename=" + System.currentTimeMillis() + fileName);
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        return ResponseEntity.ok().headers(headers).contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(os);
    }





}
