package com.splguyjr.chap13.level01.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> scoreList = new ArrayList<>();

        char c = 'y';

        while(c == 'y' || c == 'Y') {
            System.out.print("학생 성적 : ");
            int score = sc.nextInt();

            scoreList.add(score);

            System.out.print("추가 입력하려면 y : ");
            c = sc.next().charAt(0);
        }

        double avgScore = 0;

        int cnt = 0;
        for (int x : scoreList) {
            avgScore += x;
            cnt++;
        }
        System.out.println("학생 인원 : " + cnt);
        System.out.println("평균 점수 : " + avgScore / cnt);
    }
}
