package 클래스기본;
// 클래스 이름 참조변수 = new 클래스이름();
public class BasicClass {
    public static void main(String[] args) {  // class내에는 main이라는 메소드가 있음
        Car gv80 = new Car("GV80", "white", "2023.01",230 ); // 이 값을 초기값으로 설정한 차가 만들어 진다는 뜻
        Car santafe = new Car("Santafe", "Gray", "2023.01",210 );
        Car kona = new Car("Santafe", "Gray", "2023.01",190 );

        gv80.setName("GV80 Sports"); // 이름 바꾸기 가능
       // gv80.name = "GV80 깡통"; // 윗줄 아랫줄 둘다 바뀌는데 이렇게는 하면 안됨. 그래서 private접근제한자를 추가해줘야함

        gv80.viewCar();
        santafe.viewCar();
        kona.viewCar();

    }
}



// main안에서 class를 만들어도 되는데 public을 쓰면 안됨. public은 한번만 올 수 있음.
// 접근제한자가 default인 클래스 생성 (동일한 패키지 내에서 접근 가능)
class Car {
    static String manufacture = ("현대자동차"); // class변수 (넓은 의미에서 field라고 부름) // 제조사 고정 // 객체소속 아니고 설계도면에 딸려있는 고정된 값. 클래스에 붙어있는 애
    private String name; //인스턴스 필드 (클래스가 객체로 만들어 질 때 객체의 갯수 만큼 생성 됨),  객체가 만들어질때 가취 만들어쥐는 애덜
    String color; // 인스턴스 필드 = 객체변수
    String productYear;
    int maxSpeed;
    // 생성자 : 클래스 이름과 동일하고 반환 타입이 없다. void조차 없다
    // 생성자는 주로 객체 생성 시 객체 내부의 필드르 초기화 하는 목적으로 사용 된다.
    // 필드는 생성자의 매개변수로 전달 된다. (객체를 생성하는 곳에서....)
    // 객체로 만들어질 때 생성자는 저절로 불러짐
    Car(String name, String color, String year, int speed) {
        // 여기서 name은 매개변수로 외부에서 전달받는 값
        this.name = name;   // 전달받은 매개 변수와 객체 내부의 필드의 이름이 같은 경우는 숨겨진 this를 적어야 함
                            // this = 자기참조변수. 내부에 있는 애들이 가지고 있는 상태인데 생략되어있음. 내부 name과 외부 name을 구분하려면 this붙여줘야함
        this.color = color;
        productYear = year;
        maxSpeed = speed;
    }
    Car() {} // 얘는 기본 초기값이라서 아무것도 없는 car를 만들고 싶으면 얘를 쓰는거 (?)
    // Setter 메소드 : 인스턴스의 값을 설정하는 메소드 *접근제한자 특성
    void setName(String name) {
        this.name = name;
    }

    void setColor(String color) {
        String test = "test"; // 지금 여기에서 만들어지고 이 중괄호 사이에서만 적용되는 지역변수
       // this.color = color + test; // test는 이 뒤로도 계속 남아있음
        this.color = color;
    }

    void viewCar() {
        System.out.println("제조사: "+ manufacture);
        System.out.println("이름: " + name);
        System.out.println("출고 연도: " + productYear);
        System.out.println("최고 속도: " + maxSpeed);
        System.out.println("---------------");

    }
}

// 초기값은 객체를 만들때 넣어준다. tv를 나라마다 수출할 때 기준값이 달라져야함. 그걸 생성자에서 집어넣어준다.
// 생성자를 여러개만들면 -> 생성자 오버로딩