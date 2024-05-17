package main.java.com.ohgiraffers.question;

public class StudentDTO extends PersonDTO{
    private int grade;
    private String major;

    public StudentDTO() {
    }

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.setName(name);
        this.grade = grade;
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String information() {
        return "Student{ name = " + super.getName() +
                ", age = " + super.getAge() +
                ", height = " + super.getHeight() +
                ", wieght = " + super.getWeight() +
                ", grade = " + getGrade()+
                ", major = " + getMajor() +
                "}";
    }
}
