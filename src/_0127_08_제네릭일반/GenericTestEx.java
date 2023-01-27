package _0127_08_제네릭일반;
import java.util.ArrayList;
import java.util.List;

// 컴파일 시 강한 타입 체크 / 자바 8 이전 대비 변경 사항
// 타입 변환 제거 / 자바 8 이전 대비 변경 사항
public class GenericTestEx {
    public static void main(String[] args) {
       // 제네릭 타입
        List<String> list = new ArrayList<>(); // 해당 어레이리스트에는 문자열만 받겠다는걸 명시 한 상태.  <String> -> 강한타입체크
        // List 에서 사용할 데이터 타입을 미리 지정함으로 컴파일 시 타입체크가 일어나도록 함
        list.add("hello");
        String str = list.get(0); // 0번재 값을 읽어 옴
        System.out.println(str);



    }
}

/* // 옛날 버전 *런타임중에 에러 남
  List list = new ArrayList(); // 자바 8 이전 스타일 (배열의 업그레이드 판, 동적 배열)
  list.add("안녕하세요.");
  String str = (String) list.get(0); // 출력시에 타입캐스팅을 해줘야했음(?)
  // 동작중에 에러가 발견됨 제네릭에선 컴파일 중에 에러가 뜸
 */