package main.java.com.ohgiraffers.section06.temary.test;

public class test {
    public static void main(String[] args) {
        int stdgde1 = 90;
        int stdgde2 = 95;
        int stdgde3 = 81;
        int stdgde4 = 88;

        String result1 = (stdgde1>=90 && stdgde1<=100)? "합격":"불합격";
        String result2 = (stdgde2>=90 && stdgde2<=100)? "합격":"불합격";
        String result3 = (stdgde3>=90 && stdgde3<=100)? "합격":"불합격";
        String result4 = (stdgde4>=90 && stdgde4<=100)? "합격":"불합격";

        System.out.println("학생1 = " + result1);
        System.out.println("학생2 = " + result2);
        System.out.println("학생3 = " + result3);
        System.out.println("학생4 = " + result4);
    }
}
