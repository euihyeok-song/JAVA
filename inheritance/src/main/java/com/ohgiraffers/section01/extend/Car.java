package com.ohgiraffers.section01.extend;

/* 설명. 모든 class는 필드에 관련된 메소드만 만듬( class가 응집력이 있음 ) */
public class Car {
// public class Car extends Object {} 가 원래 기본적 문법 (extends Object는 생략가능)

    private boolean runingStatus;

    public Car() {

        /* 설명.  모든 클래스는 Object로부터 상속을 받고 있기 떄문에 안 적어도 적혀있음 */
        super();
        System.out.println("Car 클래스의 기본 생성자 호출됨...");
    }

    public void run(){
        this.runingStatus = true;                       // this는 생략 가능
        System.out.println("자동차가 달리기 시작합니다.");
    }

    public void soundHorn(){
        if(runingStatus){
            System.out.println("빵! 빵!");
        } else{
            System.out.println("주행 중이 아닐 때는 경적을 울릴 수 없습니다.");
        }
    }

    public boolean isRunning(){
        return runingStatus;
    }

    public void stop(){
        runingStatus = false;
//        System.out.println("자동차가 멈춥니다.");
        /* 설명. 부모 클래스에서 수정되면 상속된 자식 클래스도 자동으로 수정된다( 이점과 단점 모두 포함 )*/
        System.out.println("자동차가 멈춥니다.!!!");

    }
}
