package org.ks.sys.declarationuser.ctrl;

import io.swagger.annotations.Api;
import org.ks.enums.StatusCodeEnum;
import org.ks.sys.declaration.bean.TblDeclaration;
import org.ks.sys.declaration.service.impl.DeclarationServiceImpl;
import org.ks.sys.declaration.vo.ConditionalQueryDecl;
import org.ks.sys.declarationuser.bean.TblDeclarationUser;
import org.ks.sys.declarationuser.service.TblDeclarationUserService;
import org.ks.sys.declarationuser.vo.ConditionalQueryDeclUser;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fangshaofeng
 * @date 2022/1/10
 * @apiNote
 */
@CrossOrigin
@RestController
@RequestMapping("/declartionUser")
@Api(tags = "APP接口")
public class TblDeclarationUserCtrl {

    @Autowired
    private TblDeclarationUserService tblDeclarationUserService;
    private static final Logger log = LoggerFactory.getLogger(TblDeclarationUserCtrl.class);
    /**
     * 查询报单数据
     * @param
     * @return
     */
    @RequestMapping("/memberList")
    public ResultInfo declartionshow(ConditionalQueryDeclUser conditionalQueryDeclUser){
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        log.info("======客户手机号:"+conditionalQueryDeclUser.getMobilePhone());
        log.info("======客户名称:"+conditionalQueryDeclUser.getName());
        List<TblDeclarationUser> tblDeclarationsUser = tblDeclarationUserService.selectByQueryDeclUser(conditionalQueryDeclUser);
        re.setData(tblDeclarationsUser);
        re.setTotal((long) tblDeclarationsUser.size());

        return re;
    }

}
