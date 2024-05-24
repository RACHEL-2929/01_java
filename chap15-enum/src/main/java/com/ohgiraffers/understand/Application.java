package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Application {
    // try,catch,enum
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while(true){
            System.out.println("------도서 관리 시스템-----");
            System.out.println("1. 도서 추가");
            System.out.println("2. 장르별 도서 목록 보기");
            System.out.println("3. 도서 대여");
            System.out.println("4. 도서 반납");
            System.out.println("9. 종료");

            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice){
                case 1: library.addBook(); break;
                case 2: library.genreCategory(); break;
                case 3: library.borrowBook(); break;
                case 4: library.returnBook(); break;
                case 9:return;
            }

        }
    }




}
