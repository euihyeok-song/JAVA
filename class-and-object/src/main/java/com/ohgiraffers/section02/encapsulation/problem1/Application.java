package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. (유효성 검사 X) */

        /* 설명. monster1 생성 */
        Monster monster1 = new Monster();                   // 객체 생성
        monster1.name = "드라큘라";                           // 참조연산자(.)를 통해 접근해서 값 댕비
        monster1.hp = 200;

        System.out.println("monster1의 이름 = " + monster1.name);  // 참조연산자(.)를 통해 값 추출
        System.out.println("monster1의 체력 = " + monster1.hp);

        /* 설명. monster2 생성(문제점: 음수 데이터(원치 않는)로 인한 문제 발생) */
        Monster monster2 = new Monster();
        monster2.name = "프랑켄";
        monster2.hp = - 200;

        System.out.println("monster2의 이름 = " + monster2.name);
        System.out.println("monster2의 체력 = " + monster2.hp);

        /* 설명. moster3 생성 */
        Monster monster3 = new Monster();
        monster3.name = "미라";

        /* 설명. 이 떄는 setHP메소드 내부의 this = Monster3 */
        /* 설명. 직접접근을 하면 오염된 값(-200)이 들어갈 수 있는 것을 막아주는 경우 */
        monster3.setHP(-200);
        monster3.setHP(100);
        monster3.setHP(-150);

        System.out.println("Monster3의 이르: " + monster3.name);
        System.out.println("Monster3의 hp: " + monster3.hp);
    }
}
