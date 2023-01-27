package _0127_02_Arrays클래스;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Arrays : 배열을 다루기 위한 다양한 메서드를 포함하고 있습니다.
// binarySearch() : 이분 검색 알고리즘 제공 (요소의 개수를 반으로 나누며 검색하는 것)
//                  이분검색은 항상 정렬(sort)이 선행되어야 함
// sort() : 기본적인 오름차순, 그리고 매개변수를 이용해 내림차순, 그리고 오버라이딩 통한 직접 구현
// toString() : 배열의 요소를 문자열로 출력
// asList() : 일반 배열을 ArrayList 로 변환
public class ArraysTestEx {
    public static void main(String[] args) {
//        int[] arr = {5,3,4,1,2, 345, 777, 657, 235};
//        Arrays.sort(arr); // 오름 차순 정렬
//        for(int e : arr) System.out.print(e + " ");

        // 배열의 개수 입력, 찻을 수 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 개수 : ");
        int num = sc.nextInt();
        // int[] arr = new int[num]; // 이렇게 하면 Comparator 이 안됨(?)
        Integer[] arr = new Integer[num];
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * num) + 1; // 배열의 개수를 100으로 잡으면 1부터 100까지의 난수가 발생
        }

        Arrays.sort(arr, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if(o1 < o2) return 1; // (o1 < o2) 내림 차순 정렬 // (o1 > o2) 올림 차순 정렬
                        else return -1;
                    }
                });


              //  Arrays.sort(arr);
        for(int e : arr) System.out.print(e + " "); // 입력받은 난수 만큼의 배열 발생
        System.out.println();
        // arr 배열에서 binarySearch()
        int rst = Arrays.binarySearch(arr,key); // 배열 이름과 찾을 값을 매개변수로 전달 함 (binarySearch 가 arr 을 뒤지면서 key 를 찾음)
        // 결과값으로 해당값이 있는 배열의 인덱스가 반환 됨, 찾는 값이 없으면 (-) 음수가 반환 됨
        if(rst >= 0) System.out.println("찾는 값의 인덱스는 : " + rst + " 입니다."); // 만약 rst 가 0과 같거나 크면
        else System.out.println("찾는 값이 없습니다.");
    }
}
