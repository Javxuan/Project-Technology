package com.worldly.aop;

/**
 *  权限类
 * @author xiaoqixuan
 * @create 2017/5/6 10:08
 */
public class Privilege {
    private String value;

    public Privilege(){}
    public Privilege(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
