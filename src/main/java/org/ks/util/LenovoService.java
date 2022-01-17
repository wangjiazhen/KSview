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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

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


    public String lenvoFileUpload(String  filePath, String suffixName) {
        try{
            InputStream fileInputStream = new FileInputStream(filePath);
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");//设置日期格式
            System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

            String lenovoPath = "/Application/1.153/G/filepdf/"+df.format(new Date())+"/"+ System.currentTimeMillis()+""+suffixName;
            String pathType = getLxyPathType();
            FileModel fileModel = getFileClient().uploadFile(lenovoPath, pathType, fileInputStream, getUserModel().getSession());
            log.info("上传成功");
//            PreviewModel previewUrl = getFileClient().getPreviewUrl(fileModel.getNeid(), null, getUserModel().getSession());
            log.info(lenovoPath);
            boolean bl=deleteFiles(filePath);
            return lenovoPath;
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

    //文件下载前click
    public FileModel downFileClick(String filePathName) throws BoxException {
        FileModel fileModel=null;
        String tmpPath ="";
        fileModel = fileClient.getFileByPath(filePathName, lxyPathType, getUserModel().getSession());
        return fileModel;
    }



}
