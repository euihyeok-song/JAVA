package com.ohgiraffers.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 문자열을 다영한 기본 자료형으로 바꿀 수 있다. */
        byte b = Byte.valueOf("1");
        short s = Short.valueOf("2");
        int i = Integer.valueOf("4");
        long l = Long.valueOf("8");
        float f = Float.valueOf("4.0");
        double d = Double.valueOf("8.0");
        boolean isTrue = Boolean.valueOf("true");
        char c = "abc".charAt(0);                       // Characte가 제공하지 않아 String의 charAt()을 사용
    }
}
