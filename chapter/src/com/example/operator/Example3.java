package com.example.operator;

public class Example3 {

    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    Example3 o;

    void printInitialValues() {
        System.out.println("boolean    " + t);
        System.out.println("char    " + c);
        System.out.println("byte    " + b);
        System.out.println("short    " + s);
        System.out.println("int    " + i);
        System.out.println("long    " + l);
        System.out.println("float    " + f);
        System.out.println("double    " + d);
        System.out.println("Object    " + o);
    }

    public static void main(String[] args) {
        Example3 e = new Example3();
        e.printInitialValues();

        int i = 1;
        System.out.println("i: " + i); // 1
        System.out.println("++i: " + ++i); // 2
        System.out.println("i++: " + i++); // 2
        System.out.println("i: " + i); // 3
        System.out.println("--i: " + --i); // 2
        System.out.println("i--: " + i--); // 2
        System.out.println("i: " + i); // 1
    }
}
