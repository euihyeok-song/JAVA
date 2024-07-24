package com.ohgiraffers.section06.statickeyword;

public class StaticTest {
    private int nonStaticCount;
    private static int staticCount;

    public StaticTest() {
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return StaticTest.staticCount;
    }

    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public static void  increaseStaticCount(){
        StaticTest.staticCount++;                       // 객체를 사용하지 않고, class내에서 사용됨으로 this는 X
    }
}
