package com.worldly.aop;

import javax.jws.soap.SOAPBinding;

/**
 * 用户业务实现类
 * @author xiaoqixuan
 * @create 2017/5/6 10:35
 */
public class UserServiceImpl implements UserService{
    /**
     * 用户业务某个方法要权限控制的时候就用@PrivilegeInfo注解标明
     */
    @PrivilegeInfo("save")
    public void save() {
        System.out.println("UserServiceImpl.save（）被调用了");
    }

    @PrivilegeInfo("update")
    public void update() {
        System.out.println("UserServiceImpl.update（）被调用了");
    }

    @PrivilegeInfo("deleted")
    public void deleted() {
        System.out.println("UserServiceImpl.deleted（）被调用了");
    }

    public void get() {
        System.out.println("UserServiceImpl.get（）被调用了");
    }
}
