package main.java.com.ohgiraffers.section02.string;

public class Application02 {

    public static void main(String[] args) {

        /*
         * 문자열 객체를 만드는 방법
         * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
         * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
         *
         * */
        String str1 = "java";
        String str2 = "java";
        // 같은 값을 가지는 것은 같은 주소값을 가지도록 관리되고 있음
        String str3 = new String("java");
        String str4 = new String("java");
        // new 로 생성된 것은 새롭게 공간이 만들어짐


        System.out.println("str1 == str2 : " + (str1 == str2));//주소값이랑 같을 때 true
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));
        //값을 비교했을 때 맞는지 확인

        System.out.println("str1 : " + str1.hashCode());
        System.out.println("str2 : " + str2.hashCode());
        System.out.println("str3 : " + str3.hashCode());
        System.out.println("str4 : " + str4.hashCode());
        //필드값이 같으면 다 같은 해시값을 가지고 있다
        //모두 다 같은 주소값 가지고 있음

        str2 += "oracle";
        System.out.println("str1 == str2 : " + (str1 == str2));


        /*
        * equals() : String 클래스의 equals 메소드는 인스턴스 비교가 아닌 문자열값을 비교하여
        * 동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false 를 반환하도록
        * Object 의 equals() 메소드를 재정의 해 두었다.
        * 따라서 문자열 인스턴스 생성 방식은 상관 없이 동일한 문자열인지 비교하기 위해 == 대신
        * equals() 메소드를 사용해야 한다.
        * */
        System.out.println("str1.equals(str3) : " + str1.equals(str3));

    }

}
