package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        StudentDTO[] studentDTOS = new StudentDTO[3];
        studentDTOS[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        studentDTOS[1] = new StudentDTO("홍길동", 21, 187.3, 80.0, 2, "경영학과");
        studentDTOS[2] = new StudentDTO("홍길동", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (StudentDTO studentDTO : studentDTOS) {
            System.out.println(studentDTO.information());
        }


        Scanner sc = new Scanner(System.in);
        EmployeeDTO[] employeeDTOs = new EmployeeDTO[10];
        int i = 0;

        while (true) {
            System.out.println("사원들의 정보를 적어주세요");
            System.out.println("이름 : ");
            String name = sc.nextLine();
            System.out.println("나이 : ");
            int age = sc.nextInt();
            System.out.println("신장 : ");
            double height = sc.nextDouble();
            System.out.println("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.println("급여 : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.println("부서 : ");
            String dept = sc.nextLine();


            employeeDTOs[i++] = new EmployeeDTO(name, age, height, weight, dept, salary);
            System.out.println("계속 추가할 것인가요? Y or y로 대답해주세요 : ");
            char yes = sc.next().charAt(0);
            if (yes == 'y' || yes == 'Y') {
                sc.nextLine();
            } else {
                break;
            }


        }
        for (int j = 0; j < i; j++) {
            System.out.println(employeeDTOs[j].information());
        }

    }
}
