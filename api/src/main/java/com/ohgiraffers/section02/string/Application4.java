package com.ohgiraffers.section02.string;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 이스케이프(escape) 문자에 대해 이해하고 적용할 수 있다. */
        /* 필기.
         *  이스케이프(escape) 문자
         *   문자열 내에서 사용하는 특수기능을 위한 문자이다.
         *
         * 필기.
         *  \n: 개행
         *  \t: 탭 : 격자 구조에서 다음 격자까지 띄어쓰기
         *  \': 작은 따옴표
         *  \": 큰 따옴표
         *  \\: 역슬래쉬 표기
        */
        System.out.println("안녕하세요.\n저는 홍길동 입니다.");
        System.out.println("안녕하세요.\t저는 홍길동 입니다.");

        System.out.println("안녕하세요. 저는 '홍길동' 입니다.");             // 더블 쿼테이션(") 내부의 싱글 쿼테이션(')은 인식해줌
        System.out.println('\'');
        System.out.println("안녕하세요.저는 \"홍길동\" 입니다.");

        System.out.println("역슬래쉬(\\)입니다.");
        System.out.println();

        /* 설명. 이스케이프 문자 외에도 printf관련 문법도 있으니 참고하자. */
        /* 설명. f: format  + .2f는 소수 3쨰자리에서 반올림 */
        System.out.printf("원주율은 %.2f입니다. 우리 %d로 하죠", 2.146592, 3);

    }
}
