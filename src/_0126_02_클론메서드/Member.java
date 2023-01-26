package _0126_02_클론메서드;

// Cloneable 실제 구현해야 할 메서드는 없지만 인터페이스 등록 후 사용, 단지 clone() 메서드 사용이 가능 하도록 권한(?)을 부여하는 의미
public class Member implements Cloneable {
    String id;
    String name;
    String pwd;
    int age;
    boolean isAdult;

    public Member(String id, String name, String pwd, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.isAdult = isAdult;
    }
    public Member getMember() { // getMember()의 리턴값이 Member 클래스 타입
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch(CloneNotSupportedException e) {}
        return cloned;
    }
}
