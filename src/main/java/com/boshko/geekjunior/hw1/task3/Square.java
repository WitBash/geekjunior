package com.boshko.geekjunior.hw1.task3;

public class Square implements Figure {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public double perimetr() {
        return 4 * edge;
    }
}
