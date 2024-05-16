package main.java.com.ohgiraffers.section02.uses;

public class MemberService {//application 의 명령을 실행할 곳
    int i = 1;
    public void signUpMembers() {
        Member[] members = new Member[5];


        members[0] = new Member(i++,"user01","pass01","홍길동",20,'남');
        members[1] = new Member(i++,"user02","pass02","유관순",16,'여');
        members[2] = new Member(i++,"user03","pass03","이순신",40,'남');
        members[3] = new Member(i++,"user04","pass04","신사임당",36,'여');
        members[4] = new Member(i++,"user05","pass05","윤봉길",22,'남');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);

    }

    public void showAllMembers() {
        MemberFinder finder = new MemberFinder();

        System.out.println("------가입된 회원 목록------");
        for(Member member:finder.findAllMembers()){
            //객체배열을 반환해옴으로써 배열 출력 가능
            if(member != null){
                System.out.println(member.getInfo());
            }
        }
        System.out.println("-------회원 조회 완료-----");
    }


}
