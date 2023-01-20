//package 자동차만들기종합;
//
//import java.util.Scanner;
//public class Car {
//    String name;
//    int speed;
//    int fuel;
//    int tankSize;
//    int seat;
//    Car(String name) {
//
//        this.name = name;
//    }
//    ;
//    int[] areaKm = {0,400, 200, 150, 300}; // 지역 km
//    Scanner sc = new Scanner(System.in);
//
//
//
//    public void setGasStation(int area) {
//        // 필요한 기름 = 거리 / 연비
//        // 주유횟수 = 필요한 기름 / 탱크
//        int needOil = areaKm[area] / fuel;
//        int countOil = needOil / tankSize;
//        System.out.println("주유소에 들려야할 횟수는 : " + (countOil+1) + " 입니다.");
//    }
//
//    public void setAmount(int area) {
//        //총 필요한 돈 = 거리 / 연비 * 2000
//        int totalAmount = (areaKm[area] / fuel) * 2000;
//        System.out.println("들어갈 총 비용은 " + totalAmount + " 입니다.");
//    }
//     void setTurbo(boolean turbo) {
//        isTurbo = turbo;
//    }
////    public void setGasStation() {
////        // 필요한 기름 = 거리 / 연비1
////        // 주유횟수 = 필요한 기름 / 탱크
////        int needOil = areaKm[area] / fuel;
////        int countOil = needOil / tankSize;
////        System.out.println("주유소에 들려야할 횟수는 : " + countOil + " 입니다.");
////    }
//}
//
//class Sedan extends Car {
//    boolean isTrunk;
//    Sedan(String name) {
//        super("승용차");
//        isTrunk = false;
//        speed = 200;
//        this.name = name;
//        tankSize = 45;
//        seat = 4;
//        fuel =12;
//    }
//    int getSeat() {
//        if(isTrunk) return seat = 5;
//        return seat;
//    }
//    void setSeat(boolean trunk){
//        isTrunk = trunk;
//    }
//}
//class Bus extends Car {
//    boolean isTank;
//    Bus(String name) {
//        super("버스");
//        isTank = false;
//        speed = 150;
//        this.name = name;
//        tankSize = 100;
//        seat = 20;
//        fuel = 5;
//    }
//    int getTank() {
//        if(isTank) return tankSize = 130;
//        return tankSize;
//    }
//    void setTank(boolean tank) {
//        isTank = tank;
//    }
//}