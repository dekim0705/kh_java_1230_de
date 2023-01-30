package _0130_03_어레이리스트;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// add 외의 배열 추가 방법
public class ArrayListEx2_asList {
    public static void main(String[] args) {
       String[] data = {"가","추가", "나", "다"}; // 이미 만들어진 배열
        List<String> pitches = new ArrayList<>(Arrays.asList(data));  // asList()는 이미 만들어진 배열을 List에 추가

        System.out.println(pitches); // [가, 추가, 나, 다]
        System.out.println(pitches.get(3)); // 전달된 인덱스의 값을 반환 함 // 다
//    System.out.println(pitches.get(5)); // 없는 인덱스를 전달하면 예외 발생 (Index 5 out of bounds for length 4 ~)
        System.out.println(pitches.size()); // ArrayList 의 개수 반환 // 4
        System.out.println(pitches.contains("없는것")); // false 출력됨, 전달된 값이 ArrayList 내에 있는지 확인
        System.out.println(pitches.contains("가")); // true
        System.out.println(pitches.remove(0)); // 가 // remove @Override 1)index 리스트에서 해당 항목을 삭제하고 삭제된 요소를 반환
        System.out.println(pitches.remove("나")); // true // remove @Override 2)o 리스트에서 해당 항목을 삭제하고 삭제결과를 true/false 로 반환
        System.out.println(pitches.remove("하이루")); // false //  remove @Override 2)o 리스트에서 해당 항목을 삭제하고 삭제결과를 true/false 로 반환
        System.out.println(pitches); // [추가, 다]
    }
}
