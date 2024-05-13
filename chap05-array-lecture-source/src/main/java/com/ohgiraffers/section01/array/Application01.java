package main.java.com.ohgiraffers.section01.array;

public class Application01 {
    public static void main(String[] args) {
        /*
        배열이란?
        동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위함)이다.
        배열은 heap 영역에 new 연산자를 이용하여 할당한다

        배열의 사용 이유
        1. 만약 배열을 사용하지 않는다면 여러 개의 변수를 사용해야 한다
        2. 만약 배열을 사용하지 않는다면 반복문을 이용한 연속 처리가 불가능하다
         */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;
        sum = num1 + num2 + num3 + num4 + num5;
        System.out.println(sum);

        int[] arr = new int[5];
        // 배열은 공간마다 찾아갈 수 있는 인덱스를 이용해 접근할 수 있다

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println("array = " + sum2);
    }
}
