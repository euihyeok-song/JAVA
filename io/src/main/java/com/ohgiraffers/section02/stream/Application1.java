package com.ohgiraffers.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 입출력 스트림(단반향 경로- 출력과 입력을 따로)에 대해 이해하고 파일을 대상으로 하는 FileInputStream을 사용할 수 있다. */
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(
                    "src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
//            System.out.println((char)fis.read());                     // fis.read()의 반환값은 아스키코드에  해당하는
//            System.out.println((char)fis.read());                     // 정수값이여서 (char)
//            System.out.println((char)fis.read());
//            System.out.println((char)fis.read());
//            System.out.println((char)fis.read());

            int input = 0;

            /* 설명. 파일의 끝(EOF)을 만날 떄까지 1byte씩 읽어들일 수 있도록 조건식 작성 */
            while((input = fis.read()) != -1){
                System.out.println((char)input);
            }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}

