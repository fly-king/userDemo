package com.alibaba.taobao.userdemo.model;

/**
 * Created by tianda.lt on 2017/3/31.
 */
public class User {

    private String id;
    private String NAME;
    private String age;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
