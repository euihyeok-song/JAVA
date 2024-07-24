package com.ohgiraffers.section02.userexception.exception;

public class PriceNegativeException extends Exception {

    /* 설명. 이와 같이 super로 message를 넘겨줘야 detailmessage에 담아 getMessage()로 받아올 수 있다.*/
    public PriceNegativeException(String message) {
        super(message);
    }
}
