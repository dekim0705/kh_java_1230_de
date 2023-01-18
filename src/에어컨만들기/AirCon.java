package 에어컨만들기;
// 기능 설계
// - 전원 ON/OFF 기능
// - 온도 설정 기능(1도 단위 설정) (0.5도 단위로 하려면 실수사용 X, 근사치값때문에. 정수사용하며 값의 범위를 *2 해서 넣고 /2 해서 빼면 됨.)
// - 현재 온도 표시 기능
// - 냉방기 ON/OFF 기능
// - 난방기 ON/OFF 기능
// - 바람세기 설정 기능 (1단계 / 2단계 / 3단계)
// 설정 조건 및 동작 정의
// - 설정된 온도에 따라 온도 조절 기능 (60초 / 30초 / 20초) 주기로 온도 변경
// - 에어컨의 동작은 Scanner 로 특정 문자를 입력 받아 동작 시킴
// - 현재 온도 표시를 위해 캘린터 API 를 이용해서 해당 달의 적절한 온도를 가져오도록 구현
// - 현재 온도와 설정 온도가 같아지면 자동 종료

import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    private boolean isPower; // 전원 ON/OFF. 값이 두개만 들어올 때에는 boolean 이 제일 편하고 간단
    private int setTemp; // 온도 설정 기능
    private int currTemp; // 현재 온도 표시 기능
    private boolean isCooler; // 냉방기 ON/OFF
    private boolean isHeater; // 난방기 ON/OFF
    private int windStep; // 바람세기 1단, 2단, 3단
    public AirCon() { // 생성자. 에어컨이 처음 만들어 졌을 때 초기값으로 나오는 부분
        final int[] monthTemp = {-5, 3, 8, 14, 22, 27, 31, 30, 22, 18, 7, 2}; // 온도에 대한 배열. 해당 줄에서 정의하는 값을 읽어내기만 하는 용도일때에는 final
        Calendar now = Calendar.getInstance();     // Calendar 는 객체로 못만듬, 그냥 접근. Calendar 에는 추상화문법이 있음. 실체가 없는 부모가 상속하면 => 추상화
        int month = now.get(Calendar.MONTH); // 현재 달을 가져 옴
        currTemp = monthTemp[month]; // 1월달의 index 가 0임.
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }
    // 에어컨의 온도가 변경 될 때 화면 출력
    public void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("======= 에어컨 정보 =======");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람세기 : " + windStr[windStep]); // 배열의 요소값을 찍어주려면 인덱스를 넣어주면 됨
        // 배열의 요소값을 넣을때 ""을 삭제하고 windStr[windStep-1]을 넣어서 인덱스를 맞춰주면 됨
    }
    // 에어컨에 대해 온도와 바람세기 설정, 설정 이후 조건에 따라 히터 또는 쿨러를 켬
    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도가" + currTemp + "도 입니다.");
        System.out.print("온도를 설정 하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + "도 입니다.");
        System.out.print("바람 세기를 설정 하세요. [1]1단 [2]2단 [3]3단 : ");
        windStep = sc.nextInt();
        if (currTemp > setTemp) { //현재가 더운 상태
            System.out.println("Cooler 가 동작 합니다.");
            isCooler = true; // 쿨러 동작
            isHeater = false; // 확실하게 하게 위해 히터 끄기
        } else if (currTemp < setTemp) { // 현재가 추운 상태
            System.out.println("Heater 가 동작 합니다.");
            isHeater = true;
            isCooler = false;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }
    // private설정으로 외부에서 값을 못바꾸게 해놨기때문에 setter와 getter필요
    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindStep() {
        return windStep; // 바람세기
    }
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }
    public void setCurrTemp(int n) {
        currTemp += n; // 쿨러가 동작하면 일정한 간격으로 -값, 히터가 동작하면 +값이 들어 옴
    }
    public int getCurrTemp() {
        return currTemp;
    }
    public int getSetTemp() { // 현재 설정된 온도를 읽어오라는 것
        return setTemp;
    }

}
