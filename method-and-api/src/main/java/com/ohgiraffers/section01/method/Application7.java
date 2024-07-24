package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메소드를 활용할 수 있다.*/
        int first = 100;
        int second = 50;
        Calculator cal = new Calculator();

        /* 설명. 뎃셈*/
        System.out.println("두 수의 합은? " + cal.plusTwoNumbers(first, second));

        /* 설명. 최소값*/
        System.out.println("두 수의 최소값은? " + cal.minNumbers0f(first, second));

        /* 설명. 최댓값
        *   calculator에 static으로 있다보니 속해 있는 모든 요소 (new Calculator())로 선언할 필요 X
        *   Calculator.maxNumbers0f()와 같이 필요한 부분만 가져와서 사용 */
        System.out.println("두 수 중 큰 값은?(static 메소드) " + Calculator.maxNumbers0f(first, second));
    }


}
