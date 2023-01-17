package 평균은넘겠지Example;

import java.util.Scanner;

public class AboveAve_Ex {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int testCnt = sc.nextInt();
            double[]result = new double[testCnt];
            for(int i = 0; i < result.length; i++) {
                result[i] = overRate();
            }
            for(double val : result) {
                System.out.printf("%.3f%%\n", val);
            }
        }


        static double overRate() {
            int total = 0, overCnt = 0;
            Scanner sc = new Scanner(System.in);
            int studentCnt = sc.nextInt();
            int[] score = new int[studentCnt];
            for(int i = 0; i < score.length; i++) {
                score[i] = sc.nextInt();
                total += score[i];
            }
            double average = (double)total / studentCnt;
            for(int val : score) {
                if (val > average) overCnt++;
            }
            return (double)overCnt/studentCnt * 100;
        }
    }
