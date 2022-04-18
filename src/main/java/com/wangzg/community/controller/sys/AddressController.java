package com.wangzg.community.controller.sys;


import com.github.pagehelper.PageInfo;
import com.wangzg.community.po.Address;
import com.wangzg.community.service.AddressService;
import com.wangzg.community.utils.APIResult;
import com.wangzg.community.utils.ConstantsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-2-23 11:07
 * @Description: 地址管理
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public APIResult getAll(String name, Integer house, Integer unit) {
        List<Address> addresses = this.addressService.queryAll(name, house, unit);
        APIResult apiResult = new APIResult(ConstantsUtils.CODE_STATUS_200,null,addresses.size(),addresses);
        return apiResult;
    }

    @RequestMapping(value = "/addAddress",method = RequestMethod.POST)
    public APIResult add(@RequestBody Address address){
        try {
            Address address1 = addressService.addAddress(address);
            return new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,address1);
        }
        catch (Exception e){
            return new APIResult(ConstantsUtils.CODE_STATUS_404,e.getMessage(),-1,null);
        }

    }

}
