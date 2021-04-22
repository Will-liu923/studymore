package com.w.oop.innerClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Outer {
    private int id = 10;
    public void out() {
        System.out.println("外部类的方法");
    }

    //局部内部类
    public void method() {
        class Innerclass {
            public void innerMethod() {}
        }
    }

    //成员内部类
    public class Inner {
        public void in() {
            System.out.println("成员内部类的方法");
        }

        //获得外部类的私有属性
        public void getID() {
            System.out.println(id);
        }
    }

    //静态内部类static 修饰
    public static class staticInner {

        //静态内部类无法访问外部类私有属性，因为先加载
        public  void idGet() {
            //System.out.println(id);
        }
    }
}

//一个Java类中可以有多个类，但是只能有一个public class
class A{}
