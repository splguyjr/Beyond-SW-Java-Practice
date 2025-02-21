package com.splguyjr.chap06.level02.normal.book;

public class Application {
    public static void main(String[] args) {
        BookDTO[] bookDTOS = new BookDTO[3];
        bookDTOS[0] = new BookDTO();
        bookDTOS[1] = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bookDTOS[2] = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);

        for(BookDTO dto : bookDTOS) {
            dto.printInformation();
        }
    }
}
