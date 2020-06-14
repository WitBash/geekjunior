package com.boshko.geekjunior.hw1.task2;

/*
 * добавил абстрактный метод close()
 */
public abstract class Car {
    public IEngine engine;
    private String color;
    private String name;

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName​() {
        return name;
    }

    public void setName​(String name) {
        this.name = name;
    }

    public abstract void open();
    public abstract void close();

}
