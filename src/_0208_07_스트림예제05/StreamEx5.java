package _0208_07_스트림예제05;
// 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환, 중개 연산은 연속으로 연결해서 사용 가능
// filter()   : 조건에 맞는 요소만으로 구성된 새로운 스트림 반환
// distinct() : 스트림에서 중복된 요소를 제거하고 새로운 스트림 생성
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6); // (of()메소드는 요소를 만듬)
        IntStream stream2 = IntStream.of(7,5,5,2,1,3,5,4,6);

        // 스트림에서 홀수 값만 골라냄
        System.out.println("* 스트림에서 홀수값만 골라내기 - filter() :");
        stream1.filter(n->n % 2 != 0).forEach(e->System.out.print(e + " "));
        System.out.println();
        System.out.println();

        // 스트림에서 중복 요소를 제거
        System.out.println("* 스트림에서 중복 요소를 제거 - distinct() :");
        stream2.distinct().forEach(e->System.out.print(e + " "));
        System.out.println();
        System.out.println();

        // 스트림 변환(map()) : 해당 스트림의 요소들에 주어진 함수의 인수로 전달하여, 그 반환값으로 이루어진 새로운 스트림 생성
        //                  : 입력한 원소를 그대로 스트림으로 반환
        System.out.println("* 스트림 변환 - map() ");
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream.map(e->e.length()).forEach(System.out::println); // ( element 값(위의 문자열들)을 넣어서 element 의 length()값을 뽑아냄)
        System.out.println();
        System.out.println();

        // 스트림 변환(flatMap()) :
        //                      : 원소를 가장 작은 단위의 단일 스트림으로 반환

        System.out.println("* 스트림 변환 - flatMap() ");
        // (stream 은 문자열 하나로 만들어져야 해서 Stream<String> stream3 = {"","",""} 불가...?? 위에는 그렇게 했는데..? Stream.of 의 차이인가??)
        String[] arr = {"I study hard", "You study JAVA", "I am hungry"};
        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s->Stream.of(s.split(" "))).forEach(System.out::println);
        System.out.println();
        System.out.println();

        // 스트림 제한(limit()) : 해당 스트림의 첫 번째 요소부터 전달된 개수 만큼의 요소로만 이루어진 새로운 스트림 반환
        System.out.println("* 스트림 제한 - limit() ");
        IntStream stream4 = IntStream.range(0,10); // 0 ~ 10미만 까지 // 출력 : 0 1 2 3 4 5 6 7 8 9
        IntStream stream5 = IntStream.range(0,10);
        IntStream stream6= IntStream.range(0,10);
        IntStream stream7= IntStream.range(0,10);
        System.out.print(" 스트림 전체 출력 : ");
        stream4.forEach(n->System.out.print(n + " ")); // 출력 : 0 1 2 3 4 5 6 7 8 9
        System.out.print(" 스트림 제한(limit()) : ");
        stream5.limit(5).forEach(n->System.out.print(n + " ")); // 출력 : 0 1 2 3 4
        System.out.println();
        System.out.println();

        // 스트림 제한(skip()) : 해당 스트림의 첫 번째 요소부터 전달 된 개수 만큼의 요소를 제외하고 출력
        System.out.println("* 스트림 제한 - skip() ");
        System.out.print(" 스트림 제한(skip()) : ");
        stream6.skip(5).forEach(n->System.out.print(n + " ")); // 출력 : 5 6 7 8 9
        System.out.println();
        System.out.println();

        // 중간 연산
        System.out.print("* 스트림 multi 중간연산 : ");
        stream7.skip(3).limit(5).forEach(n->System.out.print(n + " "));
        System.out.println();
        System.out.println();


        // 스트림 정렬 : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        System.out.println("* 스트림 정렬 ");
        Stream<String> stream8 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        Stream<String> stream9 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream8.sorted().forEach(s -> System.out.print(s + " ")); // (오름차순)
        System.out.println();
        stream9.sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s + " "));


/*  강사님 예제
        // 7개의 정수를 입력 받아 홀수 짝수 나누어 담기
        System.out.println("* 7개의 정수를 입력 받아 홀수 짝수 나누어 담기 :");
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("정수 입력 : ");
        for(int i = 0; i < 7; i ++) list.add(sc.nextInt());
        System.out.print("홀수 : ");
        list.stream().filter(n->n % 2 != 0).forEach(e->System.out.print(e + " "));
        System.out.println();
        System.out.print("짝수 : ");
        list.stream().filter(n->n % 2 == 0).forEach(e->System.out.print(e + " "));
 */

    }
}
