package com.ohgiraffers.section01.method;

public class Calculator {

    /* 모듈화(modulation): 같은 기능이 있는 것 끼리 묶어 놓음 */
    public int plusTwoNumbers(int first, int second){
        return first + second;
    }

    public int subTwoNumbers(int first, int second){
        return first - second;
    }

    public int multiTwoNumbers(int first, int second){
        return first * second;
    }

    public int divideTwoNumbers(int first, int second){
        return first / second;
    }

    public int minNumbers0f(int first, int second) {
        return (first > second) ? second : first;
    }

    public static int maxNumbers0f(int first, int second){
        return (first > second) ? first : second;
    }

}
