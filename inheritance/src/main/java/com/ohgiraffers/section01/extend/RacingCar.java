package com.ohgiraffers.section01.extend;

/* 설명. RacingCar는 Car에게 상속받아서 필드와 메소드를 사용 가능 */
public class RacingCar extends Car{

    /* 설명. 기본생성자는 안적어도 아래의 내용이 이미 있다고 판단*/
    public RacingCar() {
        super();
    }

    @Override
    public void run() {
        System.out.println("레이싱 자동차가 신나게 달립니다. 썌애애애앵!~");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적따위 울리지 않습니다.");
    }
}
