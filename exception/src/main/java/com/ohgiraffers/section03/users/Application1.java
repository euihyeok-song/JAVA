package com.ohgiraffers.section03.users;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 예외처리를 많이 사용하는 io 패키지와 관련한 try-catch 구문을 이해할 수  있다. */
        /* 설명.
        *    예외 처리를 가장 많이 사용하게 되는 상황(io 패키지 관련)에서 try-catch 구문을 실제 상황과
        *    유사하게 연습해보자.
        *    (입출력 관련 문법을 하나하나 신경쓰기 보다는 호출 흐름에 신경 쓰자.)
        * */

        /* 설명.  프로젝트 바로 아래에 test.dat 파일이 있다면(File 객체 생성- 경로 관련 resource 사용 가능) 해당 경로의 절대 경로를 출력 */
        System.out.println(new File("test.dat").getAbsoluteFile());    // .dat파일 = 주로 Data를 담는 파일

        BufferedReader br = null;                         // 파일로부터 data를 읽어오기 위한 통로

        try {
            br = new BufferedReader(new FileReader("test1.dat"));
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);                // pause하여 오류문 출력해주는 구조
            System.out.println("파일이 없나보네?");
        } finally {                                         // 예외가 발생되든 아니든 출력되는 문

            /* 필기.
             *  예외처리 구문과 상관없이 반드시 수행해야 하는 경우 finally에 작성하는데
             *  보통 사용한 자원(resource- 사용한 메모리 공간)을 반납할 목적으로 사용하게 된다.
             */
            try {

                /* 필기.
                 *  스트림(입출력 관련 통로)이 생성되지 않았을 때 접근해서 close() 메소드를 호출하게 되면
                 *  NullPointerException이 발생할 수 잇다. 따라서 if문을 활용해 처리하낟.
                 */
                if (br != null) {

                    /* 필기.
                     *  입출력에서 사용한 스트림을 닫아주는 메소드이다.
                     *  API에서 확인해보면 IOException을 throws하는 메소드이기 떄문에
                     *  finally 블럭 안이라도 추가 예외처리를 중첩으로 해 주어야 한다.
                    */
                    br.close();                      // 파일로부터 data를 읽어오기 위한 통로를 닫기
                                                     // catch문에 걸리면 예외여서 통로가 만들어지지 않아도 close해줘야 함
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
