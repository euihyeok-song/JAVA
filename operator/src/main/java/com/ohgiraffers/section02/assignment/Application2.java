package com.ohgiraffers.section02.assignment;

public class Application2 {

    /* 수업목표. 복합대입 연산자를 이해하고 활용할 수 있다. */
    /* 필기.
     * 대입연산자와 산술 복합 대입 연산자
     * '=', '+=', '-=', '*=', '/=', '%='
     */

    public static void main(String[] args) {
        int num = 12;
        System.out.println("num = " + num);

        num = num + 3;                          // 3을 가지고 num으로 가서 더해주므로 2번 필요
        System.out.println("num = " + num);

        num += 3;                               // 위와는 다르게 메모리를 한번만 찾아가는 효과가 있다.
        System.out.println("num = " + num);

        num -= 5;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 10;
        System.out.println("num = " + num);

        /* 주의! */
        num =- 5;                               // equal(=) 기호 오른쪽은 복합 대입 연산자가 아니다.
        System.out.println("num = " + num);
    }
}
