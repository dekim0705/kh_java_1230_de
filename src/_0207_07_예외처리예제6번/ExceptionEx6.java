package _0207_07_예외처리예제6번;
import java.io.IOException;
// 예외처리 미루기 : 해당 메서드 내에서 발생한 예외 처리에 대한 책임을 메소드를 호출한 쪽으로 떠넘길 수 있습니다
// 예외처리 던지기 :
public class ExceptionEx6 {
    public static void main(String[] args) {
        ThrowEx ex = new ThrowEx();
        ex.printStr(5);
    }
}

class ThrowEx {
    String str = null; // (String 의 초기값 : 1) null; -> 주소가 없다. 2) ""; -> 값이 없다)
    public void printStr(int cnt) {
        if(str == null) {
            System.out.println("str이 null 입니다.");
            throw new NullPointerException();
        }
        for(int i = 0; i < cnt; i++) {
            System.out.println(str);
        }
    }
}








/*  예외처리 미루기
    public static void main(String[] args)  { // (throws IOException 넣으면 예외처리를 무시하겠다는 것)
        IOSample sample = new IOSample();
        try {
            sample.input();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}

class IOSample {
    private int num;
    public void input() throws IOException { // (throws = 나의 상위, 바깥으로 던진다는 것, main 으로 미룬거 )
        num = System.in.read();
    }
    public void output() {
        System.out.println(num);
    }
}
*/
