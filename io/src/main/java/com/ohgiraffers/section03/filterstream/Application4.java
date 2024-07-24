package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;
import java.lang.reflect.Member;

public class Application4 {
    public static void main(String[] args) {

        MemberDTO[] memArr = new MemberDTO[100];
        memArr[0] = new MemberDTO("user01", "pass01", "홍길동",
                "hong123@gmail.com", 25, '남');
        memArr[1] = new MemberDTO("user02", "pass02", "유관순",
                "korea31123@gmail.com", 16, '여');
        memArr[2] = new MemberDTO("user03", "pass03", "강감찬",
                "leesoonsin@gmail.com", 38, '남');
        memArr[3] = new MemberDTO("user04", "pass04", "송의혁",
                "song@gmail.com", 27, '남');

        File ObjFile = new File("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt");

        ObjectOutputStream objOut = null;
        try {
            if(!ObjFile.exists()) {                          // 파일이 없는 경우
                objOut = new ObjectOutputStream(
                            new BufferedOutputStream(
                                new FileOutputStream(
                                        "src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));

            }  /* 설명. 계속 넣어줘도 덮어씌우지 않고, 계속 이어붙이도록 만들기 위한 부분 - Header없이 계속 추가해줌*/
            else{
                objOut = new MyOutput(                       // Header로 제한하지 않고, 하기 위해 override해서 사용하는 클래스
                            new BufferedOutputStream(
                                new FileOutputStream(
                                        "src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt",true)));
            }

            /* 설명. 조건문을 걸어주면 객체가 늘어나도 상관 X */
            for (int i = 0; i < memArr.length ; i++) {
                if(memArr[i] == null) break;
                objOut.writeObject(memArr[i]);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(objOut != null) objOut.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        MemberDTO[] newMemArr = new MemberDTO[memArr.length];

        ObjectInputStream objIn = null;
        try {
            objIn = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(
                                        "src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));

            int i = 0;
            while(true){
                newMemArr[i] = (MemberDTO)objIn.readObject();       //readObject의 반환형이 Object이므로 다운캐스팅으로 맞춰줌
                i++;
            }

        } catch (EOFException e){                   // while문을 통해서 저장 객체를 읽을 때 EOF를 만나는 상황을 처리하기 위함
            System.out.println("객체 단위 파일 출력 완!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(objIn != null) objIn.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        for(MemberDTO m : newMemArr){
            if(m == null) break;
            System.out.println(m);
        }
    }
}
