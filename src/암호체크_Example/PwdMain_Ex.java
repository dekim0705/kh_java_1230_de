package 암호체크_Example;

import java.util.Scanner;

public class PwdMain_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PwdSetting_Ex pwdSetting_ex = new PwdSetting_Ex();
        String pwd; // 여기서 입력 받으면 안됨 = sc.next(); // 암호를 입력 받는 변수 생성
        while(true) {
            System.out.println("암호 입력: ");
            pwd = sc.next(); // 매번 돌면서 암호를 입력 받음. 그 다음엔 탈출조건을 먼저 넣고 각각의 케이스를 따로 만들기

            if(pwd.equals("종료") || pwd.equalsIgnoreCase("exit"))  break;


            if(pwdSetting_ex.validLength(pwd) == false) { // 입력받은 문자열을 매개변수로 넣어줌. true면 다음스텝, false이면
                System.out.println("Bad length password");
                continue; // 길이가 안맞으면 다시 돌리는거
            }
        }
    }
}
