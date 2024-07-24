package com.ohgiraffers.section01.method;

import java.security.PublicKey;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("main() 시작됨...");
        //methodA();                                  // static으로 선언하지 않아서 컴퓨터가 인지하지 못함

        /* 설명. static이 없는 메소드(non-static method)는 해당 클래스를 인지시킨 후 접근해 호출 */
        Application2 app = new Application2();        // 함수가 포함된 Application2 전체를 인식 (Application2의 전체를 app으로)
        app.methodA();                                // 위 방식을 통해서 static이 아닌 것들을 인지시킴( '.'은 접근 연산자)
        app.methodB();
        app.methodC();

        System.out.println("main() 종료됨...");
    }

    // non static method
    public void methodA() {
        System.out.println("methodA() 호출됨...");
        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨...");
        System.out.println("methodB() 종료됨...");
    }

    public void methodC() {
        System.out.println("methodC() 호출됨...");
        System.out.println("methodC() 종료됨...");
    }
}
