package com.ohgiraffers.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. polymorphism(다형성)과 타입 형변환에 대해 이해할 수 있다. */

        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        /* 설명. 다형성 적용(부모 타입으로 자식 인스턴스의 주소값 저장)
         *      다른 타입의 객체를 배열로 다룰 수 있음 (객체 배열)
         *      Animal이 지휘자, 나머지가 피아니스트, 첼리스트와 같은 개념
         */
        Animal an1 = new Animal();                              // 다형성 X
        Animal an2 = new Tiger();                               // 다형성 O
//        Animal an2 = (Animal)new Tiger();                     // 위와 동일
        Animal an3 = new Rabbit();                              // 다형성 O
//        Animal an3 = (Animal)new Rabbit();                    // 위와 동일

        /* 설명. Animal은 Tiger나 Rabbit이 아니다(Animal(부모)은 Tiger(자식1)나 Rabbit(자식2) 타입을 지니고 있지 않다.)*/
//        Tiger tiger1 = new Animal();                           // 다형성 X

        /* 설명. 동적바인딩 확인하기 */
        /* 필기.
         *  컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가
         *  런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작하는 것을 의미
         *  (동적 바인딩의 조건 = 1. 상속 2. 오버라이딩)
        */
        System.out.println("========= 동적 바인딩 확인하기 ===========");

        /* 설명. 모두 Animal 클래스의 cry()를 가르킴 (컴파일 시점(실행전) - 정적(static) 바인딩 ) */
        /* 설명. 런타임 시점(실행)에 33 - 36줄이 실행되면서 객체들이 생성되고, Overriding을 파악하여 동적 바인딩이 실행 */
        an1.cry();
        an2.cry();
//        an2.bite();               // 실행하기 전까지는 Animal로 파악하여, 동적 바인딩 두 조건을 만족하지 못하면 사용 X
//        ((Rabbit)an2).cry();      // 강제 형변환은 가능하여 컴파일 시점에서는 가능하지만, 런타임 시점에서는 문제가 발생
        an3.cry();

        /* 설명. 부모타입을 자식 타입으로 강제 형변환 하는 것은 가능하다.(조심해야 한다.)
        *       컴파일 시점에 에러가 발생하지 않고 런타임 시점에 에러가 발생한다. (Rabbit 과 Tiger는 상속관계 X)
        * */
//        ((Tiger)an3).cry();

        /* 설명. 오버라이딩 되지 않은(추가한 메소드) 메소드 호출은 다운캐스팅(강제형변환)을 해 주어야 한다. */
        /* 필기.
         *  instanceof란?
         *   해당 객체의 타입을 런타임 시점에 확인하기 위한 연산자
        */
        if(an3 instanceof Tiger) {              // an3(Rabbit)가 Tiger의 인스턴스면 True, 아니면 False  -> False
            ((Tiger)an3).bite();
        }

        if(an3 instanceof Rabbit) {              // an3(Rabbit)가 Animal의 인스턴스면 True, 아니면 False  -> True
            ((Rabbit)an3).jump();                // 한번 instanceof로 확인 후 맞으면, Rabbit내부에 override되지 않은
                                                 // 메소드를 강제형변환을 통해서 사용할 수 있다.
            System.out.println("an3는 토끼지");
        }

        if(an3 instanceof Animal) {              // an3(Rabbit)가 Animal의 인스턴스면 True, 아니면 False  -> True
            System.out.println("Animal은 맞지");
        }

        /* 설명. 다형성은 상속관계의 객체들간에 형변환 */
        Animal animal2 = new Tiger();               // (묵시적 형변환 = 자동형변환(auto up-casting)) 일어남 - 다형성 적용 O
        Rabbit rabbit2 = (Rabbit)an3;               // (명시적 형변환 = 강제형변환(down-casting)) 일어남- 다형성 적용 X

    }
}
