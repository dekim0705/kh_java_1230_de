package _0208_03_스트림예제01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 스트림이란? 함수형 프로그램을 이용해 다양한 데이터소스를 표준화된 방법으로 다루기 위한 것. (다양한 데이터 소스 -> 배열, 컬렉션 프레임워크 등)
//           - 자료의 대상과 상관 없이 동일한 연산 수행
//           - 내부 반복자 이용(반복문 배제)
//           - 스트림은 한번 생성된 후 최종연산을 통해 소모되면 재사용이 불가
//           - 원본 데이터 변경하지 않음
//           - 지연 연산 지원, 병렬 처리 지원
//           - [생성 -> 중개 연산 -> 최종 연산] 순서로 진행 됨
// (컬렉션은 리스트와 셋의 조상인데 컬렉션에 스트림이 이미 포함이 되어있어서 컬렉션의 자손들은 이미 스트림을 가지 고 있는 상태)
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr)); // (asList 는 배열로 만들어진걸 어레이 리스트에 담을 때 사용함)
        // 스트림 생성, 중간연산, 최종연산
        list.stream().filter(s->s.intValue() >= 5).forEach(e -> System.out.println(e));
        // (스트림생성 ->       중간 연산           -> 최종 연산(결과출력포함)
        // (조건문 대신 필터)
        list.stream().filter(s->s.intValue() >= 5).forEach(System.out::println); // (참조)

    }
}

//(메소드들이 나올때, bold 는 자기의 메소드, bold 없으면 상속받은 메소드)
/*
intValue() : Returns the value of this Integer as an int.
 */