package com.ohigraffers.section02.enumtype;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 열거형(enum)을 이용하여 열거 패턴의 단점을 해결하는 것을 이해할 수 있다. */
        Subjects subject1 = Subjects.JAVA;                          // 6개 출력 -> 각 변수마다 객체를 만드는 개념
        Subjects subject2 = Subjects.HTML;                          // 역시 6개만 출력 -> 처음 만든 객체만 사용(싱글톤)
        Subjects subject3 = Subjects.JAVA;

        /* 설명.
         *  1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 각각 한 개임을 보장한다.
         *     작성한 순서에 따라 각각은 다른 인스턴스가 생성되며 최초 호출 시에 enum의 생성자를 활용해 생성된다(lazy Singleton 개념)
        * */
        if(subject1 == subject2){
            System.out.println("두 과목은 같은 과목이다. ");
        }
        else{
            System.out.println("서로 다른 과목이다.");
        }
        /* 설명. 단일 인스턴스임을 보장하기에 "==" 비교가 가능하다.(동일 객체 비교가 가능)*/
        if(subject1 == subject3){
            System.out.println("싱글톤이다.");
        }

        /* 설명. 3. 오버라이딩 되지 않은 toString() 또는 name() 메소드를 활용하여 필드명을 문자열로 변경하기 쉽다.(feat.별도 switch문 X) */
        System.out.println(Subjects.JAVA.toString());               // 재정의가 가능
        System.out.println(Subjects.JAVA.name());

        /* 설명. 4. values()를 이용하여 상수값 배열을 반환받고 이를 활용하여 연속처리를 해 줄 수 있다. */
        Subjects[] subjects = Subjects.values();
        for(Subjects sub: subjects){
            System.out.println(sub.toString());
            System.out.println(sub.ordinal());                      // 선언된 순서를 Index 체계로 알려줌
            System.out.println(sub.name());
        }

        /* 설명. 5. 타입 안전성을 보장한다. */
        printSubjects(Subjects.JAVA);
//        printSubjects(0);                                 // Subjects 타입이 아니라서 에러 발생
    }

    private static void printSubjects(Subjects subjects) {

    }
}
