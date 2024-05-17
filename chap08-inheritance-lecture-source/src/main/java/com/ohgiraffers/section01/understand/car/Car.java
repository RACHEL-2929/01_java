package main.java.com.ohgiraffers.section01.understand.car;

public class Car {

    //fianl 이어서 생성자를 통해서만 값을 넣을 수 있음
    private final String brand;
    private int price;
    private String name;

    public Car(String brand, int price, String name) {
        this.brand = brand;
        this.price = price;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


}
