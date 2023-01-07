package 스위치문기본;

import java.util.Scanner;

// 스위치문은 조건문이며, 스위치에는 조건식은 올 수 없고 조건에 대한 변수만 올 수 있음
// 변수는 정수, 문자, 문자열만 사용 가능
// 스위치의 각 케이스를 끝내기 위해서는 반드시 break 문이 필요
// 해당하는 케이스가 없는 경우를 위해 default 문이 필요
public class SwitchSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력 하세요: ");
        String season = sc.next(); // 공백 기준으로 문자열을 입력 받음
        switch(season) {
            case "spring" : //문장의 끝이 아니기 때문에 ;가 아님
            case "SPRING" : // OR조건과 같음; 연달아 쓰면 됨
                System.out.println("꽃이 피는 봄이 왔어요^^");
                break;
            case "summer" : case "SUMMER" :
                System.out.println("무더운 여름 입니다. ㅠㅠ");
                break;
            case "fall" : case "FALL" :
            case "autumn" : case "AUTUMN" :
                System.out.println("식욕의 계절 가을입니당 히히");
                break;
            case "winter" : case "WINTER" :
                System.out.println("붕어빵 먹는 겨울 호호");
                break;
            default :
                System.out.println("다시 제대로 입력하세용");
        }
    }
}

