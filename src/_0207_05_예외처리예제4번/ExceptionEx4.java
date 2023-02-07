package _0207_05_예외처리예제4번;
import java.util.Scanner;

// ArithmeticException : 연산 오류
public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                rst = a / b;
            } catch(ArithmeticException e) {
//                System.out.println(e);
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                continue; // (위 문구가 출력 되고 continue 때문에 다시 while 문으로 돌아감)
            }
            System.out.print("결과 : " + rst);
            break;
        }
    }
}
