package 연산자연습1;

import java.util.Scanner;

// 이항연산자와 삼항연산자
// 산술연산자 : +, -, *, /, %(나머지)
// 대입연산자 : 값을 변수에 대입할 때 사용, 대입은 항상 뒤에서 앞으로 일어남
// 복합대입연산자 : 대입 이전에 자신의 값과 연산을
// 증감연산자 : 값을 1증가하거나 갑소 시키는 연산자(단항 연산자), ++ , --
//            우위와 전위에 따라 상황이 달라짐
// 비교 연산자 : 값의 크기를 비교하는 연산자
// 논리 연산자 : 참과 거짓을 판단 하는 것? AND(&&) OR (||) NOT (!)
// 삼항 연산자 : 항이 3개인 연산자 (이건 참과 거짓이 있는 조건문과 같음); 이프보다 효율 좋음. 스위치(?) 보다도좋음
// 문자열 결합 연산자 : 문자열을 이어주는 연산자
public class OperatorEx  {
    public static void main(String[] args) {

















       /* 문자열 결합 연산자
        System.out.println("Java" + (11.03 + 12));
        */


      /* 삼항연산자
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력 하세요: ");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false; // 조건문은 얘 한줄; 삼항연산자(항이 3개라서) 사실은 조건문

        System.out.println(isAdult);
       */



       /* 논리 연산자
        int x = 10, y = 20;
        boolean rst1, rst2, rst3;
        rst1 = (x > y) && (x > 5); // false; 앞이 거짓이면 뒤는 보지않음
        rst2 = (x > y) || (x > 5); // true; 앞이 거짓이면 뒤를 본다
        rst3 = !((x > y) || (x > 5)); // false;

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
        */



        /* 비교 연산자
        int x = 10, y = 20;
        System.out.println(x > y); // false
        System.out.println(x < y); // true
        System.out.println(x == y); // false; == 같다라는 의미, = 대입의 의미
        System.out.println(x >= y); // false
        System.out.println(x <= y); // true
         */


       /* 증감연산자
        int num1 = 10;
        System.out.println(num1--);
        System.out.println(num1);
        */


        /*  복합대입연산자
        System.out.println(num1 += 2); // num1 = num1 + 2;
        System.out.println(num1 -= 2); // num1 = num1 - 2; num1값이 이미 12로 바뀌어있어성 8이 아니고 10이 나옴
        System.out.println(num1 *= 2); // num1 = num1 * 2;
        System.out.println(num1 /= 2); // num1 = num1 / 2;
        System.out.println(num1 %= 2); // num1 = num1 % 2;
         */


        /* 산술연산자
         int num1 = 10, num2 =4;
        System.out.println("+ 연산자 : " + (num1 + num2));
        System.out.println("- 연산자 : " + (num1 - num2));
        System.out.println("* 연산자 : " + (num1 * num2));
        System.out.println("/ 연산자 : " + (num1 / num2)); // 몫을 구한 것 (몇 번 들어는지 구할때는 정수로 구하기)
        System.out.println("/ 연산자 : " + ((double)num1 / num2)); // 값을 구한 것 (소수점 추가). 나누기 전에 num1부터 형을 바꿔줘야 함
        System.out.println("% 연산자 : " + (num1 % num2)); // 나눈 결과에 대한 나머지

        try {
            System.out.println(5 / 0);
        } catch(ArithmeticException e) {
            System.out.println("0으로 나누면 안됨");
        }
        // 수학으로 하면 무한대의 값이 나옴 divided by zero -> 0으로 나누면 안된당
        */

    }
}
