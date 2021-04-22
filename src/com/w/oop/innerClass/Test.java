package com.w.oop.innerClass;

public class Test {

    public static void main(String[] args) {

        //匿名内部类--没有名字初始化类，不用将实例保存到变量中。
        new Apple().eat();

        //new 接口
        U u = new U() {
            @Override
            public void a() {

            }
        };
    }
}

class Apple {
    public void eat() {
        System.out.println("1");
    }
}

interface U {
    void a();
}