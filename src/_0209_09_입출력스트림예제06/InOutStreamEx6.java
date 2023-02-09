package _0209_09_입출력스트림예제06;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
// ☆ 중요 예제 ☆
public class InOutStreamEx6 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // (e는 FileNotFoundException 에 대한 에러를 찾는거고 printStackTrace() 는 내부 추적)
        }
        Scanner sc = new Scanner(inputStream); // (스캐너 생성할 때 생성자의 매개변수자리에 항상 System.in 넣었었음. 이번에는 "test.txt"의 입력을 받아서 넣어준것)
        while (sc.hasNextLine()) { // (다음에 읽을 라인이있으면 들어가구, 없으면 X)
            String line = sc.nextLine(); // (nextLine 이 있으면 읽는거)(라인별로 문자열로 읽어들인거..)
            System.out.println(line);
        }
    }
}
