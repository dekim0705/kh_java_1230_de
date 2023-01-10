package 문자열연결;

import java.util.Scanner;

// 문자열 추가하기
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// 첫번째 문자열에서 입력 받은 정수 갯수 만큼의 문자를 뒤에서 부터 잘라, 두번째 문자열 앞에 주차하기
// ulkorea
// 3을 입력하면 oulkorea
// 힌트 1. substring(index) : 문자열의 시작 위치 부터 끝까지 잘라냄
// 힌트 2. substring 메소드를 이용해 문자열 추출하기 전에 index계산이 필요.
public class StringAppend {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("첫번째 문자열 입력 : ");
        String firstStr = sc.next();
        System.out.print("두번째 문자열 입력 : ");
        String secondStr = sc.next();
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        // 전체 위치에서 n만큼을 뺀 위치가 우리가 substring을 해야 하는 부분
        int position = firstStr.length() - n; // 포지션 구하기 length-n 하면 해당 index번호가 나옴
        String sub = firstStr.substring(position); // index번호로 생각하기!
        System.out.println(sub + secondStr);

    }
}

// s e o u l  -2
// 0 1 2 3 4


/*  내가 한거
        System.out.print("첫번째 문자열을 입력 하세요: ");
        String first = sc.nextLine();
        System.out.print("두번째 문자열을 입력 하세요: ");
        String second = sc.nextLine();
        System.out.print("정수값을 입력 하세요: ");
        int num = sc.nextInt();
        System.out.println(first.substring(num-1,num) + second);  <= 이거 쓰레기ㅠㅠ
 */

