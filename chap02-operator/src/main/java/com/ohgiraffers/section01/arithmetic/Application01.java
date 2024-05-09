package main.java.com.ohgiraffers.section01.arithmetic;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 산술 연산자
        * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서
        * 가장 많이 사용되는 연산자이다
        * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
        * 피연산자들의 방향은 왼쪽에서 오른쪽이다.*/

        /*
        * + - * / %
        */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 : " + num1 + num2);//문자열로 인식
        System.out.println("num1 + num2 : " + (num1 + num2));//괄호 치면 가능
        //System.out.println("num1 - num2 : " + num1 - num2);//문자열은 - 안됨
        System.out.println("num1 - num2 : " + (num1 - num2));
        System.out.println("num1 * num2 : " + num1 * num2);//우선순위로 인해 +보다 *가 먼저 진행됨
        System.out.println("num1 / num2 : " + num1 / num2);//우선순위로 인해 +보다 /가 먼저 진행됨
        System.out.println("num1 % num2 : " + num1 % num2);//우선순위로 인해 +보다 %가 먼저 진행됨


    }
}
