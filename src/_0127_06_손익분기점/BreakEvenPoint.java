package _0127_06_손익분기점;
import java.util.Scanner;
// 첫번째 : 고정비용
// 두번째 : 가변비용
// 세번째 : 판매금액
// 예외처리 : 손익분기점을 달성할 수 없으면 -1 반환
public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost = sc.nextInt();   // 고정비용
        int varCost = sc.nextInt();   // 가변비용(생산비용)
        int sellPrice = sc.nextInt(); // 판매금액
        int cnt = 0;
        if(varCost >= sellPrice) { // 예외부분 먼저
            System.out.println("-1");
            return; // void 여도 return 가능. if the condition;s true, the program ends
        }
        System.out.println((fixCost / (sellPrice - varCost)) + 1); // 손익분기점 구하는 공식. +1해야 이익이라서 해줘야 함.

/*
        while(true) { // X 값이 커져서 int 범위를 벗어날수도 있는 방법임
            if (fixCost + (varCost * cnt) < sellPrice * cnt) break;
            cnt++;
        }
        System.out.println(cnt);

 */

    }
}






/*
        Scanner sc = new Scanner(System.in);
        System.out.print("고정비용, 가변비용, 노트북가격 입력 : ");
        long fixedP = sc.nextLong();
        long changeP = sc.nextLong();
        long laptopP = sc.nextLong();
        int bkPoint = 0;
 */


