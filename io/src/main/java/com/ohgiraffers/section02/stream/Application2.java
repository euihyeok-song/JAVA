package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. FileOutput Stream에 대해 이해하고 활용할 수 있다. */
        FileOutputStream fout = null;                       // main내의 지역변수로 main내에서 모든 메소드가 사용하도록 설정
         try {
             /* 설명. 해당경로에 파일이 없으면 자동으로 만들어줌(출력 스트림만 만들어도) */
             /* 설명. OutputStream 생성자 중에 append 개념을 추가하는 인자를 true로 넘겨주면 데이터 이어붙이기가 가능하다.*/
            fout = new FileOutputStream(
                    "src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt", true);

//            fout.write('a');
//            fout.write(66);

             /* 설명. Overloading이 발생하여 위의 개별적 write와는 다른 기능을 함(배열을 입력으로 받음)*/
             byte[] bArr = new byte[]{'a','p','p','l','e'};
//             for(byte b: bArr){
//                 fout.write(b);
//             }
             /* 설명. 배열의 주소값이 들어오면 자동 override됨*/
             fout.write(bArr, 1, 3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
             throw new RuntimeException(e);
         } finally {
             try {
                 if(fout != null) fout.close();             // if문 같은 블럭에서 실행구문이 하난면 중괄호 생략 가능
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
    }
}
