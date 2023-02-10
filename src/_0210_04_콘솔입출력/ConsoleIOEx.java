package _0210_04_콘솔입출력;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 콘솔 입출력  : 키보드로 입력 받고 화면에 출력하는 것을 말합니다.
// System.in  : 표준 입력 스트림
// System.out : 표준 출력 스트림
// System.err : 표준 오류 스트림 (System.out 과 거의 동일하며 버퍼 사용 방법만 다릅니다. 더 좋은게 있어서 사용 안합니다.)
public class ConsoleIOEx {
    public static void main(String[] args) throws IOException {
        System.out.println("=== 메뉴 ===");
        System.out.println("1. 예금 조회");
        System.out.println("2. 예금 출금");
        System.out.println("3. 예금 입급");
        System.out.println("4. 종료 하기");
        System.out.printf("메뉴를 선택 하세요 : ");
        InputStream is = System.in;
        char inputChar = (char) is.read(); // ASCII 코드를 읽어 문자로 변환
        switch(inputChar) {
            case '1' :
                System.out.println("예금 조회를 선택 했습니다.");
                break;
            case '2' :
                System.out.println("예금 출금을 선택 했습니다.");
                break;
            case '3' :
                System.out.println("예금 입금를 선택 했습니다.");
                break;
            case '4' :
                System.out.println("종료 하기를 선택 했습니다");
                break;
        }

        OutputStream os = System.out; // (System.out.println 과 같은것)
        for(byte b = 48; b < 58; b++) { // (출력 : 0123456789)
            os.write(b); // (System.out 으로 부터 OutputStream 을 받았음, 표준 출력. write 하면 아무것도 안나오는데 마무리문자(개인문자??)가 없어서 그런거라서 10  찍어주면 됨)
        }
        os.write(10);
        for(byte b = 65; b < 65+26; b++) { // (출력 : ABCDEFGHIJKLMNOPQRSTUVWXYZ)
            os.write(b); // (System.out 으로 부터 OutputStream 을 받았음, 표준 출력. write 하면 아무것도 안나오는데 마무리문자(개인문자??)가 없어서 그런거라서 10  찍어주면 됨)
        }
        os.write(10);
        for(byte b = 97; b < 97+26; b++) {  // (출력 : abcdefghijklmnopqrstuvwxyz)
            os.write(b); // (System.out 으로 부터 OutputStream 을 받았음, 표준 출력. write 하면 아무것도 안나오는데 마무리문자(개행문자??)가 없어서 그런거라서 10  찍어주면 됨)
        }
        os.write(10);
    }
}

