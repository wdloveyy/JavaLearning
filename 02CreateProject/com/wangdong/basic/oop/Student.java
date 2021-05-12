package com.wangdong.basic.oop;

public class Student extends Person {

    //学号
    public String xh;

    //重写Person的run方法，直接覆盖
    public void run(){
        System.out.printf("%s--%s正在跑%n",name,xh);
    }
    public void superRun(){
        //使用super关键字访问父类的元素（类似于C#中的base）
        super.run();
    }
}
