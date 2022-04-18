package com.wangzg.community.utils;

import java.util.Random;

/**
 * @Auther: wangzg
 * @Date: 2022-2-12 14:49
 * @Description: 生成随机盐方法
 */
public class SaltUtils {

    public static String getSalt(int n){
        char[] chars = "QWERTYUIOPASDFGHJKLZXCVBNM~!@#$%^&*()_+=-qwertyuiopasdfghjklzxcvbnm1234567890".toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0 ; i<n;i++){
            char aChar= chars[new Random().nextInt(chars.length)];
            stringBuffer.append(aChar);
        }
        return stringBuffer.toString();
    }
}
