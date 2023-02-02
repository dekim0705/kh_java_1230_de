package _0202_06_피타고라스;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanExample2 {
    public static void main(String[] args) {
        ArrayList<String> rstList = new ArrayList<>();
        String rst;
        while (true) {
            rst = calcFunc();
            // (rst = PythagoreanEx.calcFunc(); 과 같은 방법인데 클래스 내에 있는 하나의 함수이기때문에 클래스이름 생략)
            if (rst.equals("exit")) break;
            rstList.add(rst);
        }
        for (String e : rstList) System.out.println(e);
    }
    static String calcFunc() { // 함수로 만들어 놓으면 계속 사용 가능
        int sum = 0;
        int[] arr = new int[3]; // 3변의 길이를 입력 받기 위한 배열
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if (sum == 0) return "exit";
        Arrays.sort(arr); // 오름차순 정렬
        if ((arr[2] * arr[2]) == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
            // (Math.pow 는 타입이 더블형이라서 근사치를 구하는 실수값으로 비교를 하기는 애매..)
            return "right";
        }
        return "wrong";
    }
}
