package com.ohgiraffers.section03.filterstream;

import java.io.*;
import java.nio.Buffer;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. BufferedWriter와 BufferdReader에 대해 이해하고 사용할 수 았다. */
        /* 설명.
         *  내부적으로 버퍼(buffer)를 활용해서 입출력 성능을 향상 시킨다.
         *  추가적인 메소드가 제공된다.
        */

        /* 설명. BufferdWriter를 활용한 한 줄씩 출력하기 - filter를 씌우는 보조장치 */
        BufferedWriter bw = null;                           // 느린 속도의 공간을 저장해두는 개념
        /* 설명. append = ture이면 stream을 닫고 다시 열 경우에도 적용시켜준다는 의미*/
        try {
            bw = new BufferedWriter(
                    new FileWriter(
                            "src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt", true));

            bw.write("제목: 세종대왕님\n");
            bw.write("드디어 세종대왕님이 만족하시겠네!\n");
            bw.write("대한민국 최고\n");

            /* 설명.
             *  버퍼를 이용해서 출력을 하는 경우 버퍼 공간이 가득차지 않으면 내보내기(출력)가 안되는 경우가 있다.
             *  이럴 경우 버퍼에 담긴 내용을 강제로 내보내기 위해서는 flush() 메소드를 활용해야 한다.
             *  (write를 했는데 파일에 값이 안 적혀 있으면 flush() 할 것)
             *  (write나 output할 경우 주요하게 써주고, 왠만하면 모두 적어줄 것!)
            */
            bw.flush();                         // 중간에 오류가 발생하면 남아있는 정보들이 다음 출력에 영향을 미칠수 있음으로 필수 적용

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {

                /* 설명. 보조스트림을 닫으면 그 이전에(내부에) 만든 스트림들은 자동으로  close() 된다.
                *       BufferdWriter 스트림을 닫으면 내부적으로 flush()가 동작한다.    */
                if(bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println();

        /* 설명. BufferedReader를 활용한 한 줄(개행 문자 전까지)씩 읽어오기 */
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new FileReader(
                            "src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            String returnString = "";
            while((returnString = br.readLine()) != null){
                System.out.println(returnString);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(br != null) br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
