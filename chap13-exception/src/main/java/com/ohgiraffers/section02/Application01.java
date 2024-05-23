package main.java.com.ohgiraffers.section02;

public class Application01 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try{
            //price가 음수
            //money가 음수
            //money가 충분하지 않을 때
            et.checkEnoughMoney(30000,50000);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
