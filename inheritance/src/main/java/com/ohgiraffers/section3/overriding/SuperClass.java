package com.ohgiraffers.section3.overriding;

/* 설명. class가 final 키워드가 붙으면 부모 클래스가 될 수 없다. */
//public final class SuperClass{

public class SuperClass {

    /* 수업목표. 오버라이딩(Overriding-상속관계에서만 가능) 에 대해 이해할 수 있다. */

    public void method(int num) {}

    public Object method2(int num) {return null;}

    /* 설명. class 내부에서만 사용할 private 메소드 */
    private void privateMethod(){}

    /* 설명. 자식에게 더이상 물려주지 않는 마지막 메소드 ( 자식만 오버라이딩 불가 - 다른 class는 가능)*/
    public final void finalMethod() {}

    /* 설명. 다른 패키지여도 내 자식이면 접근할 수 있는 메소드*/
    protected void protectedMethod() {}

    /* 설명. 접근제어자를 안적음 => default 접근제어자(이 method가 있는 package 내부에서만 사용 가능) */
    void defaultMethod() {}



}
