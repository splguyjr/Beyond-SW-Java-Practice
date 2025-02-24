package com.splguyjr.chap08.level01.basic;

public abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
