package _0130_06_X보다작은수;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제 : 정수 N개로 이루어진 배열 A와 정수 X가 주어진다. 이 때 A에서 X보다 작은 수를 모두 출력
// 입력 : 10 5 -> 배열의 길이와 주어진 수
//     : 1 10 4 9 2 3 8 5 7 6
// 출력 : 1 4 2 3
public class LessThanXEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt(); // 배열의 개수
        int x = sc.nextInt(); // 비교 값
        for(int i = 0; i < n; i ++) {
            list.add(sc.nextInt());
            if(list.get(i) < x) System.out.print(list.get(i) + " ");
        }
    }
}


/*
List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int x = sc.nextInt();
        int val;
        for(int i = 0; i < arrLength; i++) {
            val = sc.nextInt();
            list.add(val);
        }
//        for(int i = 0; i < arrLength; i++) {
//            if(list.get(i) < x) System.out.print(list.get(i) + " ");
//        }

        for(Integer v : list) {
            if(v < x) System.out.print(v + " ");
        } // 처음 배열에 집어넣을때에는 enhanced for 못돌림. MultipleSearch 는 while 에서 하나씩 집어넣었기 때문에 이미 만들어졌었던 상황(?)
 */