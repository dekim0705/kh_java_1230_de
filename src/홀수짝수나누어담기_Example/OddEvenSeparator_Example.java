package 홀수짝수나누어담기_Example;

import java.util.Scanner;

public class OddEvenSeparator_Example {
    int[] inputArr = new int[7];
    int[] oddArr = new int[7];
    int[] evenArr = new int[7];
    int evenIdx = 0; // 배열에 0이남지 않고 값이 들어오는 차례대로 차례차례 옆으로 한칸씩 가도록..(?)
    int oddIdx = 0;

    // 7개의 정수를 입력 받음
    void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }
    }

    // 홀수 / 짝수 나누어 담기
    void separatorArray() {
        for (int e : inputArr) {
            if (e % 2 == 0) evenArr[evenIdx++] = e;
            else oddArr[oddIdx++] = e;
        }
    }

    // 홀수 / 짝수 배열 출력
    void printArray() {
        System.out.print("홀수 : ");
        for(int i = 0; i < oddIdx; i++) System.out.print(oddArr[i] + " "); // 값이 3개 들어오니까 인덱스는 0,1,2라서 값 3개 미만으로 잡아줘야 함
        System.out.println();
        System.out.print("짝수 : ");
        for(int i = 0; i < evenIdx; i++) System.out.print(evenArr[i] + " ");
        }
    }


