package org.ks.sys.group.service.impl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.group.dto.FormInfoData;
import org.ks.sys.group.dto.GroupDto;
import org.ks.sys.group.mapper.GroupMapper;
import org.ks.sys.group.service.GroupService;
import org.ks.sys.group.vo.GroupVo;
import org.ks.sys.mapper.TblGroupCustomMapper;
import org.ks.sys.mapper.TblGroupMapper;
import org.ks.system.UserInfo;
import org.ks.util.ResultInfo;
import org.ks.util.SeqUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import org.ks.sys.po.TblGroup;
import org.ks.sys.po.TblGroupExample;


import java.util.Date;
import java.util.List;

/**
 * @author wangbiao
 */
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private TblGroupMapper tblGroupMapper;
    @Autowired
    private TblGroupCustomMapper tblGroupCustomMapper;
    @Autowired
    private GroupMapper groupMapper;
    @Autowired
    private UserInfo userInfo;


    private static final Logger log = LoggerFactory.getLogger(GroupServiceImpl.class);

    /**
     * 根据用户组id查询用户组信息
     *
     * @param groupId
     * @return
     */
    @Override
    public ResultInfo selectByPrimaryKey(Long groupId) {
        TblGroupExample example = new TblGroupExample();
        TblGroupExample.Criteria criteria = example.createCriteria();
        criteria.andGroupIdEqualTo(groupId);
        List<TblGroup> groups = tblGroupMapper.selectByExample(example);
        if (groups.isEmpty()) {
            log.info("查询用户组失败");
            return new ResultInfo(StatusCodeEnum.NOT_FOUND, "查询用户组失败");
        }
        ResultInfo<List<TblGroup>> info = new ResultInfo<>(StatusCodeEnum.OK, "查询用户组成功");
        info.setData(groups);
        log.debug(info.toString());
        return info;
    }

    /**
     * 新增一条用户组数据
     *
     * @param groupDto
     * @return
     */
    @Override
    public ResultInfo insertSelective(GroupDto groupDto) {
        ResultInfo info = queryByName(groupDto);
        if(info == null){
            TblGroup group = new TblGroup();
            BeanUtils.copyProperties(groupDto,group);
            // 创建人
            group.setCreateAcct(userInfo.getUserId());
            group.setUpdateAcct(userInfo.getUserId());
            group.setCreateTime(new Date());
            group.setUpdateTime(new Date());
            group.setUseFlag(0);
            group.setGroupId(SeqUtil.getNextId());
            int insert = tblGroupMapper.insert(group);
            if (insert == 0) {
                log.info("插入用户组失败");
                return new ResultInfo(StatusCodeEnum.NOT_FOUND, "插入用户组失败");
            }
            return new ResultInfo(StatusCodeEnum.OK, "插入用户组成功");
        }
        return queryByName(groupDto);
    }

    /**
     * 查询所有用户组信息
     *
     * @return
     */
    @Override
    public ResultInfo<List<TblGroup>> selectByExample() {
        TblGroupExample tblGroupExample = new TblGroupExample();
        List<TblGroup> tblGroups = tblGroupMapper.selectByExample(tblGroupExample);
        if (CollectionUtils.isEmpty(tblGroups)) {
            log.info("用户组列表为空");
            ResultInfo<List<TblGroup>> resultInfo = new ResultInfo<List<TblGroup>>(StatusCodeEnum.NOT_FOUND, "用户组列表为空");
            return resultInfo;
        }
        ResultInfo<List<TblGroup>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "用户组查询成功");
        long size = tblGroups.size();
        resultInfo.setTotal(size);
        resultInfo.setData(tblGroups);
        log.debug(resultInfo.toString());
        return resultInfo;
    }


    /**
     * 更新一条用户组信息
     *
     * @param groupDto
     * @return
     */
    @Override
    public ResultInfo updateGroupSelective(GroupDto groupDto) {
        TblGroup tblGroup = new TblGroup();
        BeanUtils.copyProperties(groupDto,tblGroup);
        ResultInfo info = queryByName(groupDto);
        if(info == null){
            TblGroupExample example = new TblGroupExample();
            TblGroupExample.Criteria criteria = example.createCriteria();
            criteria.andGroupIdEqualTo(tblGroup.getGroupId());
            tblGroup.setUpdateTime(new Date());
            // 修改人
            tblGroup.setUpdateAcct(userInfo.getUserId());
            int updateGroup = tblGroupMapper.updateByExampleSelective(tblGroup, example);
            if (updateGroup == 0) {
                return new ResultInfo(StatusCodeEnum.NOT_FOUND, "更新用户组信息失败");
            }
            return new ResultInfo(StatusCodeEnum.OK, "更新成功");
        }
        return queryByName(groupDto);
    }

    /**
     * 排序查询用户组信息
     *
     * @return
     */
    @Override
    public ResultInfo<List<TblGroup>> selectListGroup(FormInfoData groupNameInfo) {
        List<TblGroup> tblGroups = tblGroupCustomMapper.selectListGroup(groupNameInfo);
        if (CollectionUtils.isEmpty(tblGroups)) {
            log.info("用户组列表为空");
            ResultInfo<List<TblGroup>> resultInfo = new ResultInfo<List<TblGroup>>(StatusCodeEnum.NOT_FOUND, "用户组列表为空");
            return resultInfo;
        }
        ResultInfo<List<TblGroup>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "用户组查询成功");
        long size = tblGroups.size();
        resultInfo.setTotal(size);
        resultInfo.setData(tblGroups);
        log.debug(resultInfo.toString());
        return resultInfo;
    }

    /**
     * 查询数据库是否有名字一样的
     * @param groupDto
     * @return
     */
    @Override
    public ResultInfo queryByName(GroupDto groupDto) {
        TblGroup tblGroup = new TblGroup();
        BeanUtils.copyProperties(groupDto, tblGroup);
        Long groupId = tblGroup.getGroupId();
        TblGroupExample tblGroupExample = new TblGroupExample();
        TblGroupExample.Criteria criteria = tblGroupExample.createCriteria();
        criteria.andGroupNameEqualTo(tblGroup.getGroupName());
        List<TblGroup> tblGroupNames = tblGroupMapper.selectByExample(tblGroupExample);
        ResultInfo resultInfo = null;
        if (!tblGroupNames.isEmpty()) {
            Long id = tblGroupNames.get(0).getGroupId();
            // 比较查询出当前的一条数据的id，和数据库的groupId，进行比较是否相等
            if (id.equals(groupId)) {
                log.info("开始编辑");
                return null;
            }
            resultInfo = new ResultInfo(StatusCodeEnum.UNSUPPORTED_MEDIA_TYPE, "该名称已存在，不可以重复");
            resultInfo.setData(tblGroupNames);
            log.info(resultInfo.toString());
            return resultInfo;
        }
        return resultInfo;
    }

    /**
     * 切换是否启用状态
     * @param groupVo
     * @return
     */
    @Override
    public ResultInfo updateFlag(GroupVo groupVo) {
        ResultInfo resultInfo = null;
        if (groupVo != null){
            resultInfo = new ResultInfo(StatusCodeEnum.OK,"修改成功");
            resultInfo.setData(groupMapper.updateFalg(groupVo));
        }

        return resultInfo;
    }


}
