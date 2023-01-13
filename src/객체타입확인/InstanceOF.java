package 객체타입확인;
// instanceOf : 객체 타입 확인 연산자, 부모와 자식 관계 성립 여부를 확인
public class InstanceOF {
    public static void main(String[] args) {
        Parent parent = new Parent("부모"); // Parent클래스를 가지고 만든 참조객체
        Child child = new Child("자식");

        System.out.println(parent instanceof Parent); // True. Parent 클래스를 가지고 parent가 만들어진거니? 라고 물어보는 용도
        System.out.println(child instanceof Parent); // True // 상속관계를 이용해서 동적바인딩이나  느슨한 결합을 만들때 필요한 부분
        System.out.println(parent instanceof Child); // False
        System.out.println(child instanceof Child); // True
    }
}

class Parent {
    String name;
    public Parent(String name) { // 생성자 생성, generator이용
        this.name = name;
    }
}

class Child extends Parent {
    public Child(String name) {
        super(name); // 부모가 생성자를 가지고 생성이 됐다면 자식도 생성자를 한번 더 불러와야한다
        this.name = name;
    }
}