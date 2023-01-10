package KMP문제;

import java.util.Scanner;

public class KMPProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String name = sc.next();
        char[] chName = name.toCharArray();
        for (char e : chName) { // 문자열로 바꿨기때문에 e는 문자 // 향상된 포문은 이미 만들어진 배열에서만 써야 함. 시작값과 마지막값을 알고 있어야 함 = 이미 만들어짐
            if (e >= 'A' && e <= 'Z') System.out.print(e);
        }
    }
}

/* 첫번째 방법 : split()
    String[] splitName = name.split("-");
        for(String e : splitName) System.out.print(e.charAt(0)); // element e에 이름들이 들어옴

 */

/* 두번째 방법 : 대문자만 골라내는 방법
       for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i) >= 'A' && name.charAt(i) <='Z') { // 대문자 구간
                System.out.print(name.charAt(i);   // 문자열은 ascii코드가 아니지만 charAt으로 뽑아내는애는 정수로 돌아감
            }
                }
 */

/* 0번째 문자 출력, 그리고 '-'다음 문자 출력
        for(int i = 0; i < name.length(); i++) {
            if(i == 0) System.out.print(name.charAt(i));
            else {
                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
                // 특정한 문자를 정해놓고(-) 다음 문자를 찍는 것
                }
 */




/* 내가 한거 - 안됨 ㅠ
     System.out.print("이름을 입력 하세요: ");
        String names = sc.next();
        String[] splitNames = names.split("-");
        char name1 = names.charAt(0);
        char name2 = names.charAt(1);
        char name3 = names.charAt(2);



//        char[] name1 = names.toCharArray();
//        char[] name2 = names.toCharArray();
//        char[] name3 = names.toCharArray();



        System.out.print(names.charAt(0) + names.charAt(1) + names.charAt(2));

 */