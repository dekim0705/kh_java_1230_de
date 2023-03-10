package _0125_04_중첩인터페이스;
// 중첩인터페이스란? 클래스 내부에 선언한 인터페이스를 말합니다.
// 주로 UI 프로그래밍에서 이벤트 처리를 위해 사용 합니다.
public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListener()); // 버튼이 눌러지면 CallListener 를 호출
        button.touch(); // touch() 메소드 호출, 등록된 리스너의 onClick() 메소드를 호출
        button.setOnClickListener(new MessageListener());
        button.touch(); // touch 를 누르면 MessageListener 에 있는 onClick() 호출
    }
}
