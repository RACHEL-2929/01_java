package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args) {
        /*
         * Map 인터페이스의 특징
         * Collection 인터페이스와는 다른 저장 방식을 가진다.
         * 키와 값을 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         * 키(Key)란?
         * 값(value)을 찾기 위한 이름 역할을 하는 객체를 의미한다.
         * 1. 요소의 저장 순서를 유지하지 않는다.
         * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값을 저장 가능하다.
         *
         * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
         * HashMap 이 가장 많이 사용되며, HashTable 은 jdk 1.0 부터 제공되며
         * HashMap 과 동일하게 작동된다. 하위 호환을 위해 남겨 놓았기 때문에
         * 가급적이면 HashMap 을 사용하는 것이 좋다.
         *
         * */


        /*
         * HashMap
         * jdk 1.2 부터 제공되는 클래스로 해쉬 알고리즘을 사용하여 검색 속도가 매우 빠르다.
         *
         *
         * */
        //기본적인 HashMap 인스턴스 생성
        HashMap hmap = new HashMap();
        // Map hamp2 = new HashMap();

        //삽입
        hmap.put("one",new Date());
        hmap.put(12,"red apple");//오토박싱
        hmap.put(33,123);//오토박싱

        System.out.println(hmap);
        //{33=123, one=Thu May 23 09:41:42 KST 2024, 12=red apple}

        hmap.put(12,"yellow");
        System.out.println(hmap);
        //키가 같으면 값이 덮어씌워짐
        //{33=123, one=Thu May 23 09:42:41 KST 2024, 12=yellow}

        hmap.put(11,"yellow banana");
        hmap.put(9,"yellow banana");
        System.out.println(hmap);
        //값이 같아도 키가 다르면 넣어진다.
        //{33=123, one=Thu May 23 09:43:29 KST 2024, 9=yellow banana, 11=yellow banana, 12=yellow}

        System.out.println(hmap.get(9));
        //키값을 넣어주면 해당 값을 가져옴
        //yellow banana

        hmap.remove(9);
        System.out.println(hmap);
        //해당하는 키 값 삭제
        //{33=123, one=Thu May 23 09:45:35 KST 2024, 11=yellow banana, 12=yellow}

        System.out.println(hmap.size());
        //크기
        //4

        HashMap<String,String> hmap2 = new HashMap<>();
        //키와 값 둘다 문자열만 가능

        hmap2.put("one","java 8");
        hmap2.put("two","oracle");
        hmap2.put("three","jdbc");
        hmap2.put("four","html");
        hmap2.put("five","css3");
        // hmap2.put(23,"2"); 다른 자료형을 넣으면 오류가 난다



        //----------조회-----------

        //-----키------를 이용한 조회=> 키를 불러왔으니 get을 이용해 값도 불러올 수 있음.
        //iterator(Collection을 상속받은 객체들만 iterator를 쓸 수 있다=>collection,Set,List)
        //set 안에는 Iterator 자료형으로 바꿔주는 메소드가 있다.
        Iterator<String> keyIter = hmap2.keySet().iterator();
        /*
        * hmap2.keySet()
        * Set<String> keySet = map.keySet(); // hmap2를 keySet으로 Set에 넣는다.
        * Iterator<String> keyIterator = keySet.iterator(); // 그리고 Iterator를 사용한다.
        * 이 줄을 한 줄로 줄인 것이다.
        * */

        while (keyIter.hasNext()){
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key +" = " + value);
        }

        //-----값------을 이용한 조회
        //value 객체들만 values() 메소드로 Collection 으로 만듦.
        //키 값은 출력하지 못함
        Collection<String> values = hmap2.values();

        //Iterator()
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()){
            System.out.println(valueIter.next());
        }


        //----인덱스와 값 모두 불러올 수 있는 방법-----
        //배열로 처리
        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }


        //----키와 값 모두 불러올 수 있는 방법-----
        // Map 의 내부클래스인 EntrySet 이용
        Set<Map.Entry<String,String>> set = hmap2.entrySet();
        // Entry : 키 객체와 값 객체를 쌍으로 묶은 것
        Iterator<Map.Entry<String,String>> entryIterator = set.iterator();

        while (entryIterator.hasNext()){
            Map.Entry<String,String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }






    }
}
