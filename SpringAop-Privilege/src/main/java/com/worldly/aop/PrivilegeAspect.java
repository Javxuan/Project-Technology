package com.worldly.aop;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.List;

/**
 * 权限的切面
 * 思路：
 * 利用用户本身的权限 去匹配权限控制得到的权限
 *  如果匹配上了就 访问目标方法
 *  没有匹配上就 返回权限控制的提示
 * @author xiaoqixuan
 * @create 2017/5/6 10:30
 */
public class PrivilegeAspect {
    /**
     * 用户本身具有的权限
     */
    private List<Privilege> privilegeList;

    public List<Privilege> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(List<Privilege> privilegeList) {
        this.privilegeList = privilegeList;
    }

    /**
     * aop中的环绕通知
     * 在这个方法中检查用户的权限和目标方法的需要的权限是否匹配
     * 如果匹配则调用目标方法，不匹配则不调用
     * @param joinPoint
     */
    public void isAccessMethod(ProceedingJoinPoint joinPoint) throws  Throwable{
        /**
         * 1.获取访问目标方法应该具备的权限
         *  为解析目标方法的PrivilegeInfo注解，根据我们定义的解析器，需要得到：目标类的class形式　方法的名称
         */
        Class clazz = joinPoint.getTarget().getClass();
        String method = joinPoint.getSignature().getName();
        /**
         * 2.根据权限控制得到对应的 权限
         */
        String  privilege = PrivilegeParse.parse(clazz,method);
        /*
         * 3.遍历用户的权限，看是否拥有目标方法对应的权限
         */
        boolean isAccess = false;
        for(Privilege privilege1 :privilegeList){
            /*
             * 如果目标方法没有使用PrivilegeInfo注解，则解析出来的权限字符串就为空字符串
             * 则默认用户拥有这个权限
             */
            if("".equals(privilege)){
                isAccess=true;
                break;
            }
            /*
             * 用户原有权限列表中有的权限与目标方法上PrivilegeInfo注解配置的权限进行匹配
             */
            if(privilege1.getValue()!=null&&privilege1.getValue().equalsIgnoreCase(privilege)){
                isAccess=true;
                break;
            }
        }

        /*
         * 3.如果用户拥有权限，则调用目标方法　，如果没有，则不调用目标方法，只给出提示
         */
        if(isAccess){
            joinPoint.proceed();
        }else{
            System.out.println("亲，你没有访问权限哟！");
        }
    }

}
