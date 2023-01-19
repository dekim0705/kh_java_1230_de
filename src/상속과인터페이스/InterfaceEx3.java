package 상속과인터페이스;
// 이렇게 구현하면 의존관계가 완전히 구별,구현되지 않음
// Chat 기능과 Network 기능은 독립적으로 돌아가야 함. 둘 다 상속 X
import java.util.Scanner;

public class InterfaceEx3 {
    public static void main(String[] args) {
       //  NetworkAdapter2 adapter; 상속을 ?? 했기때문에 얘로 가면안되고 개별 클래스에서 새로 만들어줘야 함
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택하세요 [1]WiFi [2]5G : ");
        int sel = sc.nextInt();
        if(sel ==1) {
            WiFi wifi = new WiFi("KT", "고유림");
            wifi.connect();
            wifi.sendMsg();
            wifi.rcvMsg();
        } else {
            FiveG fiveG = new FiveG("SK", "나희도");
            fiveG.connect();
            fiveG.sendMsg();
            fiveG.rcvMsg();

        }
    }
}

