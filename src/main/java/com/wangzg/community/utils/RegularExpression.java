package com.wangzg.community.utils;


import org.springframework.stereotype.Component;

/**
 * @author wangzg
 * @date 2022/1/14
 * @name RegularExpression(正则表达式)
 */
@Component
public class RegularExpression {

    /**
     * 长度为3-20的所有字符
     */
    private static String allChar = "^.{3,20}$";

    /**
     * 由数字和26个英文字母组成的字符串
     */
    private static String charNumber = "^[A-Za-z0-9]{5,16}$";

    /**
     * //中文、英文、数字包括下划线
     */
    private static String all = "^[\\u4E00-\\u9FA5A-Za-z0-9_]$";

    /**
     * //匹配帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)
     */
    private static String accounNumber = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";

    /**
     * //匹配帐号密码是否合法(允许5-16字节，允许字母数字下划线)
     */
    private static String accounNumberPassword = "^[a-z0-9_-]{6,18}$";

    /**
     * 手机号码第一个数必须为1
     * [3，5，7，8]:手机号码第二个数必须为:括号内数字
     */
    private static String CM = "^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$";

    /**
     * 匹配真实姓名是否合法(只允许2-6汉字)
     */
    private  static String name = "^[\\u4e00-\\u9fa5]{2,6}$";

    /**
     * 功能描述:验证账号是否违法
     * @param: [name]
     * @return: [java.lang.String]
     * @auther: wanzg
     * @date: 2022/1/14 16:46
     */
    public static boolean decideAccounNumber(String name) {
        boolean flag = name.matches(accounNumber);
        return flag;
    }

    /**
     * 功能描述:验证密码是否违法
     *
     * @param: [password]
     * @return: [java.lang.String]
     * @auther: wanzg
     * @date: 2022/1/14 16:49
     */
    public static boolean decideAccounNumberPassword(String password) {
        boolean flag = password.matches(accounNumberPassword);
        return flag;
    }

    /**
     * 功能描述:验证手机号是否违法
     *
     * @param: [phone]
     * @return: [java.lang.String]
     * @auther: wanzg
     * @date: 2022/1/14 17:17
     */
    public static boolean decidePhone(String phone) {
        boolean flag = phone.matches(CM);
        return flag;

    }
    /**
     * 功能描述: 验证真实姓名是否违法
     * @param: [realName]
     * @return: [java.lang.String]
     * @auther: wanzg
     * @date: 2022/1/14 17:23
     */
    public static boolean decideRealName(String realName){
        boolean flag = realName.matches(name);
        return flag;
    }
}
