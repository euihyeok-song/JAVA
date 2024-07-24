package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.*;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 와일드카드(keyword: ?)에 대해 이해할 수 있다. - 제네릭 클래스 자체를 다룸 */
        WildCardFarm wildCardFarm = new WildCardFarm();

        /* 설명. anyType는 Rabbit에 포함되면 다 가능*/
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /* 설명. Bunny나 Bunny 하위만 가능*/
//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /* 설명. Bunny나 Bunny 상위(Rabbit)만 가능*/
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));



    }
}
