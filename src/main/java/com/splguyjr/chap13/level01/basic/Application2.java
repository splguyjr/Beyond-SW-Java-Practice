package com.splguyjr.chap13.level01.basic;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> urlQueue = new LinkedList<>();

        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit을 입력하면 종료) : ");

            String url = sc.nextLine();
            if(url.equals("exit")) break;

            if(urlQueue.size() == 5) {
                urlQueue.poll();
            }
            urlQueue.add(url);

            printStack(urlQueue);
        }

    }

    public static <T> void printStack(Queue<T> q) {
        System.out.print("최근 방문 url : [");

        List<T> reverseList = new ArrayList<>(q.stream().toList());
        Collections.reverse(reverseList);

        int cnt = 0;
        for (T t : reverseList) {
            if(++cnt == q.size()) System.out.print(t);
            else System.out.print(t + ", ");
        }

        System.out.println("]");
    }
}
