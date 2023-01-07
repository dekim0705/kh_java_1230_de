package 반복문연습문제1;

import java.util.Scanner;

// 양의 정수 n을 입력 받아서 n * n 크기의 행렬을 출력하는 프로그램
// 값은 1부터 시작
// 정수 값 : 4
//  1  2  3  4
//  5  6  7  8
//  9 10 11 12
// 13 14 15 16
public class SquareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int number = sc.nextInt();
        for(int i = 1; i <= number * number; i++) {
            System.out.printf("%4d", i);
            if(i % number == 0 ) System.out.println();

        }
    }
}
//요구사항
// 1.n*n의 찍는 범위를 알고 있었는지
// 2.정렬
// 3.i값이 number로 나눈 값이 0으로 떨어지면 줄바꿈

//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 값을 입력 하세요: ");
//        int number = sc.nextInt();
//        for(int i = 1; i >= number; i++) {
//            System.out.printf("%4d",i);
//            for(int j = 1; j < number; j++) {
//                System.out.print(i);
//            }
//        }