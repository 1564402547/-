package com.wangzg.community.shiro.realm;

import com.wangzg.community.po.Menu;
import com.wangzg.community.po.User;
import com.wangzg.community.service.UserService;
import com.wangzg.community.shiro.slat.MyByteSource;
import com.wangzg.community.utils.ApplicationContextUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * @Auther: wangzg
 * @Date: 2022-2-11 17:02
 * @Description: shiro的认证和授权
 */
public class MyShiroRealm extends AuthorizingRealm {



    /**
     * 功能描述: shiro 的授权
     * @param: [token]
     * @return: org.apache.shiro.authc.AuthenticationInfo
     * @auther: wanzg
     * @date: 2022-2-15 9:34
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //获取身份信息
        String primaryPrincipal = (String) principalCollection.getPrimaryPrincipal();

        //拿到业务对象
        UserService userService = (UserService) ApplicationContextUtils.getBean("userService");

        User user = userService.findRolesByAccount(primaryPrincipal);
        //授权角色信息
        if (!CollectionUtils.isEmpty(user.getRoles())){
            SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
            user.getRoles().forEach(role -> {
                simpleAuthorizationInfo.addRole(role.getRoleName());

                //权限信息
                List<Menu> menus = userService.findMenuByRoleId(role.getRoleId());
                if (!CollectionUtils.isEmpty(menus)){
                    menus.forEach(menu -> {
                        simpleAuthorizationInfo.addStringPermission(menu.getName());

                    });

                }
            });
            return  simpleAuthorizationInfo;
        }
        return null;
    }

    /**
     * 功能描述: shiro 的认证
     * @param: [token]
     * @return: org.apache.shiro.authc.AuthenticationInfo
     * @auther: wanzg
     * @date: 2022-2-15 9:34
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String principal = (String) token.getPrincipal();

        //获取userServic的对象
        UserService userService = (UserService) ApplicationContextUtils.getBean("userService");
        //根据账号查询信息
        User user = userService.findByAccount(principal);
//        String s = new Md5Hash(user.getPassword(), principal).toHex();
        //认证
        if (!ObjectUtils.isEmpty(user)){
            return new SimpleAuthenticationInfo(user.getAccount(),user.getPassword(), new MyByteSource(user.getCodeText()),this.getName());
//            return new SimpleAuthenticationInfo(user.getAccount(),s, new MyByteSource(user.getCodeText()),this.getName());
        }

        return null;
    }
//    @Override
//    public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher) {
//        // 构建凭证匹配对象
//        HashedCredentialsMatcher cMatcher = new HashedCredentialsMatcher();
//        // 设置加密算法  Matcher
//        cMatcher.setHashAlgorithmName("MD5");
//        // 设置加密次数
//        cMatcher.setHashIterations(1);
//        super.setCredentialsMatcher(cMatcher);
//    }
}
