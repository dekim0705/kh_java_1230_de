package _0125_04_중첩인터페이스;

// CallListener 는 전화를 거는 버튼에 대한 동작
public class CallListener implements Button.OnClickListener {
    @Override
    public void onClick() { // 실제 눌러졌을 때의 동작을 여기에 넣어주기
        System.out.println("전화를 겁니다.");
    }
}
