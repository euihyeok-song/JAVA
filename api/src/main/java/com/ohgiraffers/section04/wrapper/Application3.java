package com.ohgiraffers.section04.wrapper;

import java.sql.SQLOutput;

public class Application3 {
    public static void main(String[] args) {

        /* 설명. 문자열로 바꾸는 법
         *       1. "" + 수
         *       2. 수 + ""
         *       3. method사용
         *      */

        /* 설명. 3 방식 */
        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(8L).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        String isTrue = Boolean.valueOf(true).toString();
        String ch = Character.valueOf('a').toString();


        /* 설명. 1, 2 방식 ( 대부분 쓰임 ) - 기본자료형을 문자열로 바꿀 떄는 간단히 "" 을 더해주자*/
        String floatString = 4.0f + "";
        String floatString2 =  "" + 4.0f;

    }
}
