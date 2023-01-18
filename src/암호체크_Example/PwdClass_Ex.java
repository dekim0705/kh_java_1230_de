package 암호체크_Example;
// 암호체크
// 암호의 길이는 10 ~ 30자 사이 (10 <= len <=30)
// 암호에는 숫자, 소문자, 대문자, 특수 문자가 포함되어야 함
// 특수문자는 (!, %, _, #, &, +, -, *, /)의 9개중 하나
// 입력 받은 패스워드가 조건을 만족하면 "Good password", 만족하지 않으면 "Bad password"출력
// 반복문을 사용하고 사용자가 "종료" 또는 "exit"을 입력하면 프로그램 종료
public class PwdClass_Ex {
    // 스캐너 넣어서 해도 되는데 (더 나음) 매개변수넣어서 하는 법 보기위해서~
    boolean validLength(String pwd) { // 길이 체크
        if (pwd.length() >= 10 && pwd.length() <= 30) return true; // if가 맞으면 true
        return false; // 아니면 false
    }

    // 숫자 체크
    boolean validNumber(String pwd) { // 문자열을 문자로 뽑아서 돌려서 숫자가 하나라도 포함되어 있으면 true
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') return true;
        }
        return false;
    }

    // 소문자 체크
    boolean validLowerAlphabet(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') return true;
        }
        return false;
    }

    // 대문자 체크
    boolean validUpperAlphabet(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') return true;
        }
        return false;
    }

    // 특수문자 체크. bigO표기법으로 하면 더 효율..?
    boolean validRex(String pwd) { // pwd라는 매개변수를 전달받아서~
        String specialLetter = "!%_&#+-*/";
        for(int i = 0; i < specialLetter.length(); i++) { // specialLetter.length 는 9. for문이 도는 범위는 0~8. 0번째 문자는 !
            for(int j = 0; j < pwd.length(); j++) {
                if(specialLetter.charAt(i) == pwd.charAt(j)) return true;
            }
        }
        return false;
    }



}
