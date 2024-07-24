package com.ohgiraffers.section06.singleton;

/* 설명. static과 private을 이용해서 객체를 한번만 생성되게 하는 싱글톤을 사용*/
public class EagerSingleton {

    /* 설명.  static으로 선언하여 켜자마자 생성되도록 한다. */
    private static EagerSingleton eager = new EagerSingleton();

    /* 설명. private을 붙여서 이 생성자를 이 클래스 내부에서만 사용할 수 있도록 하도록 하여 객체를 더 생성할 수 없도록 만든다.*/
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
