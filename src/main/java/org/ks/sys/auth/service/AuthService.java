package org.ks.sys.auth.service;

import org.ks.sys.auth.dto.AuthAddAndUpdateDto;
import org.ks.util.ResultInfo;
import org.springframework.stereotype.Service;
import org.ks.sys.po.TblAuth;

import java.util.List;

/**
 * @author mulishuai
 */
@Service
public interface AuthService {

    /**
     * 查询权限列表
     *
     * @param authName
     * @param createAcct
     * @param updateAcct
     * @return
     */
    ResultInfo<List<TblAuth>> queryAuthList(String authName, String createAcct, String updateAcct);

    /**
     * 添加
     *
     * @param authAddAndUpdateDto
     * @return ResultInfo
     */

    ResultInfo insertAuth(AuthAddAndUpdateDto authAddAndUpdateDto);

    /**
     * 根据ID查询
     *
     * @param longAuthId
     * @return
     */
    ResultInfo selectAuthById(Long longAuthId);


    /**
     * 模糊查询权限列表
     *
     * @param authName
     * @param createAcct
     * @param updateAcct
     * @return
     */
    List<TblAuth> authList(String authName, String createAcct, String updateAcct);

    /**
     * 更新
     *
     * @param authAddAndUpdateDto
     * @return
     */

    ResultInfo updateAuthSelective(AuthAddAndUpdateDto authAddAndUpdateDto);

    /**
     * 更新或者添加时根据权限名称和权限代码查询权限
     *
     * @param authAddAndUpdateDto
     * @return
     */
    ResultInfo selectAuthByNameAndCode(AuthAddAndUpdateDto authAddAndUpdateDto);

    /**
     * 更新权限状态
     *
     * @param authId
     * @param useFlag
     * @return
     */
    ResultInfo updateUseFlagOfAuth(Long authId, Integer useFlag);
}
