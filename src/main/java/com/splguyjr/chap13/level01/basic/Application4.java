package com.splguyjr.chap13.level01.basic;

import java.util.*;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> studentIdSet = new HashSet<>();

        while (true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String studentId = sc.nextLine();
            if (studentId.equals("exit")) {
                break;
            }
            else {
                studentIdSet.add(studentId);
                System.out.println("ID가 추가 되었습니다.");
            }
        }

        System.out.print("모든 학생의 ID : [");
        Iterator<String> iterator = studentIdSet.iterator();
        int cnt = 0;
        int size = studentIdSet.size();
        while(iterator.hasNext()) {
            String nextID = iterator.next();
            if (++cnt == size) System.out.print(nextID + "]");
            else System.out.print(nextID + ", ");
        }
    }
}
