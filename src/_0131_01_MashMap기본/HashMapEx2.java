package _0131_01_MashMap기본;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("김땡땡", 99);
        map.put("님땡땡", 98);
        map.put("딤땡땡", 97);
        map.put("림땡땡", 96);
        map.put("님땡땡", 100); // 키가 같기 때문에 값이 나중의 값에 대체 됨
        System.out.println("총 Entry 수 : " + map.size()); // Entry : a pair of key and value
        // 객체 찾기
        System.out.println(map.get("님땡땡"));

        // map 순회 방법 : enhanced for loop
        for (String key : map.keySet()) { // .keySet() : 모든 키를 Set 객체에 담아서 리턴 (map 바로 넣으면 X key 와 value, 2개가 들어있기 때문에)
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println();
        // map 순회 방법 : 반복자(iterator) : iterator 안에 반복순회가 가능한 메서드들이 존재
        Set<String> keySet = map.keySet(); // map 에 있는 key 값(keySet)들을 모두 받아서 Set 객체를 만들어주고
        Iterator<String> iterator = keySet.iterator(); // Set 에 있는 iterator 를 돌려줌.
        // map 자체에는 반복자가 없음. 반복순회를 위해서 map -> set -> set(iterator)
        while (iterator.hasNext()) { // iterator 안의 내부 키 확인 후 존재하는 동안은 true)
            String key = iterator.next(); // 키를 가져 옴
            System.out.println(key + " : " + map.get(key));
        }
        // 객체 삭제
        map.remove("딤땡땡"); // 키로 Map.Entry 를 제거 (Entry : a pair)
        System.out.println("총 Entry 수 : " + map.size());

        // 값을 수정하는 메서드
        map.replace("림땡땡", 101);

        // Map.Entry 전체 삭제
        map.clear(); // map 전체가 아닌 내부에 있는 개체들만 삭제
        System.out.println("총 Entry 수 : " + map.size());

    }
}
