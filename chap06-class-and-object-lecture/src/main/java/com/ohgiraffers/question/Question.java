package main.java.com.ohgiraffers.question;

public class Question {

    public static void main(String[] args) {

        //기본 생성자 호출 및 정보 출력
        BookDTO bookDTO = new BookDTO();
        System.out.println(bookDTO.getInfomation());


        //필드 3개 초기화 및 정보 출력
        BookDTO bookDTO1 = new BookDTO("표지판","공포","나");
        System.out.println(bookDTO1.getInfomation());

        //모든 필드 초기화 및 정보 출력
        BookDTO bookDTO2 = new BookDTO("표지판2","공포","나",20000,0.05);
        System.out.println(bookDTO2.getInfomation());
    }
}
