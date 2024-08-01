package com.ohgiraffers.chap06.section01.dp;

public class Application2 {

    public static int solution(int n){
        int[] dp = new int[n+1];
//        int[] dp = new int[1001];                     // 최대 기로 선언해두는 것도 가능
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];

        }

        return dp[n];
    }
}
