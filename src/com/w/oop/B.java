package com.w.oop;

//方法重写--和属性无关
public class B extends A{

    @Override
    public void test() {
        System.out.println("B=>test()");
    }

    public static void method() {
        System.out.println("B=>method()");
    }

    public void run() {
        System.out.println("run");
    }
}
