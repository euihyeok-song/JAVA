package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.dto.BookDTO;

public class Application2 {
    public static void main(String[] args) {

        /* 설명. Object 클래스가 공동적으로 제공하는 기능 1. toString(), 2.equals 3.Hashcode ( 모두 override해서 사용)*/
        /* 설명. book1과 book2는 동등하다( 완전한 일치X(동일한 객체 X) , 기준(사용자 판단)에서는 일치O(title이후 값 동일한 값 O)*/
        BookDTO book1 = new BookDTO(1,"홀길동전","허균",50000);
        BookDTO book2 = new BookDTO(2,"홀길동전","허균",50000);

        /* 설명. book3와 book2는 동일하다 ( 완전한 일치 O)*/
        BookDTO book3 = book2;

        System.out.println("두 인스턴스를 == 연산자로 비교: " + (book1 == book2));  // false : 동일하지 않다.(주소값 비교) - 다른 객체
        /* 설명. Object가 처음 물려주는 equals() 메소드는 동일 비교용이다. (주소값 비교) - 위와 동일 / 다형성 적용 O*/
        System.out.println("두 인스턴스를 equals() 메소드로 비교: " + book1.equals(book2));

        /* 설명. BookDTO에서 equals() 메소드를 Override하여서 사용*/
        System.out.println("두 인스턴스를 equals() 메소드로 비교: " + book1.equals(book2));
        System.out.println("book1의 hashCode: " + book1.hashCode());
        System.out.println("book2의 hashCode: " + book2.hashCode());


    }
}
