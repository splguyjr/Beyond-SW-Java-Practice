package com.splguyjr.chap05.section01.array.level04.advanced;

import java.util.*;

public class Application2_Refactor {
    private static final int DIGITS = 4;
    private static final int MAX_CHANCES = 10;

    public static void main(String[] args) {
        int[] answer = generateUniqueNumber();
        playGame(answer);
    }

    //set을 이용하여 중복을 제거하고, 0~9의 4자리 숫자 배열을 반환하는 메소드
    private static int[] generateUniqueNumber() {
        Random random = new Random();
        Set<Integer> usedNumbers = new HashSet<>();
        int[] arr = new int[DIGITS];

        int count = 0;
        while(count < DIGITS) {
            int num = random.nextInt(10);
            if (count == 0 && num == 0) continue; //첫 번째 숫자가 0인 경우 다시 선정
            if (usedNumbers.add(num)) {//set에 이미 존재하는 요소를 추가할 시 false 반환
                arr[count++] = num;
            }
        }
        return arr;
    }

    //사용자의 입력을 배열에 담아 반환
    private static int[] getUserInput(Scanner sc) {
        while(true) {
            System.out.print("4자리 숫자를 입력하세요:");
            String input = sc.nextLine().trim();

            if (input.matches("\\d{4}")) { //4자리 숫자인지 확인
                int[] userNumbers = new int[DIGITS];
                for (int i = 0; i < DIGITS; i++) {
                    userNumbers[i] = input.charAt(i) - '0';
                }
                return userNumbers;
            } else {
                System.out.println("4자리의 정수를 입력해야 합니다.");
            }
        }
    }

    private static void playGame(int[] answer) {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        while (attempts < MAX_CHANCES) {
            System.out.println((MAX_CHANCES - attempts) + "회 남으셨습니다.");
            int[] userGuess = getUserInput(sc);

            //스트라이크 & 볼 개수 계산
            int[] score = calculateScore(answer, userGuess);
            int strikes = score[0];
            int balls = score[1];

            if (strikes == 4) {
                System.out.println("정답입니다!");
                return;
            } else {
                System.out.println("아쉽네요 "+ strikes + "S " + balls + "B 입니다.");
                attempts++;
            }
        }

        System.out.print("정답은 ");
        for(int x : answer) {
            System.out.print(x);
        }
        System.out.println("였습니다!");
    }

    //정답 배열과, 입력 배열을 입력으로 받아 계산한 Strike, Ball수를 담은 배열 반환
    private static int[] calculateScore(int[] answer, int[] userGuess) {
        int strikeCount =0, ballCount = 0;
        List<Integer> answerList = new ArrayList<>();
        for (int num : answer) answerList.add(num);

        for (int i = 0; i < answerList.size(); i++) {
            if(answer[i] == userGuess[i]) {
                strikeCount++;
            }
            else if (answerList.contains(userGuess[i])) {
                ballCount++;
            }
        }
        return new int[]{strikeCount, ballCount};
    }


}
