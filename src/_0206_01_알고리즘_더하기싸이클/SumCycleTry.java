package _0206_01_알고리즘_더하기싸이클;

import java.util.Scanner;

public class SumCycleTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int[] arr = new int[2];
        int[] tmpArr = new int[1];
        String n = sc.next();
            int sum = 0;
            String tmpStr;
            if(n.length() == 1) {
                for (int i = 0; i < n.length(); i++) {
                    arr[1] = n.charAt(0) - '0';
                    sum += arr[1];
                    tmpArr[0] = sum;
                }

            }  else {
                for (int i = 0; i < n.length(); i++) {
                    arr[0] = n.charAt(0) - '0';
                    arr[1] = n.charAt(1) - '0';
                    sum += arr[i];
                }
            }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(sum);

        while(true) {
            int nN = Integer.parseInt(n);
            int cnt = 0;
            tmpStr = (Integer.toString(sum));
            if((arr[1] + tmpArr[0]) != nN)
                cnt++;
            for(int i = 0; i < tmpStr.length(); i++) {
                tmpArr[i] = tmpStr.charAt(i) - '0';

            }

            if(n.equals(tmpStr)) {
                System.out.print("총 싸이클 횟수 : " + cnt);
                break;
            }
        }

    }

    }



