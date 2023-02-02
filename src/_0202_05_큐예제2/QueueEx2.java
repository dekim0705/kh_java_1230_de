package _0202_05_큐예제2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 명령 이력 조회
// (ex. Git Bash 에 history 입력시 나오는 것 -> Queue 구조)
public class QueueEx2 {
    Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10; //  (final = 상수, static = 유일한 값 하나 -> 최종상태, 하나만 만들겠다는 뜻)
    public static void main(String[] args) {
        QueueEx2 history = new QueueEx2(); // (메인을 포함하고 있는 클래스를 객체로 만들기)
        System.out.println("help 입력시 도움말을 볼 수 있습니다.");
        while(true) {
            System.out.print("$ ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine().trim(); // 입력 받은 문자열의 앞/뒤의 공백 제거 (.trim()입력 앞,뒤의 공백을 날리는 것)
            if(cmd.equalsIgnoreCase("q")) {
                System.exit(0); // 프로그램을 강제 종료 (강력한 프로그램 종료)
            } else if(cmd.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말을 보여 줍니다.");
                System.out.println("q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
            } else if(cmd.equalsIgnoreCase("history")) {
                history.save(cmd);
                int cnt = 0; // (history number)
                for(String e : history.queue) {
                    cnt++;
                    System.out.println(cnt + " " + e);
                }
            } else {
                history.save(cmd);
                System.out.println(cmd);
            }
        }
    }
    void save(String cmd) {
        queue.offer(cmd);
        if(queue.size() > MAX_SIZE) queue.remove(); // 큐의 정해진 개수를 넘어서면 맨 앞의 요소 제거
    }
}

