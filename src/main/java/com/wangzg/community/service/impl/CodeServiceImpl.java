package com.wangzg.community.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.bcel.internal.generic.LMUL;
import com.wangzg.community.mapper.CodeMapper;
import com.wangzg.community.mapper.UserMapper;
import com.wangzg.community.po.Address;
import com.wangzg.community.po.Code;
import com.wangzg.community.service.CodeService;
import com.wangzg.community.utils.ConstantsUtils;
import com.wangzg.community.utils.SaltUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Auther: wangzg
 * @Date: 2022-2-15 10:53
 * @Description:
 */
@Service
@Transactional
public class CodeServiceImpl implements CodeService {



    final CodeMapper codeMapper;

    final UserMapper userMapper;

    public CodeServiceImpl( CodeMapper codeMapper,
                            UserMapper userMapper){
        this.codeMapper =codeMapper;
        this.userMapper = userMapper;
    }



    @Override
    public List<Code> queryAll(String roleName, String userName, String account) {
        List<Code> collect = this.codeMapper.findAll(roleName,userName,account).stream()
                .filter(c -> roleName == null || roleName == "" || c.getRoleName().equals(roleName))
                .filter(c -> userName == null || userName == "" || c.getUserName().equals(userName))
                .filter(c -> account == null || account == "" || c.getAccount().equals(account))
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public int deleteBycodeId(Integer codeId) {
        return codeMapper.deleteByCodeId(codeId);
    }

    @Override
    public boolean addCode(String roleName) {
        String codeText = SaltUtils.getSalt(ConstantsUtils.CODE_STATUS_36);
        if (roleName.equals("admin")){
            codeMapper.save(ConstantsUtils.CODE_STATUS_1,codeText);
            return true;
        }
        if(roleName.equals("user")){
            codeMapper.save(ConstantsUtils.CODE_STATUS_2,codeText);
            return true;
        }
        return false;
    }


    @Override
    public Code updateCodeStatusBycodeId(Integer codeId) {
        Code code = codeMapper.selectByCodeId(codeId);
        if (code.getStatus() == ConstantsUtils.CODE_STATUS_0){
            code.setStatus(ConstantsUtils.CODE_STATUS_1);
        }else if(code.getStatus() == ConstantsUtils.CODE_STATUS_1){
            code.setStatus(ConstantsUtils.CODE_STATUS_0);
        }
        codeMapper.updateCode(code);
        return code;
    }

    @Override
    public Code remove(Integer codeId) {
        Code code = codeMapper.selectByCodeId(codeId);
        codeMapper.deleteByCodeId(codeId);
        return code;
    }


}
