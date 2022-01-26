package org.ks.sys.declaration.service.impl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.declaration.bean.TblDeclaration;
import org.ks.sys.declaration.bean.TblDeclarationExample;
import org.ks.sys.declaration.mapper.TblDeclarationMapper;
import org.ks.sys.declaration.service.DeclarationService;
import org.ks.sys.declaration.vo.ConditionalQueryDecl;
import org.ks.sys.declaration.vo.ConditionalupdateDecl;
import org.ks.sys.declarationuser.bean.TblDeclarationUser;
import org.ks.sys.declarationuser.bean.TblDeclarationUserExample;
import org.ks.sys.declarationuser.mapper.TblDeclarationUserMapper;
import org.ks.sys.po.TblUser;
import org.ks.sys.user.service.UserService;
import org.ks.system.UserInfo;
import org.ks.util.LocalDateTimeUtil;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Service
public class DeclarationServiceImpl implements DeclarationService {
    private static final Logger log = LoggerFactory.getLogger(DeclarationServiceImpl.class);

    @Autowired
    private TblDeclarationMapper declarationMapper;
    @Autowired
    private UserInfo userInfo;
    @Autowired
    private UserService userService;
    @Autowired
    private TblDeclarationUserMapper tblDeclarationUserMapper;

    /**
     * 是否重复标记
     */
    private static final  String CHONGFU_FLAF="chongfu";




    @Override
    public long countByExample(TblDeclarationExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TblDeclarationExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long declId) {
        return 0;
    }

    @Override
    public int insert(TblDeclaration record) {
        return 0;
    }

    @Override
    public int insertSelective(TblDeclaration record) {
        return 0;
    }

    @Override
    public List<TblDeclaration> selectByExample(TblDeclarationExample example) {
        return null;
    }


    @Override
    public List<TblDeclaration> selectByQueryDecl(ConditionalQueryDecl conditionalQueryDecl) {
        List<TblDeclaration> tblDeclarations=declarationMapper.selectByQueryDecl(conditionalQueryDecl);
        return tblDeclarations;

    }

    @Override
    public ResultInfo updateByPrimaryKeySelectiveResultInfo(ConditionalupdateDecl conditionalupdateDecl) {
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        TblDeclaration tblDeclarations=declarationMapper.selectByPrimaryKey(conditionalupdateDecl.getDeclId());
        if("".equals(tblDeclarations)){
            re=new ResultInfo(StatusCodeEnum.NOT_FOUND,"成功");
            re.setData(tblDeclarations);
            return re;
        }

        tblDeclarations.setFlag(0);
        //修改启用标志
        int count=declarationMapper.updateByPrimaryKey(tblDeclarations);
        TblDeclaration tblDecladd=new TblDeclaration();
        //创建新的数据
        tblDecladd.setFlag(1);
        tblDecladd.setDeclUrl(conditionalupdateDecl.getDeclUrl());
        tblDecladd.setDeclUrlAcct(conditionalupdateDecl.getDeclUrlAcct());
        TblUser tblUser=userService.selectByPrimaryKey(Long.valueOf(userInfo.getUserId()));
        tblDecladd.setUpdateAcct(tblUser.getAcct());
        LocalDateTime now = LocalDateTime.now();
        tblDecladd.setUpdateTime(LocalDateTimeUtil.getDate(now));
        tblDecladd.setCreateTime(tblDeclarations.getCreateTime());
        tblDecladd.setRealName(tblDeclarations.getRealName());
        tblDecladd.setMobilePhone(tblDeclarations.getMobilePhone());
        tblDecladd.setCreateAcct(tblDeclarations.getCreateAcct());
        tblDecladd.setDeclUrlImage(conditionalupdateDecl.getDeclUrlImage());

        declarationMapper.insert(tblDecladd);
        re.setData(tblDeclarations);
        return re;
    }

    @Override
    public ResultInfo insertResult(TblDeclaration record) {
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        List<TblDeclaration> tblDeclarations=declarationMapper.selectByQueryDeclphone(record.getMobilePhone());

        if(tblDeclarations.size()>0){
            re.setData(CHONGFU_FLAF);
            return re;
        }

        LocalDateTime now = LocalDateTime.now();
        TblUser tblUser=userService.selectByPrimaryKey(Long.valueOf(userInfo.getUserId()));
        record.setCreateAcct(tblUser.getAcct());
        record.setCreateTime(LocalDateTimeUtil.getDate(now));
        record.setFlag(1);
        declarationMapper.insert(record);
        return re;
    }

