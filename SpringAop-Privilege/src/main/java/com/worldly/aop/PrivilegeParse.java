package com.worldly.aop;

import java.lang.reflect.Method;

/**
 * 自定义权限注解解析类
 * @author xiaoqixuan
 * @create 2017/5/6 10:10
 */
public class PrivilegeParse {
    public static String parse(Class targetClass ,String targetMethod){
        //要访问的方法即对应的权限
        String accessMethod ="";
        try {
            Method method = targetClass.getMethod(targetMethod);
            //判断方法是否有权限注解
            if(method.isAnnotationPresent(PrivilegeInfo.class)){
                //得到该方法上的注解
                PrivilegeInfo privilegeInfo = (PrivilegeInfo)method.getAnnotation(PrivilegeInfo.class);
                //在通过注解得到相关的方法
                accessMethod = privilegeInfo.value();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return accessMethod;
    }

}
