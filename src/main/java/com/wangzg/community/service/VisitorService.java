package com.wangzg.community.service;


import com.wangzg.community.po.Visitor;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-2-24 15:45
 * @Description:
 */
public interface VisitorService {



    //添加访客的记录
    Visitor addVisitorInFoM(Visitor visitor) throws Exception;

    List<Visitor> queryAll(String visName,Integer visHelthCode,Integer visType);

    List<Visitor> getAll();


    int upRemove(Integer visitorId,Integer code);

    int visitorUpBatch(List<Integer> ids,Integer code);
}
