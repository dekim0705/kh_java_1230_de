package 간판만들기;

import java.util.Scanner;

// 각 숫자마다 차지하는 공간이 다르다.
// 0은 4칸, 1은 2칸, 나머지 수는 3칸을 차지
// 간판의 각 숫자 사이는 1칸의 여백이 필요
// 총 입력한 숫자를 표기하기 위해 몇 칸의 공간이 필요한지 계산하는 문제
// 120 = 1 + 2 + 1 + 3 + 1 + 4 + 1 = 13
// 5611 = 1 + 3 + 1 + 3 + 1 + 2 + 1 + 2 + 1 = 15칸
// 입력은 0이 들어 올때 까지 계속 반복 입력이 가능하게 해야 함. = 종료 조건 (while문을 계속 돌려야 함)
public class SignBoard {
    public static void main(String[] args) {
        int[] numberSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        Scanner sc = new Scanner(System.in);
        String signNumber; // 문자열 입력 받는 변수
        int sum = 0; // 총 몇자리의 공간을 차지하는지 누적하는 변수
        while (true) {
            signNumber = sc.next();
            if (signNumber.equals("0")) break;
            for (int i = 0; i < signNumber.length(); i++) {
                // 숫자 뒤의 공간을 위해 1을 더해 줌
                sum += numberSize[signNumber.charAt(i) - '0'] + 1; // 총 자리 수 계산. ASCII코드. 0에서 0을빼면 0이 나옴 그래서 0이됨.
            }
            // 전체 공간에서 맨 앞 공간을 위해 1을 더해줌
            System.out.println(sum + 1); // 젤 앞에 한칸때문에 1더해줌
            sum = 0;
        }
    }
}

// sum += numberSize[signNumber.charAt(i) - '0'] + 1;
// 배열에 있는 숫자들 차례대로 문자화해서 하나씩 -'0'을 해줌. 그럼 원래 입력한 값이 나오고 +1을 해줘야 뒤쪽 여백 한칸의 수가 더해짐.
// last commit try for real
// why is commit so difficult?
// char chNum = Integer.toString(num).charAt(0); 정수 -> 스트링 -> 문자



/* 내가 만든 쓰레기
 System.out.print("간판에 넣을 숫자 입력: ");
        int num = sc.nextInt();
        int [] sign = new int[num];
        int sum = 0;
        while(true) {
            for(char i = 0; i < sign.length; i++) {
                if(sign[i] == 0) {
                    sign[i] = 5;
                } else if(sign[i] == 1) {
                    sign[i] = 3;
                } else { sign[i] = 4;
                }


            sum += sign[i]
                System.out.print(+=sign[i]);
                }
            }
 */