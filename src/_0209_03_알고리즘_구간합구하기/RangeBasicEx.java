package _0209_03_알고리즘_구간합구하기;

import java.util.Scanner;

// 단순 구간 합
public class RangeBasicEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 개수
        int x = sc.nextInt(); // 테스트 케이스
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // (값을 입력 받아서 배열 만들기)
        }
        int left = 0, right = 0;
        while (x != 0) { // ( x--; 하면 되니까 굳이 cnt 변수 또 만들 필요 X)
            long sum = 0; // (한바퀴 돌때마다 sum 은 0으로 초기화 되어야 함) (구간합은 값이 커질 수 있어서 long type 사용)
            left = sc.nextInt();
            right = sc.nextInt();
            for (int i = left - 1; i < right; i++) { //( 입력 받은 숫자는 항상 인덱스는 위치값보다 항상 1이 적음)
                sum += arr[i];
            }
            System.out.println(sum);
            x--;
        }
    }
}
