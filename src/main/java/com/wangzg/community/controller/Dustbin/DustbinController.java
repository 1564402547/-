package com.wangzg.community.controller.Dustbin;

import com.wangzg.community.po.Resident;
import com.wangzg.community.po.ResidentInFo;
import com.wangzg.community.po.Visitor;
import com.wangzg.community.service.DustbinService;
import com.wangzg.community.service.ResidentInFoService;
import com.wangzg.community.service.ResidentService;
import com.wangzg.community.service.VisitorService;
import com.wangzg.community.utils.APIResult;
import com.wangzg.community.utils.ConstantsUtils;
import org.springframework.web.bind.annotation.*;
import sun.misc.Cache;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/dustbin")
@RestController
public class DustbinController {

    final DustbinService dustbinService;

    final ResidentService residentService;

    final ResidentInFoService residentInFoService;

    final VisitorService visitorService;

    public DustbinController(DustbinService dustbinService, ResidentService residentService, ResidentInFoService residentInFoService, VisitorService visitorService) {
        this.dustbinService = dustbinService;
        this.residentService = residentService;
        this.residentInFoService = residentInFoService;
        this.visitorService = visitorService;
    }

    @RequestMapping(value = "/getResident",method = RequestMethod.GET)
    public APIResult getAllResident(String resName){
        List<Resident> residents = this.dustbinService.queryAllRes(resName);
        APIResult apiResult = new APIResult(ConstantsUtils.CODE_STATUS_200,null,residents.size(),residents);
        return apiResult;
    }

    @RequestMapping(value = "/getResidentInFo",method = RequestMethod.GET)
    public APIResult getAllResidentInFo(String resName){
        List<ResidentInFo> residentInFos = this.dustbinService.queryAllResidentInFo(resName);
        return new APIResult(ConstantsUtils.CODE_STATUS_200,null,residentInFos.size(),residentInFos);

    }

    @RequestMapping(value = "/getAllVisitor",method = RequestMethod.GET)
    public APIResult getAllVisitor(String visName){
        List<Visitor> visitors = this.dustbinService.queryAllVisitor(visName);
        return new APIResult(ConstantsUtils.CODE_STATUS_200,null,visitors.size(),visitors);

    }

    /**
     * Resident?????????????????????
     *
     *
     */

    @RequestMapping(value = "/recResident/{id}",method = RequestMethod.POST)
    public APIResult recResident(@PathVariable("id") Integer id){
        Resident resident = this.residentService.upRemove(id, ConstantsUtils.CODE_STATUS_0);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,resident);
    }

    @RequestMapping(value = "/recResident/batch",method = RequestMethod.POST)
    public APIResult recResident(@RequestBody Integer[] ids){
        List<Integer> ides = Arrays.asList(ids);
        residentService.resUpBatch(ides,ConstantsUtils.CODE_STATUS_0);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,ides.size(),null);
    }

    /**
     * ?????????????????????
     *
     */

    @RequestMapping(value = "/recVisitor/{id}",method = RequestMethod.POST)
    public APIResult recVisitor(@PathVariable("id") Integer id){
        visitorService.upRemove(id,ConstantsUtils.CODE_STATUS_0);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,null);
    }

    @RequestMapping(value = "/recVisitor/batch",method = RequestMethod.POST)
    public APIResult recVisitorBatch(@RequestBody Integer[] ids){
        List<Integer> ides = Arrays.asList(ids);
        visitorService.visitorUpBatch(ides,ConstantsUtils.CODE_STATUS_0);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,ides.size(),null);
    }

    /**
     * ???????????????????????????
     */

    @RequestMapping(value = "/recResidentInfo/{id}",method = RequestMethod.POST)
    public APIResult recResidentInfo(@PathVariable("id") Integer id){
        residentInFoService.upRemove(id,ConstantsUtils.CODE_STATUS_0);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,null);
    }

    @RequestMapping(value = "/recResidentInfo/batch",method = RequestMethod.POST)
    public APIResult recResidentInfoBatch(@RequestBody Integer[] ids){
        List<Integer> ides = Arrays.asList(ids);
        residentInFoService.resInfoUpBatch(ides,ConstantsUtils.CODE_STATUS_0);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,ides.size(),null);
    }

    /**
     * ?????????????????????
     */

    @RequestMapping(value = "/deleteVisitor/batch",method = RequestMethod.POST)
    public APIResult visitorDelete(@RequestBody Integer[] ids){
        List<Integer> ides = Arrays.asList(ids);
        dustbinService.removeVisitor(ides);
        return new APIResult(ConstantsUtils.CODE_STATUS_200,null,ides.size(),null);
    }

    @RequestMapping(value = "/deleteResident/batch",method = RequestMethod.POST)
    public APIResult residentDelete(@RequestBody Integer[] ids){
        List<Integer> ides = Arrays.asList(ids);
        dustbinService.removeResident(ides);
        return new APIResult(ConstantsUtils.CODE_STATUS_200,null,ides.size(),null);
    }

    @RequestMapping(value = "/deleteResidentInfo/batch",method = RequestMethod.POST)
    public APIResult residentInfoDelete(@RequestBody Integer[] ids){
        List<Integer> ides = Arrays.asList(ids);
        dustbinService.removeResidentInfo(ides);
        return new APIResult(ConstantsUtils.CODE_STATUS_200,null,ides.size(),null);
    }
}
