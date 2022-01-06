package org.ks.sys.ctrlauth.service;

import com.alibaba.fastjson.JSON;
import org.ks.enums.StatusCodeEnum;
import org.ks.sys.cache.service.RedisService;
import org.ks.sys.mapper.TblCtrlInfoMapper;
import org.ks.sys.mapper.TblCtrlUserInfoMapper;
import org.ks.system.UserInfo;
import org.ks.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.ks.sys.ctrlauth.mapper.QueryMapper;
import org.ks.sys.po.TblCtrlInfo;
import org.ks.sys.po.TblCtrlInfoExample;
import org.ks.sys.po.TblCtrlUserInfo;
import org.ks.sys.po.TblCtrlUserInfoExample;


import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author ws
 * @version 1.0
 * @date 2020/8/12 11:51
 */
@Service
public class QueryService {
    @Autowired
    private TblCtrlInfoMapper tblCtrlInfoMapper;
    @Autowired
    private TblCtrlUserInfoMapper tblCtrlUserInfoMapper;
    @Autowired
    private RedisService redisService;
    @Autowired
    private QueryMapper queryMapper;
    @Autowired
    private UserInfo userInfo;
    private Logger log = LoggerFactory.getLogger(QueryService.class);
    private static final long ONE_DAY_MS = 24 * 60 * 60L * 1000L;

    public ResultInfo<List<TblCtrlInfo>> queryAllCtrl() {
        List<TblCtrlInfo> tblCtrlInfos = tblCtrlInfoMapper.selectByExample(new TblCtrlInfoExample());
        ResultInfo<List<TblCtrlInfo>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "查询成功");
        resultInfo.setData(tblCtrlInfos);
        return resultInfo;

    }

    public ResultInfo<List<TblCtrlUserInfo>> queryAllUser(String appId,String name,String mailAddr) {
        TblCtrlUserInfoExample tblCtrlUserInfoExample = new TblCtrlUserInfoExample();
        TblCtrlUserInfoExample.Criteria criteria = tblCtrlUserInfoExample.createCriteria();
        if(!StringUtil.isNull(appId)){
            criteria.andAppIdLike("%"+appId+"%");
        }
        if(!StringUtil.isNull(name)){
            criteria.andNameLike("%"+name+"%");
        }
        if(!StringUtil.isNull(mailAddr)){
            criteria.andMailAddrLike("%"+mailAddr+"%");
        }
        List<TblCtrlUserInfo> tblCtrlUserInfos = tblCtrlUserInfoMapper.selectByExample(tblCtrlUserInfoExample);
        ResultInfo<List<TblCtrlUserInfo>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK,"查询成功");
        resultInfo.setData(tblCtrlUserInfos);
        return resultInfo;
    }

    public ResultInfo<String> getToken(String appId,String appSecret) {
        TblCtrlUserInfoExample tblCtrlUserInfoExample = new TblCtrlUserInfoExample();
        tblCtrlUserInfoExample.createCriteria().andAppIdEqualTo(appId).andAppSecretEqualTo(appSecret).andUseFlagEqualTo(1);
        List<TblCtrlUserInfo> tblCtrlUserInfos = tblCtrlUserInfoMapper.selectByExample(tblCtrlUserInfoExample);
        if(!CollectionUtils.isEmpty(tblCtrlUserInfos)){
            //有这个用户就给返回token
            TblCtrlUserInfo tblCtrlUserInfo = tblCtrlUserInfos.get(0);
            JwtModel jwtModel = new JwtModel();
            jwtModel.setAcct(tblCtrlUserInfo.getName());
            jwtModel.setUserId(tblCtrlUserInfo.getCtrlUserId());
            String newToken = null;
            try {
                newToken = JwtUtil.createJWT(SeqUtil.getNextId(Constant.SERVICE_ID_GATEWAY).toString(), jwtModel.getUserId() + "", JSON.toJSONString(jwtModel), ONE_DAY_MS);
            } catch (Exception e) {
                log.error("生成令牌异常", e);
            }
            redisService.setString(newToken,JSON.toJSONString(jwtModel));
            redisService.expire(newToken, ONE_DAY_MS, TimeUnit.MILLISECONDS);
            ResultInfo<String> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "获取成功");
            resultInfo.setData(newToken);
//            //再返回token前查询出该用户可以访问的接口地址放入缓存
//            List<String> strings = queryMapper.queryCtrlByUserId(tblCtrlUserInfo.getCtrlUserId());
//            String string1 = String.join("-",strings);
//            redisService.setString(newToken+"JKDZ",string1);
//            redisService.expire(newToken+"JKAD", ONE_DAY_MS, TimeUnit.MILLISECONDS);
            return resultInfo;
        }else{
            return new ResultInfo<>(StatusCodeEnum.UNPROCESSABLE_ENTITY,"认证失败");
        }

    }


    public ResultInfo<String> getCtrlByUserId() {
        ResultInfo<String> resultInfo = new ResultInfo<>(StatusCodeEnum.OK,"查询成功");

        String userId = userInfo.getUserId();
        TblCtrlUserInfo tblCtrlUserInfo = tblCtrlUserInfoMapper.selectByPrimaryKey(Long.valueOf(userId));
        if(tblCtrlUserInfo==null){
            resultInfo.setCode(333);
            return resultInfo;

        }else{
            List<String> strings = queryMapper.queryCtrlByUserId(Long.valueOf(userId));
            if(strings.size()==0){
                resultInfo.setCode(222);
            }
            String string1 = String.join("-",strings);
            resultInfo.setData(string1);
            return resultInfo;

        }
    }
}
