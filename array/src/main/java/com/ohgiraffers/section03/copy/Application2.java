package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 깊은 복사에 대해 이해할 수 있다.( 원본 변경되지 X) */
        /* 필기.
         *  깊은 복사를 하는 방법은 4가지가 있다.
         *  1. for문을 이용한 동일한 인덱스 값을 일일이 복사
         *  2. Object의 clone()을 이용한 복사(사용 빈도가 높음)
         *  3. System의 arraycopy()를 이용한 복사
         *  4. Arrays의 copyOf()를 이용한 복사
         */

        int[] originArr = new int[]{1,2,3,4};
        print(originArr, "원본");

        /* 목차. 1. for문 활용 */
        int[] copyArr1 = new int[originArr.length];
        for (int i = 0; i < copyArr1.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1, "for문을 활용한 사본");

        /* 목차. 2. clone() 활용 */
        int[] copyArr2 = originArr.clone();
        print(copyArr2, "clone()을 활용한 사본");

        /* 목차. 3. arraycopy()를 이용한 복사 */
        int[] copyArr3 = new int[originArr.length + 3];                        // 원본보다 3 크기가 더 큰 배열 할당
        System.arraycopy(originArr, 0, copyArr3, 3, 3);  // 원본(originArr)의 0부터 3개를 짤라서
                                                                               // 복사본의 4번째 부터 붙이는 개념
        print(copyArr3, "arraycopy()를 활용한 사본");

        /* 목차. 4. copyOf()를 이용한 복사( 원본의 처음부터만 가능) */
        int[] copyArr4 = Arrays.copyOf(originArr,2);                // 원본(originArr)의 처음부터 2개를 짤라서 저장
        print(copyArr4, "copyOf()를 활용한 사본");
    }

    public static void print(int[] arr, String desc){
        System.out.println("==========" + desc + "===========");

        System.out.println("넘어온 배열의 hashCode: " + arr.hashCode());        // hashcode는 주소를 시각화
        System.out.println(System.identityHashCode(arr));                       // 위와 동일한 구조

        System.out.println(Arrays.toString(arr));
    }
}
