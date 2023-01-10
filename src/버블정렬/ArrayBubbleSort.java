package 버블정렬;

// 1차원 배열을 이용한 버블 정렬 : 가장 비효율적이지만 구현하기 쉬운 정렬 방식
// 거품모양처럼 하나하나 1:1로 자기와 인접한것과 비교해가는것
public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 33, 100, 5, 8, 7, 6, 2, 1};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) { // i 값 한번마다 j가 한바퀴 돌아야함
            for(int j = i; j <arr.length; j++) {
                if(arr[i] > arr[j]) {
                    tmp = arr[j]; // tmp를 이용해서 값 변경
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int e : arr) System.out.print(e + " ");

    }
}
// 값이 오름차순으로 정렬됨 (크기순)
// swap : 안의 값을 뒤집는 것
// tmp : 임시버퍼