package 다형성응용2;

public class Driver {
    String name; // 운전자 이름
    public Driver(String name) {
        this.name = name;
    }
    public void drive(Vehicle vehicle) {
        System.out.print(name + "의 ");
        vehicle.run();
    }
}


// 여기서 Driver와 Vehicle 클래스를 따로 만든 이유는? public이 붙는 클래스는 하나씩밖에 못만들어서..?