package _0203_08_8진수2진수;
// 문제 : 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
// 입력 : 첫째줄에 8진수가 주어짐
// 출력 : 첫째줄에 주어진 8진수를 2진수로 변환하여 출력, 수가 0인 경우를 제외하고 반드시 1로 시작
// 314 => 각 자리의 수가 0 ~ 7
// 11001100
// 000 001 010 011 100 101 110 111
//       1  10  11 100 101 110 111

import java.util.Scanner;

public class Trans {
    public static void main(String[] args) {
        // (8진법에 해당하는 문자열 2개 만들기)
        String[] bin1 = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String[] bin2 = {"", "1", "10", "11", "100", "101", "110", "111"};
        // int[] idx = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("8진수 입력 : ");
        String oct = sc.next();
        for(int  i = 0; i < oct.length(); i++) {
        // idx[i] = num.charAt(i) -'0'; // (배열에 넣을 필요 X, oct.charAt(i) 자체를 인덱스로 사용 가능! )
            if(oct.length() == 1 && oct.charAt(0) - '0' == 0) { // 0이 들어오면 0이 나오는 예외 조건
                System.out.println("0"); break;
            }
            if(i == 0) {
                System.out.print(bin2[oct.charAt(0) - '0']);
            } else
                System.out.print(bin1[oct.charAt(i) - '0']);
        }
    }
}



/*
 (8진법에 들어올 수 있는 수 : 8가지 (0,1,2,3,4,5,6,7))
 입력 예제 : 314
 출력 예제 : 11001100
000 [0]
001 [1] 1
010 [2] 10
011 [3] 11
100 [4] 100
101 [5] 101
110 [6] 110
111 [7] 111
 */
