package main.java.com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args) {
        /*
        * 변수를 선언하고 값을 할당하여 사용할 수 있다.
        *
        * 변수를 사용하는 방법
        * 1. 변수를 준비한다.-선언
        * 2. 변수에 값을 대입한다.-값 대입(초기화)
        * 3. 변수를 사용한다.
        *
        * */


//        int bonus;
//        System.out.println(bonus);//선언만 하고 초기화 안하면 오류남


        /*
        * 변수에는 자료형이 존재한다.
        * 자료형이란? 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 컴파일러와 약속한 키워드이다.
        * 기본 자료형과 참조 자료형으로 나뉜다.
        * 그 중 기본 자료형 8가지를 먼저 확인한다.
        *
        * */

        /*목차 1. 숫자를 취급하는 자료형*/
        /*1바이트 = 8비트
        * 자바는 기본적으로 데니터의 최소 단위를 1바이트만큼 취급*/


        //프리미티브 타입 기본 자료형 8가지(원시 자료형)
        byte bnum;//1byte
        short snum;//2byte
        int inum;//4byte
        long lnum;//8byte

        /*실수를 취급하는 자료형*/
        float fnum;//4byte
        double dnum;//8byte

        /*문자를 취급하는 자료형*/
        char ch;//한글자 2byte

        /*논리값을 취급하는 자료형*/
        /*1byte 논리 데이터 형은 0과 1의 값으로 데이터를 취급=>1bit도 가능 but, 자바는 byte가 최소단위라*/
        boolean isTrue;

        String str;


        /*목차2. 변수에 값을 대입하기
        * 선언만 한 것은 공간만 만들어 놓은 것이다
        * 그 공간에 자료형 저장할 수 있다
        * 만약 약속 내용과 다른 값 넣으려고 하면 컴파일러 오류
        *
        * */
        //int test = "asd"

        /*정수를 취급하는 자료형에 값 대입*/
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;
        System.out.println(lnum);

        /*실수를 취급하는 자료형에 값 대입*/
        fnum = 4.0f;
//        fnum = 4.0;
        dnum = 4.0;

        /*문자를 취급하는 자료형에 값 대입*/
        ch = 'a';
        char ch2 = 97;//아스키 코드로 문자 넣기
        System.out.println(ch2);

        /*논리형을 취급하는 자료형에 값 대입*/
        isTrue = false;

        /*문자열을 취급하는 자료형에 값 대입*/
        str = "안녕하세요";

        /*숫자로 된 형태의 값을 그대로 사용하는 자료형은 byte, short, int, double 이다.
        * 정수는 int 실수는 double이 대표적인 자료형이다*/
        System.out.println("--------------변수 값 출력하기----------");
        System.out.println("bnum의 값 : " +bnum);
        System.out.println("snum의 값 : " +snum);
        System.out.println("inum의 값 : " +inum);
        System.out.println("lnum의 값 : " +lnum);

        System.out.println("fnum의 값 : " +fnum);
        System.out.println("dnum의 값 : " +dnum);


        System.out.println("isTrue의 값 : " +isTrue);
        System.out.println("str의 값 : " +str);

        int bonus = 100;
        int point = 10;

        System.out.println("포인트와 보너스의 합은 : "+ (bonus+ point));
        bonus+=100;
        System.out.println("bonus = bonus + 100 ? " + bonus);
    }
}
