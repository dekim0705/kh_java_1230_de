package 시간입력;

import java.util.Scanner;

// 입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력) (문자열 하나로 입력) (콜론(:)을 스플릿 기준으로 잡기)
// 출력 : 오후 11시 05분 03초 (15초를 잘라야 할 수도)
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력 하세요: ");
        String time = sc.next();
        String[] splitTime = time.split(":");
        int intHour = Integer.parseInt(splitTime[0]);
        int intMin = Integer.parseInt(splitTime[1]);
        int intSec  = Integer.parseInt(splitTime[2]);


        if(intHour > 11 && !(intHour == 12)) { // intHour !=12
            intHour -= 12;
            System.out.printf("오후 %02d시 %02d분 %02d초\n 입니다", intHour, intMin, intSec);
        }  else if(intHour == 12) {
            System.out.printf("오후 %02d시 %02d분 %02d초\n 입니다", intHour, intMin, intSec);
        } else {
            System.out.printf("오전 %02d시 %02d분 %02d초\n 입니다", intHour, intMin, intSec);
        }
// %02d == 정수 두 자리를 잡도록 한자리수면 앞에 0을 채워라
    }
}



