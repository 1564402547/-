package com.wangzg.community.controller.general;

import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.sun.deploy.net.URLEncoder;
import com.wangzg.community.po.Resident;
import com.wangzg.community.service.ResidentService;
import com.wangzg.community.utils.APIResult;
import com.wangzg.community.utils.ConstantsUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * @Auther: wangzg
 * @Date: 2022-2-21 17:02
 * @Description:
 */
@RequestMapping("/resident")
@CrossOrigin(origins = { "*" })
@RestController
public class ResidentController {

    @Value("${spring.servlet.multipart.location}")
    private String path;

    final ResidentService residentService;


    public ResidentController(ResidentService residentService){
        this.residentService =residentService;
    }


    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public APIResult queryAllResident(String resName, Integer house, Integer unit){
        List<Resident> residents = residentService.queryAll(resName, house, unit);
        APIResult apiResult = new APIResult(ConstantsUtils.CODE_STATUS_200,null,residents.size(),residents);
        return apiResult;
    }


    @RequestMapping(value = "addRes",method = RequestMethod.POST)
    public APIResult saveResident(@RequestBody Resident resident){

        try {
            Resident resi = residentService.saveResident(resident);
            return  new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,resi);
        } catch (Exception e) {
            e.printStackTrace();
            return new APIResult(ConstantsUtils.CODE_STATUS_404,e.getMessage(),-1,null);
        }
    }

    @RequestMapping(value = "getState",method = RequestMethod.GET)
    public APIResult getState(){
        List<Resident> residents = residentService.queryByresState();
        return new APIResult(ConstantsUtils.CODE_STATUS_200,null,residents.size(),residents);


    }
    @RequestMapping(value = "edit",method = RequestMethod.POST)
    public APIResult editResident(@RequestBody Resident resident){
        try {
            Resident resident1 = residentService.editResident(resident);
            return new APIResult(ConstantsUtils.CODE_STATUS_201,null,11,resident1);
        }
        catch (Exception e){
            e.printStackTrace();
            return new APIResult(ConstantsUtils.CODE_STATUS_404,e.getMessage(),-1,null);
        }

    }

    @RequestMapping(value = "/upDelete/{id}",method = RequestMethod.DELETE)
    public APIResult upDeleteres(@PathVariable("id") Integer id){
        Resident resident = residentService.upRemove(id,ConstantsUtils.CODE_STATUS_1);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,resident);

    }

    @RequestMapping(value = "/upDelete/batch",method = RequestMethod.POST)
    public APIResult upBatch(@RequestBody Integer[] ids){
        List<Integer> ides = Arrays.asList(ids);
        residentService.resUpBatch(ides,ConstantsUtils.CODE_STATUS_1);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,ides.size(),null);
    }

    @RequestMapping(value = "/editResState/{id}",method = RequestMethod.POST)
    public APIResult editResState(@PathVariable("id") Integer id){
        int i = residentService.editResState(id);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,null);
    }


    @RequestMapping(value = "/export",method = RequestMethod.GET)
    public void export(HttpServletResponse response) throws IOException {
        List<Resident> list = residentService.getAll();
        for(int i =0; i<list.size(); i++){
            list.get(i).getResSex();
        }
        ExcelWriter writer = ExcelUtil.getWriter(path + "/用户信息.xlsx");
        writer.addHeaderAlias("resName","姓名");
        writer.addHeaderAlias("resSex","性别");
        writer.addHeaderAlias("resPhone","电话");
        writer.addHeaderAlias("name","社区");
        writer.addHeaderAlias("house","楼号");
        writer.addHeaderAlias("unit","单元号");
        writer.addHeaderAlias("residentCount","住户数量");
        writer.addHeaderAlias("resState","建康码状态");

        writer.write(list,true);
        // 设置浏览器响应的格式
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        String fileName = URLEncoder.encode("用户信息", "UTF-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xlsx");

        ServletOutputStream out = response.getOutputStream();
        writer.flush(out, true);
        out.close();
        writer.close();
    }
}
