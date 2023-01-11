package 영화표예매_Example;

import java.util.Arrays;
import java.util.Scanner;

// 현재 좌석 상태를 보여주는 메소드가 필요
// 좌석을 예매하는 메소드가 필요
// 판매된 좌석의 개수를 구해 총 판매 금액을 구하는 메소드가 필요
public class MovieTicket_Example {
    // 극장의 좌석 상태를 표시하는 배열 만들기 (총 10개)
    int seat[] = new int[10];



    // 현재 좌석 상태를 보여주는 메소드 작성
    // 0이면 [ ], 1이면 [V]
    void printSeat() {
//        for(int i = 0; i < seat.length; i++) {
//            if(seat[i] == 0) System.out.print("[ ]");
//            else System.out.print("[V]");
//        }
        // enhanced for
        for(int val : seat) {
            if(val == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }

        System.out.println();
    }



    // 좌석을 예약하는 메소드
    void selectSeat() {
        // printSeat() 호출해 현재 좌석 상태를 보여 줌
        printSeat();
        // 좌석번호를 입력 할 수 있도록
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호를 입력 하세요: ");
        int seatPos = sc.nextInt();
        // 받은 좌석 번호로 좌석을 예약하는데 이미 예약된 좌석은 에러 문구 출력 (main에서 while문이 돌고있기때문에 여기서 재입력 요구 안해도 됨)
        if(seat[seatPos - 1] == 0) {
            seat[seatPos - 1] = 1; // seat sold
            // 좌석 예약이 성공하면 다시 printSeat()를 호출해 좌석 상태를 보여줌
            printSeat(); // show the updated printSeat after sold
        } else {
            System.out.println("이미 예약된 좌석 입니다. 다른 좌석을 선택 하세요.");
        }
  }




    int totalAmount () {
        int cnt = 0; // 예약된 좌석의 수를 누적하는 변수 생성
        // 좌석 예약 정보를 가지고 있는 배열을 순회해 예약된 좌석 개수를 누적
        for(int val : seat) {
            if(val == 1) cnt++; // 판매된 좌석 개수를 누적
        }
        // 좌석 개수와 좌석당 가격을 곱해서 결과를 반환
       return (cnt * 12000);
    }

}

