package 추상메소드;

public class AbstractMainEx2 {
    public static void main(String[] args) { // 메인 만들때 두가지 방식 : 자신의 참조자
        Phone phone = new SmartPhone("Galaxy S22");
        phone.setPower(true);
        phone.call();
        // phone.internet(); // internet 은 자식이 SmartPhone 에서 독립적으로 구현한 기능이라서 접근 X
        // 해당 기능을 abstract 로 부모에게 넣어주면 됨 but can be problematic
        phone.internet();



//        SmartPhone smartPhone = new SmartPhone("Galaxy S22");
//        smartPhone.setPower(true); // 부모가 만들었던 부분. 전원 켜기
//        smartPhone.call(); // 추상화 상속
//        smartPhone.internet();
    }
}
