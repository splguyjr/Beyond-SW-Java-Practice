package com.splguyjr.chap03.level01.basic;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {
        int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        return sum;
    }

    public void checkMaxNumber(int a, int b) {
        System.out.print(Math.max(a, b));
    }

    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    public int minusTwoNumber(int a, int b) {
        return Math.abs(a-b);
    }
}
