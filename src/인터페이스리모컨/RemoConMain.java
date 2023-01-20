package 인터페이스리모컨;
import java.util.Scanner;

public class RemoConMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품을 선택하세요 [1]TV [2]Audio :  ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if(sel == 1) {
            rc = new Television();
            rc.turnOn();
            rc.setVolume(20);
            rc.getInfo();
            rc.setMute(true); // 디폴트 메소드이며 오버라이딩 되어 있는 메소드 사용
//            RemoteControl.changeBattery(); // 공통사항이라 여기에 굳이 넣을 필요 X
        } else {
            rc = new Audio();
            rc.turnOn();
            rc.setVolume(120);
            rc.getInfo();
            rc.setMute(false); // 디폴트 메소드이고 부모에서 만든 메소드 사용 (재정의를 안했기 때문에 부모꺼 사용)
        }
        RemoteControl.changeBattery(); // 리모콘 자체에 있는 인터페이스 소속의 메소드로 접근

        RemoteControl remoteControl = new RemoteControl() { // 익명의 객체 (일회용)
            int volume;
            @Override
            public void turnOn() {
                System.out.println("플스5 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("플스5 끕니다.");

            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) { // 인터페이스 자체를 참조해야함. MAX_VOLUME 은 static, 인터페이스 소속
                    this.volume = RemoteControl.MAX_VOLUME; // 최대치보다 높게 들어오면 최대치로 넣겠다는 뜻
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 플스5 볼륨 : " + this.volume);
            }
            @Override
            public void getInfo() {
            }
        }; // 구현부는 끝났다는 의미로 ;을 찍어줘야 함
        remoteControl.turnOn();
        remoteControl.turnOff();
    }
}
