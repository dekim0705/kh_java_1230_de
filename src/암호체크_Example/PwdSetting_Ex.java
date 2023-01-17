package 암호체크_Example;

import java.util.Scanner;

public class PwdSetting_Ex {
    boolean validLength(String pwd) { // 길이 체크
        if(pwd.length() >= 10 && pwd.length() <= 30) return true; // if가 맞으면 true
        return false; // 아니면 false
    }
}
