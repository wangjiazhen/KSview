package org.ks.sys.role.service.impl;


import java.util.Date;
import java.util.List;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.po.TblRoleAuthRel;
import org.ks.sys.po.TblRoleExample;
import org.ks.sys.role.dto.RoleAddAndUpdateDto;
import org.ks.system.UserInfo;
import org.ks.util.ResultInfo;
import org.ks.util.SeqUtil;
import org.ks.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import org.ks.sys.mapper.TblRoleMapper;
import org.ks.sys.po.TblRole;
import org.ks.sys.po.TblRoleAuthRelExample;
import org.ks.sys.role.service.RoleService;
/**
 * @author : Aaron
 * <p>
 * create at:  2020-04-15  20:30
 * <p>
 * description: 角色service实现类
 */
@Service
public class RoleServiceImpl implements RoleService {


    @Autowired
    private TblRoleMapper tblRoleMapper;
    private static final Logger log = LoggerFactory.getLogger(RoleServiceImpl.class);
@Autowired
private UserInfo userInfo;

    /**
     * 根据用户id查询角色结合
     * @param userId
     * @return
     */
    @Override
    public List<TblRoleAuthRel> queryRoleByUserId(long userId) {

        if (StringUtil.isNull(userId)) {

            return null;
        }
        TblRoleAuthRelExample tblRoleAuthRelExample = new TblRoleAuthRelExample();

        TblRoleAuthRelExample.Criteria criteria = tblRoleAuthRelExample.createCriteria();


        return null;
    }


    /**
     * 查询角色列表
     *
     * @param roleName
     * @param createAcct
     * @param updateAcct
     * @return
     */
    @Override
    public List<TblRole> roleList(String roleName, String createAcct, String updateAcct) {
        TblRoleExample example = new TblRoleExample();
        example.setOrderByClause("update_time DESC");
        TblRoleExample.Criteria criteria = example.createCriteria();
        if (roleName == null) {
            roleName = "";
        }
        if (createAcct == null) {
            createAcct = "";
        }
        if (updateAcct == null) {
            updateAcct = "";
        }

        criteria.andRoleNameLike("%" + roleName + "%").andCreateAcctLike("%" + createAcct + "%").andUpdateAcctLike("%" + updateAcct + "%");
        List<TblRole> tblRoles = tblRoleMapper.selectByExample(example);
        return tblRoles;
    }

