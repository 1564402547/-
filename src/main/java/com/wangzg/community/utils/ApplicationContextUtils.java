package com.wangzg.community.utils;

import com.alibaba.druid.sql.visitor.functions.Concat;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;

/**
 * @Auther: wangzg
 * @Date: 2022-2-12 15:40
 * @Description:
 */
@Component
public class ApplicationContextUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context =applicationContext;
    }

    public static Object getBean(String beanName){
     return context.getBean(beanName);
    }
}
