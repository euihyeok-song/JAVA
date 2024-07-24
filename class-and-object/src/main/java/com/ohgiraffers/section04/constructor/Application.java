package com.ohgiraffers.section04.constructor;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */

        /* 필기.
         *  생성자란?
         *   인스턴스를 생성할 때 호출하는 반환형이 없는 함수로 기본생성자와 매개변수 있는 생성자로
         *   나눌 수 있다.
        */

        /* 설명. 기본 생상자와 매개변수 생성자는 무조건 생성하고 시작한다고 생각하자 - 매개 변수 생성자를 만들고 넘어가면 기본 생성자는 자동 생성 X */
        User user1 = new User();                              // 생성자(Constructor) : User()
        System.out.println(user1.information());

        User user2 = new User("user01","pass01","피카츄", new java.util.Date());
        System.out.println(user2.information());

    }
}
