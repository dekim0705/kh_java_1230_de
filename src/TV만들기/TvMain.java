package TV만들기;

public class TvMain {
    public static void main(String[] args) {
        // TV객체 생성
        TV samsungTv = new TV(); // default setting
        TV lgTv = new TV(true, 3, 15); // 매개변수가 있는 생성자 호출
//        samsungTv.getTV();

        lgTv.getTV();


        samsungTv.getTV();
        samsungTv.setON(true); //동작을 하는지?
        samsungTv.setChannel(999); //동작을 하는지?
        samsungTv.setVolume(30);//동작을 하는지?

    }
}
