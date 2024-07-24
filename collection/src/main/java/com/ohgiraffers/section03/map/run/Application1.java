package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        Map<Object,Object> hMap = new HashMap<>();             // Map<Object,Object>면 key와 value는 모든 자료형 가능
        hMap.put("one", new Date());
        hMap.put(12, "red apple");
        hMap.put(33, 123);

        System.out.println("키가 \"One\"인 value 값: " + hMap.get("one"));

        /* 설명. {33=123 , one=Wed ...} "33=123"와 같이 key와 value가 함께 있는 자료형으 entry라고 한다. */
        System.out.println("Map의 toString(): " + hMap);

        /* 설명. 객체는 key "허균의 홍길동 전"은 value => 찾지 못함 => BookDTO의 compareTo를 override해야함
        *       Key값을 사용하는 경우에는 equals와 hashcode를 override를 해야한다. */
        hMap.put(new BookDTO(1, "홍길동전", "허균", 500000), "허균의 홍길동 전이면 오케이");
        System.out.println("map의 키 값으로 활용되는 객체를 활용: "
                        + hMap.get(new BookDTO(2,"홍길동전","허균",50000)));

        /* 설명. Key값이 중복되면 나중의 key와 value가 기존의 값을 덮어 씌운다. */
        hMap.put(12, "purple banana");
        System.out.println("hMap = " + hMap);

        /* 설명. value값은 중복되어도 상관 업싱 추가 된다. */
        hMap.put(35,123);
        System.out.println("hMap = " + hMap);

        System.out.println("Map이 지닌 entry(key-value쌍)의 수: " + hMap.size());

        System.out.println("34번 키와 관련된 entry 삭제: " + hMap.remove(35));
        System.out.println("삭제 후 entry(key-value쌍)의 수: " + hMap.size());

        /* 설명. Map을 활용해 보자. ( 반복하여 ) */
        Map<String, String> hMap2 = new HashMap<>();

        hMap2.put("one","java 17");
        hMap2.put("two","mariaDB 10");
        hMap2.put("three","servlet/jsp");
        hMap2.put("four","springboot 3.0");
        hMap2.put("five","vue.js");

        /* 설명. Map은 iterator 기능 지원 X -> iterable 계층으로 넘겨서 사용해야함*/
        /* 목차. 1. keySet()를 활용한 iterator 반복하기(feat.key 값만 set으로 변환하자) */
        Set<String> keys = hMap2.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            String key = iter.next();                               // 넣은 순서대로 출력되지는 X
            System.out.println("key: " + key + ", value: " + hMap2.get(key));
        }

        /* 목차. 2. entrySet()을 활용한 iterator 반복하기(feat.key + value set으로 변환하자)*/
        Set<Map.Entry<String,String>> set = hMap2.entrySet();
        Iterator<Map.Entry<String,String>> iterEntry = set.iterator();
        while(iterEntry.hasNext()){
            Map.Entry<String,String> entry = iterEntry.next();

            System.out.println("key값: " + entry.getKey() + "value값: " + entry.getValue());
        }

    }
}
