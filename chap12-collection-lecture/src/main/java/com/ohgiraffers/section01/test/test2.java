package main.java.com.ohgiraffers.section01.test;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    /*
    *
    * 문제 2: 숫자 리스트 관리
    ArrayList를 사용해 정수를 저장하는 프로그램을 작성하세요.
    정수를 추가하는 메서드를 구현하세요.
    특정 인덱스의 정수를 삭제하는 메서드를 구현하세요.
    리스트의 모든 정수의 합을 계산하는 메서드를 구현하세요.
    리스트의 최대값과 최소값을 찾는 메서드를 구현하세요.
    *
    * */


    private List<Integer> numbers;

    public test2() {
        numbers = new ArrayList();
    }

    public void addNum(int number){
        //List & Set은 add, Map은 put
        numbers.add(number);
    }

    public void remove(int i){
        //List는  remove,Set은 인덱스 x => clear(), Map은 remove
        numbers.remove(i);
    }

    public
}
