package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 여러 개의 전달인자를 이용한 메소드 호출을 할 수 있다. */
        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 20, '남');

        String name = "유관순";
        int age = 20;
        char gender = '여';
        app4.testMethod(name, age, gender);             // 전달인자와 매개변수는 type을 제외하고는 꼭 맞출 필요는 없지만 맞추는 것이 좋음)
    }

    /* 설명. module : 하나의 기능은 메소드로 뽑아서 재사용할 수 있도록 한다. */
    public void testMethod(String name, int age, final char gender){
        System.out.println("당신의 이름은 " + name + "이고, 나이는 "+ age + "세 이며, 성별은 " + gender + "입니다.");
    }
}
