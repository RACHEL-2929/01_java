package main.java.com.ohgiraffers.section05.parameter;

public class RectAngle {

    private double width;
    private double height;

    public RectAngle() {
    }

    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calcArea(){
        double area = width*height;
        System.out.println("사각형의 넓이는 : " + area);
    }

    public void calcRound(){
        double area = (width+height) * 2;
        System.out.println("사각형의 둘레는 " + area + "입니다.");
    }

    // Object 클래스에 있는 toString 을 활용한 것으로 원래는 주소값이 나오는 것을 재정의해서 내가 원하는 문자열을 돌려받기
    // main 에서 사용할 때는 인스턴스 이름만 적으면 자동으로 .toString 이 적혀져서 아래 구문이 실행됨
    @Override  // 부모가 가진 기능을 자손이 재정의 해서 사용할 수 있다.
    public String toString() {
        return "RectAngle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }


}
