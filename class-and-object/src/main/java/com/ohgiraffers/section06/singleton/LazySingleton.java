package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton(){

    }

    public static LazySingleton getInstancer() {

        if (lazy == null) {
            lazy = new LazySingleton();                 // 맨 처음에 lazy에 null값이면 객체 생성
        }

        return lazy;                                // 맨 처음이 아니면 객체 생성 X
    }
}
