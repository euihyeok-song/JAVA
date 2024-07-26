package com.ohgiraffers.section01.intro;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 람다식에 대해 이해하고 활용할 수 있다. (feat.Functional Interface) */

        /* 필기. 1. 인터페이스를 구현한 구현체(Impl) 클래스를 이용한 방식 (동적 바인딩을 활용한 메소드 호출) */
        Calculator c1 = new CalculatorImpl();
        System.out.println("10과 20의 합은: " + c1.sumTwoNumbers(10,20));

        /* 필기. 2. 익명클래스를 활용한 방식(인터페이스의 하위 구현체) -> CalculatorImpl 클래스 필요 X -> eventListener 사용시 사용
        *          Interface는 기존에 객체를 생성하지 못하지만, interface를 구현하는 하위 구현채의 객체는 생성 가능*/
        Calculator c2 = new Calculator() {
            /* 설명. 이 부분은 익명 클래스이다. */
            @Override
            public int sumTwoNumbers(int first, int second) {
                return first + second;
            }
        };

        /* 설명. 동적 바인딩이 바로 위의 익명 클래스로 되어진다.*/
        System.out.println("10과 20의 합은: " + c2.sumTwoNumbers(10,20));

        /* 필기. 3. 람다식을 활용한 방식 - 메소드 명을 붙이지 않아도 추상메소드를 1개만 가지는 인터페이스만 람다식으로 활용 가능 */
        /* 설명.
         *  람다식은 익명함수로 이름을 별도로 작성하지 않지만 인터페이스의 하위 구현체를 생성하며 유일하게 있는 추상메소드를
         *  오버라이딩 하는 개념이기 때문에 익명함수가 가능하다.
         *  즉, 람다식을 활용하기 위한 인터페이스는 추상메소드를 단 하나만 가져야한다. 그런 인터페이스를 FunctionalInterface
         *  라고 한다.
        */
//        Calculator c3 = (x,y) -> {return x+y;};
        Calculator c3 = (x,y) -> x+y;                           // 인터페이스의 추상메소드가 있으면 이런식으로 생략가능
        System.out.println("10과 20의 합은: " + c3.sumTwoNumbers(10,20));
    }
}
