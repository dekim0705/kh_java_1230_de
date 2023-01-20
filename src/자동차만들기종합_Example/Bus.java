package 자동차만들기종합_Example;

public class Bus extends Car_Example{
    public Bus(String name) {
        this.name = name;
        speed = 150;
        fuelEff = 5;
        fuelTank = 100;
        seatCnt = 20;
    }

       @Override
    void setMode(boolean isMode) {
        if(isMode) fuelTank += 30;
    }
}
