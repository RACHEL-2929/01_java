package main.java.com.ohgiraffers.understand;

public class BookDTO {
    private String title;
    private String author;
    private int number;
    private Genre genre;
    private Boolean isBorrow;

    public BookDTO(String title, String author, int number, Genre genre, Boolean isBorrow) {
        this.title = title;
        this.author = author;
        this.number = number;
        this.genre = genre;
        this.isBorrow = isBorrow;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Boolean getBorrow() {
        return isBorrow;
    }

    public void setBorrow(Boolean borrow) {
        isBorrow = borrow;
    }

    public BookDTO(String title, String author, int number, Genre genre) {
        this.title = title;
        this.author = author;
        this.number = number;
        this.genre = genre;
    }

    public void borrowBook(){
        if (!isBorrow) {
            this.isBorrow = true;
            System.out.println(title + "이(가) 대여되었습니다.");
        }else{
            System.out.println(title + "은(는) 이미 대여 중입니다.");
        }
    }

    public void returnBook(){
        if(isBorrow){
            this.isBorrow = false;
            System.out.println(title + "이(가) 반납되었습니다.");
        }else{
            System.out.println(title + "은(는) 대여되지 않았습니다.");
        }
    }



    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", number=" + number +
                ", genre=" + genre +
                ", isBorrow=" + isBorrow +
                '}';
    }
}
