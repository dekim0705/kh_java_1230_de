package _0125_01_다중인터페이스;

public class Car {
    protected int speed; // protected 접근제한자는 동일 패키지와 상속 관계에서 접근 가능
    protected String color;
    protected String year;
    public Car() { // 생성자. 생성자의 매개변수로 넣지 않고 임의의 값으로 넣기
        this.speed = 150;
        this.color = "white";
        this.year = "2022";
    }
}
