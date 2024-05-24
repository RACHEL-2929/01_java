package main.java.com.ohgiraffers.section03;

public enum  UserRole1 {
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;
    //this.name 은 위의 상수를 뜻함


    UserRole1() {
    }

    public String getNameToLowerCase(){
        return this.name().toLowerCase();
    }
}
