package main.java.com.ohgiraffers.section01.object.book;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(int number, String title, String author, int price) {
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
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // Object obj 모든 객체를 다 넣을 수 있다. 부모이니까
        if (this == obj) return true;
        // this는 equals 앞에 오는 객체

        Book other = (Book) obj;// 다운 캐스팅

        if (this.number != other.number) {
            return false;
        }

        if (this.title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!this.title.equals(other.title)) {
            return false;
        }

        if(this.author == null){
            if(other.author != null){
                return false;
            }
        }else if (!this.author.equals(other.author)){
            return false;
        }

        if (this.price != other.price) {
            return false;
        }

        return true;

    }

    @Override
    public int hashCode() {
        int result = 1;

        final int PRIME = 31;

        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();// 문자열이 String이라 이미 오버라이딩 되어있어서 잘 연산됨
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;

    }
}
