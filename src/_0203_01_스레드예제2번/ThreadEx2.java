package _0203_01_스레드예제2번;
/*
스레드 생성 방법 :
    - 상속을 받는 방법 (extends Thread): 구현이 간편하지만, 다른 상속을 받지 못함.
    - Runnable 인터페이스로 구현 : 다른 클래스의 상속을 받을 수 있음, thread 객체를 만드는 과정이 추가로 필요함.
    - 익명의 객체로 구현 : 클래스 생성 없이 간편하게 구현 할 수 있음
 */
// (thread 는 지속적으로 할 작업이 있을 때 사용. 메소드,함수와 다른 사용 목적)
public class ThreadEx2 {
    public static void main(String[] args) {
        // 상속
        Thread clsTh1 = new CustomThread();
        clsTh1.start(); // 내부적으로 run()메소드가 호출 됨 (Thread 에 대한 실제 제어권은 JVM 이 아닌 운영체제가 가지고 있음)
                        // (start()는 실행자체가 아닌 실행대기상태 -> execution request)

        // Runnable 인터페이스
        Runnable run = new RunThread(); // 수행해야 할 작업내용은 포함하고 있지만 실제 thread 는 아님. (기능 구현은 했지만 thread 자체의 능력은 없음)
        Thread runTh1 = new Thread(run); // (Runnable run 을 넣어서 Thread 객체 생성) (run 이라는 동작 자체가 thread 로 작용(?)
        Thread runTh2 = new Thread(run);
        runTh1.start();
        runTh2.start();

        // 익명의 객체 생성 (1회용 객체로 구현)
        Runnable task = new Runnable() { // (여기서 task 는 클래스 이름이 아닌 참조변수. 클래스는 중괄호 내에서 코드로 구현해줘야 함)
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i < 10; i++) {
                    sum += i;
                    System.out.println(" " + Thread.currentThread() + sum);
                }
                System.out.println(Thread.currentThread() + "합계 : " + sum);

            }
        }; // (명령문의 끝이라는걸 세미콜론(;) 알려줘야 함. (클래스 내에서 하는걸 한다고 생각하면 됨))
        Thread runTh3  = new Thread(task);
        runTh3.start();


        // 익명의 객체를 람다식으로 생성 (람다식은 화살표를 사용, 생략가능한건 모든 문법을 생략하는 것 :  람다식)
        Runnable task2 = () -> {
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                sum += i;
                System.out.println(" " + Thread.currentThread() + sum);
            }
            System.out.println(Thread.currentThread() + "합계 : " + sum);
        };
        Thread runTh4  = new Thread(task);
        runTh4.start();

        System.out.println("나는 메인 입니다.");
        System.out.println("나는 메인 입니다.");
        System.out.println("나는 메인 입니다.");
    }
}








