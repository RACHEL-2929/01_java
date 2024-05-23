package main.java.com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Set 인터페이스를 구현한 Set 컬렉션 클래스
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허용하지 않는다.
        *           (null 값도 중복하지 않게 하나만 저장함)
        * */

        /*
        * HashSet
        * set 컬렉션에서 가장 많이 사용되는 클래스 중 하나이다.
        * jdk 1.2 부터 제공하고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
        * */

        // 인스턴스 생성
        HashSet<String> hset = new HashSet<>();

        hset.add(new String("java"));
        hset.add(new String("jdbc"));
        hset.add(new String("oracle"));
        hset.add(new String("css"));
        // hset.add("css"); 이렇게 써도 됨

        hset.add("java");// 중복 안됨

        System.out.println(hset);
        System.out.println(hset.size());
        System.out.println(hset.contains("java"));// 객체로 만들어서 넣었어도 java 라는 값이 같으니까 같다고 판단


        Object[] arr = hset.toArray();//Array 로 바꾸기
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " : " + arr[i]);
        }



        Iterator<String> iter = hset.iterator();//반복자 사용하기

        while (iter.hasNext()){
            System.out.println(iter.next());
        }





    }
}
