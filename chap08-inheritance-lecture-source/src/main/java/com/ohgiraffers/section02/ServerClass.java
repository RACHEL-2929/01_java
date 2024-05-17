package main.java.com.ohgiraffers.section02;

public class ServerClass extends SuperClass {


    //이름 바꾸기 안됨
    /*@Override
    public void method2(int num){}
    */

    //자료형 바꾸면 안됨
/*    @Override
    public int method(int num){}


    //매개변수 개수 다르면 안됨
    @Override
    public void method(int num, int num2){}*/


    @Override
    public void method(int num){
        super.method(num);
    }

    //private 이라서 안됨
/*    @Override
    public void privateMethod(){}*/


    //final 이라서 안됨
/*    @Override
    public final void finalMethod(){}*/

    @Override
    public void protectedMethod(){}



}
