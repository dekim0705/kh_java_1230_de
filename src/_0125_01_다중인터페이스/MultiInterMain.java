package _0125_01_다중인터페이스;

public class MultiInterMain {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar(true, 22, true, 220,
                "red", "2022", true); // ()안에 들어가는 것들 : 인자

        sportsCar.viewInfo();
    }
}
