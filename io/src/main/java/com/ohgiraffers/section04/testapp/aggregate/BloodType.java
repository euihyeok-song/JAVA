package com.ohgiraffers.section04.testapp.aggregate;

/* 설명. BloodType는 4가지만 선언가능하다는 CHECK 제약조건과 비슷함 */
public enum BloodType {
    A,AB,B,O;               // 최초 접근시 총 4개의 객체가 생성 (싱글톤)
}
