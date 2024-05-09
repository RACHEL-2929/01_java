package main.java.com.ohgiraffers.section04.comparision;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 비교 연산자
        * 비교 연산자는 피 연산자 사이에서 상대적인 크기를 판단하여,
        * 참 혹은 거짓을 반환하는 연산자이다.
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나,
        * 조건문의 조건절에 많이 사용한다.
        *
        * ! : 부정을 의미
        * */

        System.out.println(!true);
        System.out.println(!false);

        int inum1 = 10;
        int inum2 = 20;
        System.out.println("---------정수 값 비교--------");
        System.out.println("inum1과 inum2가 같은 지 비교 : " +(inum1 == inum2));
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " +(inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " +(inum1 > inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " +(inum1 < inum2));
        System.out.println("inum1이 inum2보다 큰거나 같은지 비교 : " +(inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작거나 같은지 비교 : " +(inum1 >= inum2));

        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println("-----------문자 값 비교--------");
        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("ch1과 ch2가 다른지 비교 : " + (ch1 != ch2));
        System.out.println("ch1이 ch2 보다 큰지 비교 : " + (ch1 > ch2));
        System.out.println("ch1이 ch2 보다 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("ch1이 ch2 보다 작은지 비교 : " + (ch1 < ch2));
        System.out.println("ch1이 ch2 보다 작거나 같은지 비교 : " + (ch1 <= ch2));


        System.out.println("----------논리 값 비교----------");
        boolean bool1 = true;
        boolean bool2 = false;
        //같거나 다른 거만 가능, 대소 비교 불가
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 다른지 비교 : " + (bool1 != bool2));
        //System.out.println("bool1이 bool2 보다 큰지 비교 : " + (bool1 < bool2)); 대소비교 불가 컴파일 오류 뜸

        //같거나 다른 거만 가능, 대소 비교 불가
        String str1 = "java";
        String str2 = "java";
        System.out.println("------------문자열 값 비교---------");
        System.out.println("str1과 str2가 같은지 비교 : " +(str1 == str2));
        System.out.println("str1과 str2가 다른지 비교 : " +(str1 != str2));
        //System.out.println("str1과 str2가 다른지 비교 : " +(str1 < str2)); 대소비교 불가 컴파일 오류 뜸


        int x = 10;
        int y = 11;
        boolean result = x <= y;
        System.out.println("result = " + result);





    }
}
