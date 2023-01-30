package _0130_03_어레이리스트;

import java.util.ArrayList;
import java.util.List;

// List 인터페이스란? 배열과 비슷한 구조를 가지면서 하위에 ArrayList, LinkedList, Vector 클래스로 구성 됨
// 요소의 저장 순서가 유지, 중복 저장 허용, 동절 할당(크기 지정을 하지 않아도 됨, 추가시 하나씩 생겨남), 다양한 메소드 제공
// ArrayList : 물리적으로 연속된 공간에 저장, 검색을 인덱스로 하기 때문에 빠름, 삽입/삭제는 느리나(high cost), 맨 뒤에서의 삽입/삭제는 빠름
// Vector : ArrayList 와 동일 특성을 가짐, 멀티스레드 환경을 위해 동기화 기능(Synchronize)을 지원하기 때문에 안정적이지만 ArrayList 보다 느림
// LinkedList : 물리적으로 연속된 공간이 아님, 참조로 다음 저장 위치를 가리킴. 삽입/삭제가 매우 빠르나, 검색은 느림
public class ArrayListEx1 {
    public static void main(String[] args) {

    // 참조변수 만드는 방법 : 1) 같은 타입으로 지정하는 법
    // 참조변수 만드는 방법 : 2) 부모의 객체를 가지고 만드는 것 (호환성을 위해 List 가 더 좋음. List 는 ArrayList 의 부모)
    // ArrayList<String> pitches = new ArrayList<>();  // 1)
    List<String> pitches = new ArrayList<>();  // 2) List 인터페이스로 ArrayList 객체를 참조 함
    pitches.add("가"); // ArrayList 마지막(제일 뒤)에 값 추가 (이때, 사이즈가 증가 함)
    pitches.add("나");
    pitches.add("다");
    System.out.println(pitches); // [가, 나, 다]
    pitches.add(1,"추가"); // 해당 인덱스에 값 추가 (성능에 영향을 미침)
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





/*
 컬렉션 프레임워크 : 1) Collection 2) Map
 1) Collection 안의 List 인터페이스 - 배열과 같은 타입. 순서가 있는(=인덱스, 위치적인 의미가 있는) 데이터의 집합, 데이터의 중복 허용
 List 인터페이스 의 구현 클래스 : Vector, ArrayList, LinkedList, Stack, Queue
 Set 인터페이스 - 데이터의 순서가 없고 데이터의 중복 불허
*/
