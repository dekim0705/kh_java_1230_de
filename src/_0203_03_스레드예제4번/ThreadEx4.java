package _0203_03_스레드예제4번;
// join() : 다른 스레드가 종료 될 때까지 기다렸다가 실행해야 하는 경우 사용
public class ThreadEx4 {
    public static void main(String[] args) {
        SumTh sumTh =new SumTh();
        sumTh.start();
//        try {
//            sumTh.join(); // sumTh 가 종료될때까지 main(호출한 쪽)이 대기 하고 있음 (join()도 대기상태로 떨어지니까 interrupted exception 걸어줘야 함)
//        } catch(InterruptedException e) {
//
//        }
        try {
            sumTh.join(100); // (10분의 1초만 기다리겠다는 뜻)
        } catch(InterruptedException e) {

        }
        System.out.println("합 : " + sumTh.getSum());

    }
}

class SumTh extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            sum += 1;
                try {
                    sleep(1);
                } catch (InterruptedException e) {}
        }
    }
}
