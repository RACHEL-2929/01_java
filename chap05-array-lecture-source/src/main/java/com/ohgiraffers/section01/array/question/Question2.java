package main.java.com.ohgiraffers.section01.array.question;

import java.util.Scanner;

public class Question2 {
    //2번째로 큰 값
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이를 설정해주세요 : ");
        int number = sc.nextInt();
        int[] array = new int[number];
        int max = -10000000;


        for (int i = 0; i < array.length; i++) {
            System.out.println("값을 입력해주세요 : ");
            array[i] = sc.nextInt();
        }
        int secondMax = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];

            } else if (array[i] < max && array[i] > secondMax) {
                    System.out.println("!!");
                    secondMax = array[i];
            }


        }
        System.out.println("최댓값은 " + max);
        System.out.println("두 번째로 큰 값은 " + secondMax);
        }



    }

