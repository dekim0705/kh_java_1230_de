package _0203_02_스레드예제3번;

import java.awt.*;
import static java.lang.Thread.sleep;

// sleep() : 실행중인 스레드를 일정 시간동안 대기 상태로 만듬
//         : 반복 수행에 대한 시간을 늦출 때 사용하거나, 인터럽트 예외처리를 위해서 사용
public class ThreadEx3 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // (자바가 전용프로그램을 만들기 위해서 만들어놓은 도구들 중 하나)
        for(int i = 0; i < 10; i++) {
            toolkit.beep(); // (3초마다 beep 소리를 내라는 뜻)
            try {
                sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
}


// (throws InterruptedException : 예외처리를 밖으로 던진다. 는 뜻은 예외처리를 무시하겠다는 뜻)