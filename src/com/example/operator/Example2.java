package com.example.operator;

/**
 * 方法调用中的别名问题
 * */
public class Example2 {

    static void f(Letter y) {
        y.c = 'z'; // 改变的是f()之外的对象
    }

    public static void main(String[] args) {
        Letter l = new Letter();
        l.c = 'a';
        System.out.println("1: l.c: " + l.c);
        f(l); // 传递一个引用
        System.out.println("2: l.c: " + l.c);
    }
}

class Letter {
    char c;
}
