package com.wangzg.community.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wangzg.community.po.User;
import com.wangzg.community.service.UserService;
import com.wangzg.community.utils.APIResult;
import com.wangzg.community.utils.TokenUtil;
import com.wangzg.community.utils.TokenUtil.Token   ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: wangzg
 * @Date: 2022-2-14 16:01
 * @Description:
 */
public class JWTInterceptor implements HandlerInterceptor {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 1获取客户端传递过来的token
        String strToken = request.getHeader("token");
        if (strToken == null || strToken.length() == 0) {
            // 用户没有登录
            setResponse(response, "用户未登录！！请登陆后再进行操作！！");
            // 拦截
            return false;
        }

        // 2解密Token，时间有没有过期
        Token token = TokenUtil.parseToken(strToken);
        if (token.getStatus() == 1) {
            setResponse(response, "登录已过期！！请重新登陆！！");
            return false;
        }

        // 3是不是一个有效的用户
        String account = token.getCode();
        User user = userService.findByAccount(account);
        if (user == null) {
            setResponse(response, "当前的用户不是一个有效的用户，请重新登陆！！");
            return false;
        }
        // 4禁用
        if (user.getStatus() == 1) {
            setResponse(response, "用户已被禁用，请联系管理员");
            return false;
        }

        // 5刷新token 重置有效时间
        strToken = TokenUtil.createToken(token.getCode());
        response.setHeader("token", strToken);
        return true;
    }

    /**
     * 功能描述: 返回json数据
     * @param: [response, msg]
     * @return: void
     * @auther: wanzg
     * @date: 2022-2-15 9:26
     */
    private void setResponse(HttpServletResponse response, String msg) throws IOException {
        APIResult apiResult = APIResult.unauthorized(msg);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(apiResult);
        response.setContentType("application/json; charset=utf-8");
        response.getWriter().write(json);
    }
}
