package com.splguyjr.chap09.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("문자열 입력 : ");
        String inputText = sc.nextLine();

        String[] inputWords = inputText.split(" ");
        int wordCount = inputWords.length;

        for(String word : inputWords) {
            int idx = 0;
            for (char ch : word.toCharArray()) {
                if(idx == 0) {
                    char firstChar = (ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch;
                    sb.append(firstChar);
                } else sb.append(ch);
                idx++;
            }
            sb.append(" ");
        }

        System.out.println("변환된 문자열: " + sb);
        System.out.println("총 단어 개수: " + wordCount);
    }
}
