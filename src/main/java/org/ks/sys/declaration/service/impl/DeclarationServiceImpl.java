package org.ks.sys.declaration.service.impl;

import org.ks.sys.declaration.bean.TblDeclaration;
import org.ks.sys.declaration.bean.TblDeclarationExample;
import org.ks.sys.declaration.mapper.TblDeclarationMapper;
import org.ks.sys.declaration.service.DeclarationService;
import org.ks.sys.declaration.vo.ConditionalQueryDecl;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeclarationServiceImpl implements DeclarationService {
    private static final Logger log = LoggerFactory.getLogger(DeclarationServiceImpl.class);

    @Autowired
    private TblDeclarationMapper declarationMapper;



    @Override
    public long countByExample(TblDeclarationExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TblDeclarationExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long declId) {
        return 0;
    }

    @Override
    public int insert(TblDeclaration record) {
        return 0;
    }

    @Override
    public int insertSelective(TblDeclaration record) {
        return 0;
    }

    @Override
    public List<TblDeclaration> selectByExample(TblDeclarationExample example) {
        return null;
    }

    @Override
    public List<TblDeclaration> selectByQueryDecl(ConditionalQueryDecl conditionalQueryDecl) {
        List<TblDeclaration> tblDeclarations=declarationMapper.selectByQueryDecl(conditionalQueryDecl);
        return tblDeclarations;

    }

    @Override
    public ResultInfo updateByPrimaryKeySelectiveResultInfo(TblDeclaration record) {

        return null;
    }

    @Override
    public TblDeclaration selectByPrimaryKey(Long declId) {
        TblDeclaration tblDeclaration=declarationMapper.selectByPrimaryKey(declId);
        return tblDeclaration;
    }

    @Override
    public int updateByExampleSelective(TblDeclaration record, TblDeclarationExample example) {
        return 0;
    }

    @Override
    public int updateByExample(TblDeclaration record, TblDeclarationExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(TblDeclaration record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TblDeclaration record) {
        return 0;
    }
}
