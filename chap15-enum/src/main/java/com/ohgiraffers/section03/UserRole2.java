package main.java.com.ohgiraffers.section03;

public enum UserRole2 {

    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");
    // 생성자로 매개변수를 만들어줬다면 해당 상수들은 모두 같은 형태를 지녀야 한다.

    private final String description;


    UserRole2(String description) {
        this.description = description;
    }

    /*public String getDescription(){
        return this.description;
    }*/

    public String getDescription() {
        return description;
    }
}
