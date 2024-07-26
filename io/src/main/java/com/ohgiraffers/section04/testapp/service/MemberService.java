package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;

import java.util.ArrayList;
import java.util.Scanner;

/* 설명. 트랜잭션 처리(성공 & 실패에 따른 commit/rollback) 및 회원관련 비지니스 로직 처리*/
/* 설명. Service 계층에서 1개의 메소드는 다른 계층에서의 여러개의 메소드와 연결되어 있고,
*       연결되어 있는 다른 메소드의 성공/실패 여부에 따라서 commit할지 rollback할지 처리*/
public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    /* 설명. Application에서 private static final ms 객체가 만들어지려면 생성자 필요 */
    public MemberService(){
    }

    public void findAllMembers() {
        ArrayList<Member> findMembers = mr.selectAllMembers();
        
        for(Member member: findMembers){
            System.out.println("member = " + member);
        }
    }

    public void findMembersBy(int memNo) {
        Member selectedMember = mr.selectMemberBy(memNo);

        if(selectedMember != null){
            System.out.println("조회된 회원은: " + selectedMember.getId() + " 아이디 회원");
            System.out.println("회원정보: " + selectedMember.toString() );
        }
        else{
            System.out.println("조회된 회원이 없습니다.");
        }
    }

    /* 설명. DML작업 시작 ( Rollback, Commit 작업 실행 - return 값은 int형) */
    public void registMember(Member newMember) {

        /* 설명. mr을 2번 호출 -> 성공실패 + 회원관련 비지니스 */
        int lastMemberNo = mr.selectLastMemberNo();
        newMember.setMemNo(lastMemberNo+1);
        int result = mr.insertMember(newMember);
//        System.out.println("성공 실패 유무 확인: " + result);
        if(result == 1) {
            System.out.println(newMember.getId() + "님 회원가입 해 주셔서 감사합니다.");

            /* 설명. JDBC 이후에는 commit/rollback 처리도 할 예정 */
        }
    }

    public void removeMember(int removeMember) {
        int result = mr.deleteMember(removeMember);
        if(result == 1) {
            System.out.println("다시 돌아오세요~~!");
            return;
        }

        System.out.println("회원 번호 틀렸나 본데요? ");
    }

    public void changeMember(int changeMember) {

        int result = mr.;
        if(result == 1){
            System.out.println("수정사항이 작용되었습니다.");
            return ;
        }

        System.out.println("수정사항 적용을 실패하였습니다. 다시 이용해주세요.");
    }
}
