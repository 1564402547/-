package com.wangzg.community.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Auther: wangzg
 * @Date: 2022-3-2 11:12
 * @Description:
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class RoleMenu {
    private Integer id;

    private Integer roleId;

    private Integer menuId;
}
