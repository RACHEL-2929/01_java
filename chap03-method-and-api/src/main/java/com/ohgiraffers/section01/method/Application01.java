package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args) {


        /*
         * 메소드란?
         * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이다
         * 메소드는 스코프 안에서 만들어야 한다.
         * */

        System.out.println("main() 메소드 시작됨!");

        Application01 app = new Application01();
        //Application01은 하나의 자료형이다. 변수 app 에 자기 자신을 복제해서 넣어서 사용할 수 있게 함
        //static 있는 메소드에서 static 없는 메소드를 호출할 때 쓰는 규칙이다.
        app.methodA();


        System.out.println("main() 메소드 종료됨!");

    }

    public void methodA() {
        System.out.println("methodA() 호출...");
        methodB();
        //static 없는 메소드를 호출할 때는 그냥 메소드명만 적어서 호출함
        System.out.println("methodA() 종료...");
    }

    public void methodB() {
        System.out.println("methodB() 호출...");
        System.out.println("methodB() 종료...");
    }


}
