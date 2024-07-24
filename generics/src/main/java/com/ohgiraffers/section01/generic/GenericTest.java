package com.ohgiraffers.section01.generic;

/* 필기.
 *   제네릭 클래스의 다이아모든 연산자(<>)애 들어갈 수 있는 4가지 타입 - 구현의 편리함 제공
 *  1. E : Element
 *  2. T : Type
 *  3. K : Key
 *  4. V: Value
 **/
public class GenericTest<T> {
    private T value;

    public GenericTest() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
