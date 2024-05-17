package main.java.com.ohgiraffers.question;

public class LoginRepository {
    //- 회원 가입 처리, 로그인 처리

    private final static User[] users;

    static {
        users = new User[10];
    }

    private static int cnt;

    //저장해주고 10개 이상이면 안됨
    public boolean registUser(User user) {
        if (cnt != 10) {
            System.out.println(user.getInfo() + "회원 가입 시도 중");
            users[cnt++] = user;
            return true;
        } else {
            System.out.println("정원이 초과되었습니다");
            return false;
        }

    }

    public boolean checkUsers() {
        if (users[0] == null) return true;
        else return false;
    }

    public boolean loginUser(User user) {
        for (int i = 0; i < cnt; i++) {
            if (((users[i].getId()).equals(user.getId()))
                    && ((users[i].getPwd()).equals(user.getPwd()))) return true;
        }
        return false;
    }


    public void finder() {
        for (int i = 0; i < cnt; i++) {
            System.out.println(users[i].getId() + " " + users[i].getPwd() + " " + users[i].getName());
        }
    }


}
