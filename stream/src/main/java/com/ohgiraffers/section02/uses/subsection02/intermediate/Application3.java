package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계 연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다. */
        /* 설명. 컬렉션 내부의 컬렉션은 깊이(depth)가 깊어짐을 의미한다. */
        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA","SPRING", "SPRINGBOOT"),
                Arrays.asList("java","spring", "springboot")
        );

        list.stream().forEach(System.out::println);

        /* 설명. flatMap을  통해서 list를 풀어서 하나의 Stream요소로 만든 후 collect함수를 통해서 원하는 자료형으로 변환해서 넣어줌*/
        List<String> flatList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());

        flatList.stream().forEach(System.out::println);
        System.out.println("flatList = " + flatList);
    }
}
