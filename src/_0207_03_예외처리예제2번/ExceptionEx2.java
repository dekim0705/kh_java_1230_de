package _0207_03_예외처리예제2번;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// FileNotFoundException : 존재하지 않는 파일을 열려고 시도 할 때 발생 함
public class ExceptionEx2 {
    public static void main(String[] args) { // 예외처리
        try {
            BufferedReader br = new BufferedReader(new FileReader("없는 파일"));
            br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("파일이 없습니다.");
        }
    }
}

/* 예외처리 하지 않아서 프로그램이 종료됨
    public static void main(String[] args) throws IOException { // (throws 로 밖으로 던진다는 건 예외처리를 하지 않고 밖으로 던져버리는 것)
        BufferedReader br = new BufferedReader(new FileReader("없는 파일")); // (파일이 없는 것)
        br.readLine(); // (파일에 읽으러 간거. IOException 을 throws 해서 FileReader() 까지 포함)
        br.close();
 */