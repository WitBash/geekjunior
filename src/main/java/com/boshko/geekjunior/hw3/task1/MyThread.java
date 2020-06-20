package com.boshko.geekjunior.hw3.task1;

public class MyThread implements Runnable {

    Thread thrd;
    PingPong pp;

    public MyThread(String name, PingPong pp) {
        this.thrd = new Thread(this, name);
        this.pp = pp;
        thrd.start();
    }

    @Override
    public void run() {
        if (thrd.getName().compareTo("Ping") == 0) {
            for (int i = 0; i < 10; i++) pp.ping(true);
            pp.ping(false);


        } else {
            for (int i = 0; i < 10; i++) pp.pong(true);
            pp.pong(false);

        }


    }
}
