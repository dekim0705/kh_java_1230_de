package _0208_05_스트림예제03;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        // 배열로부터 스트림 만들기
        System.out.println("배열로부터 스트림 만들기 : ");
        String[] arr = {"멍멍이", "야옹이", "꿀꿀이", "짹짹이", "꽥꽥이", "어흥이"}; // (배열 자체는 스트림이 없어서 스트림을 만들어 스트림의 메서드들을 사용 가능)
        Stream<String> stream1 = Arrays.stream(arr); // 배열로부터 스트림을 만듬
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();
        // (위 스트림은 사용하고나서 소멸됨. 그래서 새로 만들어주어야 함)

        Stream<String> stream2 = Arrays.stream(arr,1,3); // `1 ~ 3 미만 (endExclusive : 본인은 빠진다는 뜻)
        stream2.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println();



        // 숫자 범위로부터 스트림 만들기
        System.out.println("숫자 범위로부터 스트림 만들기 : ");
        IntStream stream = IntStream.rangeClosed(1, 100); //  (범위 내에 있는 정수형 값을 만들어 줌)
        int sum = stream.map(e->e).sum();
//        int sum = stream.sum(); // (위와 같음)
        System.out.println("합계 : " + sum);
    }
}
