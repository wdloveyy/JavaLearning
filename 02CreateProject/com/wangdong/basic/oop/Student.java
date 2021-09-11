package com.wangdong.basic.oop;
//继承
public class Student extends Person {

    //学号
    private String xh;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    //重写Person的run方法，直接覆盖
    public void run(){
        System.out.printf("%s--%s正在跑%n",super.getName(),xh);
    }
    public void superRun(){
        //使用super关键字访问父类的元素（类似于C#中的base）
        super.run();
    }

    /**
     * 可变参数方法
     */
    public void bariableArgTest(String ... strs){
        System.out.printf("可变的长度为："+strs.length);
    }
}
