package com.ohgiraffers.section03.interfaceimplements;

/* 설명. 인터페이스는 여러개의 인터페이스를 다중 상속 받을 수 있다.*/
public interface InterProduct extends ParentInterProduct, AnotherParentInterProduct {

//    public static final int MAX_NUM = 100;        // 정석적인 정의 (아래는 자동으로 만들어줌)
//    private static final int MAX_NUM2= 100;       // 다르게 변형해서 쓸수 X
    /* 설명. 이 필드는 public이여서 어디서든 사용 가능*/
    int MAX_NUM = 100;                              // 상품 최대 100개만 저장 가능하고 이 값을 활용


    /* 설명. 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct(){}

    /* 설명. 기본적으로 추상메소드만 가능하다. */
//    private void nonStaticMethod();               // public abstract만 가능
//    public abstract void nonStaticMethod();       // 정석적인 정의 (아래는 자동으로 만들어줌)
    void nonStaticMethod();

    /* 설명. static 메소드는 바디부까지 작성을 허용했다. (JDK 1.8부터 추가된 기능) */
    /* 설명. static 메소드는 override가 불가능하기 떄문에, 이는 인터페이스 설계시 꼭 수정이 불가능한 꼭 공통적으로 들어가야하는 기능 구현시 사용*/
    public static void sstaticMethod() {}

    /* 설명. 권장 X -> 어쩔수없이 인터페이스로 받은 거에서 override를 통해서 다른 기능을 추가하고 싶으면 아래와 같은 형식으로 써라!
    /* 설명. non-static 메소드라도 default 키워드를 추가하면 바디부까지 작성을 허용 (JDK 1.8부터 추가된 기능)*/
    public default void defaultMethod() {}

    /* 설명. 이는 위의 default void함수의 내용이 너무많아서, 내부의 내용을 함수화해서 끌어다가 사용하고 싶을 때 아래를 사용하여라!*/
    /* 설명. private도 abstract가 아닌 온전한 메소드로 사용은 가능하다. (default도 없이) */
    private void privateMethod() {

        /* 설명. 다른 public default 메소드에서 활욜할 수만 있는 기능*/
    }
}
