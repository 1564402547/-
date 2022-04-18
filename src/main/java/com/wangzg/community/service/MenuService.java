package com.wangzg.community.service;

import com.wangzg.community.po.Menu;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-3-11 11:00
 * @Description:
 */
public interface MenuService {

    List<Menu> findMenuByRoleName(String roleName);
}
