package 회원정보종합예제;

import java.util.Scanner;

// 이름, 나이, 성별, 직업 입력 받아서 출력 하기
// This is NOT a main class; do not type main
public class MemberInfo   { // 클래스 내에는 필드와 메소드가 있음
    // 필드 추가하기 : 필드란? 클래스 내부에서 사용하는 변수를 의미 (객체 생성 시 객체 갯수 만큼 생성 됨)
    String name;
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    // 키보드로 입력된 값을 name 필드에 저자
    public void setName() {
        System.out.print("이름을 입력 하세요 : ");
        name = sc.next(); // thisname이 숨겨져있음; 'name' is already available in the field area,so it's usable here
    }
    // 주어진 조건에 맞는 나이를 입력 받아서 age 필드에 저장
    public void setAge() {
        while(true) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if(age > 0 && age < 200) return; // return문(메소드 전체에 영향을 줌=public void setAge())은 break문(반복문에 대한 블럭 벗어나기)보다 넓은 영역
            System.out.println("나이를 잘못 입력 하셨습니다. ");
        }
    }
    // 주어진 조건에 맞는 성별을 입력 받아서 gender에 저장
    public void setGender() {
        while(true) {
            System.out.print("성별을 입력 하세요(M/F) : ");
            gender = sc.next().charAt(0); // 문자열에서 첫번째 문자를 입력 받음
            switch(gender) {
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    return;
                default :
                    System.out.println("성별을 잘 못 입력 하였습니다.");
            }
        } // escape condition here is 'return;'
    }  // 반복문 제어 2: break(반복문탈출) continue(반복문조건으로 돌아감???)

    // 주어진 조건에 맞는 직업을 입력 받아서 jobs필드에 저장
    public void setJobs() {
        while (true) {
            System.out.println("직업을 입력 하세요(1.학생, 2.회사원, 3.주부, 4.무직)  : ");
            jobs = sc.nextInt();
            if(jobs > 0 & jobs < 5) return; // 정상적인 입력이니까 return
            System.out.println("직업을 잘 못 입력 하셨습니다.");

        }
    }

    public int getGenderType() {
        if(gender == 'M' || gender =='m') return 1;
        else return 2;
    }

    public void viewInfo() {
        String[] genderStr = {"", "남성", "여성"};
        String[] jobsStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("======= 회원 정보 출력 =======");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        // 정수값은 이ㅜ치적인 의미를 가질 수 있음 ex)1=첫번째. 근데 직업은 index로 사용불가.
        // 그래서 getGenderType이라는걸 새로 만들어서 그 그 자리엔 return에 대한 결과값이 돌아올 수 있게
        System.out.println("직업 : " + jobsStr[jobs]); // jobsStr이란 배열을 만듬; 첫번째 0번은 "" 빈칸으로 코드를 버림. -1 해도 됨


    }



}
