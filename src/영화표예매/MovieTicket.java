//package 영화표예매;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//// 현재 좌석 상태를 보여주는 메소드가 필요
//// 좌석을 예매하는 메소드가 필요
//// 판매된 좌석의 개수를 구해 총 판매 금액을 구하는 메소드가 필요
//public class MovieTicket {
//    // 극장의 좌석 상태를 표시하는 배열 만들기 (총 10개)
//    int[] movieSeat = new int[10];
//    int seatNum;
//    int cnt;
//    int sum = 0;
//
//
//    // 0이면 [ ], 1이면 [V]
//
//
//    void printSeat() {
//        for (int i = 0; i < movieSeat.length; i++) {
//            if (movieSeat[seatNum - 1] == 0) {
//                System.out.print("[ ]");
//            } else {
//                System.out.print("[V]");
//            }
//        }
//    }
//
//
//    // 좌석을 예약하는 메소드
//    void selectSeat() {
//        printSeat();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 0; i < movieSeat.length; i++) {
//            if(movieSeat[n -1] == 1) {
//                System.out.print("에러");
//            } else{
//                cnt++;
//            }
//            sum += cnt;
//        }
//
//        // printSeat() 호출해 현재 좌석 상태를 보여 줌
//        // 좌석번호를 입력 받아서 좌석을 예약하는데 이미 예약된 좌석은 에러 문구 출력 (main에서 while문이 돌고있기때문에 여기서 재입력 요구 안해도 됨)
//        // 좌석 예약이 성공하면 다시 printSeat()를 호출해 좌석 상태를 보여줌
//    }
//
//    int totalAmount () {
//        // 좌석 예약 정보를 가지고 있는 배열을 순회해 예약된 좌석 개수를 누적
//        // 좌석 개수와 좌석당 가격을 곱해서 결과를 반환
//        int[] sumArr = new int[sum];
//        for(int i = 0; i < sumArr.length; i++) {
//            System.out.print(sumArr[i] * 12000 );
//        }
//        return 0;
//    }
//
//}
//
