package _0206_02_십진수이진수;
import java.util.Scanner;
// 10진수를 입력 받아 2진수로 변경 -> 10진수 변경
// 배열을 사용하지 않고 정수 타입 변수를 이용해 변환, 문자열 사용 금지(toBinaryString()같은 메소드 있음)
// (문제 이해가 안될 시, 틀 먼저 만들어 놓고 내부 채워넣기)
public class DecToBinEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("십진수 입력 : ");
        int val = sc.nextInt();
        val = decToBin(val); // (static 으로 바꾸면 클래스 소속이 돼서 객체 생성없이 직접 불러도 됨)
                             // (같은 클래스 -> DecToBin.decToBin(Val)과 같음)
        System.out.println("이진수 : " + val);
        val = binToDec(val);
        System.out.println("십진수 : " + val);
    }
    // 메소드 두개 만들기
    static int decToBin(int dec) { // 10진수를 입력 받아서 2진수로 반환하는 메소드
        int calc;    // 계산으로 만들어진 이진수
        int bin = 0; // 최종 결과
        int pos = 1; // 자리 이동을 위한 포지션 변수
        while (dec != 0) {
            calc = dec % 2; // 2로 나눈 나머지를 구함 (계산 받은 값을 2로 나눈 나머지, 1이 들어감)
            bin = bin + calc * pos;
            dec = dec / 2;
            pos = pos * 10; // (+실제 2진수가 아닌 1011을 만드는 것임, 포지션을 상위자리로 올린다는 것 = 1의 자리를 10의자리로 옮기는 것)
        }
        return bin;
    }
    static int binToDec(int bin) { // 2진수를 입력 받아서 10진수로 반환하는 메소드
        int dec = 0; // 최종 결과
        int i = 0;   // 인덱스 계산용 변수
        int tmp;     // 계산을 위한 임시 값 저장용
        while(bin != 0) { // (1011)
            tmp = bin % 10; // 10으로 나눈 나머지 구함 (1)
            bin = bin / 10; // (101)
            dec += tmp * (Math.pow(2, i++));
            // (2의0승은 1 -> 1, 101을10으로 나눈 나머지 1 = 1*2의1승 -> 2, 10을 10으로 나눈 나머지 0  = 0*2의2승 -> 0, 2의3승 -> 8)
        }
        return dec;
    }
}



/*
1 + 2 + 0 + 8 = 11
1011 / 10 = 101...1
 101 / 10 = 10...1
  10 / 10 = 1...0
   1 / 10 = ...1
 */

/*
1 + 0 + 4 + 8 = 13
1101 / 10 = 110...1
 110 / 10 = 11...0
  11 / 10 = 1...1
   1 / 10 = ...1
 */