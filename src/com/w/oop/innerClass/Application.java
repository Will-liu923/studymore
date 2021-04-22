package com.w.oop.innerClass;

public class Application {

    public static void main(String[] args) {

        //实例化外部类
        Outer outer = new Outer();

        //通过内部类实例化外部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();
    }
}
