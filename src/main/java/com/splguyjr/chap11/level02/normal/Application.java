package com.splguyjr.chap11.level02.normal;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 여러 개의 텍스트 파일을 하나의 파일로 병합하는 프로그램을 작성
        * BufferredReader와 BufferedWriter를 사용하여 작성 */

        Scanner sc = new Scanner(System.in);
        System.out.print("병합할 파일의 개수 입력 : ");
        int fileNum = sc.nextInt();
        String[] files = new String[fileNum];
        for(int i = 0; i < files.length; i++) {
            System.out.print(i+1 + " 번째 파일 이름 입력 : ");
            files[i] = sc.next();
        }

        System.out.print("병합 될 파일명 입력 : ");
        String mergeFileName = sc.next();

        StringBuilder sb = new StringBuilder();

        for (String fileName : files) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))
            ) {
                String temp;
                while((temp = br.readLine()) != null) {
                    sb.append(temp);
                }
            } catch (FileNotFoundException e) {
                System.out.println("오류 :" + fileName + "(지정된 파일을 찾을 수 없습니다)");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergeFileName))) {
            bw.write(String.valueOf(sb));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("파일 병합이 완료 되었습니다.");
    }
}
