package com.wangzg.community.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther: wangzg
 * @Date: 2022-2-15 10:39
 * @Description:
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Code extends User implements Serializable {
    private Integer codeId;
    private  Integer roleId;
    private String codeText;
    private Integer status;
    private String roleName;



}
