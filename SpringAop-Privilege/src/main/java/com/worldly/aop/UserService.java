package com.worldly.aop;

/**
 * 用户业务接口
 * @author xiaoqixuan
 * @create 2017/5/6 10:32
 */
public interface UserService {
    /**
     * 1.业务的方法 ，如果需要作权限处理的话，就在 对应的方法上加 @PrivilegeInfo的注解
     */
    void save();
    void update();
    void deleted();
    void get();
}
