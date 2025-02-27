package com.splguyjr.chap13.level01.basic;

import java.util.*;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> wordSet = new TreeSet<>();

        while (true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String word = sc.nextLine();
            if (word.equals("exit")) {
                break;
            }
            else {
                wordSet.add(word);
            }
        }

        System.out.print("정렬된 단어 : [");
        int cnt = 0;
        int size = wordSet.size();
        for (String word : wordSet) {
            if (++cnt == size) System.out.print(word + "]");
            else System.out.print(word + ", ");
        }
    }
}
