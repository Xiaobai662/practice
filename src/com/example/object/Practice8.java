package com.example.object;

public class Practice8 {
    public static void main(String[] args) {
        System.out.println("Static.i=" + Static.i);
        Static s1 = new Static();
        Static s2 = new Static();
        System.out.println("s1.i=" + s1.i);
        System.out.println("s2.i=" + s2.i);
        Test.increment();
        System.out.println("Aftet Test.increment called:");
        System.out.println("s1.i=" + s1.i);
        System.out.println("s2.i=" + s2.i);
        Test t = new Test();
        t.increment();
        System.out.println("Aftet t.increment() called:");
        System.out.println("s1.i=" + s1.i);
        System.out.println("s2.i=" + s2.i);
    }
}

class Static {
    static int i = 47;
}

class Test {
    static void increment() {
        Static.i++;
    }
}