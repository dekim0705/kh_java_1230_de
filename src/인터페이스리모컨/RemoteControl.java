package 인터페이스리모컨;
// 인터페이스란?
// 모든 필드는 자동으로 상수(final static)으로 변환 됩니다.
// 모든 메소드는 자동으로 추상메소드가 됩니다. (public abstract 가 자동 추가 됨)
// 디폴트 메소드 : 예외적으로 구현부를 가질 수 있으며 상속 받은 클래스에서 재정의 가능 합니다.
// 정적메소드를 포함 할 수 있습니다. (정적메소드는 객체와 상관 없고 인터페이스 타입으로 사용 됨)
public interface RemoteControl {
    int MAX_VOLUME = 100; // 상수로 정의 하지 않았지만 정적인 상수이다. ( 인터페이스 생성 시 만들어지고 객체는 안됨)
                          // 인터페이스는 추상화.. 인터페이스는 객체로 만들어 지지 않기 때문에 인스턴스필드가 X. 인스턴스필드는 객체로 만들어지는 필드이기 때문에.
                          // 실제 값이 저장 된 부분이 아니고 기준을 정해놓은 것.
    int MIN_VOLUME = 0; // 자동으로 final static
    void turnOn(); // 자동으로 public abstract 가 붙음. (왜냐하면 인터페이스는 기본적으로 모든 메소드가 추상메소드임)
    void turnOff();
    void setVolume(int volume);
     static void changeBattery() { // 인터페이스 이름으로 접근해야 되고 상속과는 무관
         System.out.println("건전지를 교환해용");
         // static 은 RemoteControl 인터페이스에만 존재해서 상속과 무관
     }
     // void getInfo(); // 그냥 이렇게만 추가하면 접근제한자 때문에 접근 할 수 없음 각각 클래스로 가서 public붙여줘야 함
     void getInfo();
     // void setMute(boolean mute); // 이렇게만 넣으면 에러가 나고 다 고쳐야 하니까  (인터페이스가 변경되었을때 다른 클래스들도 바꿔줘야해서 예외처리)
    // 자바 버전 1.8이후에 추가 되었으며 예외적으로 메소드의 구현부를 가질 수 있습니다.
    default void setMute(boolean mute) { // default method 로 만들어줌
         if(mute) System.out.println("무음 처리 합니다.");
         else System.out.println("무음 해제 합니다.");
     }

}
