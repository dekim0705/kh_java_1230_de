package _0208_08_알고리즘_블랙잭;
import java.util.Scanner;
// 5 21 => 카드 장수, 주어진 값
// 5 6 7 8 9 => 카드 중 3장의 카드를 골라서 주어진 값과 같거나 가장 가까운 값을 찾아야 함(출력)
public class Blackjack_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // 3장의 카드의 합
        int rst = 0; // 3장의 카드의 합으로 만들어진 결과값
        System.out.print("카드 장 수 : ");
        int cnt = sc.nextInt();
        System.out.print("주어진 값 : ");
        int m = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < cnt; i++) {
            for(int j = i+1; j < cnt; j++) { // (겹치면 안되니까 i+1)
                for (int k = j + 1; k < cnt; k++) {
                    sum = arr[i] + arr[j] + arr[k]; // (겹치지 않는 모든 경우의 수의 값으로 sum 이 만들어짐)
                    if (sum <= m && rst < sum) rst = sum;
                    // (두가지 조건을 만족해야함) rst 보다 sum 이 크면 더 가까운 값이 나왔다는 뜻. m과 같거나 작은 범위에서 제일 큰 값을 찾겠다는 뜻~)
                }
            }
        }
    System.out.println("결과 : " + rst);
    }
}
