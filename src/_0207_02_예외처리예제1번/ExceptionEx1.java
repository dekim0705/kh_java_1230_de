package _0207_02_예외처리예제1번;
// 예외처리란? 예외처리를 통해 프로그램이 정상적으로 수행 될 수 있도록 하는 것
// ArrayIndexOutOfBoundException : 배열의 범위 초과에 대한 예외 처리
public class ExceptionEx1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e); // (출력 : java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5)
            System.out.println("예외 처리 부분");
            // (catch 구현부 삭제하면 정상적인 척! 하면서 종료되기 때문에 조심해야 함)
        }
        System.out.println("프로그램 정상 종료...");






    }
}


//        for(int i = 0; i <= 5; i++) { // (배열은 5개, 값은 6개 -> ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5)
//            arr[i] = i;
//            System.out.println(arr[i]);
//        }