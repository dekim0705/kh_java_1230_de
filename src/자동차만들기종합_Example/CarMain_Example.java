package 자동차만들기종합_Example;

import java.util.Scanner;

public class CarMain_Example {
    public static void main(String[] args) {
        // 인덱스로 해당 거리를 구함
        final int[] dist = {0, 400, 150, 200, 300}; // 0을 비우는 부분은 인덱스를 맞추기 위해. final 을 붙인 이유는 r&w이 아니고 Ronly 이기 때문에
        Car_Example car = null; // 부모의 클래스의 참조변수로 선택된 차량의 객체를 연결하기 위한 것
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int city = sc.nextInt();
        System.out.print("이동할 승객의 수 : ");
        int passCnt = sc.nextInt();
        System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int sel = sc.nextInt();
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();

        boolean isMode = (option == 1) ? true : false; // 입력은 정수로 받아야 함

        switch(sel) {
            case 1 : car = new SportsCar("Ferrari"); break;  // 차를 결정하지 않고 null상태에 있다가 이 시점에서 차를 선택할 때 car에 붙이는 것 : 동적바인딩
            case 2 : car = new Sedan("GV80"); break;
            case 3 : car = new Bus("관광버스"); break;
            default : System.out.println("차량 선택이 잘 못 되었습니다.");
        }

        car.setMode(isMode); // 인스턴스필드에있는 값을 바꿔줘야 함. 해당하는 부가옵션을 바꿔놓고 시작.
        int moveCnt = car.getMoveCnt(passCnt);
        System.out.println("======= " + car.getName() + " =======");
        System.out.println("총 비용 : " + car.getTotalCot(dist[city], moveCnt) + "원"); // city 가 dist 의 인덱스
        System.out.println("총 주유 횟수 : " + car.getReFuelCnt(dist[city], moveCnt) + "번");
        System.out.printf("총 소요 시간  : %.2f\n", car.getMoveTime(dist[city], moveCnt));





    }
}

