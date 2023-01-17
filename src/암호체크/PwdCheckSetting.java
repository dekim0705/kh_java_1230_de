package 암호체크;

import java.util.Scanner;

public class PwdCheckSetting {
    Scanner sc = new Scanner(System.in);
    protected String pwd; // 암호..?
    protected String len; // 암호의 길이

    public PwdCheckSetting () {
    }
    public void typePwd () {
        System.out.println("10~30 글자 사이의 암호를 입력 하세요: 종료를 원할시 \"종료\" 또는 \"exit\"을 입력 하세요.");
        this.pwd = sc.next();
        if((this.pwd.length() >= 10 && this.pwd.length() <= 30)) System.out.println("글자수를 확인하세요.");
    }

    public String getPwd() {
        return pwd;
    }
    public void setPwd(java.lang.String pwd) {
        this.pwd = pwd;
    }
}

