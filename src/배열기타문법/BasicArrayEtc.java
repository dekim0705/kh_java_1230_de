package 배열기타문법;

import java.util.Arrays;

public class BasicArrayEtc {
    public static void main(String[] args) {
        int[] score = new int[5]; //국어, 영어, 수학, 과학, 미술
        for(int i = 0; i <= score.length; i++) {
            score[i] = 100;
        }
        System.out.println(Arrays.toString(score));
    }
}
// for문에서 i <= score -> 0,1,2,3,4,5 -> inde 5 out of bounds for length 5
//