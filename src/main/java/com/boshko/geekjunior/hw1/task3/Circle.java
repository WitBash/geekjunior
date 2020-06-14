package com.boshko.geekjunior.hw1.task3;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimetr() {
        return 2 * radius * Math.PI;
    }
}
