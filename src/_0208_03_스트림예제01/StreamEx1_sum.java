package _0208_03_스트림예제01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx1_sum {
    public static void main(String[] args) {
        Integer[] arrSum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listSum = new ArrayList<>(Arrays.asList(arrSum));
        int sum = listSum.stream().mapToInt(e->e).sum(); // mapToInt : 중간연산, int 스트림을 구성, sum : 최종 연산
        // (mapToInt() : map 에서 값을 꺼내서 정수형의 새로운 map 을 만들어 냄)
        // (mapToInt()에 e->e 를 넣는 이유는 순회 해라, s라는 조건을 가지고 s을 순회하며 꺼내라는 뜻.
        // (??? sum() 이후에 forEach()를 못 넣는 건 이미 소멸되어서...?)

        int count = (int) listSum.stream().count(); // count()의 반환타입은 long type 이라서 형변환 필요
        System.out.println("합계 : " + sum);
        System.out.println("횟수 : " + count);


    }
}


