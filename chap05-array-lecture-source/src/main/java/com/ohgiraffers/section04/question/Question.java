package main.java.com.ohgiraffers.section04.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        //정확하게 n킬로그램 배달
        //봉지 종류 3킬로 5킬로
        //최대한 적은 봉지 들고 가려고 함
        //ex) 18킬로=> 3킬로 6개 아닌 5킬로 3개, 3킬로 1개=> 4개
        //3<= N = 5000 스캐너로 킬로그램
        //정확하게 n킬로 만들수 없으면 -1해라 3의배수와 5의 배수가 아니라면 -1해야 할 것 같은디

        Scanner sc = new Scanner(System.in);
        System.out.println("3부터 5000까지의 값을 입력해주세요 : ");
        int kg = sc.nextInt();
        int answer = 0;

//        if(!(kg>=3&&kg<=5000)) System.out.println("3부터 5000까지의 값이 아닙니다!");

        while (kg > 0){
            if(kg % 5 == 0){
                answer += kg/5;
                kg = 0;
            }else {
                kg -= 3;
                answer++;
            }

            if(kg < 0){
                answer = -1;
                break;
            }
        }

        System.out.println(answer);

        }

    }

