package main.java.com.ohgiraffers.section04.use1;

public class FireCar extends Car implements Soundable{
//인터페이스와 추상클래스 따로 구현해서 다중 상속이 가능하게 함
//추상클래스는 단일 상속밖에 되지 않기 때문에


    @Override
    public void go() {
        System.out.println("소방차가 달려갑니다.");

    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다.");

    }

    @Override
    public void horn() {
        System.out.println("소방차가 나갑니다. 비키세요");

    }
}
