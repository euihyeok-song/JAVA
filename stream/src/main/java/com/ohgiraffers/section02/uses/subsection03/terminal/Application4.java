package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 최종 연산 중 하나인 match에 대해 이해하고 사용할 수 있다. */
        List<String> stringList = Arrays.asList("Java","Spring","SpringBoot");

        /* 설명. anyMatch/allMatch/noneMatch는 모두 predicate형의 스트림*/
        boolean anyMatch = stringList.stream()
                .anyMatch(str -> str.contains("p"));        // 하나라도 만족하면 true
        boolean allMatch = stringList.stream()
                .allMatch(str -> str.length() > 4);         // 모두 일치하지 않으면 false
        boolean noneMatch = stringList.stream()
                .noneMatch(str -> str.contains("c"));       // 하나라도 만족하면 false

        System.out.println("anyMatch = " + anyMatch);
        System.out.println("allMatch = " + allMatch);
        System.out.println("noneMatch = " + noneMatch);
    }
}
