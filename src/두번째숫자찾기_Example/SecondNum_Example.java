package 두번째숫자찾기_Example;

import java.util.Scanner;

public class SecondNum_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = new int[10];
        int cnt = 0; // 몇 번째로 나타난 수인지를 확인하기 위해서
        System.out.print("임의의 숫자 10개를 입력 : ");
        for(int i = 0; i < arr.length; i++) { // 입력받을 숫자를 배열에 넣기. *배열에 넣을 때 for 문 바로 들어오는거 기억하기*
            arr[i] = sc.nextInt(); // 입력 받은 각각의 임의의 수를 배열에 대입
        }
        System.out.print("찾을 수 입력 : ");
        int secondNum = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] == secondNum) System.out.print(arr[i] + 1 + " "); // 값 찾는거
//            if(arr[i] == secondNum) System.out.print(i + 1 + " "); // 인덱스 찾는거
            if(arr[i] == secondNum) {
                cnt++; // 같은 숫자를 만나면 진입해서 카운트 +1
                if(cnt == 2) { // cnt 가 2인 경우에만 나오도록
                    System.out.print(i + 1); // 여기서 +1은 인덱스 값 때문에 더한듯(?)
                    break; // 두번째 숫자를 찾았으면 뒤의 수를 돌 필요가 없으니까 효율성을 위해 break. ex)1 2 3 4 5 5 6 7 8 9일 경우에는 5에서 끝나고 6부터는 돌 필요 X
                }
            }
         }
        if(cnt < 2) System.out.println("-1"); // cnt 가 2보다 작다는건 1이라는 뜻
    }
}
