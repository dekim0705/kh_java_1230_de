package 배열의활용;

import java.util.Arrays;

// arraycopy() : 배열값을 복사할 때 사용
public class Arrayapply {
    public static void main(String[] args) {
        int[] arr1 = {90, 45, 77, 80, 55}; // 원본데이터. 점수 5개. 컴파일러가 크기를 알고있기때문에 그냥 넣어도 됨
        int len = 10;
        int[] arr2 = new int[len];
        System.arraycopy(arr1,0, arr2, 4, arr1.length); // arraycopy 배열을 복사하는 명령어 arr1의 0번재부터 arr2의 @부터 얼마만큼 복사할껀지
        System.out.println(Arrays.toString(arr2));

        /* 그냥 반복문으로 처리해도 됨
        for(int i = 0; i < arr1.length; i++) {
            arr2[i+3] = arr1[i];
        }
         */
    }
}
