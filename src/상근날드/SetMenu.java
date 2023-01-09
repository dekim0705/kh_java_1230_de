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
        int[] menu = new int[5]; // 5개의 정수로 구성된 배열 생성; menu는 하위 stack영역에 8바이트 주소 공간이 생겨남 -> new자체가 heal영역에 메모리를 할당 해주는 것 heap영역에 0|1|2|3|4|로 생김
        // 정수가 많아지면 배열에 넣는게 나음
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : "); // 화면 출력
        for (int i = 0; i < menu.length; i++) { // 괄호 뒤에 ;를 넣으면  그 다음 중괄호 i값이 안잡힘. ;와 동시에 i변수는 사라져버림. 지역변수는 항상 중괄호 범위 내에서 생존
            menu[i] = sc.nextInt(); // 배열의 길이 만큼 순회하면서 값을 연속으로 입력 받음
            // for문 조건식에서 i <= menu.length; 로 입력한다면 0,1,2,3,4,5 까지 받는게 됨. 배열 5개 잡아놓고 공간을 6개 쓰는 상황 = arrayindexoutofboundsexception
            // ******(?)menu.length 의 공간은 6개=0,1,2,3,4,5.(?)     i < menu.length로 하면 0,1,2,3,4 까지 돌린다는거
            // ******(?)배열크기가 5개이면 인덱스도 5개가 나와야하는데 인덱스는 0부터 시작하기때문에 배열크기5 == 인덱스[0~4]
        }
        int minBurger = menu[0]; // 0 ~ 2 index 사이의 햄버거 중 하나의 값을 기본값으로 설정
        int minDrink = menu[3]; // 3 ~ 4 index 사이의 음료 중 하나의 값을 기본 값으로 설정
        // 반복문을 순회하면서 제일 싼 햄버거와 음료를 하나씩 선택
        for(int i = 0; i < menu.length; i++) {

            if((i < 3) && (minBurger > menu[i])) minBurger = menu[i]; // 앞의 조건은 3보다 작아야하니까 0,1,2만 됨. 뒷 조건은 성립이 안됨.
                                                                      // 지금 있는 minBurger 기준의 가격보다 더 싼게 있으면 minBurger에 그 가격을 집어넣어라
            if((i > 2) && (minDrink > menu[i])) minDrink = menu[i]; // 앞의 조건으로 3,4가 있는 상태에서 minDrink(3)이 다른 menu[i]보다 가격이 싸면 그걸 minDrink로 바꿔라
        }
        System.out.println(minBurger + minDrink - 50); // 문자열과 결합을 하고 있지 않기 때문에 괄호 필요 x. 다 정수임
    }
}

/* 내가 한거
        Scanner sc = new Scanner(System.in);
        System.out.print("햄버거 3가지, 음료 2가지의 가격을 입력하세요: ");
        int[] price = new int[5];
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }

        int minH = price[0];
        int minD = price[3];

        //for (int i = 0; i <= price[3]; i++) // 조건식이 i < price[3]일때랑 어떻게 다르지?
        if (minH < price[1] && minH < price[2]) {
        } else if (price[1] > price[2]) {
            minH = price[2];
        } else {
            minH = price[1];
        }      //System.out.println("가장 저렴한 햄버거는 " + minH + "원 입니다");


        //for (int i = 0; i <= price[4]; i++)
        if (minD < price[4]) {

        } else {
            minD = price[4];
        }
                    //System.out.println("가장 저렴한 음료는 " + minD + "원 입니다.");


        System.out.println("가장 저렴한 세트는 " + (minH + minD-50) + "원 입니다." );
 */

