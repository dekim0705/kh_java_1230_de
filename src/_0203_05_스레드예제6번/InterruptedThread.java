package _0203_05_스레드예제6번;

public class InterruptedThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 실행 중......");
                sleep(1); // ( sleep 에 빠지는 상태가 종료조건(?)) / (외부에서 interrupt 를 때리면 ("인터럽트 발생...")으로 튕겨나감)
            }
        } catch (InterruptedException e) {
            System.out.println("인터럽트 발생......");
        }
        System.out.println("종료를 위해 자원 정리 중...");
        System.out.println("실행종료");
    }
}
