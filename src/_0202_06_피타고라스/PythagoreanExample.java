package _0202_06_피타고라스;
import java.util.Arrays;
import java.util.Scanner;
/*
예제 입력
6 8 10
25 52 60
5 12 13
0 0 0
출력
right
right
wrong
right
 */
public class PythagoreanExample {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 3변의 길이를 입력 받기 위한 배열
        Scanner sc = new Scanner(System.in);
        while (true) { // 0 0 0 들어 올 때까지 반복 수행(종료조건 = 탈출조건이 오기 전까지 무한반복)
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i]; // (조건이 양수이기때문에 음수 들어올 수 없음. 양수중에 제일 작은 0 )
            }
            if(sum == 0) break;
            Arrays.sort(arr); // 오름차순 정렬(오름차순이라서 제일 큰 값이 뒤로 감 그럼 a2 + b2 = c2 완성. 어떤 값을 입력 받던간에 equation 에 딱 맞게 들어감)
            if((arr[2] * arr[2]) == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
                System.out.println("right");
            } else System.out.println("wrong");

        }
    }
}
