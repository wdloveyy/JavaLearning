package com.wangdong.basic.oop;

//抽象员工类
public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    /**
     * 计算薪水
     *
     * @return test return
     */
    public double computePay() {
        return 1d;
    }
}
