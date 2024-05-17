# 객체 배열 실습 문제

---

제품 관리 프로그램으로 제품들을 추가하고 조회하는 프로그램이다. <br>
해당 구현 클래스 다이어그램과 클래스 구조를 참고하여 프로젝트를 완성하시오.<br>

---

### ProductDTO
    - pId : int // 제품 번호
    - pName : String // 제품명
    - price : int // 제품 가격
    - tax : double // 제품 세금
    + ProductDTO()
    + ProductDTO(pId:int, pName:String, price:int, tax:double)
    + information() : String

+ ProductDTO의 기본 생성자 및 매개변수 생성자로<br>
Product 객체 생성시 마다 ProductController의 객체 수 <br>
카운트를 1 증가

---

### ProductController
    - pro : ProductDTO[] // = null
    + count : int // 현재 추가된 객체 수
    ~ sc : Scanner
    + mainMenu() : void
    + productInput() : void
    + productPrint() : void

+ mainMenu(): do~while 문을 이용하여 반복적으로 메뉴화면 출력<br>
각 버튼 선택 시 각각의 메소드 호출<br>
+ productInput(): 새로운 제품 정보 기록을 위해<br>
키보드로 정보들을 입력 받아 객체를 생성하고<br>
현재 카운트 인덱스에 주소 저장<br>
+ productPrint() : 현재까지 기록된 도서 정보 모두 출력

---

### Application
    + main(args:String[]) : void
+ ProductController의 mainMenu를 실행




