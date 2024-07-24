package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimitiveTypeparameter(int num) {           // 이 num은 이 class내부에서만 사용가능
        num = 10;
        System.out.println("매개변수로 전달받은 값: " + num);
    }

    public void testPrimitiveTypeArrayparameter(int[] iArr) {   // int[] iArr는 얇은 복사가 일어난 것임
        iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값: " + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle rectangle) {
        rectangle.calArea();
        rectangle.calRound();
    }

    /* 설명. String... str은 매개변수가 0개이상 ( 안줘도 OK - String 여러개 OK) */
    public void testVariableLengthArrayParameter(String... str) {
        System.out.println("str = " + Arrays.toString(str));
    }
}
