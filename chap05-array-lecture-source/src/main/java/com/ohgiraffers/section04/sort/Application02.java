package main.java.com.ohgiraffers.section04.sort;

public class Application02 {
    public static void main(String[] args) {

        //순차 정렬
        int[] iarr = {2,5,4,6,1,3};
        //5를 2와 비교 {2,5,4,6,1,3}
        //4를 2와 5 비교 {2,5,4,6,1,3}=> {2,4,5,6,1,3}
        //6를 2와 4와 5 비교 {2,4,5,6,1,3}
        //1을 2와 4와 5와 6 비교 {2,4,5,6,1,3}=> {1,4,5,6,2,3}=> {1,2,5,6,4,3}=> {1,2,4,6,5,3}=> {1,2,4,5,6,3}
        //3을 1와 2와 4와 5와 6 비교 {1,2,4,5,6,3}=>{1,2,3,5,6,4}=>{1,2,3,4,6,5}=>{1,2,3,4,5,6}


        for (int i = 1; i < iarr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (iarr[i] < iarr[j]) {
                    int temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");

        }
    }
}
