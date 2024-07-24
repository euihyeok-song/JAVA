package com.ohgiraffers.section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. Properties에 대해 이해하고 활용할 수 있다. */
        /* 설명.
         *  Properties란?
         *   HashMap과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
         *   (제네릭<>을 별도로 요구하지 않음)
         *   주로 설정 파일 관련된 파일과의 입출력에 사용된다. (store, load)
         *   HashMap = Map<String,String> => Properties (거의 동일한 기능)
         *
         * 필기. (동기화) - 속도 느림
         *  StringBuilder -> StringBuffer
         *  ArrayList -> Vector
         *  HashMap -> Hashtable (Properties가 Hashtable의 자식 클래스)
         * */

        Properties prop = new Properties();

        /* 설명. Properties는 값을 추가할 때 setProperty()함수를 사용한다. - 설정 정보를 주로 담음*/
        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url","jbc:oracle:thin:@localhost:1521:xe");
        prop.setProperty("user", "swcamp");
        prop.setProperty("password", "swcamp");

        System.out.println("prop = " + prop);

        /* 설명. Properties를 활용한 설정 정보 파일로 출력해보기 - Project의 파일중 build.gradle파일 아래에 생김*/
        try {
//            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver xml version");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* 설명. 저장된 설정 파일에서부터 읽어온 데이터를 담을 새로운 Properties 객체 */
        Properties prop2 = new Properties();
        System.out.println("읽어오기 전: " + prop2);
        try {
//            prop2.load(new FileInputStream("driver.dat"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("읽어온 이후 ===================================");
        /* 설명. Properties는 값을 뺄 때 getProperty()함수를 사용한다. */
        System.out.println("driver: " + prop2.getProperty("driver"));
        System.out.println("url: " + prop2.getProperty("url"));
        System.out.println("user: " + prop2.getProperty("user"));
        System.out.println("password: " + prop2.getProperty("password"));
    }
}
