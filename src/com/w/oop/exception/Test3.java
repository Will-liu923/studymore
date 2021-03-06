package com.w.oop.exception;

public class Test3 {
    public static void main(String[] args) {

        try {
            test(11);
        } catch (MyException e) {
            System.out.println("MyException=> " + e);
        }
    }

    public static void test(int a) throws MyException {
        System.out.println("传递的参数=> " + a);
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("OK");
    }
}
