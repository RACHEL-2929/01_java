package main.java.com.ohgiraffers.section04.question;

import main.java.com.ohgiraffers.section04.scanner.QuestionTest;

import java.util.Random;

public class Question {
    /*
    -100 에서 100사이의 난수를 발생 시켜서 매개변수로 전달하면(0은 고려 안함)
    매개변수가 양수면서 짝수면 x는 양수면서 짝수입니다. 양수면서 홀수면 양수면서 홀수입니다
    음수면서 짝수면 x는 음수면서 짝수입니다. 홀수면 음수면서 홀수입니다.
    를 반환하는 메소드를 복습을 위해 다른 패키지에 클래스를 생성해 임포트 시킨 후 메인 메소드에 출력
     */

    public static void main(String[] args) {
        //다른 버전으로 만들어보자면
        //int randomNumber2 = (int)(Math.random()*201-100);
        int randomNumber = new Random().nextInt(201)-100;
        QuestionTest qt = new QuestionTest();
        System.out.println("난수는 "+randomNumber + "입니다");
        System.out.println("난수는 "+qt.Random01(randomNumber));
    }
}
