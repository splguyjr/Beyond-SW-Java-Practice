package com.splguyjr.chap13.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> customerLine = new LinkedList<>();

        while (true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String name = sc.nextLine();

            if(name.equals("next")) {
                String polledCustomer = customerLine.poll();
                if(polledCustomer == null) System.out.println("대기 고객이 없습니다.");
                else System.out.println(polledCustomer + " 고객님 차례입니다.");
            }

            else if (name.equals("exit")) {
                break;
            }

            else {
                customerLine.add(name);
                System.out.println(name + "님 대기 등록 되었습니다.");
            }
        }
    }
}
