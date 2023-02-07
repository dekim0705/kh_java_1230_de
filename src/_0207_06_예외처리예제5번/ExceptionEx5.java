package _0207_06_예외처리예제5번;
import java.io.FileWriter;
import java.io.IOException;
// finally : 프로그램 실행 도중 예외가 발생 할 가능성이 있는 코드에 try 구문을 걸게 되는데,
//           이때 예외가 발생하면 catch 구문으로 진행하고 그렇지 않으면 아래 코드가 실행 됩니다.
//           이 경우, 예외여부에 상관없이 항상 실행되어야 할 구문이 있다면 finally 로 처리 할 수 있습니다.
public class ExceptionEx5 {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("test.txt");
            f.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (f != null) { // (파일이 열려있으면 ~ 이라는 조건)
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


/*
    public static void main(String[] args) {
        int c;
        try {
            c = 4 /1;
        } catch(ArithmeticException e) {
            System.out.println("여기는 예외가 발생한 구문 입니다.");
        } finally {
            shouldBeRun();
        }
    }
    static void shouldBeRun() {
        System.out.println("OK, Thanks...");
    }
}
 */