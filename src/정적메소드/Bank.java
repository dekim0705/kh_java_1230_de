package 정적메소드;

public class Bank {
    private static int count = 0; // 해당 클래스가 객체로 몇번 생성되었는지 확인하는 변수
    private int account; // 계좌
    private String bank; // 은행의 이름
    public Bank(String name, int account) { // 생성자는 클래스가 객체로 만들어질 때 호출 됨
        count++;
        this.bank = name;
        this.account = account;
        System.out.println(name + "은행에 계좌 개설을 합니다. 잔액은 " + account + "원 입니다.");
    }
    public static int getCount() { // 정적 필드값을 읽기 위한 정적 메소드 (클래스 소속). static붙어있는 애들은 클래스 만들어질때 static영역에 만들어짐
        return count;
    }
    // 예금을 위한 메소드 작성
    public void setDeposit(final int dep) { // 입금된 고객의 금액을 더 이상 변경불가 상태로 만들어 안전하게 보호함
        // dep =+ 100; 은 입금받은 값이 바뀌어버림
        this.account += dep; // 기존 계좌의 잔고X, + 새로 입금하는 금액이 되어야 함
        System.out.println(bank + "은행에 " + dep + "원을 예금 했습니다.");
    }
    // 출금을 위한 메소드 작성
    public void setWithdraw(final int with) {
        if(with > account) {
            System.out.println("잔액이 부족 합니다.");
        } else {
            account -= with;
        }

    }
    public void viewAccount() {
        System.out.println("현재 잔액은 " + account + "원 입니다.");
    }
}

