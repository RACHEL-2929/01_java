package main.java.com.ohgiraffers.section01.list.run;

import java.util.ArrayList;

public class Test {
    private ArrayList<String> students;

    public Test() {
        students = new ArrayList<>();
    }

    public void AddStudent(String sName){
        students.add(sName);
    }
    public void RemoveStudent(String sName){
        students.remove(sName);
    }
    public void PrintStudent(ArrayList<String> students){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        /*for (String sName: students){
            System.out.println(sName);
        }*/
    }


}
