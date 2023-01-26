package _0126_02_클론메서드;

public class CloneMain {
    public static void main(String[] args) {
        Member mem1 = new Member("1234567", "딸기고양이", "01234", 30, true);
        Member mem2 = mem1.getMember(); // getMember()을 넣으면 클론된 별도의 메모리가 생기고 mem2는 그 주소를 가지게 됨. => 깊은복사
        // 참조변수가 대입되어서 같은 메모리를 가리키는 것 => 얕은복사 -> 의 문제는 Clone 으로 해결 가능
        mem2.age = 300;
        mem2.name = "단호박멍멍이";

        System.out.println("name  : " + mem1.name);
        System.out.println("age  : " + mem1.age);
        System.out.println("name  : " + mem2.name);
        System.out.println("age  : " + mem2.age);

    }
}
