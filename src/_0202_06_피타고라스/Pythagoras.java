package _0202_06_피타고라스;
import java.util.Scanner;
/* 예제 입력
6 8 10
25 52 60
5 12 13
0 0 0
 */

public class Pythagoras {
    public static void main(String[] args) {
       while(true) {
           Scanner sc = new Scanner(System.in);
           int[] arrNum = new int[3];
           int num = 0;
           for (int i = 0; i < arrNum.length; i++) {
               arrNum[i] = sc.nextInt();
           }
           num = arrNum[0] + arrNum[1] + arrNum[2];
           int x = (arrNum[0] * arrNum[0]) + (arrNum[1] * arrNum[1]);  // a b
           int y = (arrNum[1] * arrNum[1]) + (arrNum[2] * arrNum[2]);  // b c
           int z = (arrNum[2] * arrNum[2]) + (arrNum[0] * arrNum[0]);  // c a


           if(num == 0) break;
         if(x == (arrNum[2]*arrNum[2]) || y == (arrNum[0]*arrNum[0])) {
           System.out.println("right");
       } else if(z == (arrNum[1]*arrNum[1])) {
          System.out.println("right");
       } else System.out.println("wrong");





           }
    }
}
