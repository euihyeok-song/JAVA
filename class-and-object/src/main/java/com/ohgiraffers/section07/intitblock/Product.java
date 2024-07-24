package com.ohgiraffers.section07.intitblock;

public class Product {

    /* 설명. 필드/ 초기화 블록/ 기본 생성자/ jvm 에 의해서/ 위 모든 부분에서 초기화가 가능하다*/

    /* 설명. 필드*/
    private String name = "아이폰";    // 상품명 ( 명시적 초기화)
    private int price;              // 상품가격 (jvm에 의한 초기화 - default값)
    private static String brand;    // 제조사
//    private static final String brand1;    // 제조사 -> static에 선언되는 변수이자 상수 (아래와 동일)
//    private final static String brand1;    // null값으로 선언되어서 고정되어야하는데 아래의 static 초기화 블록에서 수정되려 함으로
                                             // 오류 발생

    /* 설명. 초기화 블록(inti block): 생성자와 상관없이 실행되는 블록 */
    {
        System.out.println("초기화 블럭 실행...");
        this.name = "헬쥐폰";              // 초기화 블록에 의한 초기화 -> this는 앞으로 생성될 객체를 의미
        Product.brand = "헬쥐";
    }

    /* 설명 non-static을 건드리지 못하는 초기화 블록 -> static 초기화 블록이 기본 초기화 블록보다 먼저 실행됨*/
    static {
//        name = "싸이온";
        brand = "엘지";
    }

    /* 설명. 기본 생성자 */
    public Product() {
        System.out.println("Product 기본생성자 호출됨..");
        name = "아이뽕";             // 생성자를 이용한 초기화
    }

    /* 설명. toString()함수를 이용하지 않아도 Product를 출력하면 나옴*/
    @Override
    public String toString() {
        return "Product{" +
                "name='" + this.name + '\'' +
                ", price=" + this.price +
                ", brand=" + Product.brand+
                '}';
    }
}
