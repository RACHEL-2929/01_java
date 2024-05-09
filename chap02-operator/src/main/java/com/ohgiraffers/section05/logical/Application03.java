package main.java.com.ohgiraffers.section05.logical;

public class Application03 {
    public static void main(String[] args) {
        /*
        * 논리식 && : 앞의 결과가  false 이면 뒤의 연산을 실행하지 않음.
        * 논리식 || : 앞의 결과가 true 이면 뒤의 연산을 실행하지 않음
        * */

        int num1 = 10;
        int result = (false && ++num1>0)? num1:20;
        System.out.println(result);
        System.out.println(num1);//증감 연산자를 위의 식에서 썼지만 실행되지 않았기 때문에 증가하지 않고 출력된 것을 알 수 있음

        int num2 = 20;
        int result2 = (true || ++num2>0)? num2:30;
        System.out.println(result2);
        System.out.println(num2);//증감 연산자를 위의 식에서 썼지만 실행되지 않았기 때문에 증가하지 않고 출력된 것을 알 수 있음



    }
}
