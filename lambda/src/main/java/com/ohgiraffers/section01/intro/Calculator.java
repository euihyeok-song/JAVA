package com.ohgiraffers.section01.intro;

/* 설명. FunctionalInterface만 람다식으로 적용이 가능하다. */
@FunctionalInterface
public interface Calculator {
    int sumTwoNumbers(int first, int second);
//    void test();          // 어노테이션 추가(@FunctionalInterFace) 후에는 추상메소드를 2개이상 가지지 못한다.
}
