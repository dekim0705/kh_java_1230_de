package _0126_08_단어공부;
import java.util.Scanner;
// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
// 입력은 대소문자를 입력하고, 결과는 대소문자 구분하지 않음
// 만약 가장 많이 등장하는 알파벳이 여러개인 경우, ? 로 출력
// 결과 예시 : AaAbcdd => A
// 결과 예시 : ddcfgrG => ?
public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영어 단어 입력 : ");
        String word = sc.next();
        char[] wordArr = word.toCharArray();
        for(int i = 0; i < wordArr.length; i++) {
            System.out.print(wordArr[i]);
            }



//        char ch;
//        for(int i = 0; i < word.length(); i++) {
//            ch = word.charAt(i);
//            System.out.print(ch);
//        }



//        char alphabet;
//        char alphabet2;
//        int cnt = 0;
//            for(int i = 0; i < wordArr.length; i++) {
//                if() cnt++;
//        }

    }
}
