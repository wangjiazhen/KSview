package org.ks.sys.declaration.ctrl;

import io.swagger.annotations.Api;
import org.ks.enums.StatusCodeEnum;
import org.ks.sys.declaration.bean.TblDeclaration;
import org.ks.sys.declaration.bean.TblDeclarationExample;
import org.ks.sys.declaration.service.DeclarationService;
import org.ks.sys.declaration.service.impl.DeclarationServiceImpl;
import org.ks.sys.declaration.vo.ConditionalQueryDecl;
import org.ks.sys.po.TblUser;
import org.ks.sys.user.vo.ConditionalQuery;
import org.ks.sys.user.vo.UserVoUser;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/declartion")
@Api(tags = "APP接口")
public class DeclartionCtrl {
    private static final Logger log = LoggerFactory.getLogger(DeclarationServiceImpl.class);


    @Autowired
    private DeclarationService declarationService;

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
    public ResultInfo userUpdate(TblDeclaration tblDeclaration){

        TblDeclaration tblDecl=new TblDeclaration();
        BeanUtils.copyProperties(tblDeclaration,tblDecl);

        return declarationService.updateByPrimaryKeySelectiveResultInfo(tblDecl);
    }

}

