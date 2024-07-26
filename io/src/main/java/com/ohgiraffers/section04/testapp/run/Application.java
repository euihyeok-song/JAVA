package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.service.MemberService;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Application {

    /* 설명. 프로그램을 켜자마자 MemberService 객체 생성 (final: 서비스 객체가 1개이도록 (싱글톤) 하기 위해서) */
    /* 설명. main의 모든 메소드에 가져다 쓰기 위해서 선어 -> 메소드랑 연관관계(강결합)을 가진다*/
    private static final MemberService ms = new MemberService();

//    자동생성
//    public Application() {
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("======== 회원 관리 프로그램 ============");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 수정");
            System.out.println("5. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();

            switch (input){
                /* 설명. service 계층에 있을 객체를 불러옴*/
                case 1: ms.findAllMembers(); break;
                case 2: ms.findMembersBy(chooseMemNo()); break;
                case 3: ms.registMember(signUp()); break;
                case 4: ms.changeMember(choiceMemNo()); break;
                case 5: ms.removeMember(chooseMemNo()); break;
                case 9:
                    System.out.println("회원관리 프로그램을 종료합니다.");return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다;");
            }
        }
    }

    private static int choiceMemNo() {

        int choice = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("수정하려는 설정을 고르세요(1.회원ID, 2.회원PW, 3.회원나이, 4.회원취미, 5. 회원혈액형): ");
        int choiceSetting = sc.nextInt();

        while(choiceSetting )

        return choice;
    }


    private static Member signUp() {

        Member newMember = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요: ");
        String id = sc.nextLine();

        System.out.print("패스워드를 입력하세요: ");
        String pwd = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("입력 할 취미 개수를 입력하세요(숫자로 1 이상): ");
        int length = sc.nextInt();
        sc.nextLine();                      // 버퍼의 개행문자 처리용

        String[] hobbies = new String[length];
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print((i + 1) +"번째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        System.out.print("혈액형을 입력하세요(A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch (bloodType) {
            case "A": bt = BloodType.A; break;
            case "AB": bt = BloodType.AB; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O; break;
        }

        /* 필기.
         *   회원으로부터 회원가입을 위한 정보를 입력받아 Member 타입 객체 하나로 가공처리할 방법이 두 가지가 있다.
         *   1. 생성자 방식(장점: 한줄 코딩 / 단점: 따로 생성자 추가 및 생성자의 매개변수가 다소 늘어날 수 있음(리팩토링 징조)
         *   2. setter 방식(장점: 초기화 할 개수 수정 용이, 가독성이 좋음 / 단점: 코드의 줄 수가 늘어남)
         *  */

        /* 설명. 1. 생성자 방식 */
        newMember = new Member(id, pwd, age, hobbies);
        /* 설명. 2. setter 방식 */
        newMember.setBloodType(bt);

        return newMember;
    }

/* 설명. 회원 ID를 입력받아 반환하는 메소드*/
    private static int chooseMemNo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("회원의 번호를 입력하세요: ");
        return sc.nextInt();
    }

}
