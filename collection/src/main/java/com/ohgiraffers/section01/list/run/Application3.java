package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. List 계열을 출력하는 4가지 방법 */
        /* 수업목표. LinkedList에 대해 이해할 수 있다.*/
        List<String> arrList = new ArrayList<>();
        arrList.add("apple");
        arrList.add("banana");
        arrList.add("orange");
        arrList.add("mango");
        arrList.add("grape");

        /* 설명. 1. toString() 활용하기 */
        System.out.println("arrList = " + arrList);
        System.out.println();

        /* 설명. 2. for문 활용하기 */
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));

        }
        System.out.println();

        /* 설명. 3. for-each문 활용하기 */
        for(String str: arrList){
            System.out.println(str);
        }
        System.out.println();
        
        /* 설명. 4. iterator 활용하기 */
        Iterator<String> iter = arrList.iterator();    // .iterator()는 형변환으 시켜버림 -> iterator의 메소드를 사용가능
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        /* 설명. 이중연결 리스트는 값의 추가 및 수정, 제거등이 자주 일어나면 사용하면 좋다*/
        List<String> arrList1 = new LinkedList<>();
        arrList1.add("apple");
        arrList1.add("banana");
        arrList1.add("orange");
        arrList1.add("mango");
        arrList1.add("grape");


        /* 설명. 1번 인덱스(2번쨰)의 과일 수정*/
        arrList1.set(1, "pineapple");
        System.out.println("arrList = " + arrList1);

        /* 설명. list가 관리하는 요소들 제거*/
        arrList1.remove(2);                        // LinkedList는 ArrayList와 달리 부분적인 요소 제거에서 성능 우수
        System.out.println("arrList = " + arrList1);
        arrList1.clear();                                // 배열 내부에 존재하는 전체 요소들 제거
        System.out.println("arrList = " + arrList1);

        /* 설명. 요소가 없는 list계열인지 확인 - isEmpty()는 null이 아니라 배열이 비어있는 것을 의미ㅊ */
        System.out.println("isEmpty: " + arrList1.isEmpty());


    }
}
