package com.ohgiraffers.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {

        /* 설명. String 과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다. */
        StringBuilder sb = new StringBuilder("java");
//        StringBuilder sb = "java";                        // 리처럴 형태로 초기화 X

        /* 설명. String 과 StringBuilder로 수정 시 객체 주소값 변화 살펴보기 */
        String testStr= "java";
        StringBuilder testSb = new StringBuilder("kotlin");

        for (int i = 0; i < 9; i++) {
            testStr += i;
            testSb.append(i);                              // append 메소드로 문자열을 이어붙인다.

            System.out.println("String의 경우: " + System.identityHashCode(testStr));   // 주소 계속 바뀜: 계속 객체 생성
            System.out.println("StringBuilder의 경우: " + System.identityHashCode(testSb));  // 주소 안바뀜
        }

        System.out.println("String의 결과: " + testStr);
        System.out.println("StringBuilder의 결과: " + testSb);
    }
}
