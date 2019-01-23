package com.example.operator;

public class PassingThis {

    public static void main(String[] args) {
        new Person().eat(new Apple());
        new Person().sleep();
    }
}

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }

    void sleep() {
        drink();
        this.drink();
    }

    void drink() {
        System.out.println("person drink..");
    }
}

class Apple {
    Apple getPeeled() {
        System.out.println("this -> Apple");
        return Peeler.peel(this);
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        return apple;
    }
}
