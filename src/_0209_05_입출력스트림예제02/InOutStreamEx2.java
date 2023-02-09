package _0209_05_입출력스트림예제02;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// InputStream : 바이트 기반의 입력 스트림의 최상위 클래스로 추상 클래스 입니다.
public class InOutStreamEx2 {
    public static void main(String[] args) throws IOException { // (throws~ 파일이 없으면 아무것도 하지 않을거라는 의미, 예외처리 안하겠다는 의미)
        InputStream is = new FileInputStream("test.bin"); // (어디로부터 읽을거니~?)
        while(true) {
            int data = is.read(); // 1 바이트 씩 읽기
            if (data == -1) break; // 파일의 끝에 도달 (계속 읽다가 -1에 도달하면 = 더 읽을게 없다는 뜻. 바이트 코드 값에는 음수가 없음. -1이라는 뜻은 읽을 대상이 없다는 뜻. 파일입출력에서 디폴트값은 0이 아닌 -1)
            System.out.print(data + " ");
        }
        is.close(); // 읽기 위해 열어둔 스트림을 닫음
    }
}
