package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 논리 연산자 활용하기 */
        /* 목차. 1. 1부터 100 사이 값 확인 */
        int num1 = 55;
        int num2 = 101;
        System.out.println((num1 >= 1) && (num1 <= 100));
        System.out.println((num2 >= 1) && (num2 <= 100));

        /* 목차. 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        char ch2 = 'g';

        System.out.println("A는 유니코드 번호 몇 번이지? " + (int)'A');
        System.out.println("Z는 유니코드 번호 몇 번이지? " + (int)'Z');
        System.out.println(ch1 >= 65 && ch1 <= 90);
        System.out.println(ch1 >= 'A' && ch1 <= 'Z');                 // 자바는 자동으로 숫자로 치환해서 문자의 대소비교 바로 가능

        System.out.println("a는 유니코드 번호 몇 번이지? " + (int)'a');
        System.out.println("z는 유니코드 번호 몇 번이지? " + (int)'z');
        System.out.println(ch2 >= 97 && ch2 <= 122);

        /* 목차. 3. 대소문자 상관없이 영문자 'y' 확인 */
        char ch3 = 'y';
        char ch4 = 'Y';
        System.out.println("y 입력햇는지 확인: " + (ch3 == 'y' || ch3 == 'Y'));
        System.out.println("y 입력햇는지 확인: " + (ch4 == 'y' || ch4 == 'Y'));
    }
}
