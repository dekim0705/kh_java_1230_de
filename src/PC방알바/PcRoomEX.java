package PC방알바;

import java.util.Scanner;

// 피씨방에 피씨가 100대 있음 (배열의 인덱스는 0 ~ 99)
// 손님들은 모두 자기가 앉고 싶어 하는 자리가 있음
// 만약 자기가 앉고 싶어 하는 자리에 다른 손님이 있으면 거절을 해야하고, 아니면 자리 사용 허가
// 손님의 수 입력 : 3
// 손님이 앉고 싶어 하는 자리 번호 : 1 3 5 => 0
// 손님의 수 입력 : 5
// 자리 번호 : 1 1 3 3 5 => 2(거절 횟수)
public class PcRoomEX {
    public static void main(String[] args) {

        int[] pcRoom = new int[100];  // 피씨방 좌석에 대한 100개의 배열이 필요
        int rejectCnt = 0; // 거절횟수를 나타내는 변수
        int seatNum; // 손님이 원하는 좌석 번호를 입력 받기 위한 변수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 손님의 수를 입력받음
        for(int i = 0; i < n; i++) {// 손님의 수만큼 반복문 돌리기
            seatNum = sc.nextInt(); // 좌석번호는 1번 부터 시작
            if(pcRoom[seatNum-1] == 1) { // 해당 배열의 값이 1이라는 것 이미 예약된 자리이다.
            // 1을 빼줘야 배열의 인덱스와 조건이 맞음. 0번 자리 주세요 하지 않으니까. 배열 초기값이 0인데 손님이 좌석 달라고 하면 그 좌석?!!잌엨?!!
                rejectCnt++;
            } else {
                pcRoom[seatNum - 1] = 1; // 비어 있는 자리를 사용 함
        }
        }
        System.out.println("거절횟수는: " + rejectCnt +"입니다");
    }
}


/* 내가 한것..
    // 피씨방 좌석에 대한 100개의 배열이 필요
        int[] seat = new int[100];
        int deny;
        // 배열의 초기값은 0이다. 즉, 0이면 비어 있는 자리이다.
        Scanner sc = new Scanner(System.in);
        System.out.print("몇분이세용?");
        int ppl = sc.nextInt();
        System.out.print("어디에 앉으시겠어용?");

        for(int i = 0; i < seat.length; i++) {
        String seatNum = sc.next();
            if(seat[seatNum[i]] == seatNum[i] {
            deny++;

        }

        }
 */