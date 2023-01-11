package 메소드연습;

import java.util.Scanner;

// 메소드 이름 규칙 : 변수 만드는 규칙과 동일 (대/소문자, _, $, 숫자 사용 가능 (숫자가 맨 앞에 오면 안됨))
// camel 표기법 사용
// 접근제한자 반환타입 메소드이름(매개변수목록) { 구현부; return }
public class ClassMethod {
    public static void main(String[] args) {
        Sample sample = new Sample(); // 클래스 내에 생성자가 없으면 기본 생성자가 호출 됨
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값 입력 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rst = sample.sum(n1, n2) ; // sum()은 매개변수와 반환값이 있는 메소드. 두개의 값을 받아서 한개의 결과값을 줘ㄸ ㅏ
        System.out.println(rst);
        // System.out.println(sample.say());  // println에서 찍어주려면 반환값이 있어야 함 그래서 안됨
        sample.say(); // 결과 찍은 시점이 메소드
        // say() 메소드를 호출하기 위해서는 클래스를 객체로 만들고 객체의 메소드로 접근
        System.out.println(sample.sayStr());

        int rst2 = sample.sum(1,2,3,4,5);// 오버로딩 문법 sum이라는 method가 두개 있다는 뜻
        System.out.println(rst2);

    }
}
