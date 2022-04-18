package com.wangzg.community.mapper;

import com.wangzg.community.po.Visitor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-2-24 14:31
 * @Description:
 */
@Mapper
@Component
public interface VisitorMapper {


    //查询有关访客所有的信息
    List<Visitor> findAll(@Param("visName") String VisName, @Param("visHelthCode") Integer visHelthCode, @Param("visType")Integer visType);

    int save(Visitor visitor);

    //批量删除
    int deleteByVisitorIdInt( List<Integer> ids);

    //批量修改
    int upBatchVis(@Param("ids") List<Integer> ids,@Param("visStatus") Integer visStatus);

    int updateVisStatusByResId(@Param("visitorId") Integer visitorId,@Param("visStatus") Integer visStatus);
}
