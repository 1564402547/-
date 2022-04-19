package com.wangzg.community.controller.file;



import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.wangzg.community.controller.file.service.FileService;
import com.wangzg.community.mapper.DocumentMapper;
import com.wangzg.community.po.Document;
import com.wangzg.community.utils.APIResult;
import com.wangzg.community.utils.ConstantsUtils;
import com.wangzg.community.utils.FilesUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;


/**
 * @Auther: wangzg
 * @Date: 2022-2-14 16:52
 * @Description: 文件上传
 */
@RestController
@RequestMapping("/file")
public class FileController {

    // 从配置文件中读取一个值
    @Value("${spring.servlet.multipart.location}")
    private String path;

    final DocumentMapper documentMapper;

    final FileService fileService;

    public FileController(DocumentMapper documentMapper, FileService fileService) {
        this.documentMapper = documentMapper;
        this.fileService = fileService;
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(MultipartFile file) throws IOException {
        Document document = new Document();
        //文件原始名字

        String fiName = file.getOriginalFilename();
        String oldName = fiName.substring(0,fiName.lastIndexOf("."));
        //文件类型
        String type = FileUtil.extName(fiName);

        //UUID后的文件名字
        String uuid = IdUtil.fastSimpleUUID();
        String newName = uuid + StrUtil.DOT + type;

        //文件大小
        long size = file.getSize();

        //判断文件夹是否存在
        File uploadFile = new File(path + newName);
        // 判断配置的文件目录是否存在，若不存在则创建一个新的文件目录
        File parentFile = uploadFile.getParentFile();
        if(!parentFile.exists()) {
            parentFile.mkdirs();
        }
        //md5
        String md5 = SecureUtil.md5(file.getInputStream());
        String url;
        Document md5Document = null;
        List<Document> list = documentMapper.findBymd5(md5);
        if (list.size() == ConstantsUtils.CODE_STATUS_0){
            md5Document = null;
        }else {
            md5Document = list.get(0);
        }

        if (md5Document != null){
            url = md5Document.getUrl();
        }else {
            // 上传文件到磁盘
            FilesUtils.save(file,path,newName);
            url = "http://127.0.0.1:8082/file/" + newName;
        }
        document.setOldName(oldName);
        document.setType(type);
        document.setNewName(newName);
        document.setSize(size/ConstantsUtils.CODE_STATUS_1024);
        document.setUrl(url);
        document.setMd5(md5);
        documentMapper.addDocument(document);
        return url;
    }

    @RequestMapping(value = "/{newName}",method = RequestMethod.GET)
    public void download(@PathVariable String newName, HttpServletResponse response) throws IOException {
        File file = new File(path + newName);
        ServletOutputStream outputStream = response.getOutputStream();
        Document document = documentMapper.findByNewNameDocument(newName);
        if (document == null){
            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(newName, "UTF-8"));
        }else {
            //使文件完整，加上后缀名
            String kName = document.getOldName() + StrUtil.DOT + document.getType();
            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(kName, "UTF-8"));
        }
        response.setContentType("application/octet-stream");


        // 读取文件的字节流
        outputStream.write(FileUtil.readBytes(file));
        outputStream.flush();
        outputStream.close();
    }

    @RequestMapping(value = "/getAllFile",method = RequestMethod.GET)
    public APIResult getAllFile(String oldName){
        List<Document> list = fileService.queryAllFile(oldName);
        return new APIResult(ConstantsUtils.CODE_STATUS_200,null,list.size(),list);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public APIResult upNable(@RequestBody Document document){
        Document document1 = fileService.upRemove(document);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,document1);
    }

    @RequestMapping(value = "/upDelete/{id}",method = RequestMethod.POST)
    public APIResult upDelete(@PathVariable("id") Integer id){
      fileService.upRemoveStatus(id);
        return new APIResult(ConstantsUtils.CODE_STATUS_201,null,1,null);
    }

    @RequestMapping(value = "/upDelete/batch",method = RequestMethod.POST)
    public APIResult visitorInfoBatch(@RequestBody Integer[] ids){
        List<Integer> ides = Arrays.asList(ids);
       fileService.documentUpBatch(ides);
        return new APIResult(201,null,ides.size(),null);
    }



}
