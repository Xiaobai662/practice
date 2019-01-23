package com.example.initialization;

class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    // 故意把几个Window对象的定义散布到各处，
    // 以证明它们全都会在调用构造器或其他方法之前得到初始化
    Window w1 = new Window(1); // Before constructor

    House() {
        System.out.println("House()");
        w3 = new Window(33); // Reinitialize w3
    }

    Window w2 = new Window(2); // After constructor

    void fn() {
        System.out.println("fn()");
    }

    Window w3 = new Window(3); // At end
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.fn();
        System.out.println("Initialization again");
        House h2 = new House();
    }
}
