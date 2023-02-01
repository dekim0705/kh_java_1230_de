package _0201_08_알고리즘_문구암호화;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 암호와키의 반복 : lovelovelove => love 문자열을 입력받아 문자배열로 만듬, 문자배열의 길이는 4-> 인덱스는 0,1,2,3 (들어온 길이의 % 를 구하면 0이 됨)
//                nice day
// a b c d e f g h i j  k  l  m  n  o  p  q  r  s  t  u v w x y z
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 ~~ (1부터 카운트 해야 맞게 들어감)
// 만약 음수가 나오면 해당값에서 26만큼 더해줌
public class EncryptTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal = sc.nextLine(); // 평문은 공백이 있으니 sc.nextLine();
        System.out.print("암호화 키 : ");
        String encrypt = sc.next();
        char[] enCh = encrypt.toCharArray(); // 암호화키를 문자 배열로 변경 (인덱스가 필요해서)
        char value = 0; // 암호문을 만들기 위한 문자 변수
        List<Character> vig = new ArrayList<>();
        for(int i = 0; i < normal.length(); i++) { //(for 문을 평문의 길이만큼 돌림)
            if(normal.charAt(i) == ' ') vig.add(' '); // (normal 의 charAt(i)가 공백이면 공백을 추가)
            else { // (핵심! 문구만들기)
                value = (char) (normal.charAt(i) - (enCh[i % encrypt.length()] - 'a') -1);
                if(value < 'a') value += 26;
                vig.add(value);
            }
        }
        for(Character e : vig) System.out.print(e);

    }
}
