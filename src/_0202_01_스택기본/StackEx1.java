package _0202_01_스택기본;
import java.util.Stack;

// Stack : LIFO(Last in First Out)구조, Vector 의 기능을 제약해서 만듬, 메모리 구조의 Stack 역이 대표적인 예시 입니다.
// 입력과 출력이 한 곳에서만 일어납니다.
// push() : 객체를 삽입
// peek() : 스택의 맨 위의 값 확인
// pop() : 맨 위의 값 추출하면서 보여줌
// empty() : 스택이 비어 있는지 반환 (true/false)
// size() : 스택에 포함된 객체의 개수 반환
// contains(값) : 해당 값이 스택내에 있는지 확인
// 특이사항 : (Java 에서는 메모리 설계 형태 에도 불구하고 내부값을 순회 가능, C는 불가)
public class StackEx1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3); // 메모리구조 -> 제일 아래부터 1,2,3이 위로 쌓임
        System.out.println(stack.peek()); // 3
        System.out.println(stack.pop()); // 3
        System.out.println(stack.peek()); // 2 // 이런식으로 밑에 있는 걸 확인 하려면 그 위를 먼저 덜어내야 함

        System.out.println(stack.empty()); // false
        System.out.println(stack.size()); // 2
        System.out.println(stack.contains(1)); // true
        for(Integer e : stack) { // 내부값 순회 가능, 원래는 아래쪽의 값이 보이면 안됨
            System.out.println(e);
        }
    }
}
