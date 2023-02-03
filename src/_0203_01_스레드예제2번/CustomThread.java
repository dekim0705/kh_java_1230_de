package _0203_01_스레드예제2번;

public class CustomThread extends Thread{
    public void run() { // thread execution part
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += i;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" " + Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
