package _0131_01_MashMap기본;
import java.util.HashMap;
import java.util.Map;

// HashMap : 키와 값으로 구성되어 있음, 키의 중복 여부 확인은 hashCode()를 통해서 수행 함
// 키의 중복은 허용하지 않음, 값은 중복 가능, 순서를 유지 하지 않음
// 경우에 따라서 hashCode()와 equals()메소드를 오버라이드 해서 사용해야 함
// HashMap 은 성능이 우수하고 멀티스레드 환경을 지원하지 않음(즉 동기화 기능 없음)
// HashTable 은 HashMap 과 내부 구조가 동일하며, 멀티스레드 지원
// Properties 는 HashTable 을 상속 받아서 기능을 제약하여 사용(key & value 가 문자열로만 구성), 정보를 파일에 저장하거나 읽기 위한 용도
public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 객체 추가 : .put(key, value)
        map.put("Americano", 2500);
        map.put("Latte", 4500);
        // 객체 찾기 (값 읽기) : .get(key) (key 를 넣으면 반환값으로 value 가 넘어옴)
        System.out.println("값 읽기 : " + map.get("Latte")); // 반환값으로 넘어오기 때문에 print 찍어줘야 함
        System.out.println("값 읽기 : " + map.get("Latte2"));
        // 객체 삭제 : .remove(key) (삭제가 정상적으로 진행되면 value 가 넘어 옴)
        System.out.println("값 제거 : " + map.remove("Latte"));
        System.out.println("값 제거 : " + map.remove("Latte2"));
    }
}











/*
- Map 인터페이스 = 하나가 아닌 쌍(Pair)으로 되어 있는 자료를 관리하는 메소드
- Map 은 key and value 로 구성되어 있음 -> key(중복불가) 로 value(중복허용) 를 한번에 얻어냄 (순차적으로 요소 값 구하지 X)
- Map + Hash -> HashMap(멀티스레드지원 X, 빠름), Hashtable(멀티쓰레드지원, 느림), Properties(Hashtable 로부터 상속 + 제약사항)
- TreeMap 은 Hash 형태 X, 자료구조가 tree 구조임
- (임의의)입력값(객체가 heap 영역에 올라가 있는 메모리의 주소) -> Hash function -> (임의의)정수값 = HashCode / 역방향 X
 */
