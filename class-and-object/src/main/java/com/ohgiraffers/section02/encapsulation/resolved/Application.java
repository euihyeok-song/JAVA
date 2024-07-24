package com.ohgiraffers.section02.encapsulation.resolved;

public class Application {

    /* 설명. 정보은닉(information hiding)
     *  1. 구현 은닉
     *  2. 타입 은닉
     *  3. 필드 은닉 ( encapsulation) - 강결합 방지
     */

    public static void main(String[] args) {
        /* 수업목표. 접근제어자와 캡슐화에 대해 이해하고 직접 필드 접근을 막는 이유를 이해할 수 있다. */
        Monster monster = new Monster();
//    monster.name = "드라큘라";
//    monster.hp = 1000;

        /* 설명. 필드에 직접 접근이 안되므로 메소드를 통해 우회해서 활용한다.*/
        monster.setInfo1("드라큘라");
        monster.setInfo2(1000);

        /* 필기.
         *  캡술화(Encapsulation)란?
         *   캡슐화는 유지보수를 증가시키기 위해 필드의 직접 접근을 제한하고
         *   public 메소드를 이용해서 간접적으로(우회해서) 접근하여 사용할 수 있도록 만든 기술이다.
         *   클래스 작성 시 특별한 목적이 있지 않다면 캡슐화를 적용하는 것을 기본 원칙으로 하고 있다.
         */
    }
}
