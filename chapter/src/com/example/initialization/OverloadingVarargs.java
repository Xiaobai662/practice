package com.example.initialization;

public class OverloadingVarargs {
    static void f(float i, Character... args) {
        System.out.println("first");
    }
    static void f(Character... args) {
        System.out.println("second");
    }
    public static void main(String[] args) {
        f(1, 'a');
        //f('a', 'b'); // 报错原因：都匹配
    }
}
