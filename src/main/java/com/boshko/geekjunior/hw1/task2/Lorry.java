package com.boshko.geekjunior.hw1.task2;

/*
* класс Lorry наследуем от класса Car и реализуем интерфейс
* Moveable
*
*
 */
public class Lorry extends Car implements Moveable{

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
