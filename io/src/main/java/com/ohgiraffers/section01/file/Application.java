package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. File 클래스의 사용 용법을 이해할 수 있다. */
        /* 설명. 파일에 대한 기능을 사용할 때 File 객체가 필요함. */
        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt"); // "\\"나 "/" 모두 가능

        try {
            boolean isSuccess = file.createNewFile();
            System.out.println("파일 생성 여부: " + isSuccess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* 설명. 몇 가지 File에서 제공하는 메소드 확인 */
        System.out.println("파일의 크기: " + file.length() + "byte");
        System.out.println("파일의 경로 " + file.getPath());
        System.out.println("현재 파일의 상위 경로 " + file.getParent());
        System.out.println("파일의 절대 경로 " + file.getAbsolutePath());

        /* 설명. file을 삭제하는 method */
        boolean isDeleted = file.delete();
        System.out.println("파일 삭제 여부: "+ isDeleted);
    }
}
