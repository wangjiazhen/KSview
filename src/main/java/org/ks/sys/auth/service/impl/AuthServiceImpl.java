package org.ks.sys.auth.service.impl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.auth.dto.AuthAddAndUpdateDto;
import org.ks.sys.po.TblAuth;
import org.ks.sys.po.TblAuthExample;
import org.ks.system.UserInfo;
import org.ks.util.ResultInfo;
import org.ks.util.SeqUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import org.ks.sys.auth.service.AuthService;
import org.ks.sys.mapper.TblAuthMapper;


import java.util.Date;
import java.util.List;

/**
 * @author : Aaron
 * <p>
 * create at:  2020-04-15  20:30
 * <p>
 * description: 权限service实现类
 */
@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserInfo userInfo;

    @Autowired
    private TblAuthMapper tblAuthMapper;
    private static final Logger log = LoggerFactory.getLogger(AuthServiceImpl.class);


    /**
     * 查询角色列表
     *
     * @param authName
     * @param createAcct
     * @param updateAcct
     * @return
     */
    @Override
    public List<TblAuth> authList(String authName, String createAcct, String updateAcct) {
        TblAuthExample example = new TblAuthExample();
        example.setOrderByClause("update_time DESC");
        TblAuthExample.Criteria criteria = example.createCriteria();
        if (authName == null) {
            authName = "";
        }
        if (createAcct == null) {
            createAcct = "";
        }
        if (updateAcct == null) {
            updateAcct = "";
        }
        criteria.andAuthNameLike("%" + authName + "%").andCreateAcctLike("%" + createAcct + "%").andUpdateAcctLike("%" + updateAcct + "%");

        List<TblAuth> tblAuths = tblAuthMapper.selectByExample(example);
        return tblAuths;
    }


    /**
     * 查询角色列表
     *
     * @param authName
     * @param createAcct
     * @param updateAcct
     * @return
     */
    @Override
    public ResultInfo<List<TblAuth>> queryAuthList(String authName, String createAcct, String updateAcct) {
        List<TblAuth> tblAuths = authList(authName, createAcct, updateAcct);
        log.info(tblAuths.toString());

            if (CollectionUtils.isEmpty(tblAuths)) {
                log.info("权限列表为空");
            return new ResultInfo(StatusCodeEnum.NOT_FOUND, "权限列表为空");
        }
        ResultInfo<List<TblAuth>> res = new ResultInfo<>(StatusCodeEnum.OK, "查询权限列表成功");
        long size = tblAuths.size();
        res.setTotal(size);
        res.setData(tblAuths);
        log.debug(res.toString());
        return res;

    }

    /**
     * 添加权限
     *
     * @param authAddAndUpdateDto
     * @return ResultInfo
     */
    @Override
    public ResultInfo insertAuth(AuthAddAndUpdateDto authAddAndUpdateDto) {
        String userId = userInfo.getUserId();
        if (selectAuthByNameAndCode(authAddAndUpdateDto) == null) {
            TblAuth auth = new TblAuth();
            BeanUtils.copyProperties(authAddAndUpdateDto, auth);
            try {
//                auth.setAuthId(SeqUtil.getNextId());
            } catch (Exception e) {
                e.printStackTrace();
            }
            auth.setCreateAcct(userId);
            Date date = new Date();
            auth.setCreateTime(date);
            auth.setUpdateAcct(userId);
            auth.setUpdateTime(date);
            auth.setUseFlag(1);
            int insert = tblAuthMapper.insert(auth);
            if (insert == 0) {
                log.info("插入权限失败");
                return new ResultInfo(StatusCodeEnum.NOT_FOUND, "插入权限失败");
            }
            return new ResultInfo(StatusCodeEnum.OK, "插入权限成功");
        } else {
            return selectAuthByNameAndCode(authAddAndUpdateDto);
        }
    }

    /**
     * 根据id查询
     *
     * @param authId
     * @return ResultInfo
     */

    @Override
    public ResultInfo selectAuthById(Long authId) {
        TblAuthExample example = new TblAuthExample();
        TblAuthExample.Criteria criteria = example.createCriteria();
        criteria.andAuthIdEqualTo(authId);
        List<TblAuth> tblAuths = tblAuthMapper.selectByExample(example);
        if (tblAuths.isEmpty()) {
            log.info("查询权限失败");
            return new ResultInfo(StatusCodeEnum.NOT_FOUND, "查询权限失败");
        }
        ResultInfo<List<TblAuth>> res = new ResultInfo<>(StatusCodeEnum.OK, "查询权限列表成功");
        res.setData(tblAuths);
        log.debug(res.toString());
        return res;
    }

    /**
     * 更新
     *
     * @param authAddAndUpdateDto
     * @return
     */

    @Override
    public ResultInfo updateAuthSelective(AuthAddAndUpdateDto authAddAndUpdateDto) {
        String userId = userInfo.getUserId();
        if (selectAuthByNameAndCode(authAddAndUpdateDto) == null) {
            TblAuth auth = new TblAuth();
            BeanUtils.copyProperties(authAddAndUpdateDto, auth);
            TblAuthExample example = new TblAuthExample();
            TblAuthExample.Criteria criteria = example.createCriteria();
            criteria.andAuthIdEqualTo(auth.getAuthId());
            auth.setUpdateTime(new Date());
            auth.setUpdateAcct(userId);
            int update = tblAuthMapper.updateByExampleSelective(auth, example);
            if (update == 0) {
                return new ResultInfo(StatusCodeEnum.NOT_FOUND, "更新权限失败");
            }

            return new ResultInfo(StatusCodeEnum.OK, "更新权限成功");
        }
        return selectAuthByNameAndCode(authAddAndUpdateDto);

    }

    /**
     * 根据权限名称和权限代码查询权限
     *
     * @param authAddAndUpdateDto
     * @return
     */
    @Override
    public ResultInfo selectAuthByNameAndCode(AuthAddAndUpdateDto authAddAndUpdateDto) {
        TblAuth auth = new TblAuth();
        BeanUtils.copyProperties(authAddAndUpdateDto, auth);
        Long authId = auth.getAuthId();
        /**
         *根据前台输入name判断数据库中有无相同的数据
         */
        TblAuthExample exampleByName = new TblAuthExample();
        TblAuthExample.Criteria criteriaByName = exampleByName.createCriteria();
        criteriaByName.andAuthNameEqualTo(auth.getAuthName());
        List<TblAuth> tblAuthsByName = tblAuthMapper.selectByExample(exampleByName);
        log.info(tblAuthsByName.toString());
        /**
         *根据前台输入code判断数据库中有无相同的数据
         */
        TblAuthExample exampleByCode = new TblAuthExample();
        TblAuthExample.Criteria criteriaByCode = exampleByCode.createCriteria();
        criteriaByCode.andAuthCodeEqualTo(auth.getAuthCode());
        List<TblAuth> tblAuthsByCode = tblAuthMapper.selectByExample(exampleByCode);
        log.info(tblAuthsByCode.toString());
        /**
         * 对查询出的数据进行判断 包括更新操作时进行的判断
         */
        if (!tblAuthsByCode.isEmpty()) {
            Long authIdOfDatabase = tblAuthsByCode.get(0).getAuthId();
            if (authIdOfDatabase.equals(authId)) {
                return selectAuthByName(tblAuthsByName, authId);
            }
            ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.UNSUPPORTED_MEDIA_TYPE, "权限代码已存在，请重新输入");
            resultInfo.setData(tblAuthsByName);
            log.info(resultInfo.toString());
            return resultInfo;
        }
        return selectAuthByName(tblAuthsByName, authId);
    }

    /**
     * @param tblAuths
     * @param authId
     * @return
     */
    private ResultInfo selectAuthByName(List<TblAuth> tblAuths, Long authId) {

        if (!tblAuths.isEmpty()) {
            Long authIdByNameOfDatabase = tblAuths.get(0).getAuthId();
            if (authIdByNameOfDatabase.equals(authId)) {
                log.info("开始更新了");
                return null;
            }
            ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.UNSUPPORTED_MEDIA_TYPE, "权限名称已存在，请重新输入");
            resultInfo.setData(tblAuths);
            log.info(resultInfo.toString());
            return resultInfo;
        }
        return null;
    }

    /**
     * 更新角色状态
     *
     * @param authId
     * @param useFlag
     * @return
     */
    @Override
    public ResultInfo updateUseFlagOfAuth(Long authId, Integer useFlag) {
        TblAuth auth = new TblAuth();
        auth.setAuthId(authId);
        if (useFlag == 1) {
            auth.setUseFlag(0);
            tblAuthMapper.updateByPrimaryKeySelective(auth);
            return new ResultInfo(StatusCodeEnum.OK, "禁用权限成功");
        }
        auth.setUseFlag(1);
        tblAuthMapper.updateByPrimaryKeySelective(auth);
        return new ResultInfo(StatusCodeEnum.OK, "启用权限成功");
    }

}

