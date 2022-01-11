package org.ks.sys.declaration.ctrl;

import com.lenovo.css.boxsdk.exception.BoxException;
import com.lenovo.css.boxsdk.file.model.FileModel;
import com.lenovo.css.boxsdk.file.model.PreviewModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.ks.enums.StatusCodeEnum;
import org.ks.sys.declaration.bean.TblDeclaration;
import org.ks.sys.declaration.bean.TblDeclarationExample;
import org.ks.sys.declaration.service.DeclarationService;
import org.ks.sys.declaration.service.impl.DeclarationServiceImpl;
import org.ks.sys.declaration.vo.ConditionalQueryDecl;
import org.ks.sys.declaration.vo.ConditionalupdateDecl;
import org.ks.sys.po.TblUser;
import org.ks.sys.user.vo.ConditionalQuery;
import org.ks.sys.user.vo.UserVoUser;
import org.ks.util.LenovoService;
import org.ks.util.LocalDateTimeUtil;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    ResultInfo uploadFile(@RequestParam("filename") MultipartFile file) throws FileNotFoundException, BoxException {
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
        String templatePath = "E:/file/template/";
        log.info("文件路径:" + templatePath);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //获取文件名
        String prefixName = fileName.substring(0, fileName.lastIndexOf("."));
        // 解决中文问题,liunx 下中文路径,图片显示问题
        fileName = UUID.randomUUID() + suffixName;
        File dest0 = new File(templatePath);
        File dest = new File(dest0, prefixName + File.separator + fileName);
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



}

