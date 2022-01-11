package org.ks.sys.declarationuser.ctrl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.declaration.bean.TblDeclaration;
import org.ks.sys.declaration.vo.ConditionalQueryDecl;
import org.ks.sys.declarationuser.service.TblDeclarationUserService;
import org.ks.util.ResultInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author fangshaofeng
 * @date 2022/1/10
 * @apiNote
 */
public class TblDeclarationUserCtrl {

    @Autowired
    private TblDeclarationUserService tblDeclarationUserService;

}
