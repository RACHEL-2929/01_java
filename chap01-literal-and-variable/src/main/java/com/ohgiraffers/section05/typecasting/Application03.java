package main.java.com.ohgiraffers.section05.typecasting;

public class Application03 {
    public static void main(String[] args) {
        /*자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산 처리한다.*/

        int inum = 10;
        long lnum = 10L;

        int isum = inum +(int)lnum;//lnum은 int보다 크므로 강제로 형변환해서 int끼리 더했음
        isum = (int)(inum + lnum);//이렇게 쓸 수도 있음

        byte bnum = 1;
        short snum = 2;
        short sum2 = 3;
        short sum3 = 4;

        //큰 부분은 강제 작은 부분은 자동
        int result1 = bnum+snum;//바이트와 쇼츠는 int보다 작으므로 가능
        int result2 = sum2+bnum;//바이트와 쇼츠는 int보다 작으므로 가능
        int result3 = bnum+result2;//byte int 더하면 int보다 크지 않으니까 가능

    }
}
