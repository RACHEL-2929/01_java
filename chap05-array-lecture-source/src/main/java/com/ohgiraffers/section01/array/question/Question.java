package main.java.com.ohgiraffers.section01.array.question;

import java.awt.*;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        // 배열의 최솟값, 최댓값 찾기

        //배열 길이는 스캐너로 입력 받아서 요소마다 정수를 넣어줌
        //해당 배열의 최솟값과 최댓값을 출력해주는 기능을 만들어주세요

        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이를 설정해주세요 : ");
        int number = sc.nextInt();
        int[] array = new int[number];
        int max = -10000000;
        int min = 10000000;

        for (int i = 0; i < array.length; i++) {
            System.out.println("값을 입력해주세요 : ");
            array[i] = sc.nextInt();
            if (array[i] > max) {max = array[i];}
            if (array[i] < min) {min = array[i];}
        }
        System.out.println("최댓값은 " + max);
        System.out.println("최솟값은 " + min);

    }
}
