package com.boshko.geekjunior.hw1.task2;

/*
* методы интерфейса не переопределяются, а реализуются
 */
public class LightWeightCar extends Car implements Moveable{

    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    @Override
    public void open() {
        System.out.println("Car is open");
    }

    @Override
    public void close() {
        System.out.println("Car is close");
    }
}
