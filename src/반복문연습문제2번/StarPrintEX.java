package 반복문연습문제2번;
// 입력 : 5
// *
// * *
// * * *
// * * * *
// * * * * *
import java.util.Scanner;

public class StarPrintEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별 갯수 입력: ");
        int star = sc.nextInt();
        for(int i = 0; i < star;i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println(); //줄바꿈
        }
    }
}


/*
    Scanner sc = new Scanner(System.in);
        System.out.print("별의 갯수를 입력 하세요: ");
        int number = sc.nextInt();
        for(int i = 0; i < number; i++) {
        System.out.printf("%d", i); <- 이게 필요가 없었음
        for(int j = 0; j <= number; j++) {
        System.out.printf("* ");
        }
        System.out.println();
        }

 */