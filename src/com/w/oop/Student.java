package com.w.oop;

public class Student {

    //属性
    protected String name = "will"; // null
    int age; // 0

    public Student() {
        System.out.println("父类无参构造执行");
    }

    //方法
    public void study() {
        System.out.println(this.name + " is studying!");
    }
}
