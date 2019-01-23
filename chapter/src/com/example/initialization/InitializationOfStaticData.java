package com.example.initialization;

class Bowl {
    Bowl(int market) {
        System.out.println("Bowl(" + market + ")");
    }
    void f1(int market) {
        System.out.println("f1(" + market + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int market) {
        System.out.println("f2(" + market + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class CupBoard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    CupBoard() {
        System.out.println("CupBoard()");
        bowl4.f1(2);
    }
    void f3(int market) {
        System.out.println("f3(" + market + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

public class InitializationOfStaticData {
    public static void main(String[] args) {
        System.out.println("Create new CupBoard() in main");
        new CupBoard();
        System.out.println("Create new CupBoard() in main");
        new CupBoard();
        table.f2(1);
        cupBoard.f3(1);
    }
    static Table table = new Table();
    static CupBoard cupBoard = new CupBoard();
} /* Output:
Bowl(1)
Bowl(2)
Table()
f1(1)
Bowl(4)
Bowl(5)
Bowl(3)
CupBoard()
f1(2)
Create new CupBoard() in main
Bowl(3)
CupBoard()
f1(2)
Create new CupBoard() in main
Bowl(3)
CupBoard()
f1(2)
f2(1)
f3(1)
*///:~