package com.w.oop;

public class Person {

    String name;

    //一个类即使什么都不写，也存在一个构造方法--使用new必须要有构造器
    //无参构造器
    public Person(){}

    //有参构造器----定义了有参构造就必须写上无参构造器
    public Person(String name) {
        this.name = name;
    }
}

/*
构造器：
    1、和类名相同
    2、没有返回值
作用：
    1、new本质是在调用构造器
    2、初始化对象的值
注意点：
    1、定义了有参构造，如果想使用无参构造，必须显示地定义无参构造
 */