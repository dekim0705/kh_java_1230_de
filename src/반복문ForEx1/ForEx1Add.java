package 반복문ForEx1;

import java.util.Scanner;

public class ForEx1Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int number = sc.nextInt();
        int result = recursiveFunc(number);
        System.out.println(result);
        }

        // recursive : 자기가 자기 자신을 호출하는 것. 재귀호출 ex)하노이탑?
        // public static int의 int는 결과(result)를 int값으로 보여주겠다는 뜻
        // public static void의 void는 메소드의 실행결과로 아무것도 되돌려 주지 않겠다는 의미
    public static int recursiveFunc(int n) {
        if(n ==1) return 1;
        return n + recursiveFunc((n - 1));
// 함수가 함수를 계속 불러서 호출을 계속 하는 것; 미로찾기처럼 쭉 들어가서 역으로 되돌아오는 것
    }
}


//for문
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력 하세요 : ");
//        int number = sc.nextInt(); // 10
//        int sum = 0;
//        for(int i = 1; i <= number; i++) {
//        sum += i; // i가 number와 같을때까지 더하는것
//        }
//        System.out.println("정수의 합은 : " + sum);







// while문
//        while(number > 0) { //10
//            sum += number; // sum = sum + number;
//            number--;
//        }



/*
10 = 0 + 10
19 = 10 + 9
27 = 19 + 8
34 = 27 + 7
40
45
49
52
54
55 = 54 + 1
number가 0이 됨
자기 자신과 조건값으로 들어오는 애를 누적해서 계속 도는것
 */

