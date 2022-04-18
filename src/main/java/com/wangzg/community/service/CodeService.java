package com.wangzg.community.service;

import com.github.pagehelper.PageInfo;
import com.wangzg.community.po.Code;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-2-15 10:52
 * @Description:
 */
public interface CodeService {

    //添加注册码
    boolean addCode(String roleName);


    //修改注册码状态
    Code updateCodeStatusBycodeId(Integer codeId);

    //
    Code remove(Integer codeId);

    List<Code> queryAll(String roleName,String userName,String account);

    int deleteBycodeId(Integer codeId);
}
