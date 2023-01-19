package 추상메소드;

public class SmartPhone extends Phone {
    SmartPhone(String name) {
        super(name); // 매개변수 있는 생성자여서 super 이용하여 부모꺼 먼저불러 와야 함
    }

    @Override
    void call() { // 추상메소드 상속 후 mandatory 구현

        System.out.println("부모의 요청으로 통화 기능을 구현 합니다.");
    }
    @Override
    public void internet()
    {
        System.out.println("인터넷 기능을 만듭니다");
    }
}

