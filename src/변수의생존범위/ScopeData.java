package 변수의생존범위;

import java.util.Scanner; // 스캐너를 쓰려면 이 메소드를 데려와서 써야함
// 외부에서 받을때는 제일 기본적인게 scanner(얘는 utility)
// import 안쓰려면 java.util.Scanner sc = new Scanner (System.in); 로 직접 써주기
public class ScopeData {
    public static void main(String[] args) {
       final double taxRate = 0.10;
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 수입을 입력 하세요 : ");
        int income = sc.nextInt();
        System.out.println("당신이 내야할 세금은 " + income * taxRate);
    }
}










/*
// 변수의 생존범위는 중괄호를 블럭을 따라간다
int value = 20; // 지역 변수 - 생성과 소멸이 자동으로 일어남
        if(value > 10) {
            int m = 30;
            m = m + (value - 10);
        }
        int m = 10;
        System.out.println(m);
 */

/*
// 상수란? 변수와 마찬가지로 데이터를 저장할 수 있는 메모리공간을 의미
// 변수와 다른 점은 프로그램이 실행되는 동안 값이 변경이 안됨 (한번만 넣을 수 있음)
// 자바에서 상수는 final키워드로 정의하고 단, 한번만 값을 설정할 수 있다 (설정 시점 상관X)
// 상수를 만들때는 전부 대문자 ex)AGE로 쓰는 관습. 불변의 값이라는 뜻.

        final int age; // 다른 언어는 선언과 동시에 값을 넣어줘야하는데 자바는 딱 한번 넣어줄 수 있음.
        age = 30 + 100;
        System.out.println("당신의 나이는 " + age + "입니다");
        // 자바에는 final에 static이 따라다니는 경우가 있음. 왜냐면 둘다 only 1 을 의미
        // 지금 여기선 main에 붙어있어서 static을 또 못붙임
 */
