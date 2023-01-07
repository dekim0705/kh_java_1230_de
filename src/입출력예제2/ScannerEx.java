package 입출력예제2;

import java.io.IOException;
import java.util.Scanner; // 두번재로 많이 사용되는 자바 API

// 콘솔 입력(화면 입력기를 통해서 입력 받는것)에 대해서
// System.in.read() : 키보드의 입력을 ASCII 코드값으로 읽어 들임
// Scanner 입력 : 키보드의 입력을 원하는 데이터타입으로 반환 받음
public class ScannerEx {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in); // sc는 스캐너를 만드는 객체를 가르키고 있음
        byte a = sc.nextByte(); // 키보드의 입력을 byte형으로 반환
        short b = sc.nextShort(); // 키보드 입력을 short형으로 반환
        int c = sc.nextInt();
        char ch = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출
        String s1 = sc.next(); // 문자열을 공백 단위로 입력 받음 ex)서울시 강남구 ~ 면 서울시 까지만 나옴
        String s2 = sc.nextLine(); // 문자열을 줄바꿈 기준으로 입력 받음

    }
}
