package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. ArrayList에서 관리되는 자료형의 정렬 기준을 이용할 수 있다. */
        /* 목차. 1. Comparable 인터페이스 구현 방법 활용 */
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1, "홍길동" , "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서" , "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감" , "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기" , "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사" , "일연", 58000));

        /* 설명. Collections.sort를 활용한 정렬 (Comparable 방식) */
//        Collections.sort(bookList);
        /* 설명. Collections.sort를 활용한 정렬 (Comparator 방식)
         *  sort(Comparable, Comparator) => Comparable < Comparator : Comparator 기준 정렬
         *  Comparable은 반환값이 1개여서 오름차순/내림차순을 변경하기 위해서는 코드를 수정해줘야 하지만,
         *  Comparator은  오름차순/내림차순와 같은 기능에 필요한 클래스들을 정의해주면 바로바로 적용이 가능하다. */
        Collections.sort(bookList, new AscendingPrice());

        /* 설명. ArrayList가 제공하는 sort를 사용할 수도 있다.(다만 Comparator 기준만 가능)*/
        bookList.sort(new AscendingPrice());

        System.out.println(bookList);

        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));

        }

    }
}
