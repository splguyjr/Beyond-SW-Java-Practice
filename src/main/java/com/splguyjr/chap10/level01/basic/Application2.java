package com.splguyjr.chap10.level01.basic;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String s = sc.nextLine();

        try {
            checkOlder(s);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (DateTimeException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        }
    }

    public static void checkOlder(String s) throws InvalidAgeException {
        LocalDate parse = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate minusYear = LocalDate.now().minusYears(20);
        if(parse.isBefore(minusYear)) {
            System.out.println("입장하셔도 됩니다.");
        }

        else {
            throw new InvalidAgeException("만 20세 미만은 입장불가입니다.");
        }
    }
}
