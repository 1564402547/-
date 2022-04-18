package com.wangzg.community.mapper;

import com.wangzg.community.po.Address;
import com.wangzg.community.po.AddressResident;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Component;

/**
 * @Auther: wangzg
 * @Date: 2022-2-21 16:05
 * @Description:
 */
@Mapper
@Component
public interface AddressResidentMapper {

    //添加关系
    int addResidentAddress(@Param("addressId") Integer addressId, @Param("resId") Integer resId);

    //删除关系

    int deleteResidentAddress(@Param("resId") Integer resId);

    AddressResident selectByresidentId(Integer resId);

}
