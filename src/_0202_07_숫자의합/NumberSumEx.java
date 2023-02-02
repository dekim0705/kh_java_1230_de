package _0202_07_숫자의합;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
문제 : N개의 숫자가 공백없이 쓰여 있음. 이 숫자를 모두 합해서 출력하는 문제
입력 : 54321
출력 : 15
입력 : 7000000000
출력 : 7
입력 : 5678
출력 : 26
입력 : 0000
프로그램 종료
 */
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        while (true) {
            int sum = 0; // 한번 계산 결과를 출력 후 초기화가 되어야 함. (값이 누적되면 안됨)
            System.out.print("입력 : ");
            number = sc.next();
            if (number.equals("0000")) break;
            for (int i = 0; i < number.length(); i++) {
                sum += number.charAt(i) - '0'; // (ASCII 코드값에서 0만큼 빼주면 정수값이 나옴)
            }
            System.out.println("출력 : " + sum);
        }
    }
}
