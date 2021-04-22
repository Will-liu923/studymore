package com.w.oop.interfaceDemo;

//类 可以实现接口 implements接口----接口可以多继承【类只能单继承！】
//实现了接口，就需要重写接口中的方法！
public class UserServiceImpl implements UserService,TimeService { //利用接口实现多继承。

    @Override
    public String printName(String name) {
        return null;
    }

    @Override
    public void run() {

    }

    @Override
    public String timer() {
        return null;
    }
}
