package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {
        /*
        nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자 전까지 읽어서 문자열로 변환
        next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 변환
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력 해주세요 : ");
        String greeting = sc.nextLine();
        System.out.println(greeting);

        System.out.println("두번째 값을 입력 해주세요 : ");
        String greeting2 = sc.next();
        System.out.println(greeting2);
    }
}
