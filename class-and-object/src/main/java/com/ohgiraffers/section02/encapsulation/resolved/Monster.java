package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {

    private String name;                    // private(접근제어자중 1개)는 이 class만 확인할 수 있는 변수를
    private int hp;

    public void setInfo1(String info1){
        this.name = info1;
    }

    public void setInfo2(int info2){
        this.hp = info2;
    }
}
