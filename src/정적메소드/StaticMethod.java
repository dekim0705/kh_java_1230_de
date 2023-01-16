package 정적메소드;

import java.security.DomainCombiner;

import static 정적메소드.Util.DOMAIN;

public class StaticMethod {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinHan = new Bank("신한", 1000);
        Bank NH = new Bank("농협", 0);
        kakao.setDeposit(2000);
        kakao.setWithdraw(1580);
        kakao.viewAccount();

        System.out.println("총 계좌 개설 횟수: " + Bank.getCount()); // getCount()메소드는 정적메소드(static)이며 클래스 소속
        // Bank라는 클래스를 객체로 몇번 만들었는지

        System.out.print("현재 시간을 출력합니다: ");
        System.out.println(Util.getCurrentDate("yyyy년 MM월 dd일 - hh:mm:ss"));
        // Util이라는 클래스 이름으로 만들어짐. 객체 X
        System.out.println("도메인 주소 : " + DOMAIN);
        // 클래스 만들 필요 없이 반복적으로 필요한것이나 하나의 고정된 값을 사용해야 하는 경우 static사용


    }
}


