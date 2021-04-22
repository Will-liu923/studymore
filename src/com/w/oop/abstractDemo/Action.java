package com.w.oop.abstractDemo;


//abstract用在类上就是：抽象类修饰符
public abstract class Action {

    //abstract用在方法上就是：抽象方法，只有方法名字，没有方法的实现(方法体)。----这是一个约束，用的人负责实现
    public abstract void doSomething();
}

/*
特点：
    1、不能new这个抽象对象，只能靠子类去实现它：约束！
    2、抽象类中可以有普通方法，但是抽象方法必须在抽象类中。
 */