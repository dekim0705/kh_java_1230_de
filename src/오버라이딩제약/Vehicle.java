package 오버라이딩제약;

public class Vehicle {
    protected int speed;  // protected: 상속관계와 동일 패키지 내에서 접근 가능
    protected String color; // 앞에 private을 붙이면 밑에서 사용 X. protected는 상속관계에선 보여주고 외부로부터는 내부값을 보호하겠다는 뜻
    protected String name;
    // final 은 최종 상태를 의미하며, 메소드에서 사용 시 오버라이딩이 불가 함을 의미 합니다 (class앞에 붙이면 상속도 불가하지만 굳이 안씀)
    final void accelerator () { // final = 상수 = 더 이상 변경 불가. 오버라이딩제약 방법은 final을 붙이는 것
        System.out.println("차의 속도를 증가시킵니다~");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소시킵니다~");
    }
}

class SportsCar extends Vehicle { // Vehicle로 부터 상속 받은 SportCar 객체???
    // SportsCar의 기능 구현
    boolean isTurbo; // ********isTurbo라는 boolean변수를 선언한 다음에 false를 기본값으로 설정한다는건 차가 원래는 꺼져 있다? 최고속도가 280이다??라는 뜻입니까ㅠ??? 모르겠써용...
    SportsCar(String name) { // 생성자
        isTurbo = false; // 터보모드가 켜지면 차의 최고 속도를 증가 시키는 기능. 상속 받은 기능이 아님  (false가 원래 기본값이란 뜻일까? true를 해줘야 켜지는 느낌..적인 느낌...?)
        speed = 280; // Vehicle로부터 상속받은 기능
        this.name = name; // 생성자로부터 이름을 입력 받아 인스턴스 필드의 초기값으로 사용. (this는 자기 이름과 매개변수로 전달받은 이름이 동일할 때 사용)
        color = "Red";
    }
    int getSpeed() { // 게터라고 부른다. 내부에 있는 필드를 읽기 위한 용도(?)
        if(isTurbo) return speed *= 1.2; // 만약 isTurbo(False상태)가 켜져있으면 return으로 1.2 배만큼 속도 증가를 하라는 뜻 안켜져있으면 걍 원래 상태 =280
        return speed;
    }
    boolean getTurbo() {
    return isTurbo;
    }
    void setTurbo(boolean turbo) { // 세터. 값을 설정하기 위한 것 = 외부에서 내부에 있는 필드값을 사용하기 위해 사용.  값을 변경하는법은 하나. 매개변수를 통해서, setTurbo()에서 ()부분
                                // (boolean turbo)에서 turbo부분은 이름 그냥 정해도 상관 X 외부에서 받는 값에 대한 통로이기때문에 이름 자체는 의미가 없음. 어떤 값이 들어오는지가 중요. t/f중에 뭐가 들어오니?
        isTurbo = turbo;
    }
    void infoCar() { // 출력부분
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed()); // infoCar메소드 내에서 getSpeed메소드 사용한상태
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo);
    }
}

class ElectricCar extends Vehicle {
    boolean isAutoDrv;

    ElectricCar(String name) { //생성자
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        this.color = "white";
        // color = "red";  // 여기서는 color를 쓰든 this.color를 쓰든 상관이 없음. "색상"이 다르니까
    }

    boolean getAutoDrv() {
        return isAutoDrv;
    }
    void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }

    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrv);
    }
}


