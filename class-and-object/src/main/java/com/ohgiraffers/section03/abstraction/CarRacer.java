package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    private Car myCar = new Car();          // Car객체의 주소를 myCar에 저장 -> CarRacer는 myCar의 주소를 저장

    public void startUp() {
        this.myCar.startUp();
    }

    public void stepAccelator() {
        this.myCar.go();
    }

    public void stepBreak() {
        this.myCar.stop();
    }

    public void turnOff() {
        this.myCar.turnOff();
    }
}
