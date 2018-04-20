package main.java.com.yanyi.thread.chapter1;

public class Run {
    public static void main (String[] args) {
        /*Thread t1 = new MyThread();
        t1.setName("thread1");
        MyThread mt = new MyThread();
        Thread t2 = new Thread(mt, "thread2");
        t1.start();
        t2.start();*/

        MyThread mt2 = new MyThread();
        Thread tt1 = new Thread(mt2);
        Thread tt2 = new Thread(mt2);
        Thread tt3 = new Thread(mt2);
        Thread tt4 = new Thread(mt2);
        Thread tt5 = new Thread(mt2);
        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();
        tt5.start();
    }
}
