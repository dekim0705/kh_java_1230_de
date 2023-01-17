package 평균은넘겠지;

import java.util.Arrays;
import java.util.Scanner;

public class AboveAverageSetting {
    int sum = 0, cnt = 0;

    public int getStudentNum() {
        Scanner sc = new Scanner(System.in);
        int studentNum = sc.nextInt();
        int[] grades = new int[studentNum];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = sc.nextInt();
            sum += grades[i];
        }
        double average = (double)sum / studentNum;
        for (int val : grades) {
            if(val > average) cnt++;
        }
        return (int) ((double)cnt / studentNum * 100);
    }
}
