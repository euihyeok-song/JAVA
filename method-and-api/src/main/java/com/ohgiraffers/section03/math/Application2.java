package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 지정 범위의 난수를 발생시킬 수 있다.(ver, java.lang.Math 클래스) */

        /* 설명. 1. 0 ~ 9 까지의 난수 생성 */
        int random1 = (int)(Math.random() * 10) + 0;
        System.out.println("random1 = " + random1);
        
        /* 설명. 2. 1 ~ 10 까지의 난수 생성 */
        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println("random2 = " + random2);

        /* 설명. 3. 10 ~ 15 까지의 난수 생성 */
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("random3 = " + random3);

        /* 설명. 4. -128 ~ 127 까지의 난수 생성 */
        int random4 = (int)(Math.random() * 256) + (-128);
        System.out.println("random4 = " + random4);

        /* 설명. 5. 80 ~ 100 까지의 난수 생성 */
        int random5 = (int)(Math.random() * 21) + 80;
        System.out.println("random5 = " + random5);

        /* 설명. 6. -188 ~ 10 까지의 난수 생성 */
        int random6 = (int)(Math.random() * (188+1+10)) - 188;
        System.out.println("random6 = " + random6);
    }
}
