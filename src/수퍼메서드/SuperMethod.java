package 수퍼메서드;
// super() : 부모 클래스의 생성자를 호출하는 메소드 입니다. (자식의 생성자 내에서 호출)
// 자식의 생성자에서 부모의 생성자를 호출 할 때는 반드시 부모의 생성자를 먼저 호출하고 다른 초기화를 진행해야 함
// 생성자를 따로 만들지 않으면 기본 생성자가 호출되는 것처럼 부모의 생성자도 생성자를 별도로 만들어 주지 않으면 ...??
// 기본적으로 부모의 생성자가 자동 호출 됨
public class SuperMethod {
    public static void main(String[] args) {
        System.out.println("main 메소드 호출: ");
        Child child = new Child();
        child.display();
    }
}

class Parent {
    int a;
    // 생성자를 안만들면 기본 생성자가 자연적으로 만들어지는데 여기선 생성자 만들 것
    Parent() {
        System.out.println("부모의 기본 생성자 호출: ");
        a = 10;
    }
    Parent(int n) {
        System.out.println("부모의 생성자 호출: ");
        a = n;
    }
}

class Child extends Parent {
    int b;
    Child() {
        // 여기 사이에서 아무것도 없는 부모의 생성자를 불러온것. 우리한텐 안보임. """부모의 기본생성자가 무조건 불러짐."""
       super(200); // 디폴트 없으면 이렇게 super로 써어야함
        System.out.println("자식의 생성자 호출: ");
        // super(200); // super는 생성자 들어가자마자 불러줘야함. 최초실행 되어야 함.System~ 출력보다도 먼저. 항상 첫번째 줄
        b = 20;
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}
