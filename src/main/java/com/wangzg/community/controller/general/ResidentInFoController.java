package com.wangzg.community.controller.general;

import com.wangzg.community.po.ResidentInFo;
import com.wangzg.community.service.ResidentInFoService;
import com.wangzg.community.utils.APIResult;
import com.wangzg.community.utils.ConstantsUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/residentInfo")
@CrossOrigin(origins = { "*" })
@RestController
public class ResidentInFoController {

    final ResidentInFoService residentInFoService;


    public ResidentInFoController(ResidentInFoService residentInFoService) {
        this.residentInFoService = residentInFoService;
    }

    @RequestMapping(value = "getAllInfo",method = RequestMethod.GET)
    public APIResult getAll(String resName,String name ,Integer house){
        List<ResidentInFo> residentInFos = residentInFoService.queryAll(resName, name, house);
        return new APIResult(ConstantsUtils.CODE_STATUS_200,null,residentInFos.size(),residentInFos);

    }

    @RequestMapping(value = "/addResidentInfo",method = RequestMethod.POST)
    public APIResult addInfo(@RequestBody  ResidentInFo residentInFo){
        try {
            ResidentInFo residentInFo1 = residentInFoService.addResInfo(residentInFo);
            return new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,residentInFo1);
        }catch (Exception e){
            return new APIResult(ConstantsUtils.CODE_STATUS_404,e.getMessage(),-1,null);
        }
    }

    @RequestMapping(value = "/upDeleteInfo/{id}",method = RequestMethod.POST)
    public APIResult upDelete(@PathVariable("id") Integer id){
        residentInFoService.upRemove(id,ConstantsUtils.CODE_STATUS_1);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,null);
    }

    @RequestMapping(value = "/upDeleteInfo/batch",method = RequestMethod.POST)
    public APIResult resInfoBatch(@RequestBody Integer[] ids){
        List<Integer> ides = Arrays.asList(ids);
        residentInFoService.resInfoUpBatch(ides,ConstantsUtils.CODE_STATUS_1);
        return new APIResult(201,null,ides.size(),null);
    }
}
