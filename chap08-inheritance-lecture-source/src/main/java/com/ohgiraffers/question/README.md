# question01

---

학생과 직원을 관리하는 프로그램으로 상속 구조를 통해 구현해보시오. <Br>
해당 구현 클래스 다이어그램과 클래스 구조를 참고하여 프로젝트를 완성하시오.<br>

---

### Application
    + main(args:String[]) : void
1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고<br>
아래의 사용데이터를 참고하여 3명의 학생 객체 생성 후 반복문을 통해 출력<br>
2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고<br>
반복문을 사용하여 키보드로 사원 정보를 입력 받도록 구현<br>
2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고<br>
현재까지 기록된 사원들의 정보 출력

---

### PersonDTO
    # name : String
    - age : int
    - height : double
    - weight : double
    + PersonDTO()
    + PersonDTO(age:int, height:double,weight:double)
    + information() : String

---

### StudentDTO
PersonDTO 상속받기<br>

    - grade : int // 학년
    - major : String // 전공
     + StudentDTO()
    + StudentDTO(name:String, age:int,height:double, weight:double, grade:int,major:String)
    + information() : String

매개변수 생성자<br>
name 값은 부모 필드 값에 직접 접근해서 초기화<br>
age, height, weight는 부모 생성자를 통해 초기화

---

### EmployeeDTO
PersonDTO 상속받기<br>

    - salary : int // 급여
    - dept : String // 부서
    + EmployeeDTO()
    + EmployeeDTO(name:String, age:int, height:double, weight:double, salary:int, dept:String)
    + information() : String

매개변수 생성자<br>
name 값은 부모 필드 값에 직접 접근해서 초기화<br>
age, height, weight는 부모 생성자를 통해 초기화<br>
