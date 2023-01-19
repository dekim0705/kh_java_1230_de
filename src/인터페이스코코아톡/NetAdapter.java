package 인터페이스코코아톡;

import 인터페이스네트워크.NetworkAdapter;

public interface NetAdapter {
    void connect();
    void send(String msg); // 네트워크니까 wrtMsg는 필요 X . send만 만들면 됨
}

class WiFi implements NetAdapter {

    @Override
    public void connect() {}

    @Override
    public void send(String msg) { // main에서 객체.send 가 되는 부분에서 여기서 동작
        System.out.println("WiFi >> " + msg);
    }
}

class FiveG implements NetAdapter {

    @Override
    public void connect() {}

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}