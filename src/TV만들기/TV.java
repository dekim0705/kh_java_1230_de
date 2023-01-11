package TV만들기;

import javax.management.ObjectName;

// Television 만들기
public class TV {
    private boolean isON; // 전원 버튼, 접근 제한자 private 설정(같은 클래스 내에서만 접근 가능). private - prevent other access to on/off; only through the button.
    private int channel; // 0 ~ 999
    private int volume; // 0 ~ 100; 0 = mute

    TV() { // 매개변수가 없는 생성자.  TV default setting /
        isON = false;
        channel = 10;
        volume = 10;
        System.out.printf("기본생성자 호출, 전원 : %b, 채널 : %d, 볼륨 : %d\n", isON, channel, volume);
    }

    TV(boolean isON, int cnl, int vol) { // 메인에서 입력한 기준값으로 만들겠다는 생성자
        this.isON = isON;
        channel = cnl;
        volume = vol;
    }
    // 외부에서 전원 on/off 할 수 있는 기능을 제공 (리모콘??)
    public void setON(boolean isON) { // private boolean 부터 private int 까지인 인스턴스필드들은 내부변수들, 밖에서 보이면 안됨, 정해진 통로로 접근해야함.
                                      // main에서는 접근제한자들을 못봄. 그래서 메소드를(리모컨) 이용해서 제어를 해야 함
        this.isON = isON;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV가 " + onOffStr + "되었습니당~~~");
    }

    // 외부에서 채널을 변경할 수 있는 기능을 제공
    public void setChannel(int cnl) {
        if(cnl >= 0 && cnl <=999) {
            channel = cnl;
            System.out.println("채널을 " + channel + "로 변경 하였습니당~~~");
        } else {
            System.out.println("채널 설정 범위가 아닙니당~~~");
        }
    }

    public void setVolume (int vol) {
        if(vol >= 0 && vol <=100) {
            volume = vol;
            System.out.println("볼륨을 " + volume + "으로 변경 하였습니당~~~");
        } else {
            System.out.println("볼륨 설정 범위가 아닙니당~~~");
        }
    }
    public void getTV() {
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("====== TV 정보 ======");
        System.out.println("전원: " + onOffStr);
        System.out.println("볼륨: " + volume);
        System.out.println("채널: " + channel);


    }

}
