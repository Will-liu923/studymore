package com.w.oop;


/*
封装：
1、提高代码的安全性，保护数据
2、隐藏代码的实现细节
3、统一接口
4、系统可维护性增加
 */
public class GoodStu {

    //属性私有
    private String name;
    private int age;
    private char sex;

    //提供一些操作属性的方法---public 的get获取  set设置
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //年龄需要进行合法性检查
        if (age > 120 || age < 0) {
            this.age = 3;
        }else {
            this.age = age;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
