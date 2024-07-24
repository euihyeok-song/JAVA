package com.ohgiraffers.section3.overriding;

public class SubClass extends SuperClass{

    /* 설명. 부모 메소드와 이름, 반환형, 매개변수, 접근제어자 모두 동일하게 오버라이딩 */

    @Override
    public void method(int num) {
    }

    /* 설명. 메소드 이름변경(새로운 메소드 생성한 셈) */
//    @Override
//    public void method1(int num) {
//    }

    /* 설명. 메소드 리턴 타입 변경(새로운 메소드 생성한  셈)*/
//    @Override
//    public String method(int num) {
//        return null;
//    }

    /* 설명. 경우에 따라서는 메소드의 반환형을 달리 할 수 있다.(부모 메소드의 리턴타입(Object)의 자식 타입으로는 가능) */
    /* 설명. SuperClass에서의 public Object method2(int num)를 오버라이딩 한 것*/
    @Override
    public String method2(int num) {
        return null;
    }

    /* 설명. private 메소드는 오버라이딩 불가 */
//    @Override
//    private void privateMethod(){}

    /* 설명. final 메소드는 오버라이딩 불가 */
//    @Override
//    public final void finalMethod() {}

    /* 설명. 부모 메소드가 protected이면 어디서든(어느 패키지든) 접근해서 오버라이딩 가능 */
//    @Override
//    protected void protectedMethod() {}

    /* 설명. 부모 메소드의 접근제어자와 같은 범위 이거나 더 넓은 범위는 가능*/
    /* 설명. private < (default) < protected < public */
    @Override
    public void protectedMethod() {}

    @Override
    void defaultMethod() {}
//    protected defaultMethod() {}                  가능


}
