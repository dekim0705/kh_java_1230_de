package 반복문유효값체크;

import java.util.Scanner;

// 반복문을 이용해서 유효값 체크 하기 (while 반복문 사용)
// do ~ while() : 먼저 수행 후 조건 확인
public class ValidCheck {
    public static void main(String[] args) {
        int age;
        boolean isFirst = true; // 처음 진입인지 아닌지 확인 할 일이 있음 ex)첫 방문 환영문구
        Scanner sc = new Scanner(System.in);

        do { // 반복문을 번저 물어보고
            if(!isFirst) System.out.println("나이를 잘못 입력 하셨습니다.");
            // 같은 코드,지저분 if(isFirst == false) System.out.println("나이를 잘못 입력 하셨습니다.");
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            isFirst = false;
        } while(age <= 0 || age >=200); // 조건확인(?)

        System.out.println("입력 하신 나이는 " + age + "입니다.");


//        while(true) {
//            System.out.println("나이를 입력 하세요 :  ");
//            age = sc.nextInt();
//            if(age > 0 && age <200) break;
//            System.out.println("나이를 잘못 입력 하셨습니다.");
//        }
//        System.out.println("입력 하신 나이는 " + age + "입니다.");







    }
}
