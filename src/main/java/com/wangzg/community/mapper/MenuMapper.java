package com.wangzg.community.mapper;

import com.wangzg.community.po.Menu;
import javafx.scene.control.MenuItem;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-3-2 11:21
 * @Description:
 */
@Mapper
@Component
public interface MenuMapper {


    //根据角色查询资源
    List<Menu> findAll(String roleName);

    List<Menu> findMenuByRoleId(Integer roleId);


    //根据菜单id查询
    Menu findByparentId(Integer parentId);


}
