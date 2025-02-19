package com.splguyjr.chap03.level02.normal;

import java.util.Random;

public class RandomMaker {

    Random random = new Random();

    public int randomNumber(int min, int max) {
//        return (int)(Math.random() * (max - min + 1) + min );
        return random.nextInt(min, max + 1);
    }

    public String randomUpperAlphabet(int length) {
        String s = "";

        for (int i = 0; i<length; i++) {
            s+= (char)random.nextInt(65, 91);
        }

        return s;
    }

    public String rockPaperScissors() {
        String[] s = {"가위", "바위", "보"};

        int rand = random.nextInt(0,3);
        return s[rand];
    }

    public String tossCoin() {
        String[] s = {"앞면", "뒷면"};

        int rand = random.nextInt(0,2);
        return s[rand];
    }
}
