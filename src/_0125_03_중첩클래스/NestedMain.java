package _0125_03_중첩클래스;
// 중첩클래스란? 하나의 클래스 내부에 선언된 또 다른 클래스를 의미
// 일반적으로는 여러 클래스와 관계를 맺는 경우 독립적으로 클래스를 선언 함
// 특별한 경우 특정 클래스와 관계를 맺는 클래스를 내부에 선언 하기도 함
// - 내부 클래스에서 외부 클래스 멤버의 손쉬운 접근 가능
// - 클래스를 논리적으로 묶어서 표현함으로써, 코드의 캡슐화 증가
// - 코드의 복잡성을 줄일 수 있음
public class NestedMain {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        // 내부클래스에 대한 객체를 별도로 만들 필요 없음. 생성자에서 내부클래스에 대한 객체를 이미 만듬.
        outerClass.usingClass(); // 정상적으로 내부 클래스의 메소드를 사용하는 방법
        outerClass.innerClass.inTest(); //
    }
}
// ** 내부클래스 사용시 외부클래스를 이용하여 내부클래스 객체를 만들어줘야 함(?)


//    // 사용빈도 떨어짐 (main 부분)
//    A a = new A(); // 먼저 외부클래스를 생성한 후 내부 클래스 생성 해야 함
//    A.B b = a.new B(); // b 라는 객체가 만들어짐
//        b.testMethod();
//class A {
//    class B {
//        void testMethod() {
//            System.out.println("중첩 클래스의 메소드 입니다.");
//        }
//    }
//}












// the concept of object-oriented style can be overlooked cuz the inner class is dependent of the outer class, which means it cannot be used in other purposes
