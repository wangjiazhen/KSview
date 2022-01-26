package org.ks.sys.declaration.ctrl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.ks.enums.StatusCodeEnum;
import org.ks.schedu.ScheduleService;
import org.ks.sys.declaration.bean.TblDeclaration;
import org.ks.sys.declaration.service.DeclarationService;
import org.ks.sys.declaration.service.impl.DeclarationServiceImpl;
import org.ks.sys.declaration.vo.ConditionalQueryDecl;
import org.ks.sys.declaration.vo.ConditionalupdateDecl;
import org.ks.sys.joblog.bean.Joblog;
import org.ks.sys.joblog.mapper.JoblogMapper;
import org.ks.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/declartion")
@Api(tags = "APP接口")
public class DeclartionCtrl {
    private static final Logger log = LoggerFactory.getLogger(DeclarationServiceImpl.class);


    @Autowired
    private DeclarationService declarationService;
    @Autowired
    private LenovoService lenovoService;
    @Autowired
    private RestHttpClientTest restHttpClientTest;

    @Autowired
    private ScheduleService scheduleService;
    @Autowired
    private JoblogMapper joblogMapper;

    @Value("${winfilePath}")
    private String winfilePath;

    @Value("${linuxfilePath}")
    private String linuxfilePath;

    @Value("${winvoluntarilyPath}")
    private String winvoluntarilyPath;//sftp下载的文件win存放路径
    @Value("${linuxvoluntarilyPath}")
    private String linuxvoluntarilyPath;//sftp下载的文件linux存放路径

    /**
     * 查询报单数据
     * @param
     * @return
     */
    @RequestMapping("/declartionlist")
    public ResultInfo declartionshow(ConditionalQueryDecl conditionalQueryDecl){
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        log.info("======客户手机号:"+conditionalQueryDecl.getMobilePhone());
        log.info("======客户名称:"+conditionalQueryDecl.getRealName());
        List<TblDeclaration> tblDeclarations = declarationService.selectByQueryDecl(conditionalQueryDecl);
        re.setData(tblDeclarations);
        re.setTotal((long) tblDeclarations.size());

        return re;
    }

