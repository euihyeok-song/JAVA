package com.ohgiraffers.section03.users;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. try-with-resource 구문을 이해해하고 활용할 수 있다.(feat. finally 안 쓰기) */
        try (BufferedReader br = new BufferedReader(new FileReader("test.dat"))){//App1의 finally구문을 작성 역할

        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {                                   // 위의 (Buffer ~ ) 부분의 close()를 예외처리로 빼줌
            throw new RuntimeException(e);
        }
    }
}
