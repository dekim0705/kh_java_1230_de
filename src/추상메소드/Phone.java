package 추상메소드;
// 추상클래스 만들기
// 인스턴스 필드 포함, 생성자 포함, 인스턴스 메소드 포함
public abstract class Phone {
    String name;
    boolean isPower;
    Phone(String name) { // 매개변수가 있는 생성자를 만듬. 자식객체가 만들어 질 때 생성자를 호출하는데 (객체를 만들기위해 생성자호출) 해당 생성자에 매개변수가 있어서 super넣어서 데려와야함.
        this.name = name;
    }
    void setPower(boolean power) { // 상속을 받는 클래스에서 오버라이딩 자유가 있음.
        isPower = power;
        if(isPower) {
            System.out.println("Phone Power ON");
        } else {
            System.out.println("Phone Power OFF");
        }
    }
    abstract void call(); // 상속을 받는 클래스에서 반드시 오버라이딩 해서 구현 해야 함.
    abstract void internet();
}
