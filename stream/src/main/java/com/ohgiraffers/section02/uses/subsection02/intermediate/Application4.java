package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계 연산 중 하나인 sorted에 대해 이해하고 사용할 수 있다. */
        List<Integer> integerList = IntStream.of(5,10,99,2,1,35)
                                            .boxed()
                                            .sorted()
                                            .collect(Collectors.toList());
        System.out.println("정렬된 Integer List: " + integerList);

        /* 설명. 내림차순을 위해 Compartor 인터페이스 적용 - DescInteger 인터페이스
        *       sorted()는 Stream형에서 사용가능 하기 때문에 ,boxed()로 Stream으로 변경후 사용*/
        List<Integer> integerList1 = IntStream.of(5,10,99,2,1,35)
                                                .boxed()
                                                .sorted(new DescInteger())
                                                .collect(Collectors.toList());

        System.out.println("정렬된 Integer List: " + integerList1);
    }
}
