package 중첩반복문;

import java.util.Scanner;

// 반복문 내의 반복문
public class DoubleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별의 갯수를 입력 하세요 : ");
        int number = sc.nextInt();
        for(int i = 0; i < number; i++) {
            //가이드
            System.out.printf("|%d|",i);
            for(int j = 0; j < number; j++) { // j for문이 *을 옆으로 쭉 찍어준거
                System.out.print("* ");
            }
            System.out.println();
        }
// i값은 행 j값은 열. i가 한번 돌때마다 j는 열번씩 움직여야함
    }
}
