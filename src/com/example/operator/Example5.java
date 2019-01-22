package com.example.operator;

public class Example5 {

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";
        Dog scruffy = new Dog();
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";
        System.out.println("spot: " + "name=" + spot.name + ", says=" + spot.says);
        System.out.println("scruffy: " + "name=" + scruffy.name + ", says=" + scruffy.says);

        Dog niuniu = new Dog();
        niuniu.name = "niuniu";
        niuniu.says = "wangwang!";
        System.out.println("niuniu: " + "name=" + niuniu.name + ", says=" + niuniu.says);
        System.out.println("Comparison: ");
        System.out.println("spot == niuniu: " + (spot == niuniu)); // false
        System.out.println("spot.equals(niuniu): " + spot.equals(niuniu)); // false
        System.out.println("niuniu.equals(spot): " + niuniu.equals(spot)); // false
        System.out.println("Now assign: spot = niuniu");
        spot = niuniu;
        System.out.println("Compare again: ");
        System.out.println("spot == niuniu: " + (spot == niuniu)); // true
        System.out.println("spot.equals(niuniu): " + spot.equals(niuniu)); // true
        System.out.println("niuniu.equals(spot): " + niuniu.equals(spot)); // true
        System.out.println("spot: " + "name=" + spot.name + ", says=" + spot.says); // spot: name=niuniu, says=wangwang!
        System.out.println("niuniu: " + "name=" + niuniu.name + ", says=" + niuniu.says); // niuniu: name=niuniu, says=wangwang!
    }
}

class Dog {
    String name;
    String says;
}
