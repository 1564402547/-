package com.wangzg.community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangzg.community.po.Menu;
import com.wangzg.community.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-2-11 16:26
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    //保存用户
    void save(User user);

    //根据用户账号查询
    User findByAccount(String account);

    User findUserByAccount(String account);
    //根据用户Id查询
    User findByUserId(Integer userId);

    //
    User findRolesByAccount(String account);


    List<Menu> findMenuByRoleId(Integer roleId);



    List<User> selectAll(@Param("account") String account,@Param("userName") String userName,@Param("userPhone") String userPhone);

    //修改用户信息（软删除用）
    int deleteUpdate(User user);

    int deleteById(Integer id);


    User findByAccountMenus(String account);

    int updatePasswordByAccount(@Param("account") String account,@Param("password") String password);


    int updateUser(User user);


}
