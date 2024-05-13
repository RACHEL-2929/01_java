package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine() {
        //2단부터 단을 1단씩 증가시키는 반복문

        //1단씩 증가
        for (int dan = 2; dan < 10; dan++) {

            //1부터 9까지 단에 곱해주기

            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println(" ");


        }

    }

    public void printUpgradeGugudan() {
        for (int dan = 2; dan < 10; dan++) {
            printGugudan(dan);
        }

    }

    public void printGugudan(int dan) {
        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
        System.out.println(" ");

    }


    public void printTriangleStars() {

        //키보드로 정수를 하나 입력 받아 해당 정수만큼 한 행에  "*"을 행의 번호개씩 출력하세요
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요 : ");
        int row = sc.nextInt();
        //출력할 행
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public void printTriangleStars2() {

        //키보드로 정수를 하나 입력 받아 해당 정수만큼 한 행에  "*"을 행의 번호개씩 출력하세요
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요 : ");
        int row = sc.nextInt();
        //출력할 행
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void testTriangleTree() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row*2-1; j++) {
                for(int k = 1; k <= j; k++) {

                }
                System.out.print(" ");

            }
            System.out.println("*");
            for (int j = 1; j <= row*i-1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}

