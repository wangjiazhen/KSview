package org.ks.sys.org.service.impl;
import org.ks.enums.StatusCodeEnum;
import org.ks.sys.org.mapper.OrgMapper;
import org.ks.sys.org.vo.OrgDto;
import org.ks.sys.org.vo.OrgVo;
import org.ks.sys.po.TblOrgExample;
import org.ks.system.UserInfo;
import org.ks.util.LocalDateTimeUtil;
import org.ks.util.ResultInfo;
import org.ks.util.SeqUtil;
import org.ks.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import org.ks.sys.mapper.TblOrgMapper;
import org.ks.sys.org.service.OrgService;
import org.ks.sys.po.TblOrg;


import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class OrgServiceImpl implements OrgService {

    @Resource
    TblOrgMapper tblOrgMapper;

    @Autowired
    private OrgMapper orgMapper;
//    @Autowired
//    private DataDicClient dicClient;
    @Autowired
    private UserInfo userInfo;
    /**
     * 是否重复标记
     */
    private static final  String CHONGFU_FLAF="chongfu";

    /**
     * 查询
     * @return
     */
//    @Override
//    public ResultInfo<List<TblOrg>> selectByExample() {
//        TblOrgExample ex = new TblOrgExample();
//        ResultInfo<List<TblOrg>> tx = new ResultInfo<>(StatusCodeEnum.OK,"成功");
//        List<TblOrg> tblOrgList = tblOrgMapper.selectByExample(ex);
//        tx.setData(tblOrgList);
//        long cout = tblOrgList.size();
//        tx.setTotal(cout);
//        return tx;
//    }

    @Override
    public ResultInfo<List<TblOrg>> selectTiaojian(OrgDto orgDto) {
        TblOrgExample ex = new TblOrgExample();
        ResultInfo tx = new ResultInfo<>(StatusCodeEnum.OK,"成功");

        List<TblOrg> tblOrgList = null;
        try {
            tblOrgList = orgMapper.selectTiaojian(orgDto);
            Map<String,String> map=new HashMap<>();
//            Map<String,String> map = dicClient.getDicType("ORGTYPE");
            for (TblOrg org : tblOrgList) {
                org.setOrgTypeCode(map.get(org.getOrgTypeCode()));
            }
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        tx.setData(tblOrgList);

        long cout = tblOrgList.size();
        tx.setTotal(cout);
        return tx;
    }

    /**
     * 插入数据
     * @param record
     * @return
     */
    @Override
    public ResultInfo insertSelective(TblOrg record) {

        TblOrg tblOrg = new TblOrg();
        tblOrg.setOrgName(record.getOrgName());
        tblOrg.setCreateAcct(userInfo.getUserId());
        LocalDateTime now = LocalDateTime.now();
        tblOrg.setUpdateTime(LocalDateTimeUtil.getDate(now));
        List<TblOrg> tblOrgs = orgMapper.ckChongFu(tblOrg);
        ResultInfo  re = new ResultInfo(StatusCodeEnum.OK,"成功");
        if (tblOrgs.size() == 0){
            record.setCreateTime(LocalDateTimeUtil.getDate(now));
            record.setUpdateTime(LocalDateTimeUtil.getDate(now));
            record.setOrgId(SeqUtil.getNextId());
            record.setUseFlag(1);

            re.setData(tblOrgMapper.insertSelective(record));
        }else {

            re.setData(OrgServiceImpl.CHONGFU_FLAF);

        }

        return re;
    }

    /**
     * 根据ID 查询一个对象
     * @param orgId
     * @return
     */
    @Override
    public ResultInfo selectByPrimaryKey(Long orgId) {
        ResultInfo  re = new ResultInfo();
        if(StringUtil.isNull(orgId)){
            re.setMessage("error--orgId 为 null");
        }else {
            TblOrg tblOrg = tblOrgMapper.selectByPrimaryKey(orgId);
            re.setCode(200);
            re.setMessage("success");
            re.setData(tblOrg);
        }
        return re;
    }

    /**
     * 修改
     * @param record
     * @return
     */
    @Override
    public ResultInfo updateByPrimaryKeySelective(TblOrg record) {
        TblOrg tblOrg = new TblOrg();
        tblOrg.setOrgName(record.getOrgName());
        tblOrg.setUpdateAcct(userInfo.getUserId());
        tblOrg.setUpdateTime(new Date());
        List<TblOrg> tblOrgs = orgMapper.ckChongFu(tblOrg);
        ResultInfo  re = new ResultInfo(StatusCodeEnum.OK,"成功");

        Long qid = record.getOrgId();
        Long id=null;

        if(tblOrgs.size() ==0){
            re.setData(tblOrgMapper.updateByPrimaryKeySelective(record));
        }else{
            id = tblOrgs.get(0).getOrgId();

            if(qid.equals(id)){

                re.setData(tblOrgMapper.updateByPrimaryKeySelective(record));
            }else {

                re.setData(OrgServiceImpl.CHONGFU_FLAF);
            }

        }
        return re;
    }

    /**
     * 修改flag
     * @param orgVo
     * @return
     */
    @Override
    public ResultInfo upFlag(OrgVo orgVo) {
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        orgVo.setUpdateAcct(userInfo.getUserId());
        orgVo.setUpdateTime(new Date());
        re.setData(orgMapper.upFlag(orgVo));

        return re;
    }


}
