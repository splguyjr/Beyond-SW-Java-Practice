package com.splguyjr.chap04.section02.looping.level02.normal;

public class Application2 {
    public static void main(String[] args) {
        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }

//        System.out.println();
//
//        for (int i =0; i<=25; i++) {
//            System.out.print((char)('a'+i));
//        }
    }
}
