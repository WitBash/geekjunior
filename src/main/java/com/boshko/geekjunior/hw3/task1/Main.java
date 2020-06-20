package com.boshko.geekjunior.hw3.task1;

public class Main {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        MyThread mt1 = new MyThread("Ping", pingPong);
        MyThread mt2 = new MyThread("Pong", pingPong);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
        }

    }
}
