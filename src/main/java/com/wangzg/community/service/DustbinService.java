package com.wangzg.community.service;

import com.wangzg.community.po.Resident;
import com.wangzg.community.po.ResidentInFo;
import com.wangzg.community.po.Visitor;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-3-17 17:48
 * @Description:
 */
public interface DustbinService {

    List<ResidentInFo> queryAllResidentInFo(String resName);

    List<Resident> queryAllRes(String resName);

    List<Visitor> queryAllVisitor(String visName);

    int removeVisitor(List<Integer> ids);

    int removeResident(List<Integer> ids);

    int removeResidentInfo(List<Integer> ids);
}
