package com.ohgiraffers.section02.string;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 객체를 생성하는 다영한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다. */
        /* 필기.
         *  문자열 객체를 만드는 방법
         *  1. "" 리터럴 형태: 동일한 값을 가지는 인스턴스(동등(haseCode & equals 일치) 객체)를 단일 인스턴스로 관리한다.
         *                  (singleton 개념, heap의 상수풀(constant pool) 활용)
         *  2. new String("") 형태: 매번 새로운 인스턴스를 생성한다. (주소값이 매번 다름)
         *                   (heap의 상수풀이 아닌 곳에 저장)
        */
        String str1 = "java";                               // 리터럴 방식
        String str2 = "java";
        String str3 = new String("java");           // 객체 방식
        String str4 = new String("java");

        /* 설명. 아래와 같이 사용하면 XXXX -> equals를 사용하여라 */
        System.out.println("str1 == str2: " + (str1 == str2));          // 기본 자료형 아닌 자료형 == 은 주소값 비교 의미
        System.out.println("str2 == str3: " + (str2 == str3));          // false: 서로 다른 객체
        System.out.println("str3 == str4: " + (str3 == str4));          // false:  서로 다른 객체

        /* 설명. equals 와 hashCode 확인  -> 값이 동일하면 equals와 hashcode 동일 */
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.hashCode() == str3.hashCode(): " + (str1.hashCode() == str3.hashCode()));

        /* 설명. 문자열 비교는 (==) 쓰지 말고 (.equals()) 사용하자. */

        /* 설명. 1. 문자열에 다른 문자열을 추가할 때 마다 새로운 객체를 생성함으로, 두 기준의 identityHashCode()를 통해
        *       주소를 비교해보면 다른 주소 값이 나옴.
        *       2. 문자열은 불변객체(immutable object)로 변화를 주면 항상 새로운 객체(인스턴스)를 생성한다.
        * */
        String str = "apple";
        System.out.println(System.identityHashCode(str));           // 문자열의 변화를 주기전 HashCode
        str +=  ", banana";
        System.out.println(System.identityHashCode(str));           // 문자열의 변화를 준 후 HashCode
        System.out.println("fruit: " + str);

    }
}
