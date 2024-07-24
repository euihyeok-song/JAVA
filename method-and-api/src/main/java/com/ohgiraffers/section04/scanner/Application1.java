package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Scanner를 이용한 다양한 자료형 값 입력 받기 */
        Scanner sc = new Scanner(System.in);                // System.in은 콘솔로 입력할 것임을 의미

        /* 목차. 1. 문자열 입력 받기 */

        /* 설명. next()는 공백 또는 개행문자(\n)를 ㅟ급하지 않고 그 전까지만 버퍼에서 가져옴 */
        System.out.print("이름을 입력하세요: ");              // println을 하게되면 자동으로 \n이 들어감 => print 사용
        String lastName = sc.next();                     // "유 관순을 입력했다면 "유"
        String firstName = sc.next();                    // "유 관순을 입력했다면 "관순"  -> 아직 \n가 buffer에 남아있음
        System.out.println("name = " + lastName + ", " + firstName);

        /* 설명. nextLine()이 아닌 Scanner 메소드를 활용하다 nextLine()을 쓰게되면 고려할 것 */
        sc.nextLine();                                   // 아직 buffer에 남아있는 개행문자(\n)를 처리

        /* 설명. nextLine()은 공백 또는 개행문자까지 취급해 버퍼에서 모두 가져옴 */
        System.out.print("이름을 입력하세요2: ");
        String name2 = sc.nextLine();                     // 유 관순을 입력했다면 "유 관순\n"을 가져옴
        System.out.println("name2 = " + name2);

        /* 목차. 2. 정수형 입력 받기 */
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("age = " + age);

        /* 목차. 3. 실수형 입력 받기 */
        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();
        System.out.println("height = " + height);

        /* 목차. 4. 논리형 입력 받기 */
        System.out.print("참과 거짓 중 한가지를 true 또는 false로 입력하세요: ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("isTrue = " + isTrue);

        /* 목차. 4. 문자형 입력 받기 */
        System.out.print("아무 문자나 하나만 입력하세요: ");
        /* 설명. 메소드 체이닝 방식: 메소드에 메소드를 연결하는 방식 */
        char answer = sc.next().charAt(0);                  // charAt(i)은 입력받은 것의 i번째 index에 해당하는 문자만 뽑아냄
        System.out.println("입력하신 문자는 " + answer + "입니다.");


    }
}
