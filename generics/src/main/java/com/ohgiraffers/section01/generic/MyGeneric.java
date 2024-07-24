package com.ohgiraffers.section01.generic;

/* 설명. 다형성 및 boxing에 의해 어떤 값이든 호환되는 클래스*/
public class MyGeneric {

    private Object value;

    public MyGeneric() {
    }

    /* 설명. 이 메소드는 다형성 및 boxing에 의해 모든 자료형을 다 받고 return 가능 */
    public Object getValue(){
        return value;
    }

    /* 설명. 이 메소드는 다형성 및 boxing에 의해 모든 자료형을 다 받을 수 있음 */
    public void setValue(Object value){
    }
}
