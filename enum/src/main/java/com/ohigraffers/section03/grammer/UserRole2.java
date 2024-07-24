package com.ohigraffers.section03.grammer;


public enum UserRole2 {
    /* 설명. 각각 선언하면,각각 객체를 선언하는 것과 동일하고, UserRole2 타입의 매개변수 생성자를 각각 생성해줌 */
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String DESCRIPTION;               // 매개변수 생성자 전까지 초기화 안되면 null값으로 오류 발생

    UserRole2(String description) {
        DESCRIPTION = description;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }
}
