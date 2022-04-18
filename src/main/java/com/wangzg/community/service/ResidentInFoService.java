package com.wangzg.community.service;

import com.wangzg.community.po.ResidentInFo;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-3-11 17:46
 * @Description:
 */
public interface ResidentInFoService {

    List<ResidentInFo> queryAll(String resName,String name ,Integer house);

    ResidentInFo addResInfo(ResidentInFo residentInFo) throws Exception;

    int upRemove(Integer resInfoId,Integer code);

    int resInfoUpBatch(List<Integer> ids,Integer code);
}
