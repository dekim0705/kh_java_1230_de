//package _0209_03_알고리즘_구간합구하기;
//import java.util.Scanner;
//// (*** 비슷하게 틀렸으니까 다시 보기!)
//public class PartialSum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int arrNum = sc.nextInt();
//        int testCaseNum = sc.nextInt();
//        int cnt=0;
//        int sum = 0;
//        int[] arr = new int[arrNum];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        } //System.out.print(Arrays.toString(arr)); // (배열 만듬 : [5, 4, 3, 2, 1])
//         while (true) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
////             if(cnt == testCaseNum) break;
//             for(int i = 0; i < arr.length; i++) {
//                sum += arr[b-1];
//                sum -= arr[a];
//              } cnt++;
//             System.out.print(sum);
//         }
//    }
//}
