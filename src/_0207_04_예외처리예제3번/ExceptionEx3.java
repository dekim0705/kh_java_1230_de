package _0207_04_예외처리예제3번;
// NullPointerException : 참조하고 있는 주소에 접근했을 때 값이 없는 경우
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
        try { // (이건 잡아줘야 하는 에러)
            String testStr = test.name;
            System.out.println(test);
        } catch (NullPointerException e) {
            System.out.println("참조하고 있는 곳에 값이 없습니다.");
        }
    }
}

class Test {
    String name = "딸기고영";
}
