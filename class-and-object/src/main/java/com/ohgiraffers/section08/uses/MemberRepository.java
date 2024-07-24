package com.ohgiraffers.section08.uses;

/* 설명. 데이터베이스와 직접적으로 연관된 클래스 */
public class MemberRepository {

    /* 설명. static 변수 선언으로 Member 객체를 담는 배열을 데이터베이스로 취급하자. */
    /* 설명. DB에서는 TABLE의 역할 (이 Member배열은 MemberRepository 클래스에서만 조정하기 위해서 private 사용 */
    private final static Member[] members = new Member[10];
    private static int count;

    public static boolean store(Member[] newMembers){

        /* 설명. DB에서는 INSERT문의 역할*/
        for (int i = 0; i < members.length; i++) {
            members[count++] = newMembers[i];
        }
        return true;
    }

    public static Member[] findAllMembers() {

        /* 설명. DB에서는 SELECT문의 역할*/
        return members;
    }
}

