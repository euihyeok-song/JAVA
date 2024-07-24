package com.ohgiraffers.question;

public class test {
    public static void main(String[] args) {

        test ts = new test();

        ts.testMethod("송의혁",27,'남');

        String name = "송의혁";
        int age = 20;
        char gender = '여';

        ts.testMethod(name, age, gender);
    }

    public void testMethod(String name, int age, final char gender){
        System.out.println("당신의 이름은 " + name + "이고, 나이는 "+ age + "세 이며, 성별은 " + gender + "입니다.");
    }


    // 정수형
    byte bnum;			//1byte
    short snum;		  //2byte
    int inum;			  //4byte
    long lnum;			//8byte

    // 실수형
    float fnum;			  //4byte
    double dnum;		  //8byte

    //

}
