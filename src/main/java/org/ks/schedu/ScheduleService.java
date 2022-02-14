package org.ks.schedu;

import com.yz.ZA.util.DateUtil;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.ks.sys.declaration.bean.TblDeclaration;
import org.ks.sys.declaration.service.DeclarationService;
import org.ks.sys.joblog.bean.Joblog;
import org.ks.sys.joblog.mapper.JoblogMapper;
import org.ks.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class ScheduleService {

    private static final Logger log = LoggerFactory.getLogger(ScheduleService.class);

    @Value("${voluntarilyPath}")
    private String voluntarilyPath;
    @Value("${SFTP.host}")
    private  String host;//服务器连接ip
    @Value("${SFTP.username}")
    private  String username;//用户名
    @Value("${SFTP.password}")
    private  String password;//密码
    @Value("${SFTP.port}")
    private  int port;//端口号
    @Value("${SFTP.path}")
    private String path;//sftp文件路径


    @Value("${winvoluntarilyPath}")
    private String winvoluntarilyPath;//sftp下载的文件win存放路径
    @Value("${linuxvoluntarilyPath}")
    private String linuxvoluntarilyPath;//sftp下载的文件linux存放路径


    @Autowired
    private DeclarationService declarationService;

    @Autowired
    private JoblogMapper joblogMapper;
    @Autowired
    private LenovoService lenovoService;

    /***
     * 根据路径读取xls表格中的数据 写入数据库
     * @param exclPath
     */
    public void readExcl(String exclPath){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        Joblog joblog=new Joblog();
        try{
            joblog.setStarttime(new Date());

            Workbook wb =null;
            Sheet sheet = null;
            Row row = null;
            List<Map<String,String>> list = null;
            String cellData = null;
            String filePath=exclPath;
//            String filePath = "D:\\Desktop\\20220120\\20220120.xlsx";
            String columns[] = {"realname","mobilephone","declurl"};
            String extString = filePath.substring(filePath.indexOf("/"),filePath.lastIndexOf("/"));
            wb = TestEXCLpoi.readExcel(filePath);
            if(wb != null){
                //用来存放表中数据
                list = new ArrayList<Map<String,String>>();
                //获取第一个sheet
                sheet = wb.getSheetAt(0);
                //获取最大行数
                int rownum = sheet.getPhysicalNumberOfRows();
                String cell;
                //获取第一行
                row = sheet.getRow(0);
                //获取最大列数
                int colnum = row.getPhysicalNumberOfCells();
                for (int i = 1; i<rownum; i++) {
                    Map<String,String> map = new LinkedHashMap<String,String>();
                    row = sheet.getRow(i);
                    if(row !=null){
                        for (int j=0;j<colnum;j++){
                            int cellType = row.getCell(j).getCellType();
                            if (cellType == 0 && j==1) {
                                DataFormatter dataFormatter = new DataFormatter();
                                dataFormatter.addFormat("###########", null);
                                cell = dataFormatter.formatCellValue(row.getCell(j));
                            } else {
                                cell = row.getCell(j).toString();
                            }
                            cellData = cell;
                            map.put(columns[j], cellData);
                        }
                    }else{
                        break;
                    }
                    list.add(map);
                }
            }
            int count=list.size();
            joblog.setTotal(count);
            int succupdate=0;//成功修改条数
            int succinster=0;//成功新增条数
            //遍历解析出来的list
            for (Map<String,String> map : list) {
                TblDeclaration record=new TblDeclaration();
                record.setRealName(map.get("realname"));
                record.setMobilePhone(map.get("mobilephone"));
                record.setDeclUrl(voluntarilyPath+df.format(calendar.getTime())+"/"+map.get("declurl"));
                record.setDeclUrlAcct(map.get("declurl"));
                String type=declarationService.insertbatch(record);
                if("UPDATE".equals(type)){
                    succupdate++;
                }else{
                    succinster++;
                }
            }

            joblog.setSuccinstart(succinster);
            joblog.setSuccupdate(succupdate);
            log.info("当前日期总数据:"+count+"条，其中新增："+succinster+"修改："+succupdate);
            joblog.setException("当前日期总数据:"+count+"条，其中新增："+succinster+"修改："+succupdate);

            //进行删除文件
            boolean bl=lenovoService.deleteFiles(exclPath);
        }catch (Exception e){
            log.error(e.getMessage());
            joblog.setException(e.getMessage());
        }finally {
            joblog.setJobtype("xls数据的读取写入");
            joblog.setEndtime(new Date());
            joblogMapper.insert(joblog);
        }


    }


    /****
     * 根据路径批量上传pdf文件到联想云
     */
    public void uploadPdfLenovo(String exclPath){
        LinkedList listPath=folderMethod1(exclPath);
        Joblog joblog=new Joblog();
        joblog.setStarttime(new Date());
        joblog.setJobtype("pdf文件上传联想云");
        int pdfcount=listPath.size();
        int pdfsuccess=0;
        int pdflosing=0;
        for (int i=0;i<listPath.size();i++){
            //根据路径上传到联想云
            String  resultType= lenovoService.lenvoFileUploadall(listPath.get(i).toString());
            if("success".equals(resultType)){
                pdfsuccess++;
                boolean bl=lenovoService.deleteFiles(listPath.get(i).toString());
                continue;
            }
            pdflosing++;
        }
        log.info("当前日期文件夹下pdf总数:"+pdfcount+"成功的数量:"+pdfsuccess+"失败的数量:"+pdflosing);
        joblog.setTotal(pdfcount);
        joblog.setSuccinstart(pdfsuccess);
        joblog.setSuccupdate(pdflosing);
        joblog.setException("当前日期文件夹下pdf总数:"+pdfcount+"成功的数量:"+pdfsuccess+"失败的数量:"+pdflosing);
        joblog.setEndtime(new Date());
        joblogMapper.insert(joblog);


    }


    /****
     * 判断当前文件夹下pdf的数量以及获取文件路径
     * @param path
     * @return
     */
    public static LinkedList folderMethod1(String path) {
        //path路径下的pdf路径
        LinkedList listPath = new LinkedList<>();

        File file = new File(path);
        LinkedList list = new LinkedList<>();
        //保存所有pdf文件的对象
        LinkedList pdfList = new LinkedList();
        //该路径对应的文件或文件夹是否存在
        if (file.exists()) {
            //如果该路径为---文件或空文件夹
            if (null == file.listFiles()) {
                // System.out.println(file.getAbsolutePath());
                if(file.getAbsolutePath().endsWith(".pdf"))
                    pdfList.add(file);
            }
            //如果该路径为非空文件夹
            else {
                //将该路径下的所有文件(文件或文件夹)对象加入队列
                list.addAll(Arrays.asList(file.listFiles()));
                //遍历该队列
                while (!list.isEmpty()) {
                    File firstF = (File) list.removeFirst();
                    //这里不论是文件夹还是文件，只需判断是否以“.pdf”结尾
                    if(firstF.getAbsolutePath().endsWith(".pdf"))
                        pdfList.add(firstF);
                    File[] files = firstF.listFiles();
                    if (null == files) {
                        //System.out.println(firstF.getAbsolutePath());
                        continue;
                    }
                    for (File f : files) {
                        if (f.isDirectory()) {
                            //System.out.println("文件夹:" + f.getAbsolutePath());
                            list.add(f);
                        } else {
                            //System.out.println("文件:" + f.getAbsolutePath());
                            if(f.getAbsolutePath().endsWith(".pdf"))
                                pdfList.add(f);
                        }
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        //输出所有pdf文件的路径

        for(Object f : pdfList){
            System.out.println(f);
            log.info(f.toString());
            listPath.add(f);
        }

        return listPath;

    }

    /***
     * 下载当天sftp文件夹中的所有文件
     * @param
     */
    public void SftpPdf() {
        Joblog joblog=new Joblog();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        joblog.setStarttime(new Date());
        joblog.setJobtype("从sftp下载文件");
        SFTPUtils sftp = null;
        //下载成功的pdf数量
        int downpdfcount=0;
        int pdfcount=0;
        int xlsxcount=0;
        try {
            sftp = new SFTPUtils(host,port,username, password);//
            boolean connect = sftp.connect();
            log.info("sftp登录:"+connect);
            String directory= path+df.format(calendar.getTime())+"/";
            String templatePath = winvoluntarilyPath;
            if("L".equals(Constant.osName())){
                templatePath=linuxvoluntarilyPath;
            }
            templatePath+=df.format(calendar.getTime());
            List<String> list = SFTPUtils.batchDownLoadFile(directory, templatePath);
            downpdfcount=list.size();
            for (int i = 0; i < list.size(); i++) {
                //根据路径直接上传pdf到联想云
                String sufix=list.get(i).substring(list.get(i).indexOf(".")+1);
                if("pdf".equals(sufix)){
                    pdfcount++;
//                    lenovoService.lenvoFileUploadall(list.get(i).toString());
                }if("xls".equals(sufix)){
                    xlsxcount++;
                }
                System.out.println(list.get(i));
            }
            log.info("当前日期"+df.format(new Date())+"从sftp中获取的文件总数量:"+downpdfcount+"其中pdf文件的数量为"+pdfcount+"xls文件的数量为："+xlsxcount);
            joblog.setException("当前日期"+df.format(new Date())+"从sftp中获取的文件总数量:"+downpdfcount+"其中pdf文件的数量为"+pdfcount+"xls文件的数量为："+xlsxcount);
        } catch (Exception e) {
            joblog.setException(e.getMessage());
            e.printStackTrace();
            log.error(e.getMessage());

        }finally
        {
            sftp.disconnect();
            joblog.setTotal(downpdfcount);
            joblog.setSuccupdate(pdfcount);
            joblog.setSuccinstart(xlsxcount);
            joblog.setEndtime(new Date());
            joblogMapper.insert(joblog);
        }
    }


    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式


        SimpleDateFormat sj = new SimpleDateFormat("yyyyMMdd");
        String today = "20220201";
        Date d = sj.parse(today);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 1);
        System.out.println("明天：" +      sj.format(calendar.getTime()));
        //此时日期变为2015-12-01 ，所以下面的-2，
        //理论上讲应该是2015-11-29
        calendar.add(calendar.DATE, -2);
        System.out.println("前天：" + sj.format(calendar.getTime()));

//        String filePath="/file/voluntarilytemplate/20220127/20220127.xlsx";
//        String extString = filePath.substring(0,filePath.lastIndexOf("/"));
//        System.out.println(filePath.indexOf("/"));
    }

}
