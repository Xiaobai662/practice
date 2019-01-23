package com.example.operator;

public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this; // 返回对当前对象的引用
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf l = new Leaf();
        l.increment().increment().increment().print();
    }
}
