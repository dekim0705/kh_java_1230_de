package 상근날드;

import java.util.Scanner;

// 상근날드 가게에서는 세트 메뉴를 판매 합니다.
// 햄버거는 3개 종류가 있고
// 음료 2가지 종류가 있음
// 입력은 총 5개의 값을 연속으로 입력 하는데 햄버거 3가지, 음료 2가지의 가격을 연속으로 입력; 햄버거를 0,1,2에 넣고 음료를 3,4에 넣는것
// 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2중 싼 것 선택하고, 세트 메뉴이기 때문에 50원 할인
// 총 세트 메뉴의 금액 구하는 문제

public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("햄버거 3가지, 음료 2가지의 가격을 입력하세요: ");
        int[] price = new int[5];
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }

        int minH = price[0];
        int minD = price[3];

        for (int i = 0; i <= price[3]; i++) ; // 조건식이 i < price[3]일때랑 어떻게 다르지?
        if (minH < price[1] && minH < price[2]) {
        } else if (price[1] > price[2]) {
            minH = price[2];
        } else {
            minH = price[1];
        }      System.out.println("가장 저렴한 햄버거는 " + minH + "원 입니다");


        for (int i = 0; i <= price[4]; i++);
        if (minD < price[4]) {
            System.out.println("가장 저렴한 음료는 " + minD + "원 입니다");
        } else {
            minD = price[4];
                    System.out.println("가장 저렴한 음료는 " + minD + "원 입니다.");
        }

        System.out.println("가장 저렴한 세트는 " + (minH + minD-50) + "원 입니다." );

    }

}



