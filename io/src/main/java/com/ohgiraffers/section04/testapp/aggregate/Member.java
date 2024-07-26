package com.ohgiraffers.section04.testapp.aggregate;

import java.io.Serializable;
import java.util.Arrays;

/* 설명. 객체 입출력을 위해서 Serializable 인터페이스 필요 */
public class Member implements Serializable {
    private int memNo;                      // 회원번호
    private String id;                      // 회원아이디
    private String pwd;                     // 회원비번
    private int age;                        // 회원나이
    private String[] hobbies;               // 회원 취미들
    private BloodType bloodType;            // 회원혈액형

    public Member() {
    }

    /* 설명. 회원이 회원가입 하기 위해서 선택한 필드에 대한 매개변수 생성자 - id,pwd,age,hobbies + setter(bloodType)*/
    public Member(String id, String pwd, int age, String[] hobbies) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Member(int memNo, String id, String pwd, int age, String[] hobbies, BloodType bloodType) {
        this.memNo = memNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    public int getMemNo() {
        return memNo;
    }

    public void setMemNo(int memNo) {
        this.memNo = memNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memNo=" + memNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                '}';
    }
}
