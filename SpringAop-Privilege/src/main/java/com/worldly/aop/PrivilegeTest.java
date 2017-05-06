package com.worldly.aop;


import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.ArrayList;
import java.util.List;

/**
 * aop实现权限控制
 * @author xiaoqixuan
 * @create 2017/5/6 11:14
 */
public class PrivilegeTest {

    /**
     * 客户端直接调用这个Service的方法，而不需要关心权限问题
     */
    private UserService userService;

    /**
     * 在初始化方法中，初始化firmService
     * 同时为用户赋上原始权限，这个在项目中，会使用别的方式实现，这里只是模拟，就不搞那么复杂了
     */
    @Before
    public void init(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = (UserService) applicationContext.getBean("userService");

        /*
         * 给用户添加默认权限
         */
        PrivilegeAspect privilegeAspect = (PrivilegeAspect) applicationContext.getBean("privilegeAspect");
        List<Privilege> privilegeList= new ArrayList<Privilege>();
        privilegeList.add(new Privilege("save"));
        privilegeList.add(new Privilege("deleted"));
        privilegeAspect.setPrivilegeList(privilegeList);
    }

    /**
     * 客户端直接调用Service中的方法，而不需要关心权限问题，会有切面去做
     */
    @Test
    public void test(){
        userService.save();
        userService.deleted();
        userService.update();
        userService.get();
    }
}
