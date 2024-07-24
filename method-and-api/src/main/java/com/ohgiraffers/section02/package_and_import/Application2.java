package com.ohgiraffers.section02.package_and_import;

// 앞으로 import의 제일 마지막 단어가 나오면 아래와 같은 의미이다.
import com.ohgiraffers.section01.method.Calculator;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. import에 대해 이해할 수 있다. */
        /* 목차. 2. 패키지(package_and_import)를 사용하는 경우 */

        /* 설명. 다른 패키지의 클래스명(full 클래스명)을 줄여쓰고자 할 때 쓸 수 있다. */
        /* 설명. non-static 메소드의 경우 */
        Calculator calculator = new Calculator();
        int result = calculator.plusTwoNumbers(80,22);
        System.out.println("result = " + result);
        
        int result2 = calculator.maxNumbers0f(40, 90);
        System.out.println("result2 = " + result2);
    }
}
