package com.ohgiraffers.section02.extend.vo;

/* 설명. <>의 범위를 상속을 통해서 Rabbit에 연관된 것만 사용 가능하도록 제한 - T는 객체를 생성하는 시점에서 생성*/
public class RabbitFarm<T extends Rabbit>{

    /* 설명. T에 들어오는 자료형으로 변환됨 - 농장의 펫말(가능한 것만 들어오세요~)의 기능 역할 */
    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
