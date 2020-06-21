package com.boshko.geekjunior.hw3.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        for (int i = 0; i < 200; i++) {
            CounterThread ct = new CounterThread(counter);
            ct.start();
        }

        Thread.sleep(1000);

        System.out.println("Counter:" + counter.getCounter());
    }
}
