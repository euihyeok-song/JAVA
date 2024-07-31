package com.ohgiraffers.chap04.section01.greedy;

public class Application1 {
    public static int solution(int n){

        /* 설명. 3kg와 5kg 봉지로 가져갈 수 있는 최소 봉지 수*/
        int count = 0;

        /* 설명. 최대한 큰 수인 5를 먼저 생각하자는 의미에서 그리디 알고리즘 */
        while(true) {
            if (n % 5 == 0) {               // 처음부터 5kg 봉지 또는 3kg씩 덜어내며 5kg 봉지로 나눌 수 있는 경우
                return n / 5 + count;
            } else if (n < 0) {             // 3kg 또는 5kg 봉지로 해결이 안되는 경우
                return -1;
            }
//            else if (n == 0) {            // 3kg 봉지로만 해결되는 경우
//                return count;
//            }
            /* 설명. 어쩔 수 없이 3kg 한 봉지만큼 무게를 덜어낸다. */
            n -= 3;
            count++;
        }
    }
}

