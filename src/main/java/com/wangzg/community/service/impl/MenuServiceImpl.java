package com.wangzg.community.service.impl;

import com.wangzg.community.mapper.MenuMapper;
import com.wangzg.community.po.Menu;
import com.wangzg.community.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: wangzg
 * @Date: 2022-3-11 11:00
 * @Description:
 */
@Service("menuService")
@Transactional
public class MenuServiceImpl implements MenuService {

    final MenuMapper menuMapper;

    public MenuServiceImpl(MenuMapper menuMappe){
        this.menuMapper = menuMappe;
    }


    @Override
    public List<Menu> findMenuByRoleName(String roleName) {
        List<Menu> collect = menuMapper.findAll(roleName).stream()
                .collect(Collectors.toList());
        List<Menu> parentNode = collect.stream()
                .filter(menu -> menu.getPid() == null)
                .collect(Collectors.toList());
        for(Menu menu : parentNode){
            menu.setChildren(collect.stream().filter(m -> menu.getMenuId().equals(m.getPid())).collect(Collectors.toList()));
        }

        return parentNode;
    }
}
