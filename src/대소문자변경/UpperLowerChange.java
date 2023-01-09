package 대소문자변경;

import java.util.Scanner;

// 영문자 소문자와 대문자로 이루어진 단어를 입력 받은 뒤, 대문자는 소문자로, 소문자는 대문자로 변경하기
// 무조건 입력은 영문자이다
// WrongAnswer => wRONGaNSWER
// 힌트 1 : 문자열에서 문자를 추출하는 메소드는 charAt(인덱스)이다.
// 힌트 2 : 자바에서의 문자는 정수값으로 사용된다.
// 힌트 3 : 정수값으로 계산 후 출력 시 (char)형 변환이 필요하다.
public class UpperLowerChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = sc.next();
        char ch; // 문자열에서 문자를 추출하기 위한 변수
        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // 해당 인덱스의 문자 추출
            if(ch < 'a') System.out.print((char)(ch + ('a' - 'A')));  // ASCII 코드 값에서 항상 대문자가 소문자보다 먼저 나온다
                                                                      // 소문자 a보다 작다는건 97미만이라는것. a 미만이라는건 대문자라는 것
            else System.out.print((char)(ch - ('a' - 'A')));
        }



    }
}


/* 내가 한거
      System.out.print("영문자를 입력 하세요: ");
        String word = sc.next();
        char[] arrWord = word.toCharArray();
        int change = sc.next().charAt(arrWord.length);
       if(change >= 'a' && change <= 'z') {
            System.out.println(change);

        arrWord[i] = sc.nextInt();
        if(arrWord[i])
        System.out.println(arrWord);
        if(char cs = )
        System.out.println(word);

 */