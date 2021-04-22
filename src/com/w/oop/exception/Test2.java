package com.w.oop.exception;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            new Test2().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
        }


        //快捷键：首先选中需要囊括的代码 ctrl + alt + t
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();//打印错误的信息
        } finally {
        }


        try {
            if (b == 0) { //throw throws
                throw new ArithmeticException(); // 主动抛出异常  throw
            }

            System.out.println(a/b);
        }catch (Throwable e) {
            System.out.println("...");
        }finally {

        }
    }

    //假设在这个方法中，处理不了这个异常。方法上抛出异常
    public void test(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException();  //throw 主动抛出异常，一般在方法中使用！
        }
        System.out.println(a/b);
    }
}
