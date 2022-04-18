package com.wangzg.community.controller.file.service.impl;

import com.wangzg.community.controller.file.service.FileService;
import com.wangzg.community.mapper.DocumentMapper;
import com.wangzg.community.po.Document;
import com.wangzg.community.utils.ConstantsUtils;
import org.springframework.stereotype.Service;
import sun.plugin.dom.DOMObject;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: wangzg
 * @Date: 2022-3-23 17:17
 * @Description: 
 */
@Service
public class FileServiceImpl implements FileService {

    final DocumentMapper documentMapper;

    public FileServiceImpl(DocumentMapper documentMapper) {
        this.documentMapper = documentMapper;
    }

    @Override
    public List<Document> queryAllFile(String oldName) {
        List<Document> collect = documentMapper.findAllFile(oldName).stream()
                .filter(document -> oldName == null || oldName == "" || document.getOldName().equals(oldName))
                .filter(document -> document.getStatus() != 1)
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public Document upRemove(Document document) {
        if (document.getEnable() == ConstantsUtils.CODE_STATUS_0){
            documentMapper.updateEnableInt(document.getId(), ConstantsUtils.CODE_STATUS_1);
        }else{
            documentMapper.updateEnableInt(document.getId(), ConstantsUtils.CODE_STATUS_0);
        }
        Document allByIdDocument = documentMapper.findAllByIdDocument(document.getId());
        return allByIdDocument;
    }

    @Override
    public int upRemoveStatus(Integer id) {
        return documentMapper.deleteByIdInt(id);
    }

    @Override
    public int documentUpBatch(List<Integer> ids) {
        return documentMapper.upBatchVis(ids);
    }
}
