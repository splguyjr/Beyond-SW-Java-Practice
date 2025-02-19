package com.splguyjr.chap03.level02.normal;

public class Application {
    public static void main(String[] args) {
        RandomMaker randomMaker = new RandomMaker();
        System.out.println(randomMaker.randomNumber(1, 2));
        System.out.println(randomMaker.randomUpperAlphabet(10));
        System.out.println(randomMaker.rockPaperScissors());
        System.out.println(randomMaker.tossCoin());
    }
}
