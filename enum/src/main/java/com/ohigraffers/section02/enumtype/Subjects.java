package com.ohigraffers.section02.enumtype;

/* 설명. DB 모델링에서 CHECK 제약 조건이 들어갈 경우 열거형(ENUM)을 대부분 사용한다 - 종류가 딱 정해진 것을 다룸 */
public enum Subjects {

    /* 설명. 아래의 필드는 전부 Subjects 자료형이다.*/
    JAVA,                       // 0번째 선언
    MARIADB,                    // 1번째 선언
    JDBC,                       // 2번째 선언
    HTML,                       // 3번째 선언
    CSS,                        // 4번째 선언
    JAVASCRIPT;                 // 5번째 선언

    Subjects() {
        System.out.println("기본 생성자 호출됨... ");
    }

    public String toString() {
        return "@@@@" + this.name() + "@@@@";
    }
}
