package org.ks.sys.roleauth.service.impl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.authmenu.dto.InfoDto;
import org.ks.sys.roleauth.mapper.TblRoleAuthMapper;
import org.ks.sys.vo.AuthVo;
import org.ks.sys.vo.AuthVoTo;
import org.ks.sys.vo.RoleAuthVo;
import org.ks.system.UserInfo;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.ks.sys.roleauth.service.RoleAuthService;


import java.util.ArrayList;
import java.util.List;

/**
 * @author wangsong
 */
@Service
public class RoleAuthServiceImpl implements RoleAuthService {
    @Autowired
    private TblRoleAuthMapper tblRoleAuthMapper;
    @Autowired
    private UserInfo userInfo;
    private static final Logger log = LoggerFactory.getLogger(RoleAuthServiceImpl.class);
    /**
     *  先查询所有的权限
     *  再根据角色id查询这个角色拥有的权限
     *  双重for循环判断id是否相同
     *      相同的话说明该角色有这个权限  给check属性赋值true
     *      不同是名没有这个权限   check 默认值是false
     *
     *
     * @param roleId 角色id
     * @return
     */
    @Override
    public ResultInfo<List<AuthVo>> selectAuthByRoleId(long roleId) {
        if(roleId==0){
            log.info("角色ID为0");
            return  new ResultInfo(StatusCodeEnum.UNPROCESSABLE_ENTITY,"角色ID为0");
        }
        List<AuthVo> authVos = tblRoleAuthMapper.selectAllAuth();
        List<AuthVo> tblRoles = tblRoleAuthMapper.selectAuthByRoleId(roleId);
        for (AuthVo authVo : authVos) {
            for (AuthVo tblRole : tblRoles) {
                if(authVo.getAuthId()==tblRole.getAuthId()) {
                    authVo.setCheck(true);
                }
            }
        }
        ResultInfo<List<AuthVo>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "查询角色拥有的权限Ok");
        resultInfo.setData(authVos);
        log.info(resultInfo.toString());
        return resultInfo;
    }

    /**
     * 循环前端传过来的数组 循环将拥有的权限id放入实体类 用力动态sql的添加
     * @param roleId 角色id
     * @param args 所要添加的权限
     * @return
     */
    @Override
    public ResultInfo<Integer> insertAuthByRoleId(long roleId, String args) {
        tblRoleAuthMapper.deleteAuthByRoleId(roleId);
        String[] split = args.split(",");

        if (split.length!=0) {
            long[] arr = new long[split.length];
            for(int j = 0;j<split.length;j++){
                System.out.println(split[j]);
                arr[j]=Long.valueOf(split[j]);
            }
            List<RoleAuthVo> roleAuthVos = new ArrayList<RoleAuthVo>();
            for (Long integer : arr) {
                RoleAuthVo roleAuthVo = new RoleAuthVo();
                roleAuthVo.setRoleId(roleId);
                roleAuthVo.setAuthId(integer);
                roleAuthVos.add(roleAuthVo);
            }
            int i = tblRoleAuthMapper.insertAuthByRoleId(roleAuthVos);
            ResultInfo<Integer> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "修改权限Ok");
            resultInfo.setData(i);
            log.info(resultInfo.toString());
            return resultInfo;
        }
        ResultInfo<Integer> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "修改权限Ok");
        log.info(resultInfo.toString());
        return resultInfo;

    }


    /**
     * 方法实现说明       查询所有的权限
     * @return
     */
    @Override
    public ResultInfo<List<AuthVoTo>> selectAllAuth(InfoDto infoName) {
        List<AuthVoTo> authVos = tblRoleAuthMapper.selectAllAuthTo(infoName);
        ResultInfo<List<AuthVoTo>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "查询所有权限Ok");
        resultInfo.setData(authVos);
        System.out.println(resultInfo.getData());
        log.info(resultInfo.toString());
        return resultInfo;
    }
}
