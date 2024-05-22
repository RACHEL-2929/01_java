package main.java.com.ohgiraffers.section01.generic;

public class GenericTest<T> {
    // 다이아몬드 연산자 안에 있는 T는 관례상 적음

    private T value;

    // 위에 적은 변수와 같은 것을 적어줘야 한다.
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


}
