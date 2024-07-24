package com.ohgiraffers.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement() {

        /* 설명. 1부터 100까지에서 4와 5의 공배수만 출력(continue 구문 활용) */
        for (int i = 1; i < 100; i++) {
            if(!(i % 4 == 0 && i % 5 == 0)){   // 4와 5의 공배수가 아니면
                continue;                      // continue 이후 반복문의 구간을 건너뛴다
            }
            System.out.println(i + "는 4와 5의 공배수 입니다.");
        }
    }
}
