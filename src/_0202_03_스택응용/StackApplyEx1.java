package _0202_03_스택응용;
import java.util.Scanner;
import java.util.Stack;
// 스택을 이용해서 괄호의 열림과 닫힘 체크
public class StackApplyEx1 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String expression = sc.nextLine(); // (sc.next()는 공백 X, sc.nextLine()은 공백 O)
        for (int i = 0; i < expression.length(); i++) { // (입력받은 문자열의 길이만큼 반복문을 돌림)
            char ch = expression.charAt(i); // 문자열에서 해당하는 문자를 뽑아내는 방법
            if (ch == '(') {
                st.push(ch); // 열림 괄호일때 push ('('가 오면 push)
            } else if (ch == ')') { // 닫힘 괄호일 때 pop
                if (!st.isEmpty()) st.pop(); // 스택이 비어있지 않으면 pop (조건이 두개니까 &&조건이나 마찬가지)
                else {
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
            }
        }
        if(st.isEmpty()) {
            System.out.println("괄호가 일치 합니다.");
        } else {
            System.out.println("괄호가 일치 하지 않습니다.");

        }
    }
}

// pop = get
