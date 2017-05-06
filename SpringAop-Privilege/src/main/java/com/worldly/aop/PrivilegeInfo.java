package com.worldly.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xiaoqixuan
 * @create 2017/5/6 10:18
 */
@Target(ElementType.METHOD)  //该注解用在什么地方
/*1.RetentionPolicy.SOURCE —— 这种类型的Annotations只在源代码级别保留,编译时就会被忽略
2.RetentionPolicy.CLASS —— 这种类型的Annotations编译时被保留,在class文件中存在,但JVM将会忽略
3.RetentionPolicy.RUNTIME —— 这种类型的Annotations将被JVM保留,所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用.*/
@Retention(RetentionPolicy.RUNTIME)
public @interface PrivilegeInfo {
    /**
     * 权限的名称
     * @return
     */
    String value() default "";
}
