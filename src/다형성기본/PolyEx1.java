package 다형성기본;
// 다형성이란? 여러가지 타입을 한가지 타입으로 처리하는 기술을 의미 (상속 관계를 이용)
// 부모 클래스의 참조 변수로 자식클래스의 객체(혹은 인스턴스)를 참조하는 방법
// 단, 부모클래스가 가지고 있는 메소드가 오버라이딩이 되어 있는 경우에 해당
public class PolyEx1 {
    public static void main(String[] args) {
        ChildPoly childPoly = new ChildPoly();; // 자식 클래스의 참조변수로 자식 객체를 참조
        childPoly.display(); // 참조변수(childPoly)타입하고 . 누르면 뜨는 것들중에 두꺼운 글씨들이 불러올 수 있는 것들
        childPoly.out();

        ParentPoly parentsPoly = new ChildPoly(); // 부모클래스의 참조 변수로 자식 객체를 참조
        parentsPoly.display(); // 오버라이딘 된 애가 불림 .out()은 부모클래스에는 없어서 안뜸
    }
}
