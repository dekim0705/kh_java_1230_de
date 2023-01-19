package 인터페이스코코아톡;
// 메신저 기능에 대한 클래스
public class CocoaTok {
    private String to; // 상대방이름
    private String msg; // 전달 할 메세지

    public CocoaTok(String name) { // 생성자 호출 시 상대방 이름을 넣어야 하는 매개변수
        to = name;
    }

    public void wrtMsg(String msg) { // 입력받은 메세지를 앞에 상대방 이름을 붙여서 날리는 것
        this.msg = to + " : " + msg;
    }

    public void send(NetAdapter na) { // 메세지 입력 완료 후 send 버튼을 누르는 동작
    na.send(msg); // 여기서 NetworkAdapter 에 있는 send로 넘어감
    }
}
