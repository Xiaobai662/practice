package com.example.java8;

/**
 * lambda 语法：
 * (parameters) -> expression 或 (parameters) -> {statements;}
 *        特征：
 * 可选的类型声明：不需要声明参数类型，编译器可以统一识别参数值
 * 可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号
 * 可选的大括号：如果主体包含了一个语句，就不需要使用大括号
 * 可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值
 * */
public class Java8Test
{
    final static String HELLO = "Hello! ";

    public static void main(String[] args) {
        Java8Test test = new Java8Test();
        // 类型声明
        Operation addition = (int a, int b) -> a + b;
        // 不用类型声明
        Operation subtraction = (a, b) -> a - b;
        // 大括号中的返回语句
        Operation multiplication = (int a, int b) -> {
            return a * b;
        };
        // 没有大括号及返回语句
        Operation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + test.operate(10, 5, addition));
        System.out.println("10 - 5 = " + test.operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + test.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + test.operate(10, 5, division));

        // 不用括号
        GreetService greetService1 = message -> System.out.println(HELLO + message);
        greetService1.sayMessage("World!");
        // ==================

        GreetService greetService2 = (message) -> System.out.println("Hello " + message);
        greetService2.sayMessage("Lambda!");





    }

    interface Operation {
        int operation(int a, int b);
    }

    interface GreetService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, Operation operation) {
        return operation.operation(a, b);
    }
}