    /**
     * 查询角色列表
     *
     * @param roleName
     * @param createAcct
     * @param updateAcct
     * @return
     */
    @Override
    public ResultInfo<List<TblRole>> queryRoleList(String roleName, String createAcct, String updateAcct) {
        List<TblRole> tblRoles = roleList(roleName, createAcct, updateAcct);
        log.info(tblRoles.toString());
        if (CollectionUtils.isEmpty(tblRoles)) {
            log.info("角色列表为空");
            ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.NOT_FOUND, "角色列表为空");
            resultInfo.setData(0);
            return resultInfo;
        }
        ResultInfo<List<TblRole>> res = new ResultInfo<>(StatusCodeEnum.OK, "查询角色列表成功");
        long size = tblRoles.size();
        res.setTotal(size);
        res.setData(tblRoles);
        log.debug(res.toString());
        return res;

    }

    /**
     * 添加角色
     *
     * @param roleAddAndUpdateDto
     * @return ResultInfo
     */
    @Override
    public ResultInfo insertRole(RoleAddAndUpdateDto roleAddAndUpdateDto) {
        String userId = userInfo.getUserId();
        if (selectRoleByNameAndCode(roleAddAndUpdateDto) == null) {
            TblRole role = new TblRole();
            BeanUtils.copyProperties(roleAddAndUpdateDto, role);
            try {
                role.setRoleId(SeqUtil.getNextId());
            } catch (Exception e) {
                e.printStackTrace();
            }
            Date date = new Date();
            role.setCreateTime(date);
            role.setUpdateTime(date);
            role.setUpdateAcct(userId);
            role.setCreateAcct(userId);
            role.setUseFlag(1);
            int insert = tblRoleMapper.insert(role);
            if (insert == 0) {
                log.info("插入角色失败");
                return new ResultInfo(StatusCodeEnum.NOT_FOUND, "插入角色失败");
            }
            return new ResultInfo(StatusCodeEnum.OK, "插入角色成功");
        }
        return selectRoleByNameAndCode(roleAddAndUpdateDto);

    }

    /**
     * 根据ID查询
     *
     * @param roleId
     * @return ResultInfo
     */
    @Override
    public ResultInfo selectRoleById(Long roleId) {
        TblRoleExample example = new TblRoleExample();
        TblRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdEqualTo(roleId);
        List<TblRole> tblRoles = tblRoleMapper.selectByExample(example);
        if (tblRoles.isEmpty()) {
            log.info("查询角色失败");
            return new ResultInfo(StatusCodeEnum.NOT_FOUND, "查询角色失败");
        }
        ResultInfo<List<TblRole>> res = new ResultInfo<>(StatusCodeEnum.OK, "查询角色列表成功");
        res.setData(tblRoles);
        log.debug(res.toString());
        return res;
    }

    /**
     * 更新角色
     *
     * @param roleAddAndUpdateDto
     * @return
     */
    @Override
    public ResultInfo updateRoleSelective(RoleAddAndUpdateDto roleAddAndUpdateDto) {
        String userId = userInfo.getUserId();
        if (selectRoleByNameAndCode(roleAddAndUpdateDto) == null) {
            TblRole role = new TblRole();
            BeanUtils.copyProperties(roleAddAndUpdateDto, role);
            role.setUpdateAcct(userId);
            role.setUpdateTime(new Date());
            int update = tblRoleMapper.updateByPrimaryKeySelective(role);
            if (update == 0) {
                log.info("根据主键更新失败");
                return new ResultInfo(StatusCodeEnum.NOT_FOUND, "更新角色失败");
            }
            return new ResultInfo(StatusCodeEnum.OK, "更新角色成功");
        }
        return selectRoleByNameAndCode(roleAddAndUpdateDto);

    }

    /**
     * 更新或者添加时根据角色名称和角色代码查询角色
     *
     * @param roleAddAndUpdateDto
     * @return
     */

    @Override
    public ResultInfo selectRoleByNameAndCode(RoleAddAndUpdateDto roleAddAndUpdateDto) {
        TblRole role = new TblRole();
        BeanUtils.copyProperties(roleAddAndUpdateDto, role);
        Long roleId = role.getRoleId();
        TblRoleExample exampleByName = new TblRoleExample();
        TblRoleExample.Criteria criteriaByName = exampleByName.createCriteria();
        criteriaByName.andRoleNameEqualTo(role.getRoleName());
        List<TblRole> tblRolesByName = tblRoleMapper.selectByExample(exampleByName);

        TblRoleExample tblRoleExampleByCode = new TblRoleExample();
        TblRoleExample.Criteria criteriaByCode = tblRoleExampleByCode.createCriteria();
        criteriaByCode.andRoleCodeEqualTo(role.getRoleCode());
        List<TblRole> tblRolesByCode = tblRoleMapper.selectByExample(tblRoleExampleByCode);

        if (!tblRolesByCode.isEmpty()) {
            Long roleIdByCodeOfDatabase = tblRolesByCode.get(0).getRoleId();
            if (roleIdByCodeOfDatabase.equals(roleId)) {
                return selectRoleByRoleName(tblRolesByName, roleId);
            }
            ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.UNSUPPORTED_MEDIA_TYPE, "角色代码已存在，请重新输入");
            resultInfo.setData(tblRolesByCode);
            log.info(resultInfo.toString());
            return resultInfo;
        }
        return selectRoleByRoleName(tblRolesByName, roleId);
    }

    /**
     * 根据角色名称查询角色
     *
     * @param tblRoleList
     * @param roleId
     * @return
     */
    private ResultInfo selectRoleByRoleName(List<TblRole> tblRoleList, Long roleId) {
        if (!tblRoleList.isEmpty()) {
            Long roleIdByNameOfDatabase = tblRoleList.get(0).getRoleId();
            if (roleIdByNameOfDatabase.equals(roleId)) {
                log.info("开始更新了");
                return null;
            }
            ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.UNSUPPORTED_MEDIA_TYPE, "角色名称已存在，请重新输入");
            resultInfo.setData(tblRoleList);
            log.info(resultInfo.toString());
            return resultInfo;
        }
        return null;
    }

    /**
     * 更新角色状态
     *
     * @param roleId
     * @param useFlag
     * @return
     */
    @Override
    public ResultInfo updateUseFlagOfRole(Long roleId, Integer useFlag) {
        TblRole tblRole = new TblRole();
        tblRole.setRoleId(roleId);
        if (useFlag == 1) {
            tblRole.setUseFlag(0);
            tblRoleMapper.updateByPrimaryKeySelective(tblRole);
            return new ResultInfo(StatusCodeEnum.OK, "禁用角色成功");
        }
        tblRole.setUseFlag(1);
        tblRoleMapper.updateByPrimaryKeySelective(tblRole);
        return new ResultInfo(StatusCodeEnum.OK, "启用角色成功");
    }


}

