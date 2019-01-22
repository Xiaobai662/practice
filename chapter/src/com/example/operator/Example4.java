package com.example.operator;

public class Example4 {

    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2); // false
        System.out.println(n1.equals(n2)); // true
    }
}
