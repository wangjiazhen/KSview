package org.ks.schedu;



import org.ks.sys.joblog.bean.Joblog;
import org.ks.sys.joblog.mapper.JoblogMapper;
import org.ks.util.Constant;
import org.ks.util.LenovoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@EnableScheduling
public class PullDataSchedule {
    private static final Logger log = LoggerFactory.getLogger(PullDataSchedule.class);


    @Autowired
    private ScheduleService scheduleService;
    @Autowired
    private LenovoService lenovoService;
    @Autowired
    private JoblogMapper joblogMapper;

    @Value("${winvoluntarilyPath}")
    private String winvoluntarilyPath;//sftp下载的文件win存放路径
    @Value("${linuxvoluntarilyPath}")
    private String linuxvoluntarilyPath;//sftp下载的文件linux存放路径



    /**
     * 定时拉sftp上的当天文件夹下的所有文件拉取到服务器中
     */
//    @Scheduled(cron = "0 0 0 * * ?")
    public void PullPdfall()  {
        log.info("当前执行的是sftp拉取当天文件夹下的所有文件");
        scheduleService.SftpPdf();

    }


    /**
     * 定时拉sftp上的excl将文件中的数据存储到数据库中
     */
//    @Scheduled(cron = "0 0 0 * * ?")
    public void Pushprocess()  {
        log.info("时推送process中的数据到腾讯云进行语音转文字定时器执行");
        Joblog joblog=new Joblog();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        log.info("根据当前时间"+df.format(new Date())+"将服务器当前日期文件夹下xls文件下载到服务器");
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






    /**
     * 将从sftp中下载的文件上传到联想云
     */
//    @Scheduled(cron = "0 0 0 * * ?")
    public void PushPdfFile()  {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        log.info("根据当前时间"+df.format(new Date())+"将服务器当前日期文件夹下的所有pdf推送到联想云");
        String exclPath = winvoluntarilyPath;
        if("L".equals(Constant.osName())){
            exclPath=linuxvoluntarilyPath;
        }
        exclPath+=df.format(df.format(new Date()));
        scheduleService.uploadPdfLenovo(exclPath);


    }

}
