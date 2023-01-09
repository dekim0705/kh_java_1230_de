package 문자열반전;

import java.util.Scanner;

// abcdefg => gfedcba
// 힌트 : for문을 반대방향으로 돌려야 함, while문으로도 가능(더 간단할 수도)
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = sc.next();
        for (int i = str.length() - 1; i >= 0; i--) { //처음시작하는게 길이의 -1, 마지막 인덱스부터 시작하겠다는 말/ 마지막 인텍스부터 0과 같거나 클동안 돌리는거
            System.out.print(str.charAt(i));
        }
    }
}


// 인덱스는 문자열의 길이보다 하나가 적다

/* while문 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = sc.next();
        int index = str.length(); // strindex는 값을 유지를 해줘야 함
        while(true) {
            index--; // 인덱스는 문자열의 길이보다 하나가 적어서 -1
            System.out.print(str.charAt(index));
            if(index == 0) break;
 */




/* 내가 한거
      System.out.print("문자열을 입력: ");
        String str = sc.next();
        char ch;
        for(int i = 0; i <= str.length()-1; i++) {
            ch = str.charAt(i);
        }
            System.out.println();
 */