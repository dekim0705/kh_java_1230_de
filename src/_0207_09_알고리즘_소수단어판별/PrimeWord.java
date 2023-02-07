package _0207_09_알고리즘_소수단어판별;
import java.util.Scanner;
// (a ~ z ->  1 ~ 26)
// (A ~ Z -> 27 ~ 52)
public class PrimeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영어단어 입력 : ");
        String word = sc.next();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                sum += word.charAt(i) - 'a' + 1;
            } else sum += word.charAt(i) - 'A' + 27;
        } // System.out.print(sum);

        if(sum % 2 == 0) {
            System.out.println("It is NOT a prime word");
        }else System.out.println("It is a prime word");

        /*
        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int)'A');
        System.out.println((int)'Z');
        System.out.println((char)90);
        System.out.println((char)91);
        System.out.println((char)92);
        System.out.println((char)93);
        System.out.println((char)94);
        System.out.println((char)95);
        System.out.println((char)96);
        System.out.println((char)97);

         */




//        char[] letterArr = new char[52];
//        for(int i = 0; i < letterArr.length; i++) {
//            if(i < 26) letterArr[i] = (char)(i+65);
//            else letterArr[i] = (char)(i+71);
//        }
//        for(int i = 0; i < word.length(); i ++) {
//            if(letterArr[i] == word.charAt(i)) {
//                sum += (letterArr[i] + 1);
//            }
//        }System.out.print("sum : " + sum);
//
        }
    }
//    static String primeSum(int n) {
//        boolean isPrime = true; // 기본값을 소수로 정함
//        for(int i = 2; i < n; i++) {
//            if(n % i == 0) isPrime = false; // 나눠지면 소수가 아니기때문에 isPrime을 false로 바꿈
//        }
//        if (isPrime) return "It is a prime number.";
//        else return "It is NOT a prime number";
//    }
//}
//




/*
1. 소수 구하는법 true/false **1도 소수
2. 알파벳 배열 52개? 소문자 + 대문자
3. 입력받은 str 문자열로 뽑아서 합을 더해주기
4. 그 합으로 소수 구하는법 true/false/ 돌리기
It is a prime word.
It is NOT a prime word.
*/