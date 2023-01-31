package _0131_04_HashSet;
import java.util.HashSet;
// HashSet : 순서를 보장하지 않으며 중복 값을 허용하지 않습니다.
// 중복 여부 확인은 hashCode()의 리턴값을 이용 합니다. (경우에 따라 오버라이딩 합니다.)
// HashSet 은 중복확인이 안됨 -> Object class 의 hashCode() 와 equals() 를 오버라이딩 해서 중복확인 가능
public class HashSetEx1 {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o")); // HashSet 에 배열형태의 값을 대입
//        System.out.println(set); // [e, H, l, o] => 순서보장 X, 중복불허
//
//        HashSet<String> set1 = new HashSet<>();
//        set1.add("Java");
//        set1.add("C");
//        set1.add("C++");
//        set1.add("Python");
//        set1.add("Java");
//        for(String e : set1) System.out.println(e + " "); // 출력시 "Java"는 한번만 나옴

        // 객체 넣기
        HashSet<Member> set2 = new HashSet<>();
        set2.add(new Member(1001, "딸기고양이"));
        set2.add(new Member(1002, "망고멍멍이"));
        set2.add(new Member(1003, "노랑병아리"));
        // 다른 방법
        Member mem4 = new Member(1004, "초록짹짹이");
        set2.add(mem4);
        set2.add(new Member(1003, "바둑강아지"));

        for(Member e : set2) {
            e.showMember();
            // id 가 1003으로 겹쳐도, 만들어진 객체의 메모리주소(영역)가 다르기 때문에 중복체크가 되지 않음
            // id 중복체크를 하고 싶으면 hashCode()로 오버라이딩
//            System.out.println(e.hashCode());
//            System.out.println("==================");

        }

    }
}

class Member { // class Member extends Object 상태임 항상! Object 는 최상위 클래스
    int id;
    String name;

    @Override
    public int hashCode() { // Object class 에 있는 hashCode 오버라이딩 하겠다는 뜻 = 부모 클래스에 있는 메소드라는 뜻
        return id; // hashCode 값을 id로 바꾼것.
    } // 여기까지는 아직 주옥값 출력 됨
    @Override // 이 메소드에서 동등객체인지 확인 가능
    public boolean equals(Object obj) { // 원래 equals 가 Object 꺼기 때문에 Object 가 들어오는 것..(?)
        if (obj instanceof Member) { // 모든 클래스들은 Object 클래스의 자손. obj 중에서 Member class 에 있는걸 찾아보는 것
            Member member = (Member) obj; // obj 다시 멤버로 바꾸니까 다운캐스팅. 부모를 자식으로 변환
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showMember() {
        System.out.println("ID   : " + id);
        System.out.println("NAME : " + name);
        // System.out.println("==================");

    }
}