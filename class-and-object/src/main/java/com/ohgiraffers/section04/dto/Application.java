package com.ohgiraffers.section04.dto;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 생성자를 이용한 객체 초기화와 설정자를 이용한 객체 초기화의 장단점을 이해할 수 있다.(feat. 자바 빈) */
        /* 설명. 설정자 장점: 개별적으로 값을 넣어줄 수 있음 + 유지 보수 측면에서 좋음 / 단점: 처음에 null값이 들어감 + 처음에 값이 존재하면
        *                                                                     코드가 길어짐*/
        UserDTO user1 = new UserDTO();
        System.out.println(user1.toString());
        user1.setId("user01");
        System.out.println(user1.getId());
        System.out.println(user1.toString());
//        System.out.println(user1);                    // println자체에서 .toString()을 자동으로 실행해줌
    }
}
