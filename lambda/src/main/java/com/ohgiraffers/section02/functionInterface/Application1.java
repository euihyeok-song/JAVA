package com.ohgiraffers.section02.functionInterface;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Consumer에 대해 이해하고 사용할 수 있다. */
        /* 설명. Consumer는 반환형이 없는 메소드 관련 람다식 */
//        Consumer<String> consumer = (str) -> {
//            System.out.println(str + "이(가) 입력됨");
//        };

        /* 설명. Consumer내부의 accept함수를 사용하기 떄문에 매개변수가 1개이면 생략가능, 중괄도 생략 가능하다. (현재는 return이 없는 구문)*/
        Consumer<String> consumer = str -> System.out.println(str + "이(가) 입력됨");
        consumer.accept("Hello");                   // accept함수는 리턴값 X

        BiConsumer<String, LocalTime> biConsumer =
                (str, time) -> System.out.println(str + "이(가) " + time + "에 입력됨");
        biConsumer.accept("Hello?", LocalTime.now());

        ObjIntConsumer<Random> objIntConsumer =
                /* 설명. Random 클래스는 객체를 생성해서 nextInt로 다운캐스팅없이 바로 출력 ( new Random.nextInt()) */
                (random, bound) -> System.out.println("0부터 " + bound + "전 까지의 난수 발생: " + random.nextInt(bound));
        objIntConsumer.accept(new Random(),10);


    }
}
