package com.boshko.geekjunior.hw3.task2;

public class CounterThread  extends Thread{

    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter=counter;
    }

    @Override
    public void run(){
        while (!isInterrupted()){
            for (int i=0; i < 1000; i++){
                if (counter.getCounter() == 1000) Thread.currentThread().interrupt();
                counter.increase();
            }
        }

    }
}
