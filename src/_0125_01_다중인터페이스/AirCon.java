package _0125_01_다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // 인터페이스에는 인스턴스변수가 못들어가서 컴파일러가 자동으로 public final static 를 추가 함
    int MIN_TEMP = 0;
    // 해당 인터페이스를 상속 받는 애는 아래 세가지를 무조건 구현해야 함
    void airConOn(); // 자도으로 추상메소드가 됨 ( abstract 자동 추가 됨)
    void airConOff();
    void setAirConTemp(int tmp);

}
