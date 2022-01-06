package org.ks.sys.org.ctrl;

import org.ks.sys.org.vo.OrgDto;
import org.ks.sys.org.vo.OrgVo;
import org.ks.util.ResultInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.ks.sys.po.TblOrg;
import org.ks.sys.org.service.OrgService;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/org")
@RestController
public class OrgCtrl {

    @Resource
    private OrgService orgService;

    /**
     * 查询所有的机制的方法
     */
    @RequestMapping("/orglist")
    public ResultInfo<List<TblOrg>> showall(OrgDto orgDto){

        //TblOrgExample tb = new TblOrgExample();

        ResultInfo tx = orgService.selectTiaojian(orgDto);
        return tx;

    }
    /**
     * 插入数据
     */
    @RequestMapping("/orginsert")
    public ResultInfo insert(TblOrg tblOrg){

        return orgService.insertSelective(tblOrg);
    }

    /**
     *
     * 根据Id查询一个对象
     *
     */
    @RequestMapping("selectOrgById")
    public ResultInfo selectById(long orgId){

       return orgService.selectByPrimaryKey(orgId);
    }

    /**
     * 修改数据
     */
    @RequestMapping("/orgupdate")
    public ResultInfo updateByPrimaryKeySelective(TblOrg tblOrg){
        TblOrg t = new TblOrg();
        BeanUtils.copyProperties(tblOrg,t);
        return orgService.updateByPrimaryKeySelective(t);
    }

    /**
     * 修改flag
     * @param orgId
     * @param useFlag
     * @return
     */
    @RequestMapping("/upflag")
    public ResultInfo upflag(Long orgId,int useFlag){

        OrgVo o = new OrgVo();
        o.setOrgId(orgId);
        o.setUseFlag(useFlag);

        return orgService.upFlag(o);
    }

}
