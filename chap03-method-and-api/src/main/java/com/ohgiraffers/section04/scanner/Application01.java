package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        /*
        * java.util.Scanner
        * 콘솔 화면에 값을 입력 받는 기능
        * */

        Scanner sc = new Scanner(System.in);
/*        System.out.println("이름을 입력 해주세요 : ");

        String name= sc.nextLine();//그 줄에 넣는 값은 다 들어감
        System.out.println("이름은 "+ name + " 입니다");

        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();
        System.out.println("나이는 " + age + "세 입니다");

        System.out.println("원하는 금액을 입력 해주세요 : ");
        long lnum = sc.nextLong();
        System.out.println("입력한 long 타입 금액 : " + lnum);


        System.out.println("원하는 실수를 입력하세요 : ");
        double number = sc.nextDouble();//int로 넣을 경우 자동으로 double로 나옴
        System.out.println("입력하신 실수는 "+ number + " 입니다");

 */
        System.out.println("참과 거짓 중에 한 가지를 true 아니면 false 로 입력 해주세요");
        boolean isTrue = sc.nextBoolean();
        System.out.println((isTrue)? "참":"거짓");


        sc.nextLine();//뭔가 출력됐을 때 나오는 엔터?가 있어서 그 엔터 값이 다음 명령의 입력 값으로 들어가게 되서 오류가 남
        //그래서 그걸 넘겨주면 정상적으로 입력이 가능하다
        //문자열 중에 한 문자를 빼는 것
        System.out.println("아무 문자나 입력 해주세요 : ");
        char charValue = sc.nextLine().charAt(0);
        System.out.println(charValue);

    }
}
