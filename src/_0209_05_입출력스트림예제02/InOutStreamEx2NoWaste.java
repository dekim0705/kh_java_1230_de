package _0209_05_입출력스트림예제02;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InOutStreamEx2NoWaste {
        public static void main(String[] args) throws IOException { // (throws~ 파일이 없으면 아무것도 하지 않을거라는 의미, 예외처리 안하겠다는 의미)
            InputStream is = new FileInputStream("test.bin"); // (어디로부터 읽을거니~?)
            byte[] buffer = new byte[100];
            while(true) {
//                int data = is.read(); // 1 바이트 씩 읽기
//                if (data == -1) break; // 파일의 끝에 도달 (계속 읽다가 -1에 도달하면 = 더 읽을게 없다는 뜻. 바이트 코드 값에는 음수가 없음. -1이라는 뜻은 읽을 대상이 없다는 뜻. 파일입출력에서 디폴트값은 0이 아닌 -1)
//                System.out.print(data + " ");
                 int readByteNum = is.read(buffer); // 매개변수로 전달한 buffer 에 값을 담음 (readByteNum 에는 몇개가 들어왔는지가 들어옴)
//                int readByteNum = is.read(buffer, 1, 2); // (지정, 포문을 .length 만큼 돌려야 다 나오는데 100개가 다 나오니까 조건문으로 0들은 지워야 함)
                if(readByteNum == -1) break;
                for(int i = 0; i < readByteNum; i++) { // (for 돌려줘야 값을 읽을 수 있음!)
                    System.out.print(buffer[i] + " ");
                }
//                for(int i = 0; i < buffer.length; i++) { // (코드라인 15와 연결)
//                    if(buffer[i] != 0) System.out.print(buffer[i] + " ");
//                }
            }
            is.close(); // 읽기 위해 열어둔 스트림을 닫음
    }
}
