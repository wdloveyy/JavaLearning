package com.wangdong.basic.oop;

public class Person {
    //姓名
    private String name;
    //年龄
    private int age;
    //微信
    private String vx;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVx(String vx) {
        this.vx = vx;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getVx() {
        return vx;
    }

    public void run(){
        System.out.println(name + "正在跑");
    }
}

