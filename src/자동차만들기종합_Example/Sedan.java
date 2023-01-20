package 자동차만들기종합_Example;

public class Sedan extends Car_Example {
    public Sedan(String name) {
        this.name = name;
        speed = 150;
        fuelEff = 12;
        fuelTank = 45;
        seatCnt = 4;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }
}
