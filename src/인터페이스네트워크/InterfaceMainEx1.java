package 인터페이스네트워크;

import java.util.Scanner;

// nullpointexception => 참조할 값이 없다는 뜻. 초기화로 null 을 해줘야 함.
public class InterfaceMainEx1 {
    public static void main(String[] args) {
        NetworkAdapter adapter = null; // 0이 아니고 null 을 넣는 이유는 객체이기 때문에. 참조변수의 초기값은 null임.
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크를 선택하세요 [1]WiFi [2]5G [3]LTE : ");
        int num = sc.nextInt();
        switch(num) {
            case 1 :
                adapter = new NetworkAdapter.WiFi("KT Megapass");
                break;
            case 2 :
                adapter = new NetworkAdapter.FiveG("SK Telecom");
                break;
            case 3 :
                adapter = new NetworkAdapter.LTE("LG U+");
                break;
            default:
                System.out.println("네트워크를 잘 못 선택 하였습니다.");
        }
                adapter.connect(); // NetworkAdapter adapter; 이렇게만 해놓으면 여기 오류 뜸
    }
}
