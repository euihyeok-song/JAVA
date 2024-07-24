package com.ohgiraffers.section01.generic;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 제네릭(generic)에 대해 이해할 수 있다. */

        /* 설명. 어떤 값이든 넘겨주고 받아서 적용할 수 있는 클래스는 generic (Object) */
        MyGeneric mgt = new MyGeneric();

        mgt.setValue("Hello Wolrd");
        mgt.setValue(1);
        mgt.setValue(3.14);

        System.out.println(mgt.getValue());
        Object result = mgt.getValue();
        double primitiveResult = (Double)result;
//        String primitiveResult = (String)result;             //(Double)형으로 다운캐스팅 해야하지만
                                                               // (String)으로 다운캐스팅도 컴파일 시점에 가능해지고
                                                               //동적 바인딩에 의해서 런타임에서는 오류 발생
                                                               //(Object를 활용한 것은 자료형이 안전하지 않다.)


        /* 필기.
         *  제네릭 클래스는 다양한 자료형으로 변할 수 있어 클래스 하나만으로 활용가치가 높아진다.(구현의 편의성)
         *  매개변수나 반환형도 제네릭 타입으로 지정되어 명확히 해당 타입에 대해 처리할 수 있다.(타입의 안정성)
         *  제네릭 클래스는 무조건 참조 자료형이다. (기본자료향 -> 래퍼클레스 -> 참조자료형 / String : 참조자료형)
        */
//        GenericTest<Integer> gt1 = new GenericTest<Integer>();
        GenericTest<Integer> gt1 = new GenericTest<>();          // 객체의 생성자 부분에는 빈 다이아몬드<> 연산자도 허용 가능

//        String strResult = (String)gt1.getValue();           // Type이 Integer이므로 컴파일 오류 발생
        int intResult = gt1.getValue();                        // 하나의 클래스로 여러개의 저료형을 다룰 수 있다.
                                                               // 컴파일 시점에서 체크 가능을 다운 캐스팅 고려 X
//        gt1.setValue("피카츄");
        gt1.setValue(10);

    }
}
