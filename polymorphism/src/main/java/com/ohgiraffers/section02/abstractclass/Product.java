package com.ohgiraffers.section02.abstractclass;

/* 설명. 불안전한(추상) method가 클래스 내부에 하나라도 있으면 해당 클래스는 'abstract' 키워드를 설정하고, 추상클래스가 된다. */
public abstract class Product {

    private int nonStaticField;
    private static int staticField;

    public Product() {
    }

    public void nonStaticMethod(){

    }

    public static void staticMethod(){

    }

    /* 설명. 1. Body가 없는 클래스 - 불안전한(추상) method -> abstract 선언 가능
    *       2. 상속이 가능하여, 부모클래스로 상속을 할 수 있음 -> 상속받은 자속 클래스의 누군가는 Body부분을 채움
    *           => 자식 클래스에게 Overriding하여 재정의하여 Body부분을 채우도록 규약을 내리는 개념
    *       3. 추상 클래스: 부분적 규약을 내리는 부모 클래스
    *       4. 추상 메소드: 시니어 개발자가 만들어야 할 기능을 주니어 개발자나 신입에게 인지시켜주기 위해서 지정하면,
    *                    상속을 받으면 오류를 발생해, Body부분을 Override 시킬 떄 사용
    *  */
    public abstract void abstractMethod();


}
