package com.wangzg.community.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-3-2 11:10
 * @Description:
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Menu implements Serializable {

    private Integer menuId;

    private String name;

    private Integer pid;

    private String path;

    private String icon;

    private Integer state;

    private RoleMenu roleMenu;

    private String pagePath;

    private List<Menu> children;

}