    @Override
    public String insertbatch(TblDeclaration record) {
        //根据手机号查询 如果有数据 就进行修改 没有的话 直接新增
        List<TblDeclaration> tblDeclarations=declarationMapper.selectByQueryDeclphone(record.getMobilePhone());
        LocalDateTime now = LocalDateTime.now();
        if(tblDeclarations.size()>0){
          tblDeclarations.get(0).setUpdateTime(LocalDateTimeUtil.getDate(now));
          tblDeclarations.get(0).setUpdateAcct("admin");
          tblDeclarations.get(0).setDeclUrl(record.getDeclUrl());
          tblDeclarations.get(0).setDeclUrlAcct(record.getDeclUrlAcct());
          declarationMapper.updateByPrimaryKey(tblDeclarations.get(0));
          return "UPDATE";
        }

        record.setCreateAcct("admin");
        record.setCreateTime(LocalDateTimeUtil.getDate(now));
        record.setFlag(1);
        declarationMapper.insert(record);
        return "INSTAR";

    }

    @Override
    public TblDeclaration selectByPrimaryKey(Long declId) {
        TblDeclaration tblDeclaration=declarationMapper.selectByPrimaryKey(declId);
        return tblDeclaration;
    }

    @Override
    public int updateByExampleSelective(TblDeclaration record, TblDeclarationExample example) {
        return 0;
    }

    @Override
    public int updateByExample(TblDeclaration record, TblDeclarationExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(TblDeclaration record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TblDeclaration record) {
        return 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertTblDeclarationInfo(String realName, String mobilePhone, String verifyCode) {
        //根据手机号码查询是否注册
        TblDeclarationUserExample tblDeclarationUserExample = new TblDeclarationUserExample();
        tblDeclarationUserExample.createCriteria().andMobilePhoneEqualTo(mobilePhone);
        List<TblDeclarationUser> tblDeclarationUserList = tblDeclarationUserMapper.selectByExample(tblDeclarationUserExample);

//        TblDeclarationExample tblDeclarationExample = new TblDeclarationExample();
//        tblDeclarationExample.createCriteria().andMobilePhoneEqualTo(mobilePhone);
//        List<TblDeclaration> tblDeclarationList = declarationMapper.selectByExample(tblDeclarationExample);
        if(CollectionUtils.isEmpty(tblDeclarationUserList)){
            TblDeclarationUser tblDeclarationUser = new TblDeclarationUser();
//            tblDeclarationUser.setUserId(Long.parseLong(mobilePhone+ LocalDateTimeUtil.getCurrentDateTimeStr()));
            tblDeclarationUser.setName(realName);
            tblDeclarationUser.setMobilePhone(mobilePhone);
            tblDeclarationUser.setCreateTime(new Date());
            tblDeclarationUserMapper.insert(tblDeclarationUser);
        }
//        if(CollectionUtils.isEmpty(tblDeclarationList)){
//            TblDeclaration tblDeclaration = new TblDeclaration();
//            tblDeclaration.setDeclId(Long.parseLong(mobilePhone+ LocalDateTimeUtil.getCurrentDateTimeStr()));
//            tblDeclaration.setRealName(realName);
//            tblDeclaration.setMobilePhone(mobilePhone);
//            tblDeclaration.setDeclUrl("");
//            tblDeclaration.setCreateAcct("admin");
//            tblDeclaration.setCreateTime(new Date());
//            tblDeclaration.setUpdateAcct("admin");
//            tblDeclaration.setUpdateTime(new Date());
//            declarationMapper.insert(tblDeclaration);
//        }
    }

    @Override
    public String policyQuery(String mobilePhone) {

        List<TblDeclaration> tblDeclaration=declarationMapper.selectByPhone(mobilePhone);
        if(!CollectionUtils.isEmpty(tblDeclaration)){
            return tblDeclaration.get(0).getDeclUrl();
        }
        return "";
    }
}
