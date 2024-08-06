package com.ohgiraffers.section03.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class AdditionalAnnotationTests {

    /* 수업목표. Junit5에서 제공하는 메소드 관련 추가 어노테이션을 사용할 수 있다. */

    /* 설명. 실행되지 않도록 불능상태로 만듬*/
    @Disabled
    @Test
    public void testIgnore(){}

    /* 설명. 제한시간을 주는 기능 */
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(900);              // 통과
//        Thread.sleep(1100);             // 예외 발생
    }

    @Test
    @Order(1)                            // 작을수록 우선순위가 높다(먼저 실행된다)
    public void testFirst(){}

    @Test
    @Order(3)                            // 작을수록 우선순위가 높다(먼저 실행된다)
    public void testThird(){}

    @Test
    @Order(2)                            // 작을수록 우선순위가 높다(먼저 실행된다)r
    public void testSecond(){}

    /* 설명. 부하를 테스트 하는 기능을 하지만, JEMETER을 사용하도록 하자 */
    @RepeatedTest(10)                    // 반복(Repeat)시키는 횟수 지정
    public void testRepeat() {}
}
