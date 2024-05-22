package main.java.com.ohgiraffers.section01.list.comparator;

import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result = 0;

        //양수일 때로 정렬 기준 재정의해줌
        if (o1.getPrice() > o2.getPrice()){
            result = 1;//-1로 바꾸고
        }else if(o1.getPrice() < o2.getPrice()){
            result = -1;//1로 바꾸면 내림차순으로 바뀜
        }else {
            result = 0;
        }
        return result;
    }
}
