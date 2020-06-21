package com.boshko.geekjunior.hw3.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private long counter = 0L;

    Lock lock = new ReentrantLock();

    public void increase() {
        try {
            lock.lock();
            if (counter < 1000) counter++;
        } finally {
            lock.unlock();
        }

    }

    public long getCounter() {
        return counter;
    }
}
