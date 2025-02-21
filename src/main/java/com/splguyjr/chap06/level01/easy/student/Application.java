package com.splguyjr.chap06.level01.easy.student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] students = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);

        char input = 'y';
        int idx = 0;
        while (input == 'y' && idx < 10) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            sc.nextLine();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            sc.nextLine();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            sc.nextLine();

            students[idx++] = new StudentDTO(grade, classroom, name, kor, eng, math);

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            input = sc.nextLine().charAt(0);
        }

        for (int i = 0; i < idx; i++) {
            System.out.println(students[i].getInformation());
        }
    }
}
