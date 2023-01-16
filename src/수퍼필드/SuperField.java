package 수퍼필드;
// super : 자식 클래스가 부모클래스로부터 상속 받은 필드(멤버)를 참조하는 변수
public class SuperField {
    public static void main(String[] args) {
       Child child = new Child();
       child.childMethod();
    }
}

class Parent {
    int x = 10;
}
class Child extends Parent { // 오버라이딩이 있으면 자기 자신의 값이 먼저임
    int x = 20;
    void childMethod() {
        System.out.println("x : " + x);
        System.out.println("this.x : " + this.x);
        System.out.println("super.x : " + super.x);
    }
}
