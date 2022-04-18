package com.wangzg.community;

import com.wangzg.community.mapper.ResidentMapper;
import com.wangzg.community.mapper.UserMapper;
import com.wangzg.community.po.Menu;
import com.wangzg.community.po.Resident;
import com.wangzg.community.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {

        User user = userMapper.findByAccountMenus("tom");
        System.out.println("-----------------------"+user);

    }

}
