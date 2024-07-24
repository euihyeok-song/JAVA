package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 필드값 수정 시 발생할 수 있는 문제점을 이해할 수 있다. */
        /* 설명. 강결화 - 결합이 너무 강해서, 코드를 수정하면 class 내부의 모든 코드가 영향을 받음 */
        Monster monster1 = new Monster();

        /* 설명. 직접접근 */
//        monster1.name = "드라큘라";
//        monster1.hp = 200;
//
//        System.out.println("monster1 name: " + monster1.name);
//        System.out.println("monster1 hp: " + monster1.hp);

        /* 설명. 직접접근X => 직접접근을 하지 않아야 수정할 부분만 수정이 가능하여서 유지보수에 좋다.*/
        monster1.setInfo1("프랑켄 슈타인");
        monster1.setInfo2(200);

        /* 설명. 하지만 여전히 직접 접근은 가능한 상태이다. -> encapsultaion을 이용해 접근 제한 가능*/
        System.out.println(monster1.kinds);

    }
}
