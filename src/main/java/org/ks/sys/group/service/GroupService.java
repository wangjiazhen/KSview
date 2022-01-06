package org.ks.sys.group.service;

import org.ks.sys.group.dto.FormInfoData;
import org.ks.sys.group.dto.GroupDto;
import org.ks.sys.group.vo.GroupVo;
import org.ks.util.ResultInfo;
import org.springframework.stereotype.Service;
import org.ks.sys.po.TblGroup;

import java.util.List;

/**
 * @author  wangbiao
 */
@Service
public interface GroupService {

    /**
     * 根据用户组id查询用户组信息
     * @param groupId
     * @return
     */
    ResultInfo selectByPrimaryKey(Long groupId);

    /**
     * 新增一条用户组数据
     * @param groupDto
     * @return
     */
    ResultInfo insertSelective(GroupDto groupDto);

    /**
     * 查询所有用户组信息
     * @return
     */
    ResultInfo<List<TblGroup>> selectByExample();

    /**
     * 修改一条用户组信息
     * @param record
     * @return
     */
    ResultInfo updateGroupSelective(GroupDto record);

    /**
     * 查询所有用户组信息-排序
     * @param groupNameInfo
     * @return
     */
    ResultInfo<List<TblGroup>> selectListGroup(FormInfoData groupNameInfo);

    /**
     * 查询是否有相同名字用户组
     * @param groupDto
     * @return
     */
    ResultInfo queryByName(GroupDto groupDto);

    /**
     * 切换是否启用状态
     * @param groupVo
     * @return
     */
    ResultInfo updateFlag(GroupVo groupVo);

}
