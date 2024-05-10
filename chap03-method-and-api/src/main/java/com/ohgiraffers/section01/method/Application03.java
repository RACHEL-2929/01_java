package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {


        /*
        * 변수의 종류
        *
        * 1. 지역 변수
        * 2. 매개 변수
        * 3. 전역 변수 (필드)
        * 4. 클래스(static) 변수
        * */

        Application03 app3 = new Application03();
        app3.testMethod(10);
        //app3.testMethod(10,20); 매개변수의 개수 다르면 오류남
        //app3.testMethod("40"); 매개변수의 자료형 다르면 오류남
        //app3.testMethod(); 매개변수가 존재하는데 안 넣으면 오류남

        //변수에 저장한 값 전달 테스트
        int age = 20;
        app3.testMethod(age);


        //자동 형 변환을 이용한 값 전달 테스트
        byte byteAge = 20;
        app3.testMethod(byteAge);

        short shortAge = 20;
        app3.testMethod(shortAge);


        //강제 형 변환을 이용한 값 전달 테스트
        long longAge = 30;
        app3.testMethod((int)longAge);


        //연산 결과를 이용한 값 전달 테스트
        //byte test = (byteAge*2); byteAge *2를 하면 int로 변환됨

        app3.testMethod(byteAge*2);




    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다");
    }
}
