package main.java.com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application04 {

    public static void main(String[] args) {
        /* 수업목표. time 패키지의 클래스들에 포매팅을 적용하여 출력할 수 있다. */
        String timeNow = "14:05:10";
        String dateNow = "2022-10-12";
        // 기본 양식은 이처럼 :이나 -로 구분지어서 시간과 날짜를 나타냄

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        // 문자열인 시간과 날짜를 parse를 사용하여 시간형과 날짜형으로 바꿔줌
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);
        // T로 뒤에가 시간인 것을 알려주기

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        String timeNow2 = "14-05-10";
        String dateNow2 = "221005";
        // 위와 같이 시간과 날짜를 기본형식처럼 작성하지 않은 사례

        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        LocalDate localDate2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));

        System.out.println(localTime2);
        System.out.println(localDate2);

        String dateFormat = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH mm"));

        System.out.println(dateFormat);
        System.out.println(timeFormat);
        // 내가 지정한 형식처럼 나오게 Formatter.ofPattern을 사용함

        /*
        * 1. Year
        * yyyy : 4자리 연도
        * yy : 2자리 연도
        *
        * 2. Month(대문자)
        * MM : 2자리 월
        * M : 1자리 월
        * MMMM : 전체 월 이름(April)
        * MMM : 축약된 월 이름(Apr)
        *
        *3. Day
        * dd : 2자리 일
        * d : 2자리 일
        *
        *
        *4. Hour
        * HH : 24시간제 2자리 시간(14)
        * H : 24시간제 1자리 시간(4)
        * hh : 12시간제 2자리 시간(02)
        * h : 12시간제 1자리 시간(2)
        *
        * 5. Minute
        * mm : 2자리 분
        * m : 2자리 분
        *
        * 6. Second
        * ss : 2자리 초
        * s : 1자리 초
        *
        *
        * 7. 나노초
        * nnnnnnnnn 나노초 전체(123456789)
        * nnnnnn 마이크로초(123456)
        * nnn 밀리초(123)
        *
        *
        * 8. 오전 오후
        * a 오전 오후 표시(AM,PM)
        * */


    }

}
