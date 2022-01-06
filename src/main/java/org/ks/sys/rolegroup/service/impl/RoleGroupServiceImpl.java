package org.ks.sys.rolegroup.service.impl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.mapper.TblGroupRoleRelMapper;
import org.ks.sys.po.TblGroupRoleRel;
import org.ks.sys.po.TblGroupRoleRelExample;
import org.ks.sys.vo.GroupVo;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.ks.sys.rolegroup.mapper.RoleGroupMapper;
import org.ks.sys.rolegroup.service.RoleGroupService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mulishuai
 */

@Service
public class RoleGroupServiceImpl implements RoleGroupService {

    @Autowired
    RoleGroupMapper roleGroupMapper;
    private static final Logger log = LoggerFactory.getLogger(RoleGroupServiceImpl.class);

    @Autowired
    TblGroupRoleRelMapper tblGroupRoleRelMapper;


    /**
     * 先查询所有的用户组
     * 然后再根据roleId查询的用户组
     * 遍历判断   id相同的check属性为ture 不同则是默认值false
     *
     * @param roleId
     * @return
     */

    @Override
    public ResultInfo<List<GroupVo>> selectGroupsByRoleId(Long roleId) {
        List<GroupVo> groupVos = roleGroupMapper.selectAllGroup();
        log.info(groupVos.toString());
        List<GroupVo> groupVosById = roleGroupMapper.selectGroupByRoleId(roleId);
        log.info(groupVosById.toString());
        for (GroupVo groupVo : groupVos) {
            for (GroupVo vo : groupVosById) {
                if (vo.getGroupId().equals(groupVo.getGroupId())) {
                    groupVo.setCheck(true);
                }
            }
        }
        ResultInfo<List<GroupVo>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "查询成功");
        resultInfo.setTotal((long) groupVos.size());
        resultInfo.setData(groupVos);
        log.info(resultInfo.toString());
        return resultInfo;
    }

    /**
     * 根据角色id删除用户组
     *
     * @param roleId
     * @return
     */
    @Override
    public ResultInfo<List<GroupVo>> delectGroupOfRole(Long roleId) {
        log.info("删除权限的角色id是" + roleId);
        TblGroupRoleRelExample example = new TblGroupRoleRelExample();
        TblGroupRoleRelExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdEqualTo(roleId);
        int i = tblGroupRoleRelMapper.deleteByExample(example);
        if (i != 0) {
            return new ResultInfo<>(StatusCodeEnum.OK, "删除权限成功");
        }
        return new ResultInfo<>(StatusCodeEnum.NOT_FOUND, "删除权限失败");
    }

    /**
     * 根据角色id和用户组id插入数据
     *
     * @param roleId
     * @param args
     * @return
     */

    @Override
    public ResultInfo<Object> insertGroupToRole(Long roleId, String args) {
        String[] split = args.split(",");

        long[] groupIds = new long[split.length];
        for(int j = 0;j<split.length;j++){
            System.out.println(split[j]);
            groupIds[j]=Long.valueOf(split[j]);
        }
        List<TblGroupRoleRel> groupRoleRels = new ArrayList<>();

        for (long groupId : groupIds) {
            TblGroupRoleRel groupRoleRel = new TblGroupRoleRel();
            groupRoleRel.setRoleId(roleId);
            groupRoleRel.setGroupId(groupId);
            groupRoleRels.add(groupRoleRel);
        }
        int i = 0;
        if (groupRoleRels.size() > 0) {
            i = roleGroupMapper.insertGroupByRoleId(groupRoleRels);

        }
        ResultInfo<Object> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "分配用户组成功");
        resultInfo.setData("添加条数为" + i);
        return resultInfo;

    }
}
