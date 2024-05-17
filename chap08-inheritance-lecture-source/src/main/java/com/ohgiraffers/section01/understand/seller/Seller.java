package main.java.com.ohgiraffers.section01.understand.seller;

import main.java.com.ohgiraffers.section01.understand.car.Car;
import main.java.com.ohgiraffers.section01.understand.car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;

public class Seller {
    // 영업사원 이름
    private String name;
    // 영업사원 판매 수당
    private double result;

    public Seller(String name) {
        this.name = name;
    }


    public void sale(Car[] cars) {
        for (Car car : cars) {
            if (car instanceof ElectricCar) {
                // 강제로 형변환 부모에게 있는 것을 자식에게 넣어줄 때는
                ElectricCar electricCar = (ElectricCar) car;
                System.out.println(electricCar.getBrand() + "사의 " + electricCar.getName() + "를 판매하였습니다");
                result += electricCar.getPrice();
            } else {
                OldCar oldCar = (OldCar) car;
                System.out.println(oldCar.getBrand() + "사의 " + oldCar.getName() + "를 판매하였습니다");
                result += oldCar.getPrice();
            }
        }
    }

    @Override
    public String toString() {
        return name + " 사원의 총 수수료는 " + result + "원 입니다";
    }
}
