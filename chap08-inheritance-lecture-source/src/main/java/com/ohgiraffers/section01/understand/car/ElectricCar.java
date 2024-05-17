package main.java.com.ohgiraffers.section01.understand.car;

public class ElectricCar extends Car{

    private String energy;


    //자동으로 포함이 되서 나옴
    public ElectricCar(String brand, int price, String name, String energy) {
        super(brand, price, name);
        this.energy = energy;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    @Override
    public double getPrice() {//영업이익 계산하기
        //자기 자신을 넣게 되면 무한루프로 안 끝나기 때문에 부모에서 가져옴
        System.out.println("전기차의 판매가는 " + super.getPrice() + "원 입니다.");
        return super.getPrice() * 0.15;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "carName = " + super.getName() +
                "energy='" + energy + '\'' +
                '}';
    }
}
