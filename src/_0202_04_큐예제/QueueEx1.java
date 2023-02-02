package _0202_04_큐예제;
// Queue : FIFO(First In First Out)구조, LinkedList 구조를 사용하고 있으며, LinkedList 기능 중 큐 관련 기능으로 제한 됨
// add(e) : 제일 뒤에  요소를 삽입. 중간 삽입 안됨 - 예외 발생 (List 는 성능이 저하되더라도 중간에 값 삽입이 가능했는데 Queue 는 제한 : .add(int index, Integer element) 사용 불가)
// offer(e) : 제일 뒤에 요소를 삽입 - true/false
// remove() : 제일 앞의요소를 제거 - 예외 발생
// poll() : 제일 앞의 요소 제거 - 비어있으면 null 반환
// element() : 제일 앞의 요소를 읽어옴(Read only) - 예외 발생
// peek() : 제일 앞의 요소를 읽어 옴 - 큐가 비어있으면 null
import java.util.LinkedList;
import java.util.Queue;
public class QueueEx1 {
    public static void main(String[] args) {
        Queue<Message> msgQ = new LinkedList<>(); // (Queue 는 자체의 컬렉션이 없어서 LinkedList 기능을 가져와서 기능제약을 하고 사용하는 상태)
        msgQ.add(new Message("SMS", "야옹이"));
        msgQ.offer(new Message("Mail", "멍멍이"));
        msgQ.offer(new Message("KaKao", "꿀꿀이"));
        while (!msgQ.isEmpty()) { // (msgQ가 비워져있지 않으면 돌기~)
            Message msg = msgQ.poll(); // 큐에서 한개의 메세지를 꺼냄 (맨 앞)
            switch (msg.command) {
                case "Mail" :
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                    break;
                case "SMS" :
                    System.out.println(msg.to + "에게 문자를 보냅니다.");
                    break;
                case "KaKao" :
                    System.out.println(msg.to + "에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}

class Message {
    String command;
    String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
