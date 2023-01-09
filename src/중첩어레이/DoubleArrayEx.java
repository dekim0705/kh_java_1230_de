package 중첩어레이;
//  2차원 배열에 대해서
public class DoubleArrayEx {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 2행 3열. 처음에 행으로 접근하면 값이아니고 주소를 가리키는 것.
                                     // arr는 주소를 가지고 있음. arr주소를 따라 가도 (3)열에 대한 주소를 가리키는것이지 값이 아님.
        int k = 10;
        for(int i = 0; i < arr.length; i++) { // arr.length는 원래 배열의 갯수를 알려주는데 지금은 행의 갯수를 알려줌
            for(int j = 0; j < arr[i].length; j++){ // 길이가 잡힘(열)
                arr[i][j] = k; // arr[i] 만 하면 열의 주소를 가리기는것
                k += 10;
            }
        }
        for(int[] row : arr) {
            for(int e : row) System.out.print(e + " ");// e가 element가 아니고 행에대한 주소임. row = 행에대한 배열
            System.out.println();
        }
            //  1차원 배열은 2차원배열이 여러개 중첩되어 있다는 뜻. element 자체가 배열
            // 이중포문에서 element는 element로 접근하면 안됨. 배열임. 순회할 데이터타입조차도 배열임.

 /*
 기본포문
         for(int i = 0; i < arr.length; i++) { // arr.length는 원래 배열의 갯수를 알려주는데 지금은 행의 갯수를 알려줌
            for (int j = 0; j < arr[i].length; j++) { // 길이가 잡힘(열)
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // 하나의 행을 찍고, 행이 바뀔 때 줄바꿈
        }
  */

    }
}
