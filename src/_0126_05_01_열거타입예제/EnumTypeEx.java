package _0126_05_01_열거타입예제;

public class EnumTypeEx {
    public static void main(String[] args) {
        Developer developer = new Developer("딸기고양이", DevType.BACKEND, Career.JUNIOR, Gender.FEMALE);
        developer.devInfo();

        Developer developer1 = new Developer("복숭아멍멍이", DevType.FRONTED, Career.SENIOR, Gender.FEMALE);
        developer1.devInfo();
    }
}
