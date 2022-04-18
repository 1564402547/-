package com.wangzg.community.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.sql.Date;

/**
 * @Auther: wangzg
 * @Date: 2022-3-11 17:20
 * @Description:
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class ResidentInFo {

    private Integer resInfoId;

    private String resName;

    private String resPhone;

    private Integer resType;

    private String  temperature;

    private Integer resState;

    private Integer resAddressId;

    private String infoRemark;

    private Integer infoStatus;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date infoTime;

    private Address address;

    private String name;

    private Integer house;

    private Integer unit;


//    public Integer getHouse(){
//        if(address != null){
//            return address.getHouse();
//        }
//        return null;
//    }
//    public String getName(){
//        if(address != null){
//            return address.getName();
//        }
//        return null;
//    }
//    public Integer getUnit(){
//        if(address != null){
//            return address.getUnit();
//        }
//        return null;
//    }

}
