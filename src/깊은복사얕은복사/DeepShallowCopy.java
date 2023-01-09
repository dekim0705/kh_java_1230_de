package 깊은복사얕은복사;

import java.util.Arrays;

// 깊은 복사 : 할당된 메모리 공간에 실제 값이 복사 되는 것 (기본 타입 모두 여기에 해당 함)
// 얕은 복사 : 참조 타입에 해당되며 실제 값이 복사가 되는 것이 아니라 주소가 복사되는 것을 의미
public class DeepShallowCopy {
// 얕은 복사 피하는 법 2
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        arr1[0] = 100;
        int[] arr2 = Arrays.copyOf(arr1,arr1.length); // 값을 카피하는 것
        arr1[0] = 300;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}


/* deep copy
        int x = 100;
        int y; // y 는 값이 없는상태
        y = x; // y 에 x를 대입
        x = 200; // x값을 200으로 바꾸면?
        System.out.println("y의 값 : " + y); // 그래도 y의 값은 100임. 대입되던 시점에 x가 100이었기 때문에.
        // x와 y가 별도의 공간에 잡혀있었기 때문에 문제가 되지 않음
 */

/* shallow copy
    int[] arr1 = new int[4];
        arr1[0] = 100;
                int[] arr2 = arr1; // 이 시점에서 얕은 복사가 일어 남
                arr1[0] = 300;

                System.out.println(Arrays.toString(arr1));
                System.out.println(Arrays.toString(arr2));

// 값은 하나인데 주소가 두개인 상태
// 얕은 복사 피하려면 어레이카피 카피오브 클론 포문&인덱스를 이용
 */

/* shallow copy 피하는 법 1
        int[] arr1 = new int[4];
        arr1[0] = 100;
        int[] arr2 = new int[4]; // 자리를 두개 잡아줌
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        arr1[0] = 300;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
 */