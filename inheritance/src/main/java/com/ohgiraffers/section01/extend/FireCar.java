package com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    /* 설명. 부모의 생성자를 생성해야 자식의 생성자가 생성된다 (super()로 정의)*/
    public FireCar() {

        /* 설명. 부모로부터 생성자는 물려받지 않고 super()를 통해 부모 개체 먼저 생성*/
        super();                        // 안 적어도 자동으로 생성되는 구문
        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }

    /* 설명. 부모로부터 물려받는 필드 및 메소드 외에 기능 하나 더 추가(확장)*/
    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ==========3");
    }

    /* 설명. 오버라이딩(overriding)*/
    @Override                            // Annotation (method 위에만 가능)

    /* 필기.
     *  @Override 어노테이션을 추가하는 이유?
     *  1. 메소드 중에 부모로부터 물려받은 메소드인 것을 한 눈에 알아보기 쉽게 하기 위해서 (가독성 측면)
     *  2. 부모의 메소드를 오버라이딩할 때 발생할 수 있는 실수(오타)를 방지하기 위해서 (실수방지 측면)
    */
    public void soundHorn(){
        System.out.println("빠아아아아아앙!!~ 빠아아아아아앙!!");
    }
}
