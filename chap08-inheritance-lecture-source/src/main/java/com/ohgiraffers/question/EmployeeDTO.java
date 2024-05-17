package main.java.com.ohgiraffers.question;

public class EmployeeDTO extends PersonDTO {
    private int salary;
    private String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, String dept, int salary) {
        super(age, height, weight);
        super.setName(name);
        this.dept = dept;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String information() {
        return "employee{ name = " + super.getName() +
                ", age = " + super.getAge() +
                ", height = " + super.getHeight() +
                ", wieght = " + super.getWeight() +
                ", salary = " + getSalary() +
                ", dept = " + getDept() +
                "}";
    }

}
