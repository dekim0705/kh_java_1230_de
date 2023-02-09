package _0209_03_알고리즘_구간합구하기;
import java.util.Scanner;
// 구간합 만들기 공식 : S[i] = S[i-1] + A[i]
public class RangeCalcEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 개수
        int x = sc.nextInt(); // 테스트 케이스
        int[] arr = new int[n]; // (입력용 배열)
        long[] sumArr = new long[n]; // 합 배열
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i == 0) sumArr[0] = arr[0];
            else sumArr[i] = sumArr[i-1] + arr[i];
        }
        int left = 0, right;
        while (x != 0) {
            left = sc.nextInt();
            right = sc.nextInt();
            // 구간합 예산하기 : sum[R] - sum[L-1], 인덱스로 계산하기 위해서는 -1을 더해준다. 시간의복잡도 : 0(1)
//            System.out.println(sumArr[right] - sumArr[left -1]); // (원래 공식)
//            System.out.println(sumArr[right-1] - sumArr[left -2]); // (인덱스?때문에 하나씩 더 빼줘야 함. 근데 그렇게 하면 0이 나올 수 있어서 조건 붙여줘야 함)
            if(left != 1) System.out.println(sumArr[right-1] - sumArr[left-2]);
            else System.out.println(sumArr[right-1] - 0);
            x--;
        }

    }
}
