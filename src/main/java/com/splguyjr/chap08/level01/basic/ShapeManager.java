package com.splguyjr.chap08.level01.basic;

import java.util.Arrays;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index;

    /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
    public void addShape(Shape shape) {
        if(index == shapes.length) {
            shapes = Arrays.copyOf(shapes, shapes.length * 2);
        }
        shapes[index++] = shape;
    }

    /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
    public void removeShape(Shape shape) {
        for (int i = 0; i < shapes.length; i++) {
            if(i == shapes.length - 1) shapes[i] = null;
            else if(shapes[i] == shape) {
                System.arraycopy(shapes, i+1, shapes, i, shapes.length-i-1);
            }
        }
    }

    public void printAllShapes() {
        for (Shape s : shapes) {
            if (s != null) {
                System.out.println("Shape: " + s);
                System.out.println("Area: " + s.calculateArea());
                System.out.println("Perimeter: " + s.calculatePerimeter());
            }
        }
    }

    public double getTotalArea() {
        double sum = 0;
        for (Shape s : shapes) {
            if (s != null)
                sum += s.calculateArea();
        }
        return sum;
    }

    public double getTotalPerimeter() {
        double sum = 0;
        for (Shape s : shapes) {
            if (s != null)
                sum += s.calculatePerimeter();
        }
        return sum;
    }
}
