package com.ohgiraffers.section01.list.dto;

import java.awt.print.Book;
import java.util.Objects;

/* 설명. 내가 만든 클래스를 제네릭으로 사용 ( 정렬기준을 내가 정함 ) - 한계점: 메소드 1개에 1개의 정렬 기준만 정의 가능*/
/* 설명. Comparable에 <BookDTO>를 안쓰면 아래 CompareTO에서 Object o를 매개변수로 받기 때문에 직접 (BookDTO)로 다운캐스팅 필요ㅌ₩ */
public class BookDTO implements Comparable<BookDTO> {
    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO() {
    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    /* 필기.
     *  우리가 원하는 필드의 오름차순 또는 내림차순을 할 수 있다.
     *  필드가 n개면 총 (n * 2 )가지의 정렬 기준을 가질 수 있다.(각각 ASC 또는 DESC)
     *  정렬은 compareTo()메소드가 반환하는 int형의 부호에 따라 정해지게 되므로 오름차순과 내림차순은
     *  부호만 달리 되도록 하면 된다.
     *  (해당 필드가 String형일 경우는 String의 compareTo() 메소드를 활용하자.)
    */


    /* 설명. 정렬 기준을 정하기 위한 Override - 이전 객체가 함수 매개변수로 전달 , 다음 객체가 함수 호출*/
    @Override
    public int compareTo(BookDTO o) {

        /* 설명. 가격에 대한 오름차순 */
//        return this.price - o.getPrice();               // this는 함수를 호출한 객체, o는 이전 객체
                                                        // this.price - o.getPrice < 0 이면 switch해주는 알고리즘 짜져있음
        /* 설명. 가격에 대한 내림차순 => 2가지 */
//        return o.getPrice() - this.price;
//        return -(this.price - o.getPrice());

        /* 설명. 책 제목에 대한 오름차순 - String일 경우 String에 저장된 compareTo() 사용 */
//        return this.title.compareTo(o.getTitle());

        /* 설명. 책 제목에 대한 내림차순 => 2가지*/
        return -this.title.compareTo(o.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
