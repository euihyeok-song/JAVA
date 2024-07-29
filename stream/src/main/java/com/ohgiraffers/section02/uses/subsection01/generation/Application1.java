package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 배열이나 컬렉션은 스트림을 이용할 수 있고, 이를 이해해서 활용할 수 있다. */
        String[] sArr = new String[]{"java","mariadb","jdbc"};

        /* 필기. Arrays.stream(배열): 배열 자료형을 Stream 자료형으로 변환 */
         /* 설명. 1. 배열로 스트림 생성 */
        System.out.println("========= 배열로 스트림 생성 =========");
        Stream<String> strStream1 = Arrays.stream(sArr);
        strStream1.forEach(System.out::println);

        System.out.println();                       // 구분을 위한 개행

        Stream<String> stringStream2 = Arrays.stream(sArr,0,2);
        stringStream2.forEach(System.out::println);
        System.out.println();

        /* 설명. 2.
         *  Builder를 활용한 스트림 생성 -> 매개변수 생성자를 통한 setter를 제외한 다른 값에 대한 setter는 캡슐화를 깨기 떄문에 주로 사용
         *  builder는 static<T>로 되어 있는 메소드이며, 호출 시 타입 파라미터를 메소드 호출 방식으로 전달한다.
         *  장점: 값을 추가하거나 삭제할 때, 필드를 직접 건들이지 않기 떄문에 편리함 (setter 대신 사용)
         *  단점: 내부에 따로 정의된 interface와 class들이 존재하므로, 메모리 공간을 더 잡아먹는다.
        */
        System.out.println("======= Builder로 스트림 생성 =========");
        Stream<String> builderStream = Stream.<String>builder()
                                            .add("홍길동")
                                            .add("유관순")
                                            .add("윤봉길")
                                            .build();                       // build() 사용시 빌드됨

        builderStream.forEach(System.out::println);

        /* 설명. 3. iterate()를 활용하여 수열 형태(이전의 output이 다음의 input으로 들어가는 형태)의 스트림을 생성
        *          반환형은 UnaryOperator이므로 반환형이 하나이고 매개변수와 반환형이 모두 동일한 자료형
        * */
        System.out.println("========= iterate로 스트림 생성 ===========");
        Stream<Integer> intStream = Stream.iterate(10, value -> value * 2)     // seed를 람다식으로 넘겨줘
                .limit(10);
        intStream.forEach(value -> System.out.print(value + " "));


    }
}
