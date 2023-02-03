package _0203_06_스레드예제7번;
import static java.lang.Thread.sleep;

// synchronized(동기화) : 멀티스레드에서 특정 메서드나 블록{}에 대해 lock(잠금)을 설정하는 것
// 동시접근으로 인해 발생할 수 있는 문제를 해결하기 위해 사용되며, 사용시 급격한 성능저하가 발생 할 수 있음
public class ThreadEx7 {
    public static void main(String[] args) {
        SharedValue sharedValue = new SharedValue();
        // Runnable 인터페이스 익명의 스레드 생성
        Runnable th1 = new Runnable() { // (일회용 익명의 객체)
            @Override
            public void run() {
                sharedValue.setValue(100);
            }
        };
        Thread thread1 = new Thread(th1);
        thread1.setName("쓰레드 1"); // 스레드 이름을 설정
        thread1.start();


        // Runnable 인터페이스 람다식으로 익명의 스레드 생성
        Runnable th2 = () -> {
            sharedValue.setValue(200);
        };
        Thread thread2 = new Thread(th2);
        thread2.setName("쓰레드 2");
        thread2.start();

    }
}
// (들어오는 값과 설정되는 값이 달라지는 걸 보려고 하는 예제)
// (두개의 스레드가 하나의 value 값을 같이 쓰는 중, 하나의 객체값을 양쪽에서 공유 하고 있음 )
// (

class SharedValue { // (접근제한자가 default 인 상태, public 붙으면 X)
    private int value = 0;

    public int getValue() {
        return value;
    }

//    public void setValue(int value) { // (동기화 X)
//        this.value = value;
//        try {
//            sleep(2000); // (하나에 블럭에 오랫동안 머물러 있으면 값이 깨질 확률이 높음)
//        } catch (InterruptedException e) {
//        }
//        System.out.println(Thread.currentThread().getName() + "의 값 : " + this.value);
//    }

    public synchronized void setValue(int value) { // (동기화로 lock 을 걸어서 2초동안 잠금이 걸림. -> 스레드1이 2초 기다리면서 출력하고 빠져나간 뒤에 스레드2가 들어올 수 있음 = 값이 바뀌지 않음)
        this.value = value;
        try { // (sleep 없이 while 문으로 두개가 동시에 값을 넣으면 두개가 겹쳐서 값이 깨지는 타이밍이 있을 수 있음)
            sleep(2000); // (하나에 블럭에 오랫동안 머물러 있으면 값이 깨질 확률이 높음)
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + "의 값 : " + getValue()); // (여기서 getValue()는 this.value)
    }
}