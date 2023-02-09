package _0209_01_스트림예제06;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// 스트림 최종 연산 : 중개 연산을 통해 변환된 스트림은 마지막으로 최종 연산을 통해 요소를 소모해 결과를 출력
public class StreamEx6 {
    public static void main(String[] args) {

        // 요소의 출력
        Stream<String> stream = Stream.of("하나", "둘", "셋", "넷");
        stream.forEach(e-> System.out.print(e + " "));
        System.out.println();

        // 요소의 소모 :  스트림의 요소를 소모하여 연산을 수행
        // reduce() : 첫 번째 요소와 두 번째 요소를 가지고 연산을 수행 후, 그 결과와 세번째 요소를 가지고 다시 연산
        Stream<String> stream1 = Stream.of("하나", "둘", "셋", "넷");
        Stream<String> stream2 = Stream.of("하나", "둘", "셋", "넷");
        IntStream stream3 = IntStream.of(7,5,5,2,1,3,5,4,6);
        OptionalInt sum = stream3.reduce((n1, n2) -> n1 * n2);
        System.out.println(sum.getAsInt());
        Optional<String> rst1 = stream1.reduce((s1, s2) -> s1 + "+" + s2);
        rst1.ifPresent(System.out::println); // (Optional - nullPointException 관련 처리, rst1 에 값이 있으면(ifPresent) 출력, 없으면 넘어감)

        // 요소의 검색 : findFirst(), findAny() : 해당 스트림에서 첫번째 요소를 반환
        IntStream stream4 = IntStream.of(4,2,7,3,5,1,6);
        IntStream stream5 = IntStream.of(4,2,7,3,5,1,6);
        OptionalInt rst2 = stream4.sorted().findFirst(); // (findAny() 는 항상 요소의 첫번째 값)
        System.out.println(rst2.getAsInt()); // (OptionalInt 로 받으면 getAsInt 로 결과 출력)
        OptionalInt rst3 = stream5.sorted().findAny(); // 병렬처리 관련 내용이 포함되어 있어서 요소의 첫번째 값이 아닌 경우가 있음 (findAny() 는 병렬 처리에 관련된 부분이 포함되어 있어서 첫번째 값이 항상 나오지 않을 수 있음)
        System.out.println(rst3.getAsInt());

        // 요소의 검사 :
        // anyMatch()  : 해당 스트림의 일부 요소가 조건에 만족하면 true
        // allMatch()  : 해당 스트림의 모든 요소가 조건에 만족하면 true
        // noneMatch() : 해당 스트림의 모든 요소가 특정 조건에 만조갛지 않을 경우 true
        IntStream stream6 = IntStream.of(30,90,70,10);
        IntStream stream7 = IntStream.of(30,90,70,10);
        IntStream stream8 = IntStream.of(30,90,70,10);
        System.out.println(stream6.anyMatch(n ->  n > 80)); // true (n 을 매개변수로 넣어서 n 값이 80보다 크면~)
        System.out.println(stream7.allMatch(n ->  n > 80)); // false
        System.out.println(stream8.noneMatch(n ->  n > 80)); // false

        // 요소의 통계 : count(), max(), min()
        IntStream stream9 = IntStream.of(30,90,70,10);
        IntStream stream10 = IntStream.of(30,90,70,10);
        IntStream stream10min = IntStream.of(30,90,70,10);
        System.out.println(stream9.count());
        System.out.println(stream10.max().getAsInt());
        System.out.println(stream10min.min().getAsInt());

        // 요소의 연산
        IntStream stream11 = IntStream.of(30,90,70,10);
        DoubleStream stream12 = DoubleStream.of(30.3, 90.9, 70.11, 10.12);

        System.out.println(stream11.sum());
        System.out.println(stream12.average().getAsDouble());










    }
}
