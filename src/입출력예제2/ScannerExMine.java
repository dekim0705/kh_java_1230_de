package 입출력예제2;
// 콘솔 입력(화면 입력기를 통해서 입력 받는것)에 대해서
// System.in.read() : 키보드의 입력을 ASCII 코드값으로 읽어 들임
import java.io.IOException;

public class ScannerExMine {
    public static void main(String[] args) {
        while(true){ // 반복문 (무조건 탈출조건을 만들어줘야 함)
            try {
                int KetCode = System.in.read();
                System.out.println("KeyCode : " + KetCode);
                if(KetCode == 'q') break; // break가 탈출조건
            } catch(IOException e) {
                e.printStackTrace(); // 쌓여있는 stack결과를 화면에 보여주라는 뜻
            }

        }
    }
}
