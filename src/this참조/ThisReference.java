package this참조;
// this : this 참조 변수는 자기자신의 객체 주소를 참조 하는 변수 (this변수)
// this() :생성자에서만 사용가능 (this메소드)
// 같은 클래스내에서 여러개의 생성자가 만들어 지는 경우 중복되는 코드가 많이 생기는데(오버로딩) 이를 보완하기 위해서 사용
public class ThisReference {
    public static void main(String[] args) {
    }
}

class Car {
    private String modelName; // 인스턴스 필드
    private int modelYear; // 인스턴스 필드
    private String color; // 인스턴스 필드
    private int maxSpeed; // 인스턴스 필드
    public Car(String modelName, int modelYear, String color, int maxSpeed) { // 생성자. 반환타입은 없고 이름은 같은 것
       this.modelName = modelName; // 클래스가 아니고 자기 자신의 객체를 참조. 내부 인스턴스 필드와 외부 입력값이 같을 때 이름 구분하는 용도
       this.modelYear = modelYear;
       this.color = color;
       this.maxSpeed = maxSpeed;
    }

    public Car(String modelName, int modelYear, String color) { // 이렇게 가져오면 maxSpeed없이도 포맷이 생김
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    public Car() { // () <- 빈 생성자 호출 후. 임의적인 값을 넣고 싶을 때
        this("싼타페", 2022, "Red"); // 내부에 있는 생성자를 다시 부르는 건데 하나라도 지우면 안돌아감(?)
    }
    public Car(String model) {
        this(model, 2022, "Red", 220); // model미리 불러놓는거
    }

}
