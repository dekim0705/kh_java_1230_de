package _0203_04_스레드예제5번;
// 스레드에서 공통으로 사용하는 클래스 생성
// synchronized(동기화) : 멀티스레드 환경에서 동시 접속이 허용되지 않도록 lock 을 거는 작업을 의미 함
// (전산용어로는 mutex(상호배제) : A,B가 같은 영역에 접근할 때, A가 사용중이면 B가 배제된다는 뜻. C or C++의 view)
// (추가로 알아두면 좋은 키워드 : semaphore(process 단위로 같은 메모리 접근을 막음, 운영체제의 view. ex. 열차역에서 사용하는 깃발)
// (추가로 알아두면 좋은 키워드 : critical section)
public class WorkObject { // (동기화가 걸려서 두개가 번갈아가서 나옴)
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행");
        notify(); // 일시 정시 상태에 있는 TreadB를 실행 대기 상태로 전환
        try {
            wait(); // ThreadA를 일시정지 상태로 만듬
        } catch(InterruptedException e) {}

    }

    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행");
        notify(); // 일시 정시 상태에 있는 TreadA를 실행 대기 상태로 전환
        try {
            wait(); // ThreadB를 일시정지 상태로 만듬
        } catch(InterruptedException e) {}

    }
}
