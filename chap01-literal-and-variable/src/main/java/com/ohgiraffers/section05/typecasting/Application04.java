package main.java.com.ohgiraffers.section05.typecasting;

public class Application04 {
    public static void main(String[] args) {
        int inum = 298;//정수형 변환(큰거에서 작은거)
        byte bnum =(byte)inum;
        System.out.println(bnum);

        double height= 178.5;//실수형에서 정수형으로 변환(큰거에서 작은거)
        int floorHeight = (int)height;//소수점 버림
        System.out.println(height);
        System.out.println(floorHeight);
    }
}
