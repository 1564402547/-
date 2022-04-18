package com.wangzg.community.mapper;

import com.wangzg.community.po.Code;
import com.wangzg.community.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-2-15 10:42
 * @Description:
 */
@Mapper
@Component
public interface CodeMapper {

    int save(@Param("roleId") Integer roleId, @Param("codeText") String codeText);

    List<Code> selectAll();

    //查询所you注册码
    List<Code> findAll(@Param("roleName") String roleName,@Param("userName") String userName,@Param("account") String account);

    int updateCode(Code code);

    //根据id查询
    Code selectByCodeId(Integer codeId);

    int deleteByCodeId(Integer codeId);

    //根据注册码，查询是否合法
    Code selectBycodeText(String codeText);

    //根据注册码信息，保存注册码与用户之间信息
    int updateByUser(User user);

    int deleteByCodeIdInt(Integer codeId);
}
