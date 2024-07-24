package com.ohgiraffers.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. StringBuilder의 자주 사용되는 메소드의 용법 및 원리를 이해할 수 있다. */
        /* 설명. 가변(mutable)이지만, 기존 리터럴을 저장하는 것보다는 천천히 객체를 생성 */
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());                      // 용량을 확인하는 메소드 - 16byte의 용량부터 시작

        /* 설명. StringBuilder는 가변객체(mutable object)로써 내부적으로 용량이 증가하는 방식을 취한다.*/
        for (int i = 0; i < 50; i++) {
            sb.append(i);

            /* 설명. 초기 16byte를 넘어가면 용량이 증가 (capacity * 2 + 2 만큼) - (객체 변경이 아닌 추가 개념으로 주소 변동 X) */
            System.out.println("sb: " + sb);
            System.out.println("capacity: " + sb.capacity());
            System.out.println("identityHashCode: " + System.identityHashCode(sb));
        }
        System.out.println();

        /* 설명. 기존 설정을 16byte + 입력받은 문자열 크기(11byte) = 21byte부터 용량 시작*/
//        StringBuilder sb2 = new StringBuilder("javamariaDB");
        StringBuffer sb2 = new StringBuffer("javamariaDB");
        System.out.println(sb2.capacity());

        /* 필기.
         *  delete(): 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
         *  deleteCharAt(): 문자열 인덱스를 이용해서 문자 하나를 제거한다.
         *  - 두 메소드 전부 원본을 수정한다.
        */
        System.out.println("delete(): " + sb2.delete(2,5));
        System.out.println("deleteCharAt(): " + sb2.deleteCharAt(0));
        System.out.println(sb2);

        /* 필기.
         *  insert(): 전달인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
         *          : 넣을 값의 크기를 보고 그 크기만큼 뒤에서부터 모든 문자를 크기만큼 이동시키고 이동시킨 앞에 집어넣는 구조
        */
        System.out.println("insert(): " + sb2.insert(1,"vao"));
        System.out.println("insert(): " + sb2.insert(0,"j"));
        System.out.println("insert(): " + sb2.insert(sb2.length(),"jdbc"));     // 맨뒤에 추가

        /* 필기.
         *  reverse(): 문자열 인덱스 순번을 역순으로 재배열한다.
        */
        System.out.println("reverse(): " + sb2.reverse());
    }
}
