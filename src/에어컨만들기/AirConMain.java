package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException { // interruptedException 이 발생하면 밖으로 던지라는 뜻(?)
        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in); // 에어컨 젼원을 켜기위해 콘솔 입력을 받음. 콘솔창 = 키보드 입력 받는 창
        int elapsedTime = 0; // 경과 시간을 계산하기 위한 변수
        boolean isSetTemp = false; // 온도가 변경되어야 할 조건 확인, 온도가 변경되어야 할 시점에 true로 바꿀 것임
        System.out.print("에어컨을 켜시겠습니까? (YES / NO) : " );
        String isOn = sc.next(); // 에어컨을 켜기 위한 문자열을 입력 받음
        if(isOn.equalsIgnoreCase("yes")) {
            lgAirCon.setPower(true); // yes라고 하면 해당 에어컨 전원 on
            lgAirCon.setAirConState(); // 온도와 바람세기를 설정하고 설정에 따라 쿨러나 히터를 켬
            while(true) { // 에어컨이 켜지면 현재온도와 설정온도가 같아질 때까지 while문이 돌아감
                    sleep(1000); // 1초. // sleep이 걸리는 순간에 interrupt를 검. // 시간계산 // sleep의 뜻 -> 스레드가 잠을 잔다는 뜻 //  1000분의 1초단위.
                    elapsedTime++;
                    switch(lgAirCon.getWindStep()) {
                        case 1 : if(elapsedTime >= 60) isSetTemp = true; break;
                        case 2 : if(elapsedTime >= 30) isSetTemp = true; break;
                        case 3 : if(elapsedTime >= 20) isSetTemp = true; break;
                        default : // 위에 케이스 1,2,3이 해당조건에 없을 때의 else문과 같음.
                    }
                    if(isSetTemp) {
                        if(lgAirCon.isHeater()) lgAirCon.setCurrTemp(1); // 히터가 켜져있으면 1도 올리는거구
                        if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1); // 쿨러가 켜져 있으면 1도 내리는거. 둘 다 한번에 켜질 일은 없음
                        lgAirCon.airConInfo(); // 온도가 바뀔 떄마다 화면에 바뀐 정보를 보여주기로 했으니
                        isSetTemp = false; // true상태이면 계속 돌테니까 false로 넣고 경과시간도 다시 셋해줘야함
                        elapsedTime = 0;
                    }



                if(lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) { // 탈출
                    System.out.println("에어컨을 종료 합니다");
                    break;
                }
            }
        }

    }
}
