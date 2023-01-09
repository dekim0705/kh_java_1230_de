package 배열의활용;
// copyof () : 배열을 원하는 길이 만큼 새로운 배열로 복사
import java.util.Arrays;

public class Arrayapply02 {
    public static void main(String[] args) {
                int[] arr1 = {90, 45, 77, 80, 55}; // 원본데이터.
        int[] arr3 = Arrays.copyOf(arr1, 10);
        System.out.println( Arrays.toString(arr3));
    }
}


