package com.wangzg.community.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Date;

/**
 * @Auther: wangzg
 * @Date: 2022-2-21 15:46
 * @Description:
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class Address implements Serializable {

    private Integer addressId;
    private String name;
    private Integer house;
    private Integer unit;
    private Integer residentCount;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;
    private Integer addressStatus;


    public Address(){

    }

    public Address(String name, Integer house, Integer unit) {
        this.name = name;
        this.house = house;
        this.unit = unit;
    }
}
