package com.splguyjr.chap09.level01.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("문자열 입력 : ");
        String inputText = sc.nextLine();

        String[] inputWords = inputText.split("");

        for(String word : inputWords) {
            for(char ch : word.toCharArray()) {
                if((ch >= 'a'&& ch <= 'z') | (ch>='A'&& ch <= 'Z'))
                    sb.append(ch);
                else if (ch == ' ')
                    sb.append(ch);
            }
        }
        String englishWord =  sb.toString();

        StringTokenizer st = new StringTokenizer(englishWord, " ");
        Map<String, Integer> wordCountMap = new HashMap<>();
        while (st.hasMoreElements()) {
            String currentWord = st.nextToken().toLowerCase();
            if (!wordCountMap.containsKey(currentWord))
                wordCountMap.put(currentWord, 1);
            else wordCountMap.put(currentWord, wordCountMap.get(currentWord) + 1);
        }

        String maxWord = null;
        int maxCount = 0;
        Entry<String, Integer> maxCountWordEntry = null;
        for (Entry<String, Integer> word : wordCountMap.entrySet()) {
            String key = word.getKey();
            int frequency = word.getValue();
            if(word.getValue() > maxCount) {
                maxWord = word.getKey();
                maxCount = word.getValue();
            }
            System.out.println(key + ": " + frequency);
        }

        System.out.println("가장 빈도 높은 단어 : " + maxWord + " (" + maxCount + " 번)");
    }
}
