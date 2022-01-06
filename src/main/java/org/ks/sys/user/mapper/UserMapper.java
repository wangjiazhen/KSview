package org.ks.sys.user.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.ks.sys.user.vo.ConditionalQuery;
import org.ks.sys.user.vo.UserVoFlag;
import org.ks.sys.user.vo.UserVoUser;
import org.ks.sys.vo.MenuVo;
import org.ks.sys.po.TblOrg;
import org.ks.sys.user.pojo.User;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {


    /**
     * 查询用户
     * @param conditionalQuery
     * @return
     */

    List<User> selectUser(ConditionalQuery conditionalQuery);
    /**
     * 查询所有数据供user使用-->
     */

    /**
     * 查询机构
     * @return
     */
    List<TblOrg> selectOrg();

    /**
     * 查询机构
     * @return
     */
    List<MenuVo> selectOrgVo();

    /**
     * 查询为空的user
     * @return
     */
    List<User> selectUserNull();

    /**
     * 修改空的用户机构
     * @param list
     * @return
     */
    int updataUserOrg(List<Map<String,Object>> list);

    /**
     * 验证是否存在
     * @param voUser
     * @return
     */
    List<UserVoUser> ckUser(UserVoUser voUser);

    /**
     * 禁用修改
     * @param userVoFlag
     * @return
     */
    int upFlag(UserVoFlag userVoFlag);
}
