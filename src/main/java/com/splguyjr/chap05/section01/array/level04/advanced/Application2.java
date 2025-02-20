package com.splguyjr.chap05.section01.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */

        int[] arr = new int[4];//정답 배열
        int[] visited = new int[10];

        int cnt = 0;
        while(cnt != 4) {
            Random random = new Random();
            int num = random.nextInt(0, 10);

            if(cnt == 0 && num == 0) continue; //맨 앞자리 0 제거

            if(visited[num] != 1) {
                arr[cnt] = num;
                visited[num] = 1;
                cnt++;
            }
        }
//        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);

        int chance = 0;
        while (chance != 10) {
            System.out.print("4자리 숫자를 입력하세요 : ");
            int input = sc.nextInt();
            sc.nextLine();

            //ans 배열에 입력 숫자 나눠 담기
            int[] ans = new int[4];
            int cnt1 = 3;
            while(input >0) {
                int r = input % 10;
                ans[cnt1--] = r;
                input /= 10;
            }

//            System.out.println(Arrays.toString(ans));
            int ball_count = 0;
            int strike_count = 0;

            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < ans.length; j++) {
                    if(ans[j] == arr[i]) {
                        if(j == i) strike_count++;
                        else ball_count++;
                    }
                }
            }

            if(strike_count == 4) {
                System.out.println("정답입니다");
                return;
            }
            else {
                chance++;
                System.out.println("아쉽네요 " + strike_count + "S " + ball_count + "B 입니다.");
                System.out.println(10-chance + "회 남으셨습니다.");
            }

        }

    }

//    //배열에 해당 값이 존재하는지 여부 확인
//    public boolean check(int[] arr, int y) {
//        for(int x : arr) {
//            if (x == y) return true;
//        }
//        return false;
//    }
}
