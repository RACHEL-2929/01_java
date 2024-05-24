package main.java.com.ohgiraffers.section03;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());


        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println(consumer.ordinal() + " " + consumer.name() + " " + consumer.getDescription());
        // ordinal() 해당하는 순서 1번부터 나타내줌
        // name() 상수값
        // getDescription() 저장했던 필드값 가져오기


        UserRole2 consumer2 = UserRole2.CONSUMER;

        if (consumer2 == consumer) {
            System.out.println("동일 비교");
        }

        // EnumSet 을 활용하여 여러 열거형 타입들을 set 으로 취급할 수 있다.
        // EnumSet.allOf(UserRole2.class);=> allOf를 사용해서 모든 상수값 넣을 수 있음
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().name());
        }

        // 특정 상수만 골라서 set 에 추가할 수 있다.
        //of를 사용해서 특정 상수만 골라오기
        System.out.println("=======================");
        EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
        Iterator<UserRole2> userIter = users.iterator();
        while (userIter.hasNext()) {
            UserRole2 role = userIter.next();
            System.out.println(role.ordinal() + " " + role.getDescription());
        }

        // 특정 상수를 제외하여 set 에 추가할 수 있다.
        //complementOf() 를 사용하여 제외할 상수를 EnumSet 으로 만든 후 사용해야 한다.
        EnumSet<UserRole2> notGuest = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST));
        Iterator<UserRole2> notGuestIter = notGuest.iterator();
        while (notGuestIter.hasNext()) {
            UserRole2 role = notGuestIter.next();
            System.out.println(role.ordinal() + " " + role.getDescription());
        }

    }
}
