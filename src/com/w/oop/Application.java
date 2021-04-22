package com.w.oop;


//一个项目应该只存在一个main方法
public class Application {

    public static void main(String[] args) {

        //类：抽象的，需要实例化
        Student xiaoming = new Student();
        xiaoming.name = "小明";
        xiaoming.age = 10;
        xiaoming.study();

        System.out.println("===============");

        Person xh = new Person("小红");
        System.out.println(xh.name);

        System.out.println("===============");

        GoodStu goodStu = new GoodStu();
        goodStu.setName("wily");
        System.out.println(goodStu.getName());
        goodStu.setAge(130);
        System.out.println(goodStu.getAge());


        System.out.println("===============");
        BadStu badStu = new BadStu();
        badStu.study(); //badstu 继承 student，
                        // 可以直接调用父类的方法
        badStu.test("lw");

        System.out.println("=================");
        new BadStu();

        System.out.println("==============");

        B b = new B();
        b.test();

        //父类的引用指向子类，非静态方法，调用和右边类型有关
        A a = new B(); //子类重写了父类的方法
        a.test();

        //静态方法 ：方法的调用之和左边有关
        b.method();
        a.method();

        System.out.println("================");

        //instanceof

        //Object > A > B
        //Object > A > C
        Object o = new B();

        System.out.println(o instanceof B);//true
        System.out.println(o instanceof A);//true
        System.out.println(o instanceof Object);//true
        System.out.println(o instanceof C);//false
        System.out.println(o instanceof String);//false

        //强制类型转换  父类 转 子类
        A a1 = new B();
        ((B) a1).run();
    }
}
