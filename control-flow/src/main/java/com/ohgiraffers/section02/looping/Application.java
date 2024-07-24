package com.ohgiraffers.section02.looping;

public class Application {
    public static void main(String[] args) {

        A_for aClass = new A_for();

        /* 설명. 단독 for문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleForStatement();
//        aClass.testForExample1();
//        aClass.testForExample2();

        B_nestedFor bClass = new B_nestedFor();
//        bClass.printGugudanFromTwoToNine();
//        bClass.printStars();
//        bClass.replaceStars();

        C_while cClass = new C_while();

//        cClass.testSimpleWhileStatement();
//        cClass.testWhileExample();

        D_dowhile dClass = new D_dowhile();
        dClass.testSimpleDoWhileStatement();
    }
}
