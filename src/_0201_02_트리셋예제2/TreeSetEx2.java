package _0201_02_트리셋예제2;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
//        Integer[] score = {78, 45, 60, 54, 92}; // 컬렉션에 기본타입은 못들어가니까 int 배열 대신 Integer 배열
//        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(score));
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(78, 45, 60, 54, 92));

        System.out.println("60점 미만 : " + ts.headSet(60));
        System.out.println("60점 이상 : " + ts.tailSet(60));

        // 주어진 점수 바로 아래의 점수 출력
        System.out.println("60점 바로 아래 점수 : " + ts.lower(60));
        // 주어진 점수 바로 위의 점수 출력
        System.out.println("60점 바로 위의 점수 : " + ts.higher(60));



    }
}
