package _0126_08_단어공부;
import java.util.Scanner;
// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
// 입력은 대소문자를 입력하고, 결과는 대소문자 구분하지 않음
// 만약 가장 많이 등장하는 알파벳이 여러개인 경우, ? 로 출력
// 결과 예시 : AaAbcdd => A
// 결과 예시 : ddcfgrG => ?
public class WordStudy {
    public static void main(String[] args) {
        int[] alphabet = new int[26]; // 알파벳 개수 만큼의 배열 생성 (가장 많이 등장하는 알파벳을 count 하기 위해)
        int max = 0; // 제일 큰 수 찾기
        char result = 0; // 결과값으로 출력할 알파벳을 구하기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력  : "); // aA~
        String word = sc.next();
        for(int i = 0; i < word.length(); i++) { // 입력 받은 단어의 길이만큼 순회하며 alphabet 배열에 횟수 누적
            if(word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++; // a = 97 (대소문자 구분없이 각자의 방에 나온 횟수만큼 넣기
                // 해당 인덱스의 문자 추출               //     a - a = 0 -> ++ 있으니까 0번 인덱스에 +1
               // 소문자 a보다 같거나 큰 애들은 소문자 구간, 대문자들은 대문자구간에 떨어짐
            else alphabet[word.charAt(i) - 'A']++;
                //           A  - A = 0 -> ++있으니까 0번인덱스에 +1
                //           B  - A - 1 -> 1번 인덱스에 +1
        }
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) result = '?'; // 배열 인덱스의 값과 max 값이 같으면 '?' (현재 max 는 0인 상태라서 조건 alphabet[0]이 들어와도 조건성립 X (2인상태)임)
            else if(alphabet[i] > max) {
                max = alphabet[i]; // 인덱스에 해당하는 배열 값이 더 크면 max 값을 변경
                result = (char) ('A' + i); // 배열의 인덱스에서 'A' 만큼 더해주면 (i 자리에) 만약에 B가 들어오면 66이 됨. i에 A가 들어오면 0이기때문에 값이 65가 됨
                                           // 배열의 인덱스에서 'A' 만큼의 값을 증가 시켜서 실제 대문자 ASCII 값을 ??
            }
        }
        System.out.println(result);
    }
}


//        Scanner sc = new Scanner(System.in);
//        System.out.print("영어 단어 입력 : ");
//        String word = sc.next();
//        char[] wordArr = word.toCharArray();
//        for(int i = 0; i < wordArr.length; i++) {
//            System.out.print(wordArr[i]);
//            }



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