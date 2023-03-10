package _0125_04_중첩인터페이스;

public class Button {
    OnClickListener listener;

    // 매개변수 다형성으로 외부에서 생성된 객체의 주소를 전달 받음
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;

    }
    void touch() { // 버튼에 터치 이벤트가 발생하면 ~ onClick()메소드 호출
        listener.onClick();

    }

    // 클래스 내부에서 인터페이스를 생성
    interface OnClickListener {
        void onClick(); // 추상메소드 : 상속 받은 클래스에서 해당 기능을 반드시 오버라이딩 해야 함
    }
}
