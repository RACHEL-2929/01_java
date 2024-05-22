package main.java.com.ohgiraffers.section01;

public class RabbitFarm<T extends Rabbit> {
    //Rabbit 의 자손들만 들어오게 제한함
    //!!제네릭스에서는 인터페이스를 상속받아도 extends를 써줘야한다!!
    //여러 개 상속받으려면 & 연산자를 사용해서 다양한 클래스를 상속받을 수 있다.


    private T animal;

    public RabbitFarm(){

    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
