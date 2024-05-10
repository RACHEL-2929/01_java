package main.java.com.ohgiraffers.section01.method;

public class Application09 {
    public static void main(String[] args) {
        /*다른 클래스에 작성한 메소드 호출*/
        //static 으로 선언한 메소드와 아닌 메소드 호출 방식

        //최솟값, 최대값을 비교할 두 정수 선언
        int first = 100;
        int second = 50;

        //non-static 메소드의 경우
        Calculator calc = new Calculator();//클래스 전체가 RAM에 올라감
        int min = calc.minNumberOf(first,second);
        System.out.println(min);


        //static 메소드의 경우
        int max = Calculator.maxNumberOf(first,second);
        System.out.println(max);

        //int max2 = calc.maxNumberOf(first,second); 가능은 하지만 권장 x
        //bcz static 은 프로그램이 실행될때 RAM 영역에 올라가있어서 따로 클래스 전체를 올릴 필요가 없기 때문에
        //공간을 효율적으로 사용하기 위해 클래스명.메소드명을 사용하는 게 올바르다.
        //System.out.println(max2);
    }
}
