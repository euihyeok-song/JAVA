package com.ohgiraffers.chap02.section01.sorting;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Application1Tests {

    private static int input1, input2;
    private static int[] act1, act2;
    private static int[] exp1, exp2;

    /* 설명. test하기 전 값을 Setting해줌 */
    @BeforeAll
    public static void set(){

        /* 설명. 예시 1 */
        input1 = 7;
        act1 = new int[]{34, 23, 5, 24, 1, 9, 12};
        exp1 = new int[]{1, 5, 9, 12, 23, 24, 34};

        /* 설명. 예시 2 */
        input2 = 6;
        act2 = new int[]{40, 47, 38, 8, 33, 35};
        exp2 = new int[]{8, 33, 35, 38, 40, 47};

    }

    public static Stream<Arguments> provideAscendingSource(){
        return Stream.of(
                Arguments.of(input1,act1,exp1),
                Arguments.of(input2,act2,exp2)
        );
    }

    /* 설명. 상황별(testcase) 테스트 메소드
    *   //given  //when  //then  */
    @DisplayName("버블 정렬 테스트")                           // 아래의 testcase를 설명하기 위한 제목과 같은 느낌
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)   // 아래의 testcase의 시간 제한
    @ParameterizedTest                                     // 아래의 testcase를 위해 파라미터들을 받아서 test하는 경우
    @MethodSource("provideAscendingSource")                // ("~")의 반환값을 메소드의 매개변수로 사용하는 경우
    public void bubbleSortTests(int length, int[] actual, int[] expected){
        Application1.solution(length,actual);               // Application1에 solution(length,arr)와 동일
        Assertions.assertArrayEquals(expected,actual);      // expected와 actual(실제 결과)가 동일하면 초록불을 띄어줌
    }

}