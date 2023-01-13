package TV만들기_Upgrade;

// TV_Upgrade_Prototype 은 TV의 기본 기능을 가짐
public class TV_Upgrade_Prototype { // 3가지의 인스턴스 필드로 구성된 TV_Upgrade_Prototype
    protected boolean isPower; // 전원에 대한 설정값 저장
    protected int channel;     // 채널 정보 저장
    protected int volume;      // 볼륨 값 저장

    public TV_Upgrade_Prototype() { // 디폴트. 객체를 만들때 생성자의 자리를 비워두면 () 불려지는 기능(?)
        this.isPower = false;
        channel = 10;
        volume = 10;
    }
    // 생성자 오버로딩 일어남
    public TV_Upgrade_Prototype(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }

    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 100) {
            channel = cnl;
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
}
// 양산용 TV
class ProductTV extends TV_Upgrade_Prototype { // 상속을 받았으니까 기본적으로 위의 정보들은 다 들어온 상태. 디폴트값이 있어서 에러 안남
    private String name; //이름이 없었으니 이름 추가
    private boolean isInternet;

    ProductTV() {
        super(true, 30, 30); // 부모의 생성자를 호출 함. 내꺼 부르기전에 부모꺼 먼저 초기화 해야 함
        name = "LG TV";
    }

    ProductTV(String name) { // 이름(name)을 외부로부터 입력받아서 생성자 만들기
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false; // 기본적으로 채널 설정 모드로 동작
        this.name = name; // 얘가 외부로부터 입력받을 이름인강?!?!?!
    }

    void setPower(boolean power) {
        isPower = power;
    }

    void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
        } else {
            System.out.println("볼륨 설정 범위를 벗어났습니다.");
        }
    }

    @Override // 오버라이딩을 하려면 접근제한자 포함하여 부모와 완벽하게 동일해야 함.
    public void setChannel(int cnl) {
        if (cnl > 0 && cnl < 1000) {
            channel = cnl;
        } else {
            System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }
    // 메소드 오버로딩 (오버라이딩을 가지고 인터넷기능을 추가 해서 오버로딩)
    // tv옵션에 따라서 채널기능만 있는 tv나 인터넷기능이 추가된 tv를 만들 수 있음
    public void setChannel(int cnl, boolean isInternet) {
        if(isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        } else {
            this.isInternet = false;
            if (cnl > 0 && cnl < 1000) {
                channel = cnl;
            } else {
                System.out.println("채널 설정 범위를 벗어났습니다.");
            }
        }
    }
    void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷모드 : " + isInternet);
    }
}
