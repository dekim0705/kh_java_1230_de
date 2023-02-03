package _0203_05_스레드예제6번;
import static java.lang.Thread.sleep;

// 스레드의 안전한 종료 방법 :
// 1) stop 플래그 구현
// 2) interrupt()메소드 사용
// (스레드는 어차피 중괄호를 벗어나가면 종료됨. 끝을 만나면 종료가 되니까 끝을 만나게 해준다는 관점에서 접근하기)
public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {
        // stop 플래그 구현
//        RunThread runThread = new RunThread();
//        runThread.start();
//        sleep(5000);
//        runThread.setStop(true);

        // interrupt() 메소드 사용
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        sleep(10000);
        interruptedThread.interrupt(); // 일시정지 상태의 스레드에 InterruptException 을 발생 시킴



    }
}
