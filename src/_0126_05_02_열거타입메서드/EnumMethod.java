package _0126_05_02_열거타입메서드;
// values() : 해당 열거체의 모든 상수를 저장한 배열을 생성해서 반환
// valueOf() : 전달된 문자열과 일치하는 해당 열거체의 상수를 반환
// ordinal() : 해당 열거체 정의에서 정의된 순서(0)를 반환
enum Rainbow {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET};

public class EnumMethod {
    public static void main(String[] args) {
        // values()
//        Rainbow[] arr = Rainbow.values(); // 열거타입에 대한 배열 생성
//        for(Rainbow e : arr) System.out.print(e + " ");

        // valueOf()
//        Rainbow rb = Rainbow.valueOf("YELLOW");
//        System.out.print(rb);

        // ordinal()
        int index = Rainbow.INDIGO.ordinal();
        System.out.println(index);


    }
}
