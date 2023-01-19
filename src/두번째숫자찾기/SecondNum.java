package 두번째숫자찾기;

import java.util.Scanner;

// 임의의 숫자 10개를 입력 받아 중복된 숫자 중 2번째등장하는 숫자의 위치 찾기 : 1 2 3 4 5 1 2 3 4 5
// 5 ==> 10
// 임의의 수 입력 : 1 2 3 4 5 5 6 7 8 2
// 찾을 숫자 : 5
// 결과 : 6(번째) . * index 아님
// 만약에 두번째에 등장하는 수가 없으면 -1 출력
public class SecondNum {
    public static void main(String[] args) {
        int findNum;
        int findCnt = 0;
        Scanner sc = new Scanner(System.in);
        int[] arrNum = new int[10];
        System.out.print("임의의 숫자 10개 입력 : ");
        for(int i = 0; i < arrNum.length; i++) {
            arrNum[i] = sc.nextInt(); // 여기에 넣는 이유?? 알아봐야 할듯
        }
            System.out.print("찾을 수를 입력: ");
            findNum = sc.nextInt();
        for(int i = 0; i < arrNum.length; i++) {
                if(arrNum[i] == findNum) findCnt++;

            System.out.println("찾을 수의 중복 횟수는 " + findCnt + " 입니다.");
            System.out.println("찾은 수의 두번째째 위치는 " + " 입니다.");


        }
    }
}
