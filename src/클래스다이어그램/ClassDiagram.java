package 클래스다이어그램;
// 1월 17일 예상 시험문제
// 클래스다이어그램 (클래스 이름이 Circle)
// + : public   - : private
// + PI : double = 3.14 => public static final PI = 3.14
// - radius : double    => private double radius;
// + Circle(radius:double) => public Circle(double radius) // Circle 에 대한 생성자
public class ClassDiagram {
    public static void main(String[] args) {
//        Circle circle = new Circle(); // 객체 생성시 생성자의 매개변수를 넣어야 함. 아래 생성자에 매개변수가 있어서
        Circle circle = new Circle(20.0);
        circle.setRadius(3.1);
        circle.draw();
    }
}
class Circle {
    public final static double PI = 3.14;
    private double radius; // 접근제한자 확인 필요 (- 는 private 을 의미 함)
    public Circle(double radius) { // 얘는 매개변수가 있는 생성자. 하나만 있으니까 메인에서 호출할때도 매개변수가 있는 생성자로 호출해야 함.
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) { // set에는 항상 매개변수가 들어감
        this.radius = radius;
    }
    public static double getPi() {
        return PI;
    }
    public void draw() {
        System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
    }
}

