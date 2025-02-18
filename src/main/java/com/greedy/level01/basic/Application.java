package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args) {
        //메소드 호출 확인용 메소드 호출
        //함수를 호출하여 1~10까지의 합을 리턴 받아 출력
        //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
        //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
        //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력

        Calculator calculator = new Calculator();

        calculator.checkMethod();

        System.out.print("1부터 10까지의 합 : ");
        System.out.println(calculator.sum1to10());

        int a = 10, b= 20;

        System.out.print("두 수 중 큰 수는 ");
        calculator.checkMaxNumber(a, b);
        System.out.printf("이다.\n%d과 %d의 합은 : %d", a, b, calculator.sumTwoNumber(a,b));
        System.out.println();
        System.out.printf("10과 5의 차는 : %d", calculator.minusTwoNumber(10, 5));


//        메소드 호출 확인
//        1부터 10까지의 합 : 55
//        두 수 중 큰 수는 20이다. 10과 20의 합은 : 30
//        10과 5의 차는 : 5
    }
}
