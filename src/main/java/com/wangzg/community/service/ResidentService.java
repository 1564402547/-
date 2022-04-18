package com.wangzg.community.service;

import com.github.pagehelper.PageInfo;
import com.wangzg.community.po.Resident;

import java.sql.ResultSet;
import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-2-21 16:56
 * @Description:
 */
public interface ResidentService {

    /**
     * 功能描述:查询所有住户信息，过滤掉被删除的和高风险的
     * @param: [resName, house, unit]
     * @return: java.util.List<com.wangzg.community.po.Resident>
     * @auther: wanzg
     * @date: 2022-3-14 14:48
     */
    List<Resident> queryAll(String resName, Integer house,Integer unit);


    List<Resident> getAll();
    /**
     * 功能描述:添加住户信息
     * @param: [resident]
     * @return: com.wangzg.community.po.Resident
     * @auther: wanzg
     * @date: 2022-3-14 14:49
     */
    Resident saveResident(Resident resident) throws Exception;


    /**
     * 功能描述:查询所有高风险住户信息
     * @param: [resState]
     * @return: java.util.List<com.wangzg.community.po.Resident>
     * @auther: wanzg
     * @date: 2022-3-14 14:49
     */
    List<Resident> queryByresState();

    /**
     * 功能描述: 修改住户信息
     * @param: [resident]
     * @return: com.wangzg.community.po.Resident
     * @auther: wanzg
     * @date: 2022-3-14 14:49
     */
    Resident editResident(Resident resident) throws Exception;

    /**
     * 功能描述: 对用户的状态修改，实行软删除
     * @param: [resId]
     * @return: com.wangzg.community.po.Resident
     * @auther: wanzg
     * @date: 2022-3-14 14:51
     */
    Resident upRemove(Integer resId,Integer code);

    /**
     * 功能描述:批量软删除（批量修改）
     * @param: [ids]
     * @return: int
     * @auther: wanzg
     * @date: 2022-3-14 15:41
     */
    int resUpBatch(List<Integer> ids,Integer code);


    /**
     * 功能描述: 降低用户的风险等级
     * @param: [id]
     * @return: int
     * @auther: wanzg
     * @date: 2022-3-14 18:04
     */
    int editResState(Integer id);
}
