package com.wangzg.community.controller.file.service;

import com.wangzg.community.po.Document;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-3-23 17:17
 * @Description: 
 */
public interface FileService {

    List<Document> queryAllFile(String oldName);

    Document upRemove(Document document);

    int upRemoveStatus(Integer id);

    int documentUpBatch(List<Integer> ids);
}
