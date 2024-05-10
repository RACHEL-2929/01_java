package main.java.com.ohgiraffers.section01.method;

public class Application07 {
    public static void main(String[] args) {
        /*
        * 실습
        * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 메소드
        *
        * 반환받아서 메인 메소드에 sout을 이용해 출력
        * */

        Application07 app7 = new Application07();
        System.out.println("1과 2 더한 값 출력 : " + app7.adder(1,2));
        System.out.println("2에서 1 뺀 값 출력 : " + app7.minus(2,1));
        System.out.println("1과 2를 곱한 값 출력 : " + app7.multi(1,2));
        System.out.println("2에서 1을 나눈 값 출력 : " + app7.division(2,1));


    }

    private int division(int a, int b) {
        return a/b;
    }

    private int multi(int a, int b) {
        return a*b;
    }

    private int minus(int a, int b) {
        return a-b;
    }

    public int adder(int a, int b){
        return a+b;
    }
}
