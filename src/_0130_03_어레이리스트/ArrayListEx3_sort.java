package _0130_03_어레이리스트;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListEx3_sort {
    public static void main(String[] args) {
        String[] data = {"138", "145", "122", "155", "105"};
        List<String> pitches = new ArrayList<>(Arrays.asList(data));  // asList()는 이미 만들어진 배열을 List에 추가

        pitches.sort(Comparator.naturalOrder()); // 오름차순 정렬
        System.out.println(pitches); // [105, 122, 138, 145, 155]
        pitches.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println(pitches); // [155, 145, 138, 122, 105]


    }
}
