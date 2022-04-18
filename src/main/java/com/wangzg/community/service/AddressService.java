package com.wangzg.community.service;

import com.github.pagehelper.PageInfo;
import com.wangzg.community.po.Address;
import com.wangzg.community.po.Resident;

import java.util.List;

public interface AddressService {



    /**
     * 功能描述: 按条件查询所有地址
     * @param: [name, house, unit]
     * @return: java.util.List<com.wangzg.community.po.Address>
     * @auther: wanzg
     * @date: 2022-3-14 19:42
     */
    List<Address> queryAll(String name, Integer house, Integer unit);

    /**
     * 功能描述: 添加地址
     * @param: [address]
     * @return: com.wangzg.community.po.Address
     * @auther: wanzg
     * @date: 2022-3-14 19:43
     */
    Address addAddress(Address address) throws Exception;
}
