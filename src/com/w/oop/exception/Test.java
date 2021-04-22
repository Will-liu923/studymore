package com.w.oop.exception;

public class Test {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        try { //try监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e) { //catch捕获异常
            System.out.println("程序异常，除数不能为0");
        }finally { //处理善后工作
            System.out.println("finally");
        }

        //finally中可以关闭资源-IO流

        //捕获多个异常，需要从小到大捕获
        try {
            new Test().a();
        }catch (Exception e) {
            System.out.println("exception");
        }catch (Throwable e) { //想要捕获的异常类型，throwable是最高的异常类型
            System.out.println("异常警告");
        }finally {
            System.out.println("do something");
        }
    }

    public void a() {
        b();
    }
    public void b() {
        a();
    }
}
