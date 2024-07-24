package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Date 클래스 사용법을 이해하고 사용할 수 있다. */
        /* 설명. Date형은 오류가 꽤 많아서 잘 사용하지는 않지만 알아두자! */
        java.util.Date today = new java.util.Date();                    // 시스템의 현재 시간을 가진 객체 생성
        System.out.println("today = " + today);

        System.out.println("long 타입 시간: " + today.getTime());          // KST로 1970/1/1 9AM 이후 흐른 milliseconds
        System.out.println("long 타입 시간을 활용한 Date: " + new java.util.Date(0L));  // 위 시간을 출력해줌
        System.out.println("현재 시간을 활용한 Date: " + new java.util.Date(today.getTime()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss E요일");
        String todayFormat = sdf.format(today);
        System.out.println("todayFormat = " + todayFormat);

        /* 설명. java.util.Date(Java 날짜) -> java.sql.Date(DB 날짜) */
        java.util.Date today2 = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(today2.getTime());    // sql.Date형의 생성자 활용

        /* 설명. util.Date를 sql.Date로 다운 캐스팅을 하기 위해선 실제 객체가 sql.Date형이어야 한다. - 틀린 문장*/
//      java.sql.Date sqlDate2 = (java.sql.Date)today2;

        /* 설명. java.sql.Date -> java.util.Date (sql.Date는 util.Date의 자손 -> 다형성 사용 가능) */
        java.util.Date utilDate = sqlDate;                              // (java.util.Date))sqlDate : 다형성 적용됨
    }
}
