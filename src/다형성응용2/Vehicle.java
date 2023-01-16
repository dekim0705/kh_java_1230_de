package 다형성응용2;

public class Vehicle {
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}
class SportsCar extends Vehicle {
    @Override // 오버라이드는 접근제한자, 반환타입 다 똑같아야 함
    public void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}
class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
class Truck extends Vehicle {
    @Override
    public void run() {
        System.out.println("트럭이 달립니다.");
    }
}