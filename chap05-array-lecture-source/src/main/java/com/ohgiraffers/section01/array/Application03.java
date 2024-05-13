package main.java.com.ohgiraffers.section01.array;

public class Application03 {
    public static void main(String[] args) {
        //각 자료형에 따라 기본값으로 초기화 되어있다
        //배열이 초기화되는 기본값을 자료형별로 이해할 수 있다.

        /*
        값의 형태 별 기본값
        정수 : 0
        실수 : 0.0
        논리 : false
        문자 : \u0000

         */

        int[] iarr = new int[5];
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[" + i + "] = " + iarr[i]);
        }//초기화 된 값으로 모든 값이 0으로 초기화 되어있는 걸 알 수 있다.

        // 기본값 외의 값으로 초기화를 하고 싶은 경우 블럭을 이용한다
        // 블럭을 사용하는 경우에는 new 연산자를 사용하지 않아도 되며, 값의 갯수만큼 자동으로 크기가 설정된다
        int[] iarr2 = {11,22,33,44,55};
        int[] iarr3 = new int[]{11,22,33,44,55};
        //둘 다 상관 없음

        System.out.println("iarr2 = " + iarr2.hashCode());
        System.out.println("iarr3 = " + iarr3.hashCode());

        System.out.println("iarr2 = " + iarr2.length);
        System.out.println("iarr3 = " + iarr3.length);

        String[] sarr = {"apple","banana","grape","orange"};
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" +i+ "]의 값 : " +sarr[i]);

        }


    }
}
