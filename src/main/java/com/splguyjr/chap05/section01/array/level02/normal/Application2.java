package com.splguyjr.chap05.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        String s = sc.next();
        char[] carr = s.toCharArray();

        for(int i = 0; i < carr.length; i++) {
            if(i > 7 ) System.out.print('*');
            else System.out.print(carr[i]);
        }
    }
}
