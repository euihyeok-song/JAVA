package com.ohgiraffers.section01.intro;

/* 설명. Calculator라는 interface를 구현하는 클래스는 Impl을 붙임*/
public class CalculatorImpl implements Calculator{

    @Override
    public int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}
