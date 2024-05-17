package main.java.com.ohgiraffers.section01.extend;


//다중 상속은 안됨
public class FireCar extends Car{
    public FireCar() {
        super();//부모의 기본 생성자를 호출하는 기능
    }

    @Override
    public void soundHorn() {
        if(isRunning()){
            System.out.println("빠앙 빠아아아아아앙~~~~");
        }else{
            System.out.println("소방차가 주행중이 아닙니다.");
        }
    }

    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다!");
    }
}
