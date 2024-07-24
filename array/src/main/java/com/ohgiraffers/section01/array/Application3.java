package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 배열에 초기화 되는 자료형 별 기본값을 이해할 수 있다. */
        /* 필기 (heap 영역에는 무조건 값이 들어감)
         *  값의 형태 별 기본값
         *  정수: 8
         *  실수: 0.0
         *  논리: false
         *  문자: \u0000
         *  참조: null
         */

        int[] iArr = new int[5];
        System.out.println(Arrays.toString(iArr));

        boolean[] bArr = new boolean[6];
        System.out.println(Arrays.toString(bArr));

        /* 설명. 크기 할당 및 초기화를 한번에 하고 싶을 때 */
        int[] iArr2 = {10,11,12,13,14};                    // 이와 같은 방식으로 선언하면서 다른 값으로 초기화 가능 (안되는 경우 존재)
        int[] iArr3 = new int[]{10,11,12,13,14};           // 기존 정석적인 방식 (무조건 됨)

        /* 설명. new int[]을 빼고 배열 생성이 안되는 경우 */
//        test({10,11,12,13,14});                          // method에 배열의 값을 넘겨줄 떄 사용할 수 X
//        test(new int[]{10,11,12,13,14});                 // 위와 같이 선언

        /* 설명. 배열의 각 요소를 확인하는 3가지 방법 */
        String[] sArr = {"apple", "banana", "grape", "orange"};

        /* 설명. 1. 단순 for문 사용 */
        for (int i = 0; i < sArr.length; i++) {            // .length는 배열의 길이(크기)
            System.out.println(sArr[i]);
        }

        /* 설명. 2. Arrays.toString() 사용 */
        System.out.println(Arrays.toString(sArr));

        /* 설명. 3. for-each문 사용(향상된 for문) - 처음부터 끝까지 배열을 돌릴 경우에 사용  */
        for(String str: sArr) {                      // 매 for문 마다 str 변수를 선언하여, sArr배열의 i번째(처음부터 끝)까지 요소를
            System.out.println(str);                 // 꺼내어 str변수에 저장하고 해당 for문이 끝나면 삭제되고 다시 선언되는 구조
        }

    }

    /* 설명. method의 매개인자가 배열일 경우 배열의 주소만 넘어옴 */
    public static void test(int[] arr){


    }
}
