package com.ohgiraffers.section03.filterstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* 설명. 우리만의 헤더 추가가 안되는 ObjectOutputSream 만들어 보기*/
public class MyOutput extends ObjectOutputStream {

    public MyOutput(OutputStream out) throws IOException {
        super(out);
    }

    /* 설명. Header를 다는 writeStreamHeader를 override해서 기능을 없버리면 Header를 안달고 진행*/
    @Override
    protected void writeStreamHeader() throws IOException {

        /* 설명. 객체 출력 시 헤더의 개념이 추가되지 않도록 제거*/
//        super.writeStreamHeader();
    }
}
