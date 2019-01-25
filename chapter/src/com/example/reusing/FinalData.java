package com.example.reusing;

import java.util.Random;

import static com.example.util.Print.*;

class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random rand = new Random(47);

    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    // can be compile-time constants: 可以是编译时常量（带有恒定初始值，即编译期常量）
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // typical public constant: 典型公共常数
    public static final int VALUE_THREE = 39;
    // cannot be compile-time constants:
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        // fd1.valueOne++; // Error: can't change value
        fd1.v1 = new Value(9); // OK: not final
        fd1.v2.i++; // Object isn't constant
        // fd1.v2 = new Value(0); // Error: can't assign a value to final variable
        // fd1.VAL_3 = new Value(1); // Error: 无法为 final 变量赋值
        // fd1.a = new int[2]; // Error: can't assign a value to final variable
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++; // Object isn't constant
        }
        println(fd1);
        println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        println(fd1);
        println(fd2);
    }
} /* Output:
fd1: i4 = 15, INT_5 = 18
Creating new FinalData
fd1: i4 = 15, INT_5 = 18
fd2: i4 = 13, INT_5 = 18
*///:~
