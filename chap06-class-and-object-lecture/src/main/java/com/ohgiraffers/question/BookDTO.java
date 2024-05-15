package main.java.com.ohgiraffers.question;

import java.awt.print.Book;

public class BookDTO {
    //책 제목, 종류, 작가, 가격, 할인률
    //getter, setter, 생성자
    String title;
    String genre;
    String author;
    int price;
    double discount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    //기본생성자
    public BookDTO() {
        System.out.println("기본생성자 호출됨..");
    }

    //필드 3가지 초기화
    public BookDTO(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    //모든 필드 초기화
    public BookDTO(String title, String genre, String author, int price, double discount) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.price = price;
        this.discount = discount;
        System.out.println("할인율 "+ discount + "을 적용한 가격은 " + (int)(price*(1-discount)) + "원 입니다.");
    }

    public String getInfomation(){
        return "Book [ title = " + this.title + ", author = " + author + ", price = " + this.price + ", discount = " + this.discount + "]";
    }
}
