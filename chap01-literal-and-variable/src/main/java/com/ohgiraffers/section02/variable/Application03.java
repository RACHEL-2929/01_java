package main.java.com.ohgiraffers.section02.variable;

public class Application03 {
    public static void main(String[] args) {
        /*
        * 변수의 명명 규칙
        * 1. 컴파일 에러를 발생시키는 규칙
        *   1-1. 동일한 범위 내에서는 동일한 변수명을 가질 수 없음
        *   1-2. 예약어는 사용이 불가능
        *   1-3. 변수명은 대/소문자 구분한다.
        *   1-4. 변수명은 숫자로 시작할 수 없음
        *   1-5. 특수기호는 '_'와 '$' 만 가능
        * 2. 컴파일 에러는 no, but 개발자들끼리의 규칙
            * 2-1. 변수명 길이 적당히
            * 2-2. 변수명 합성어인 경우, 첫단어는 소문자, 두 번째 단어의 시작 대문자
            * 2-3. 단어와 단어 사이 연결 _로 하지 않는다
            * 2-4. 한글로 변수명 가능은 함 but, 권장하지 않음
            * 2-5. 변수에 저장된 값이 어떤 의미인지 명확하게 표현
            * 2-6. 전형적인 변수 이름이 있다면 가급적 사용
            * 2-7. 명사형으로 작성
            * 2-8. boolean형은 의문문으로, 가급적 긍정적으로 네이밍*/

        //1-2 동일한 범위 내에서 동일한 변수명 가질 수 없음
        int age = 20;
//        int age = 10;


        //1-3 예약어 사용 불가능
//        int true = 10;
//        int for = 20;

        //1-4 변수명 숫자로 시작 안됨
//        int 1test = 10;
        int te10st10 = 10;

        //1-5
        int _ag_e = 20;
        int $test$ = 20;

        //2-1
        int asdkjflskdjfdasdlkfj;

        //2-2
        //자바에서는 유일하게 클래스명만 대문자로 시작
        int MaxAge = 20;//무방하나 사용 no
        int maxAge = 20;//ok

        //2-3 _사용하지 않는다
        String user_name;//snake case
        String userName;//ok

        //2-4 한글 가능 벗 권장 노
        int 나이;

        //2-5
        String s;
        String name;

        //2-6 전형적인 변수 되도록이면 사용해라
        int sum;
        int max;
        int min;
        int count;

        //2-7 명사형작성
        String goHome;//no
        String home;//명사형

        //2-8 boolean 의문문, 가급적 긍정
        boolean isAlive = true;//ok
        boolean isDead = false;//no



    }

}
