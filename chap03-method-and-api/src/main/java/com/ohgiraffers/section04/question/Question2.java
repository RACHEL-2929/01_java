package main.java.com.ohgiraffers.section04.question;

import java.util.Random;

public class Question2 {
    public static void main(String[] args) {

        //25~34까지
        int random = new Random().nextInt(10)+25;

        //55~76까지
        int random2= (int)(Math.random()*22+55);
        System.out.println(random2);

    }
}
