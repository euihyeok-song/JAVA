package com.ohgiraffers.section02.functionInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Function에 대해 이해하고 사용할 수 있다. */
        /* 설명. 매개변수 및 반환형이 있는 메소드 관련 람다식 */
        Function<String, Integer> function = str -> Integer.valueOf(str);      // 매개변수 1개: (str) -> str
        String strValue = "12345";
        System.out.println(function.apply(strValue) instanceof Integer);       // instanceof: 자료형이 같은지 물어봄
        System.out.println(function.apply(strValue));

        BiFunction<String, String, Integer> biFunction =
                (str1, str2) -> Integer.valueOf(str1) + Integer.valueOf(str2);
        System.out.println(biFunction.apply("12345","11111"));
    }
}
