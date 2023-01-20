package 자동차만들기종합_Example;

public class SportsCar extends Car_Example {
    public SportsCar(String name) {
        this.name = name;
        speed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }

    @Override
    public void setMode(boolean isMode) {
        if(isMode) speed += 1.2;
    }

}
