package org.ks.schedu.ctrl;

import io.swagger.annotations.Api;
import org.ks.schedu.ScheduleService;
import org.ks.sys.joblog.bean.Joblog;
import org.ks.sys.joblog.mapper.JoblogMapper;
import org.ks.util.Constant;
import org.ks.util.LenovoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;


@CrossOrigin
@RestController
@RequestMapping("/ScheduleCtrl")
@Api(tags = "APP接口")
public class ScheduleCtrl {
    private static final Logger log = LoggerFactory.getLogger(ScheduleCtrl.class);

    @Autowired
    private LenovoService lenovoService;
    @Autowired
    private ScheduleService scheduleService;
    @Autowired
    private JoblogMapper joblogMapper;
    @Value("${winvoluntarilyPath}")
    private String winvoluntarilyPath;//sftp下载的文件win存放路径
    @Value("${linuxvoluntarilyPath}")
    private String linuxvoluntarilyPath;//sftp下载的文件linux存放路径


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
        exclPath+=df.format(new Date())+"/"+df.format(new Date())+".xls";

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

