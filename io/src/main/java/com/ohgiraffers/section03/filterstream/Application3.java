package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 데이터 타입별 입출력 보조 스트림을 이해하고 활용할 수 있다. */

        /* 설명. 데이터 타입별 입출력은 reader ,writer 계열 사용X , OutputStream 계열 사용해야 함 */
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(
                    new FileOutputStream(
                            "src/main/java/com/ohgiraffers/section03/filterstream/testData.txt"));

            /* 설명. 꼬리표를 달아서 UTF/Int/Char등 타입을 byte단위의 크기로 인지시켜서 보내는 역할 */
            dos.writeUTF("홍길동");
            dos.writeInt(20);
            dos.writeChar('A');

            dos.writeUTF("유관순");
            dos.writeInt(16);
            dos.writeChar('B');

            dos.writeUTF("강감찬");
            dos.writeInt(38);
            dos.writeChar('O');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        DataInputStream dis = null;
        try {
            dis = new DataInputStream(
                    new FileInputStream(
                            "src/main/java/com/ohgiraffers/section03/filterstream/testData.txt"));

            /* 설명. 무한 반복이지만 예외 발생(EOF를 만나면)시 break + 넣어준 순서대로 읽어야 함 */
            while(true) {
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readChar());
            }
        } catch(EOFException e){

            /* 설명. data 단위 입출력은 EOFException을 활용하여 파일의 끝까지 입력 받았다는 것을 처리할 수 있다. */
            System.out.println("파일을 다 읽어냄");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
