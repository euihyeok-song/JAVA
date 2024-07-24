package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.*;

/* 설명. 제네릭 클래스를 사용 가능한 내부 클래스들을 결정해주는 역할 */
public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. extends 키워드를 사용하여 특정 타입만 제네릭 타입으로 사용하도록 제한할 수 있다. */
        /* 설명. Rabiit이거나 Rabbit의 자식 타입이 아닌 타입으로 제네릭 타입을 지정하면 컴파일 에러 발생*/
//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        /* 설명. Rabbit 또는 Rabbit의 자식 타입으로는 인스턴스 생성 가능 (<T extends Rabbit>)*/
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<Rabbit>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<Bunny>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<DrunkenBunny>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();
        farm4.setAnimal(new Bunny());
        farm4.getAnimal().cry();                            // 동적 바인딩에 의해 반환형이 Rabbit의 cry()가 아닌
                                                            // 실제 객체인 Bunny의 cry()가 실행됨

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();
    }

}
