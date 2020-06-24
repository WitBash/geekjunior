package com.boshko.geekjunior.hw3.task1;

public class PingPong {
    String state;

    synchronized void ping(boolean playing) {
        if(!playing){
            state = "ping";
            notify();
            return;
        }
        System.out.print("Ping ");

        state = "ping";
        notify();
        try{
            while (!state.equals("pong")){
                wait();
            }
        } catch (InterruptedException exc){
            System.out.println("Прерывание потока");
        }
    }

    synchronized void pong(boolean playing) {
        if(!playing){
            state = "pong";
            notify();
            return;
        }
        System.out.println("Pong");

        state = "pong";
        notify();
        try{
            while (!state.equals("ping")){
                wait();
            }
        } catch (InterruptedException exc){
            System.out.println("Прерывание потока");
        }
    }
}
