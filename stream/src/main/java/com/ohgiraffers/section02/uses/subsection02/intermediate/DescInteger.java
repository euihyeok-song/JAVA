package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.Comparator;

public class DescInteger implements Comparator<Integer> {

    /* 설명. 내림차순 기능*/
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
//        return o2.compareTo(o1);
    }
}
