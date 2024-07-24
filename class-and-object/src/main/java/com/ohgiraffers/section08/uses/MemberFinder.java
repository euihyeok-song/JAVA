package com.ohgiraffers.section08.uses;

/* 설명. 회원 잘 조회하는 클래스 */
public class MemberFinder {
    public Member[] findAllMembers() {
        return MemberRepository.findAllMembers();           // DB와 연관된 MemberRepository 클래스 사용
    }
}
