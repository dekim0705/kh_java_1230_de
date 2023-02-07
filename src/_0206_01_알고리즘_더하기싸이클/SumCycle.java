package _0206_01_알고리즘_더하기싸이클;
import java.util.Scanner;
// 입력 받은 수가 더하기 사이클의 조건을 수행하고 몇번만에 입력한 수와 같은 값으로 돌아오는지 확인하는 문제
// 입력 26 => 10의자리의 수(2), 1의자리의 수(2)를 분리해서 더함 => 2 + 6 = 8
// 입력 받은 수의 1의 자리 수와 계산된 수의 1의 자리수로 다시 연산 => 68
// ------- 1 Cycle --------- (여기까지가)
// 68 => 6 + 8 = 14
// 계산된 수는 84
// ------- 2 Cycle ---------
// 84 => 8 + 4 = 12
// 계산된 수는 42
// ------- 3 Cycle ---------
// 42 => 4 + 2 = 6
// 계산된 수는 26
// ------- 4 Cycle ---------

public class SumCycle {
    public static void main(String[] args) {
// 강사님 예제
        Scanner sc = new Scanner(System.in);
        int sumNumber = 0; // 입력받은 수의 10의 자리와 1의 자리를 분리해서 더함
        int newNumber = 0; // 새롭게 만들어진 수
        int cnt = 0; // 사이클 횟수 누적
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int num = input; // 입력 받은 값이 변경되는 걸 막기 위해 임시 값을 만듬
                         // cycle 을 한 바퀴 돌 때마다 새로운 값이 들어가야 함
        while(true) {
            sumNumber = (num / 10) + (num % 10); // 입력값을 10의 자리와 1의 자리로 분리해서 더함
            newNumber = (num % 10) * 10 + (sumNumber % 10); // 입력값의 1의 자리 + 계산된 값의 1의자리 더함
            cnt++;
            if(newNumber  == input) break;  // 더하기 조건에 따라 1 Cycle 순회 수 입력 받은 값과 비교
            // (새로 만들어진 숫자와 입력받은 숫자 비교)
            num = newNumber; // 순회를 위해 만들어진 값을 순회용 변수에 대입;
        }
        System.out.print("총 싸이클 : " + cnt);
    }
}

/*  구글 참고
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int cnt = 0;
        while(true) {
            int left = temp / 10;
            int right = temp % 10;
            temp = right * 10 + (left + right) % 10;
            cnt++;
            if(n == temp) {
                break;
            }
        }
        System.out.print("총 카운트 : " + cnt);

 */
