package main.java.com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car() {
        System.out.println("car 클래스의 기본 생성자 호출");
    }

    //달리는 기능
    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    //주행상태 반환 기능
    public boolean isRunning() {
        return runningStatus;
    }

    //주행중일 때 경적 울리는 기능
    public void soundHorn() {
        if(isRunning()){
            System.out.println("빵빵~~!!");
        }else{
            System.out.println("주행 중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }

    //멈추는 기능
    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
