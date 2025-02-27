package com.splguyjr.chap13.level01.basic;

import java.util.*;

public class Application6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneNumberMap = new HashMap<>();

        while (true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String inputLine = sc.nextLine();
            String[] inputs = inputLine.split(" ");

            if (inputs[0].equals("exit")) {
                break;
            }

            else if (inputs[0].equals("search")) {
                System.out.print("검색할 이름 : ");
                String searchName = sc.next();
                sc.nextLine();
                if(phoneNumberMap.containsKey(searchName)) {
                    String phoneNumber = phoneNumberMap.get(searchName);
                    System.out.println(searchName + "씨의 전화번호 : " + phoneNumber);
                } else System.out.println(searchName + "씨의 전화번호는 등록되어 있지 않습니다.");
            }

            else if(inputs.length != 2) {
                System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
            }


            else {
                phoneNumberMap.put(inputs[0], inputs[1]);
                System.out.println("추가 완료 : " + inputs[0] + " " + inputs[1]);
            }
        }
    }
}
