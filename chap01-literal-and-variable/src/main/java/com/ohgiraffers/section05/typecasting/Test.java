package main.java.com.ohgiraffers.section05.typecasting;

import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        double student1 = 178.5;
        double student2 = 170.3;
        double student3 = 190.7;
        double student4 = 188.67;
        double student5 = 160.8;
        int avg = (int)((student1+student2+student3+student4+student5)/5);

        System.out.println("1반 학생 5명의 평균 키는 "+avg+ "cm이다");

    }
}
