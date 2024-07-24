package com.ohgiraffers.section02.abstractclass;

/* 설명. 1. 부모로부터 물려받은 abstract를 그대로 abstract clss로 하는 경우 - 이 클래스를 상속받는 class에서 또 지정*/
//public abstract class SmartPhone extends Product{

/* 설명. 2. 부모로부터 물려받은 abstract를 규약을 지켜(Body를 override) 정상 class로 하는 경우*/
public class SmartPhone extends Product{

    public SmartPhone() {

        /* 설명. 추상클래스라도 자식 객체를 위해서는 객체가 생성된다.(super()) */
        super();
    }

    /* 설명. 추상 메소드를 물려받은 자식 클래스(온전한)는 반드시 오버라이딩 해야한다.(강제성 부여(규약))*/
    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스로부터 물려받은 abstractMethod를 오버라이딩한 메소드 호출됨...");
    }

    /* 설명. 추가적인 메소드도 작성할 수 있다. */
    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출됨...");;
    }
}
