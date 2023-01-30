package _0130_05_배수찾기;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 문제 : 정수 n과 목록이 주어졌을 때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫째 줄에 n이 주어짐, 다음 줄에 한줄에 한 개씩 목록에 들어있는 수가 주어짐 (수의 범위 0 ~ 1000)
// 입력 예시
// 3 -> 주어진 수
// 1
// 7
// 99
// 321
// 777
// 0 -> 반복문에 대한 종료

// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래 처럼 출력
// 출력 예시
// 1 is NOT a multiple of 3.
// 7 is NOT a multiple of 3.
// 9 is a multiple of 3.
// 321 is a multiple of 3.
// 777 is a multiple of 3.

// 어레이리스트, 반복문 종료조건(0), 배열개수 정해지지 X, 0이들어올 때 까지 계속 돌려야 함
public class MultipleSearchEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // ArrayList 생성하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 주어진 수
        int val; // 주어진 값의 배수인지 아닌지 판별하기 위한 값을 입력 받음
        while(true) { // 항상 참인 경우이므로 무한으로 반복하는 반복문, 이 경우는 반드시 탈출 조건이 필요
            // 이 안에다가 int val 을 하면 계속해서 val 을 만들기때문에 밖에서 선언하고 안에서 재활용
            val = sc.nextInt(); // 키보드로부터 값을 입력 받음  // 바로 집어넣지 않은 이유는 입력값이 0이면 집어넣지 않고 빠져야 하기 때문에
            if(val == 0) break;
            list.add(val); // add 에 인덱스를 지정하지 않으면 마지막 위치에 저장 됨
                            // 래퍼클래스가 자동적으로 박싱 [from 기본타입 to 객체타입]
            // list.add(new Integer(val)); // list.add 에는 int 타입은 못들어가고 Integer 타입(객체타입)만 들어갈 수 있는데 line35 는 내부적으로 wrapper class 가 boxing 을 해줘서 가능
            // 배열인경우 인덱스에 값을 넣고, 여기선 add 를 이용해서 제일 뒤에서부터 차례대로 추가
        }
        for(Integer v : list) { // v값은 val 와 똑같음
            if(v % n == 0) System.out.println(v + " is a multiple of " + n + ".");
            else System.out.println(v + " is NOT a multiple of " + n + ".");
        }
    }
}



/*
  Scanner sc = new Scanner(System.in);
        int givenNum = sc.nextInt();
        List<Integer> arrNum = new ArrayList<>();
        int num = 1;
        while (true) {
            for (int i = 0; i < arrNum.size(); i++) {
                num = ((int) (Math.random() * 10)) + 1;
                    arrNum.add(num);
                } if (num == 0) break;
            }
            for (int i = 0; i < arrNum.size(); i++) {
                if (arrNum.get(i) % givenNum == 0) System.out.println(arrNum.get(i) + " is a multiple of " + givenNum);
                else System.out.println(arrNum.get(i) + " is NOT a multiple of " + givenNum);
            }
 */
