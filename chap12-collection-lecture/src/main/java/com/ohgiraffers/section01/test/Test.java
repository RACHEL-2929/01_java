package main.java.com.ohgiraffers.section01.test;

import java.util.ArrayList;

public class Test {

    /*
    *
    * 문제 1: 학생 목록 관리
    ArrayList를 사용해 학생 이름을 저장하는 프로그램을 작성하세요.
    학생 이름을 추가하는 메서드를 구현하세요.
    학생 이름을 삭제하는 메서드를 구현하세요.
    전체 학생 목록을 출력하는 메서드를 구현하세요.
    *
    * */



    private ArrayList<String> students;

    public Test() {
        students = new ArrayList<>();
    }

    public void addStudent(String sName){
        students.add(sName);
    }
    public void removeStudent(String sName){
        students.remove(sName);
    }
    public void printStudent(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        /*for (String sName: students){
            System.out.println(sName);
        }*/
    }

    public static void main(String[] args) {

        Test test = new Test();
        test.addStudent("Bob");
        test.addStudent("App");
        test.addStudent("soul");
        test.printStudent();
        test.removeStudent("Bob");
        test.printStudent();
    }


}
