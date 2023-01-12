package 홀수짝수나누어담기_Example_ArrLIst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrListSeparator { // ArrayList는 크기를 넣을 필요가 없다. 무한대로 돌기때문에 탈출조건 넣어줘야 함
    List<Integer> inList = new ArrayList<>(); // List util넣어줘야함
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    void inputArray() {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.print("정수 입력: ");
        while(true) { // ArrayList는 크기를 넣을 필요가 없다. 무한대로 돌기때문에 탈출조건 넣어줘야 함
            value = sc.nextInt();
            if(value == 999) break; // 999가 들어올때까지 받기
            inList.add(value); // ArrayList 값을 추가 함
        }
    }

    // 홀수 / 짝수 나누어 담기
    void separatorArray() {
        for(int e : inList) {
            if(e % 2 == 0 ) evenList.add(e);
            else oddList.add(e);
        }
    }

    // 홀수 / 짝수 배열 출력
    void printArray() {
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int e : evenList) System.out.print(e + " ");
    }

}
