package com.wangzg.community.po;

import com.google.common.net.InternetDomainName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

/**
 * @Auther: wangzg
 * @Date: 2022-3-19 11:40
 * @Description:
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Document implements Serializable {
    private Integer id;
    private String oldName;
    private String newName;
    private String type;
    private Long size;
    private String url;
    private String md5;
    private Integer status;
    private Integer enable;
}
