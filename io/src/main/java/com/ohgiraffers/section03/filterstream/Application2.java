package com.ohgiraffers.section03.filterstream;

import java.io.*;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 표준입출력(콘솔을 통한 입출력)을 이해하고 활용할 수 있다. */
        /* 설명. 보조스트림을 여러개를 중첩해서 사용할 수 있다. */

        /* 설명. 기존 System.in을 속도향상 + Reader를 사용하기 위해서 다중 보조 장치 중첩 */
        /* 설명. InputStreamReader: 한글입력받기 + BufferedReader: 속도 향상*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("문자열 입력: ");
        try {
            String input = br.readLine();

            System.out.println("input = " + input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(br != null) br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        /* 설명. 보조스트림 두개를 사용한 출력 - 위와 동일한 선언을 그냥 객체 2개를 따로 선언해서 진행 */
        BufferedWriter bw = null;
        OutputStreamWriter osw = null;
        osw = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(osw);                       // filter는 제일 마지막에 씌워진 method를 사용

        try{
            bw.write("println이 좋은거구만!~~");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* 설명. Scanner는 Buffered보다 속도는 느리지만 close를 안닫아도 되서 편리하다.*/
//        Scanner sc = new Scanner(System.in);
//        sc.nextLine();
//        sc.close();


    }
}
