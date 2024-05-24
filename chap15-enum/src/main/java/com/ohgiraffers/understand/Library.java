package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Library {
    private static List<BookDTO> bookList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void addBook() {
        System.out.println("추가할 도서의 제목을 적어주세요");// 중복되면 안됨
        String title = sc.nextLine();


        for (int i = 0; i < bookList.size(); i++) {
            if (title.equals(bookList.get(i).getTitle())) {
                System.out.println("중복된 책은 등록할 수 없습니다.");
                return;
            }
        }

        System.out.println("추가할 도서의 작가 이름을 적어주세요");
        String author = sc.nextLine();

        System.out.println("추가할 도서의 등록 번호를 적어주세요");// 중복되면 안됨
        int number = sc.nextInt();

        for (int i = 0; i < bookList.size(); i++) {
            if (number == (bookList.get(i).getNumber())) {
                System.out.println("중복된 번호는 등록할 수 없습니다.");
                sc.nextLine();
                return;
            }
        }

        sc.nextLine();
        System.out.println("추가할 도서의 장르를 적어주세요");
        System.out.println("소설, 논픽션, 과학, 역사, 판타지, 미스터리 중 선택해주세요");
        String genre = sc.nextLine();

        Genre[] genres = Genre.values();// 장르들은 배열에 담음
        // Genre 비교하면서  genre가 Genre에 포함되어있는지 확인하기
        while (true) {
            for (Genre genre1 : genres) {
                if (genre.equals(genre1.getExplain())) {
                    BookDTO bookDTO = new BookDTO(title, author, number, genre1, false);
                    bookList.add(bookDTO);
                    return;
                }
            }
            System.out.println("장르를 잘못 입력하셨습니다. 다시 입력해주세요 =>");
            genre = sc.nextLine();
        }


    }

    public void genreCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 장르를 입력해주세요");
        System.out.println("소설, 논픽션, 과학, 역사, 판타지, 미스터리 중 선택해주세요");

        String genre = sc.nextLine();

        for (int i = 0; i < bookList.size(); i++) {
            if (genre.equals(bookList.get(i).getGenre().getExplain())) {
                System.out.println(bookList.get(i));
            }
        }

    }

    public void borrowBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("대여할 도서의 책 제목을 적어주세요");
        String title = sc.nextLine();

        for (BookDTO book : bookList) {

            if (title.equals(book.getTitle())) {
                book.borrowBook();
                return;
            }


        }
        System.out.println("해당 " + title + " 번의 도서를 찾을 수 없습니다.");

    }


    public void returnBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("반납할 도서의 책 제목을 적어주세요");
        String title = sc.nextLine();

        for (int i = 0; i < bookList.size(); i++) {
            if (title.equals(bookList.get(i).getTitle())) {
                bookList.get(i).setBorrow(false);
                return;
            }
        }
    }

}
