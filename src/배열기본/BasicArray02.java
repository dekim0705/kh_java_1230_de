package 배열기본;

public class BasicArray02 {
    public static void main(String[] args) {
        int[] score = {80, 99, 70}; // 이렇게 넣어도 저절로 갯수 파악 함

        int sum = 0;

        for (int i = 0; i < score.length; i++) {//length가 배열의 크기(몇개인지)를 알려줌
            sum += score[i]; // sum = sum +score[i];
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", sum / (double)score.length);

        }
    }
