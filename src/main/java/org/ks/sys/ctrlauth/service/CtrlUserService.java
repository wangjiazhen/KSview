package org.ks.sys.ctrlauth.service;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.mapper.TblCtrlUserInfoMapper;
import org.ks.sys.mapper.TblIpInfoMapper;
import org.ks.sys.mapper.TblUserCtrlRelMapper;
import org.ks.sys.po.*;
import org.ks.system.UserInfo;
import org.ks.util.LocalDateTimeUtil;
import org.ks.util.ResultInfo;
import org.ks.util.SeqUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.DigestUtils;


import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @author ws
 * @version 1.0
 * @date 2020/8/12 13:17
 */
@Service
public class CtrlUserService {
    @Autowired
    private TblCtrlUserInfoMapper tblCtrlUserInfoMapper;
    @Autowired
    private TblIpInfoMapper tblIpInfoMapper;
    @Autowired
    private TblUserCtrlRelMapper tblUserCtrlRelMapper;
    @Autowired
    private UserInfo userInfo;
    public ResultInfo<TblCtrlUserInfo> createCtrlUser(String name, String mailAddr) {
        TblCtrlUserInfo tblCtrlUserInfo = new TblCtrlUserInfo();
        tblCtrlUserInfo.setCtrlUserId(SeqUtil.getNextId());
        String s = UUID.randomUUID().toString();
        System.out.println(s);
        String[] split = s.split("-");
        StringBuffer appId = new StringBuffer();
        for (String ss : split) {
            appId.append(ss);
        }
        TblCtrlUserInfoExample tblCtrlUserInfoExample = new TblCtrlUserInfoExample();
        tblCtrlUserInfoExample.createCriteria().andAppIdEqualTo(appId.toString());
        List<TblCtrlUserInfo> tblCtrlUserInfos = tblCtrlUserInfoMapper.selectByExample(tblCtrlUserInfoExample);
        //如果生成的appid存在   就从新生成
        if(!CollectionUtils.isEmpty(tblCtrlUserInfos)){
            return createCtrlUser(name,mailAddr);
        }
        tblCtrlUserInfo.setAppId(appId.toString());
        //获取时间戳
        String timeStamp = Long.toString(System.currentTimeMillis());
        //第一次加密
        String sss = DigestUtils.md5DigestAsHex(appId.toString().getBytes()) + timeStamp;
        //第二次加密
        tblCtrlUserInfo.setAppSecret(DigestUtils.md5DigestAsHex(s.getBytes()));
        tblCtrlUserInfo.setName(name);
        tblCtrlUserInfo.setUseFlag(1);
        tblCtrlUserInfo.setUserType(1);
        tblCtrlUserInfo.setMailAddr(mailAddr);
        LocalDateTime now = LocalDateTime.now();
        tblCtrlUserInfo.setCreateAcct(userInfo.getUserId());
        tblCtrlUserInfo.setCreateTime(LocalDateTimeUtil.getDate(now));
        tblCtrlUserInfo.setUpdateAcct(userInfo.getUserId());
        tblCtrlUserInfo.setUpdateTime(LocalDateTimeUtil.getDate(now));
        int insert = tblCtrlUserInfoMapper.insert(tblCtrlUserInfo);
        if(insert==1){
            ResultInfo<TblCtrlUserInfo> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "创建用户成功");
            resultInfo.setData(tblCtrlUserInfo);
            return resultInfo;
        }else{
            ResultInfo<TblCtrlUserInfo> resultInfo = new ResultInfo<>(StatusCodeEnum.PROCESSING_EXCEPTION, "创建用户失败");
            return resultInfo;

        }
    }

    public ResultInfo addIpWhite(String ctrlUserId, String ip) {
        TblIpInfo tblIpInfo = new TblIpInfo();
        tblIpInfo.setIid(SeqUtil.getNextId());
        tblIpInfo.setIp(ip);
        tblIpInfo.setUseFlag(1);
        tblIpInfo.setCtrlUserId(ctrlUserId);
        LocalDateTime now = LocalDateTime.now();
        tblIpInfo.setCreateAcct(userInfo.getUserId());
        tblIpInfo.setCreateTime(LocalDateTimeUtil.getDate(now));
        tblIpInfo.setUpdateAcct(userInfo.getUserId());
        tblIpInfo.setUpdateTime(LocalDateTimeUtil.getDate(now));
        int insert = tblIpInfoMapper.insert(tblIpInfo);
        if(insert==1){

            ResultInfo resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "添加白名单IP成功");
            return resultInfo;
        }else{
            ResultInfo resultInfo = new ResultInfo<>(StatusCodeEnum.PROCESSING_EXCEPTION, "添加白名单IP失败");
            return resultInfo;

        }

    }

    public ResultInfo addUserCtrlRel(String ctrlUserId, String ctrlId) {
        //1删除改用户现有的接口权限
        TblUserCtrlRelExample tblUserCtrlRelExample = new TblUserCtrlRelExample();
        tblUserCtrlRelExample.createCriteria().andCtrlUserIdEqualTo(Long.valueOf(ctrlUserId));
        tblUserCtrlRelMapper.deleteByExample(tblUserCtrlRelExample);
        //2添加新选择的权限 TODO 改成动态sql
        try {
            String[] split = ctrlId.split(",");
            for (String s : split) {
                TblUserCtrlRel tblUserCtrlRel = new TblUserCtrlRel();
                tblUserCtrlRel.setCtrlId(Long.valueOf(s));
                tblUserCtrlRel.setCtrlUserId(Long.valueOf(ctrlUserId));
                tblUserCtrlRelMapper.insert(tblUserCtrlRel);
            }
            return new ResultInfo(StatusCodeEnum.OK,"添加成功");
        }catch (Exception e){
            return new ResultInfo(StatusCodeEnum.PROCESSING_EXCEPTION,"添加失败");

        }
    }

    public ResultInfo updateStatus(String ctrlUserId) {
        TblCtrlUserInfo tblCtrlUserInfo = tblCtrlUserInfoMapper.selectByPrimaryKey(Long.valueOf(ctrlUserId));
        tblCtrlUserInfo.setUseFlag(tblCtrlUserInfo.getUseFlag()==1?0:1);
        int i = tblCtrlUserInfoMapper.updateByPrimaryKey(tblCtrlUserInfo);
        if(i==1){
            return new ResultInfo(StatusCodeEnum.OK,"修改成功");
        }else{
            return new ResultInfo(StatusCodeEnum.NOT_FOUND,"修改失败");
        }

    }
}
