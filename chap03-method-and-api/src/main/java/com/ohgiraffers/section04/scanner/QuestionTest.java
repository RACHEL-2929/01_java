package main.java.com.ohgiraffers.section04.scanner;

public class QuestionTest {
    public String Random01(int a) {
        return (a>0)? ((a%2==0)? "양수면서 짝수입니다":"양수면서 홀수입니다"):
                ((a%2==0)? "음수면서 짝수입니다":"음수면서 홀수입니다");

    }
}
