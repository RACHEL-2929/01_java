package main.java.com.ohgiraffers.section01;

public class WildCardFarm {

    public void anyType(RabbitFarm<?> farm){
        //RabbitFarm에 들어오는 어떤 타입도 사용 가능하다.=> extends Rabbit
        farm.getAnimal().cry();
    }


    public void extendsType(RabbitFarm<? extends Bunny> farm){
        //RabbitFarm에 들어오는 타입 중에 Bunny 자신이나 그 후손일 때만 가능한 메소드
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm){
        //RabbitFarm에 들어오는 타입 중에 Bunny 자신이나 그 부모일 때만 가능한 메소드
        farm.getAnimal().cry();
    }







}
