package com.example.reusing;

class Insect {
    private int i = 9;

    private int k = printInit("Insect.k initialized");

    protected int j;

    Insect() {
        System.out.println("Insect constructor");
        System.out.println("Insect.i = " + i + ", Insect.j = " + j);
        System.out.println("Insect.x1 = " + x1);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("Beetle constructor");
        System.out.println("Beetle.k = " + k);
        System.out.println("Beetle.j = " + j);
        System.out.println("Beetle.x2 = " + x2);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        Beetle b = new Beetle();
    }
} /* Output:
static Insect.x1 initialized
static Beetle.x2 initialized

    Insect.k initialized
Insect constructor
Insect.i = 9, Insect.j = 0
Insect.x1 = 47

    Beetle.k initialized
Beetle constructor
Beetle.k = 47
Beetle.j = 39
Beetle.x2 = 47
*///
