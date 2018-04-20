package main.java.com.yanyi.thread.chapter1;

public class MyThread extends Thread{
    private int i = 5;
    @Override
    public void run () {
//        System.out.println(Thread.currentThread().getName());
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }
}
