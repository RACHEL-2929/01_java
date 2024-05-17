package main.java.com.ohgiraffers.question2;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro = new ProductDTO[10];
    public static int count;
    Scanner sc= new Scanner(System.in);

    public void mainMenu(){
        do{
            System.out.println("=====제픔관리메뉴=====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            int  no = sc.nextInt();
            if(no==1){
                productInput();
            } else if (no==2) {
                productPrint();
            } else if (no ==9) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }while(count!=10);
    }



    public void productInput() {
        System.out.println("도서아이디를 넣어주세요: ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.println("도서 이름을 넣어주세요: ");
        String pName = sc.nextLine();
        System.out.println("도서 가격을 넣어주세요: ");
        int price = sc.nextInt();
        System.out.println("도서 세금 넣어주세요: ");
        double tax = sc.nextDouble();


        pro[count] = new ProductDTO(pId,pName,price,tax);


    }


    public void productPrint() {
        for (int i = 0; i<count; i++){
            System.out.println(pro[i].information());
        }


    }
}
