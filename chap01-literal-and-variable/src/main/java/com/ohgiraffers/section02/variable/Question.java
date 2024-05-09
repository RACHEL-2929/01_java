package main.java.com.ohgiraffers.section02.variable;

public class Question {
    public static void main(String[] args) {
        int salary = 100;
        double bonus = salary*0.5;
        double sum = bonus+salary;
        System.out.println("김대리의 월급은 "+salary +"만원 보너스 " +bonus+ "만원으로 총 "+ sum+"만원 입금되었습니다");

        salary = 120;
        bonus = salary*0.5;
        sum = bonus+salary;
        System.out.println("김과장의 월급은 "+salary +"만원 보너스 " +bonus+ "만원으로 총 "+ sum+"만원 입금되었습니다");


        salary = 130;
        bonus = salary*0.5;
        sum = bonus+salary;
        System.out.println("김차장의 월급은 "+salary +"만원 보너스 " +bonus+ "만원으로 총 "+ sum+"만원 입금되었습니다");


        salary = 150;
        bonus = salary*0.5;
        sum = bonus+salary;
        System.out.println("김부장의 월급은 "+salary +"만원 보너스 " +bonus+ "만원으로 총 "+ sum+"만원 입금되었습니다");
    }
}
