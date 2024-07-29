package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 병렬처리에 대해 이해할 수 있다. */
        List<String> stringList =
                new ArrayList<>(Arrays.asList("java", "mariadb", "jdbc", "html", "css"));

        /* 설명. main 쓰레드 상에서 스트림을 사용하지 않고 확인 (단일 쓰레드) */
        System.out.println("======== for each");
        for(String s: stringList){
            System.out.println(s + ": " + Thread.currentThread().getName());     //
        }

        /* 설명. main 쓰레드 상에서 단순 스트림을 사용하고 확인 (단일 쓰레드)*/
        System.out.println("========= normal stream");
//        stringList.stream().forEach(x -> Application2.print(x));
        stringList.stream().forEach(Application2::print);

        /* 설명. main 쓰레드 상에서 병렬 스트림을 사용하고 확인(main 쓰레드 외의 다른 쓰레드를 활용한다. - 멀티 쓰레드)
        *       os에 따라 달라지지만, 순서가 보장 되지 않는다. -> 처리 속도를 증가시켜준다. */
        System.out.println("========= parallel stream");
        stringList.parallelStream().forEach(Application2::print);
    }

    /* 설명. for each문은 람다식 구조가 필요하므로 직접 선언 - 직접 for each문에 구현하면 더러워서 메소드로 선언해줌 */
    private static void print(String s){
        System.out.println(s + ": " + Thread.currentThread().getName());
        System.out.println(s + ": " + Thread.currentThread().getName());
        System.out.println(s + ": " + Thread.currentThread().getName());
    }
}
