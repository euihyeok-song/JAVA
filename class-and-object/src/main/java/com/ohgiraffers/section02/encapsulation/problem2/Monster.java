package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
//    String name;
//    int hp;

    /* 설명. 메소드를 추가함으로 인해 필드(class내의 변수)가 수정되어도 이 클래스 내에서만 에러가 발생함(단일책임의 원칙) */
    /* 설명. 결합도를 낮춤 + 응집도가 높은 코드  */
    String kinds;
    int mp;

    public void setInfo1(String info1){
        this.kinds = info1;
    }

    public void setInfo2(int info2){
        this.mp = info2;
    }
}
