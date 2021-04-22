package com.w;

public class Demo02 {
    public static void main(String[] args) {
        int a = 1;
        //Java是值传递
        System.out.println(a); // a = 1
        func(a);
        System.out.println(a); // a = 1

        //引用传递：本质还是值传递
        Demo02 demo02 = new Demo02();
        Person person = new Person();
        demo02.change(person);
        System.out.println(person.name);
    }
    public static void func(int a) {
        a = 10;
    }

    public void change(Person person) {
        person.name = "Wily";
    }
}

class Person {
    String name;
}
