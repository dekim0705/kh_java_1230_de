package _0202_07_스레드예제1번;
// 멀티스레드란? 하나의 프로그램에서 여러가지 일을 동시에 수행하는 것
public class ThreadEx1 { // (출력 : 반복문 두개가 동시에 돌고 있는 상태)
    public static void main(String[] args) {
        Thread test = new TestThread();
        test.start(); // (실행 상태가 아닌 실행 대기상태까지만 가고 운영체제가 상태를 보고 실행)
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println("여기는 메인 스레드 입니다 : " + sum);
        }
        System.out.println(Thread.currentThread() + "메인 합계 : " + sum);


    }
}
// 스레드를 만드는 방법은 Thread Class 를 상속 받는 방법이 있음 (별로 좋은 방법은 아님)
class TestThread extends Thread { // (이미 Thread 를 상속 받았기 때문에 다른 클래스 상속이 불가능)
    @Override
    public void run() { // (run() 메소드는 꼭 있어야 함. 스레드가 동작하는 구간 -> runt(){ㅇ ㅕ ㄱ ㅣ}
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println("여기는 테스트스레드 입니다 : " + sum);
        }
        System.out.println(Thread.currentThread() + "테스트스레드 합계 : " + sum);
    }

}
