package 인터페이스리모컨;

public class Television implements RemoteControl { // 오디오를 제어하기위한 리모콘
    private int volume; // 인스턴스필드 & 접근제한자 => 내부사용

    @Override
    public void turnOn() {
        System.out.println("Televisiono를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television를 끕니다.");
    }

    @Override
    public void setVolume(int volume) { // 볼륨에 대한 범위 이미 인터페이스에 기록
        if (volume > RemoteControl.MAX_VOLUME) { // 인터페이스 자체를 참조해야함. MAX_VOLUME 은 static, 인터페이스 소속
            this.volume = RemoteControl.MAX_VOLUME; // 최대치보다 높게 들어오면 최대치로 넣겠다는 뜻
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Television 볼륨 : " + this.volume);
    }
@Override
    public void getInfo() {
        System.out.println("Television 입니다.");
        System.out.println("현재 볼륨은 " + volume + "입니다.");
    }

    // setMute 가져와서 오버라이드 가능
    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("TV를 무음 처리 합니다.");
        else System.out.println("TV를 무음 해제 합니다.");
    }
}
