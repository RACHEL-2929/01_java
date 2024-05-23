package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Application {
    // TreeSet 사용=>오름차순 출력,중복저장 x,
    /*
     * 1. 사용자에게 부여되는 로또 번호 6자리 만들어서 저장하기
     * => 반복문 10번 사용해서 TreeSet 인스턴스 생성 후에 add로 6개 넣기
     * 2. 무작위 번호 랜덤함수 이용해서 6개 받기(1~45까지)
     *
     * 3. 비교하기
     * 새로 난수 6자리 받기, 사용자의 Treeset 이랑 비교하기
     * */

    // 로또 티켓의 최대 구매 수
    private static final int MAX_PURCHASES = 10;

    private static List<Set<Integer>> users = new ArrayList<>();

    // 로또 번호의 갯수
    private static final int NUMBERS_COUNT = 6;


    // 로또 번호의 최대 값
    private static final int MAX_NUMBER = 45;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = 10;
        while (cnt > 0) {
            // 몇장 살건지 입력받아서
            System.out.println("몇 장을 구매하실까요???");
            System.out.println("현재 구매 가능한 매수 : " + cnt);
            int num = sc.nextInt();

            if ((cnt - num) < 0 || num >= MAX_PURCHASES) {
                System.out.println("구매 가능한 매수를 초과하였습니다.");
            } else {
                for (int i = 0; i < num; i++) {
                    Set<Integer> user = createLotto();
                    users.add(user);
                }
                cnt -= num;
            }


        }
        // 비교하기
        System.out.print("당첨 번호 : ");
        Set<Integer> lotto = createLotto();

        // 당첨자 여부 확인 users 의 Set 과 lotto 비교
        boolean win = false;
        for (int i = 0; i < users.size(); i++) {
            //equals로 비교 가능
            if(users.get(i).equals(lotto)){
                System.out.println((i+1) + " 번 로또 당첨 " + users.get(i));
                win = true;
            }
        }
        if (!win){
            System.out.println("이번 회차 당첨 없음");
        }
        
        

    }

    // 살 수 있는 만큼 userSet 객체 생성 후 Map에  넣기
    public static Set<Integer> createLotto() {

        Set<Integer> userSet = new TreeSet<>();
        while (userSet.size() < NUMBERS_COUNT) {
            userSet.add((int) (Math.random() * MAX_NUMBER) + 1);
        }
        System.out.println(userSet);
        return userSet;

    }


}


