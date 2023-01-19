package 인터페이스코코아톡;
// 설계상으로 CocoaTok 은 우리가 만들어야 하는 부분
// send() 기능이 호출 되면 적절한 네트워크가 연결되어 입력된 메세지를 수신할 대상자에게 전달하는 형태

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTok cocoaTok = new CocoaTok("상대방 이름"); // 채팅창/어플을 켜는것
        cocoaTok.wrtMsg("오늘 춥죠??"); // 메시지 입력
        NetAdapter adapter; // 전송시 네트워크망을 모르는 상태
        Scanner sc = new Scanner(System.in);
        System.out.println("네트워크 [1]WiFi [2]5G");
        int sel = sc.nextInt(); // 자동선택기능이 아직 없으니까 여기서 선택
        if (sel == 1) adapter = new WiFi();// WiFi가 adapter 로 동작 함 (?)
        else adapter = new FiveG();
        cocoaTok.send(adapter); // adapter는 WiFi 와 5G의 부모. 인터페이스 상속을 줬음.
    }
}


