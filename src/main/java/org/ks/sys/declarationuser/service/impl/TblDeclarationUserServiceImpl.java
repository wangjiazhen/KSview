package org.ks.sys.declarationuser.service.impl;

import org.ks.sys.declaration.service.impl.DeclarationServiceImpl;
import org.ks.sys.declaration.vo.ConditionalQueryDecl;
import org.ks.sys.declarationuser.bean.TblDeclarationUser;
import org.ks.sys.declarationuser.bean.TblDeclarationUserExample;
import org.ks.sys.declarationuser.mapper.TblDeclarationUserMapper;
import org.ks.sys.declarationuser.service.TblDeclarationUserService;
import org.ks.sys.declarationuser.vo.ConditionalQueryDeclUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fangshaofeng
 * @date 2022/1/10
 * @apiNote
 */
@Service
public class TblDeclarationUserServiceImpl implements TblDeclarationUserService {

    private static final Logger log = LoggerFactory.getLogger(TblDeclarationUserServiceImpl.class);
    @Autowired
    private TblDeclarationUserMapper tblDeclarationUserMapper;

    @Override
    public long countByExample(TblDeclarationUserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TblDeclarationUserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long userId) {
        return 0;
    }

    @Override
    public int insert(TblDeclarationUser record) {
        return 0;
    }

    @Override
    public int insertSelective(TblDeclarationUser record) {
        return 0;
    }

    @Override
    public List<TblDeclarationUser> selectByExample(TblDeclarationUserExample example) {
        return null;
    }

    @Override
    public List<TblDeclarationUser> selectByQueryDeclUser(ConditionalQueryDeclUser conditionalQueryDeclUser) {

        return tblDeclarationUserMapper.selectByQueryDeclUser(conditionalQueryDeclUser);
    }

    @Override
    public TblDeclarationUser selectByPrimaryKey(Long userId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(TblDeclarationUser record, TblDeclarationUserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(TblDeclarationUser record, TblDeclarationUserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(TblDeclarationUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TblDeclarationUser record) {
        return 0;
    }
}
