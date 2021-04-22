package com.w.oop;

/*
继承 extends
在Java中所有的类都默认直接或者间接继承Object类，Java只有单继承
 */

//ctrl + h 可以调出继承关系
public class BadStu extends Student {
    private String name = "wily";

    public BadStu() {
        //这里隐藏类一行代码super();---调用父类无参构造
        //也可以手动调用super(...);
        System.out.println("子类无参构造执行");
    }

    public void test(String name) {
        System.out.println(name);
        System.out.println(this.name); //wily
        System.out.println(super.name); //will
    }
}
