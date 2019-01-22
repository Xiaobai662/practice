package com.example.operator;

class Tank {
    int level;
}

/**
 * 为对象赋值
 * */
public class Example1 {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2; // 别名现象：t1 t2指向相同的引用，在对t1赋值的时候，t1的引用丢失了
        // t1.level = t2.level
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 48;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}