    @RequestMapping("/selectDeclBydeclId")
    public ResultInfo selectDeclBydeclId(Long declId){
        log.info("当前declId为:"+declId);
        TblDeclaration tblDeclarations = declarationService.selectByPrimaryKey(declId);
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        re.setData(tblDeclarations);

        return re;
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping("/declUpdate")
    public ResultInfo declUpdate(ConditionalupdateDecl conditionalupdateDecl){

        return declarationService.updateByPrimaryKeySelectiveResultInfo(conditionalupdateDecl);
    }


    /**
     *添加
     * @return
     */
    @RequestMapping("/declInstar")
    public ResultInfo declInstar(TblDeclaration tblDeclaration){


        return declarationService.insertResult(tblDeclaration);
    }

    /**
     * 文件上传 到本地 然后到 联想云
     * @param
     * @return
     */
    @ApiOperation("上传文件")
    @PostMapping(value = "/uploading")
    public @ResponseBody
    ResultInfo uploadFile(@RequestParam("filename") MultipartFile file) {
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        log.info("接收到的文件数据为：" + file);

        if (file.isEmpty()) {
            re = new ResultInfo(StatusCodeEnum.failure,"上传文件为空");
            log.error("上传文件为空");
            return re;
        }
        // 获取文件全名a.py
        String fileName = file.getOriginalFilename();
//         文件上传路径<br>
        String templatePath = winfilePath;
        if("L".equals(Constant.osName())){
            templatePath=linuxfilePath;
        }
        log.info("文件路径:" + templatePath);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //获取文件名
        String prefixName = fileName.substring(0, fileName.lastIndexOf("."));
        // 解决中文问题,liunx 下中文路径,图片显示问题
        fileName = UUID.randomUUID() + suffixName;
        File dest0 = new File(templatePath);
        File dest = new File(dest0,   File.separator + fileName);
        //文件上传-覆盖
        try {
            // 检测是否存在目录
            if (!dest0.getParentFile().exists()) {
                dest0.getParentFile().mkdirs();
                //检测文件是否存在
            }
            if (!dest.exists()) {
                dest.mkdirs();
            }
            file.transferTo(dest);
            //上传pdf
            String url= lenovoService.lenvoFileUpload(dest.getPath(),suffixName);
            if("".equals(url)){
                re = new ResultInfo(StatusCodeEnum.failure,"上传失败");
            }
            re.setData(url);
            return re;
        } catch (Exception e) {
            re = new ResultInfo(StatusCodeEnum.failure,"上传失败");
            log.error("文件上传错误");
            return re;
        }

    }

    /**
     * 保存登录信息
     * @param
     * @return
     */
    @PostMapping("/saveTblDeclarationInfo")
    @ApiOperation(value = "登录接口",httpMethod = "POST",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "姓名",name = "realName",required = true,dataType = "String"),
            @ApiImplicitParam(value = "手机号码",name = "mobilePhone",required = true,dataType = "String"),
            @ApiImplicitParam(value = "验证码",name = "verifiedCode",required = true,dataType = "String")
    })
    public ResultInfo saveTblDeclarationInfo(String realName, String mobilePhone, String verifiedCode){
        log.info("======登录手机号:"+mobilePhone+"登录姓名:"+realName+"客户输入的验证码:"+verifiedCode);
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        try {
//            String phonecode=restHttpClientTest.getPhoneKey(mobilePhone,verifiedCode);
            String phonecode="123456";
            if(phonecode==null){
                re.setMessage("您还没有获取验证码");
            }else if(!verifiedCode.equals(phonecode)){
                re.setMessage("验证码错误");
            }else{
                declarationService.insertTblDeclarationInfo(realName, mobilePhone, verifiedCode);
            }
        } catch (Exception ex){
            re = new ResultInfo(StatusCodeEnum.PROCESSING_EXCEPTION,"请求发生异常");
            log.info(ex.getMessage(), ex);
        }
        return re;
    }

    /**
     * 保单查询
     * @param
     * @return
     */
    @PostMapping("/policyQuery")
    @ApiOperation(value = "保单查询接口",httpMethod = "POST",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "手机号码",name = "mobilePhone",required = true,dataType = "String")
    })
    public ResultInfo policyQuery(String mobilePhone){
        log.info("======保单查询手机号:"+mobilePhone);
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        try {
            String policyUrl = declarationService.policyQuery(mobilePhone);
            re.setData(policyUrl);
        } catch (Exception ex){
            re = new ResultInfo(StatusCodeEnum.PROCESSING_EXCEPTION,"请求发生异常");
            log.info(ex.getMessage(), ex);
        }
        return re;
    }

    /**
     * 发送验证码
     * @param
     * @return
     */
    @PostMapping("/sendMessageCode")
    @ApiOperation(value = "发送验证码接口",httpMethod = "POST",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "手机号码",name = "mobilePhone",required = true,dataType = "String"),
    })
    public ResultInfo sendMessageCode( String mobilePhone){
        log.info("======发送验证码手机号:"+mobilePhone);
        return restHttpClientTest.sendMsgVerification(mobilePhone);
    }



    @RequestMapping("/downdeclUrlImage")
    @ResponseBody
    public void filedownbydeclUrlImage(String  declUrl, HttpServletRequest request, HttpServletResponse response) {
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"接口成功");
        try {
            lenovoService.downFileForInputStream(declUrl, request, response);
        }catch ( Exception e ){
            log.error(e.getMessage());
        }

    }

    /****
     * 预览pdf
     * @param response
     * @param filePathName
     * @throws Exception
     */
    @RequestMapping("/images")
    public void images(HttpServletResponse response,String filePathName) throws Exception {
        String uuid=lenovoService.getUUID()+".pdf";
        String toPathName=winfilePath+uuid;
        if("L".equals(Constant.osName())){
            toPathName=linuxfilePath+uuid;
        }
        lenovoService.downFile(filePathName,toPathName,response);
        boolean bl=lenovoService.deleteFiles(toPathName);
    }


    /*****
     * 执行xlsx文件的读取 将数据写入数据库
     */
    @RequestMapping("/xlsxread")
    public void xlsxread() {
        log.info("执行手动读取当天的xlsx文件的数据");
//        String exclPath="D:\\Desktop\\20220120\\20220120.xlsx";
        Joblog joblog=new Joblog();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        log.info("根据当前时间"+df.format(new Date())+"将服务器当前日期文件夹下的所有pdf推送到联想云");
        String exclPath = winvoluntarilyPath;
        if("L".equals(Constant.osName())){
            exclPath=linuxvoluntarilyPath;
        }
        exclPath+=df.format(new Date())+"/"+df.format(new Date())+".xlsx";

        boolean exisboolean=lenovoService.existFiles(exclPath);
        if(exisboolean){
            scheduleService.readExcl(exclPath);
        }
        else{
            log.info("当前文件不存在"+exclPath);
            joblog.setException("当前文件不存在"+exclPath);
            joblog.setJobtype("xls数据的读取写入");
            joblog.setEndtime(new Date());
            joblog.setStarttime(new Date());
            joblogMapper.insert(joblog);

        }

    }

    /****
     * 根据日期获取指定文件夹下的pdf 上传到联想云
     */
    @RequestMapping("/uploadallPdf")
    public void uploadallPdf() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        log.info("根据当前时间"+df.format(new Date())+"将服务器当前日期文件夹下的所有pdf推送到联想云");
        String exclPath = winvoluntarilyPath;
        if("L".equals(Constant.osName())){
            exclPath=linuxvoluntarilyPath;
        }
        exclPath+=df.format(new Date());
        scheduleService.uploadPdfLenovo(exclPath);

    }

    /****
     * 根据当前日期从sftp服务中下载文件
     */
    @RequestMapping("/sftpFileDown")
    public void sftpFileDown() {
        log.info("当前执行的是sftp拉取当天文件夹下的所有文件");
        scheduleService.SftpPdf();

    }






}

