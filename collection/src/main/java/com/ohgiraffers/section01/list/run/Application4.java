package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. Stack에 대해 이해하고 사용할 수 있다. */
        /* 필기.
         *  Stack이란?
         *   후입선출(LIFO) 또는 선입후출(FILO)의 자료구조로 push(), pop(), peek()등의 메소드를
         *   활용하여 자료를 처리할 수 있다.
        */

        /* 설명. 동기화 처리를 할 경우에는 부모 클래스인 Vector를 이용 + Stack도 List계열 */
        Stack<Integer> integerStack = new Stack();

        /* 설명. Stack 인스턴스 생성 후 데이터 추가*/
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        System.out.println(integerStack);               // .toString()이 오버라이딩 되어 있음

        /* 설명. peek() 메소드는 Stack의 맨위에 있는 요소를 보여줌 - 보여주기 외 기능 X*/
        System.out.println("peek(): " + integerStack.peek());
        System.out.println(integerStack);

        /* 설명. serach() 메소드는 Stack 내부의 값을 찾아준다. - 위에서부터 매개변수(o:2)만큼 지난 값 반환 */
        System.out.println("search(): " + integerStack.search(2));

        /* 설명. pop() 메소드는 Stack의 가장 위의 값을 꺼내줌*/
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
//        System.out.println("pop(): " + integerStack.pop());       // Stack이 이미 다 비어서 더 꺼낼수 X
        System.out.println(integerStack);

    }
}
