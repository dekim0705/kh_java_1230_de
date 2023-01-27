package _0127_04_System클래스;

import static java.lang.Thread.sleep;

// 경과 시간 측정 하기
public class SystemTestEx {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0;
        int val = (int)(Math.random() * 1000) + 1; // 1 ~ 1000 사이의 임의의 값 (테스트 결과를 위해서 난수 만들기)
        for(int i = 0; i < data.length; i++) { // 1000개의 배열에 1부터 1000까지의 값을 저장
            data[i] = i + 1; // (0번째 방에 1을 넣고~ 배열 개수만큼 넣겠다는 의미~)
        }
        long time1 = System.currentTimeMillis(); // 측정을 위한 시작 시간 가져옴
        for(int i = 0; i < data.length; i++) {
            cnt++;
            sleep(1); // 시간 측정에 대한 지연 요인을 만들기 위해서 인위적으로 추가 (import 후, 예외처리 하기) (한번 돌때마다 1milli 씩 지연 걸어놓은 상태)
            if(val == data[i]) {
                System.out.println("위치  : "  + (i+1)); // 위치니까 index + 1
                break;
            }
        }
        long time2 = System.currentTimeMillis(); // 측정을 위한 종료 시간 가져 옴
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간 : " + (time2 - time1) + "millis");

        // 시스템 프로퍼티 읽기 (운영체제에게 물어보는 것)
        System.out.println(System.getProperty("os.name")); // os.name 키값을 넣으면 해당 정보를 반환
        System.out.println(System.getProperty("user.name"));

    }
}
