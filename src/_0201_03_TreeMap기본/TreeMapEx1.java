package _0201_03_TreeMap기본;
import java.util.Map;
import java.util.TreeMap;
// TreeMap 도 TreeSet 과 마찬가지로 이진검색트리(값이 추가 될 때 정렬이 됨)로 구현 되어 있음.
// Key 값으로 정렬하므로 key 값에 해당하는 Comparable 과 Comparator 를 구현 해야 함.
// Map 은 key & value 가 있어서 정렬조건을 key 에 걸어줘야 함. (Set 과 다름!)
// TreeMap : ascending 은 자동으로 되기 때문에 descending method 만 존재
public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(87, "김멍멍");
        score.put(88, "님멍멍");
        score.put(75, "딤멍멍");
        score.put(65, "림멍멍");
        score.put(98, "밈멍멍");

        Map.Entry<Integer, String> entry = null;
        entry = score.firstEntry(); // score.firstEntry().getKey() 로도 가능하지만 복잡함을 줄이기 위해서
        System.out.println("가장 낮은 점수 : " + entry.getKey() + " " + entry.getValue());
        entry = score.lastEntry();
        System.out.println("가장 높은 점수 : " + entry.getKey() + " " + entry.getValue());
        entry = score.lowerEntry(95);
        System.out.println("95 아래 점수  : " + entry.getKey() + " " + entry.getValue());
        entry = score.higherEntry(95);
        System.out.println("95 위의 점수  : " + entry.getKey() + " " + entry.getValue());

    }
}

