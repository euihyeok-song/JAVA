package com.ohgiraffers.section01.object.dto;

import java.util.Objects;


public class BookDTO {

    private int number;
    private  String title;
    private  String author;
    private  int price;

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

    /* 설명. equals를 Override 하기 위해 String class의 equals(문자하나씩 비교해줌)를 이용해서 재정의함*/
//    @Override
//    public boolean equals(Object obj) {
//
//        /* 설명. 책제목, 작가, 가격이 같으면(우리의 동등 기준) true가 나올 수 있게 equals() 메소드 재정의 */
//        return this.title.equals(((BookDTO)obj).title) &&                // Object 클래스에는 title이 없으므로 다운 캐스팅 필요
//                this.author.equals(((BookDTO)obj).author) &&
//                this.price == ((BookDTO)obj).price;
//    }

    /* 설명. 위의 equals와 hashcode의 Override는 ctrl + enter 해서 equals and hashcode 부분은 클릭하여 자동 만들기 가능*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return price == bookDTO.price && Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author);
    }

    /* 설명. native언어(다른 언어로 만든 구조) 이므로 Override를 막 하면 X => 단축키로만 진행해야함*/
    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}
