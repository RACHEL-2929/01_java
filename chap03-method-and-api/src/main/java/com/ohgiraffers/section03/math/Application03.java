package main.java.com.ohgiraffers.section03.math;

import java.util.Random;

public class Application03 {
    public static void main(String[] args) {
        /*
        * java.util.Random 클래스
        * Random 클래스의 nextInt() 메소드를 이용한 난수 발생
        * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시키는 메소드
        * */

        /*
        * 원하는 방식의 난수를 구하는 공식
        * random.nextInt(구하려는 난수의 범위) + 구하려는 난수의 최솟값*/

        //0~9까지 난수 발생
        int randomNumber1 = new Random().nextInt(10);
        System.out.println("0부터 9까지의 난수 : "+randomNumber1);

        //1부터 10까지의 난수 발생
        int randomNumber2 = new Random().nextInt(10)+1;
        System.out.println("1부터 10까지의 난수 : "+randomNumber2);

        //20부터 45까지의 난수 발생
        int randomNumber3 = new Random().nextInt(26)+20;
        System.out.println("20부터 45까지의 난수 : "+randomNumber3);


    }
}
