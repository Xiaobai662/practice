package com.example.operator;

public class FinalizeTest {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference. forget to clean up:
        new Book(true); // 这本书未被嵌入
        // Force garbage collection & finalization
        System.gc(); // 强制进行终极动作
    }
} /* Output:
Error: checked out
*///

class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if(checkedOut) {
            System.out.println("Error: checked out");
            // Normally, you'll also do this:
            // super.finalize(); // Call the base-class version
        }
    }
}
