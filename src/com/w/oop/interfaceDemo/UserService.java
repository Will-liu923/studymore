package com.w.oop.interfaceDemo;

//接口 interface 接口都有实现类
public interface UserService {

    //属性---接口中属性都是被public static final修饰的常量，一般不会这么使用！
    public static final int age = 10;
    int num = 200;


    //接口中的所有定义方法其实都是抽象的 public abstract的
    public abstract String printName(String name); //public abstract 都是默认的，实际开发中可以省略
    void run();
}
