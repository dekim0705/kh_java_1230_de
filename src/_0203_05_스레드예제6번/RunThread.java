package _0203_05_스레드예제6번;
// 플래그를 이용한 종료 방법
public class RunThread extends Thread {
    private boolean stop; // stop 플래그 설정 (외부에서 stop 플래그를 바꿔주면 종료할 수 있게 구현하면 됨)

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() { // (stop 을 바꿔주려면 run()으로 하면 됨)
        while (!stop) { // ((true)부분에 인스턴스변수 값을 받아서 탈출시키는것)
            System.out.println("Thread 실행 중...");
        }
        System.out.println("종료를 위한 자원 정리..");
        System.out.println("실행 종료");

    }
}
