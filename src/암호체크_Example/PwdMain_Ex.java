package 암호체크_Example;

import java.util.Scanner;

public class PwdMain_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PwdClass_Ex pwdClassEx = new PwdClass_Ex();
        String pwd; // 여기서 입력 받으면 안됨 = sc.next(); // 암호를 입력 받는 변수 생성
        while (true) {
            System.out.print("암호 입력: ");
            pwd = sc.next(); // 매번 돌면서 암호를 입력 받음. 그 다음엔 탈출조건을 먼저 넣고 각각의 케이스를 따로 만들기

            if (pwd.equals("종료") || pwd.equalsIgnoreCase("exit")) {
                System.out.println("종료 합니다."); break;
            }
            // 원래 한칸 아래에 있었는데 validLength가 먼저 떠서 얘 위치를 위로 올렸더니 제대로 종료 됨
            // System.out.println("종료 합니다."); 넣어주려면 중괄호 필요한듯. 중괄호 없이 추가하면 아래 if문이 unreachable 이라고 뜸


            if (pwdClassEx.validLength(pwd) == false) { // 입력받은 문자열을 매개변수로 넣어줌. true면 다음스텝, false이면
                System.out.println("Bad Length password");
                continue; // 길이가 안맞으면 다시 돌리는거
            }
            // 숫자체크
            if (!pwdClassEx.validNumber(pwd)) { // validLength에서 처럼 == false로 쓰는 것 보다 부정의연산자 ! 하나 쓰는게 더 좋음
                System.out.println("Bad Number Password");
                continue;
            }
            if (!pwdClassEx.validLowerAlphabet(pwd)) {
                System.out.println("Bad Lower Case Password");
                continue;
            }
            if (!pwdClassEx.validUpperAlphabet(pwd)) {
                System.out.println("Bad Upper Case Password");
                continue;
            }
            if (!pwdClassEx.validRex(pwd)) {
                System.out.println("Bad Special Letter Password");
                continue;
            }
            System.out.println("Good Password"); // break;
        }
    }
}
