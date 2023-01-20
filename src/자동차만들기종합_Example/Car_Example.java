package 자동차만들기종합_Example;

public abstract class Car_Example { // 실제 사용할 차 X, 객체를 만들 필요가 X => 추상클래스로 생성
    protected int speed; // 속도
    protected int fuelEff; // 연비 (리터당 주행거리)
    protected int fuelTank; // 연료탱크
    protected int seatCnt; // 좌석 수
    protected String name; // 자동차 이름

    // 부가 기능은 각 차량마다 다르긔 때문에 부모는 기능만 명시하고 상속받은 자식이 해당 기능을 (반드시)구현 함
    abstract void setMode(boolean isMode);

    public String getName() { // 메인이 다른 패키지에 있을 경우를 대비해서 public 접근제한자
        return name;
    }
    // 다른 기능들도 같은 패키지에 있을때에는 상관 없지만 다른 패키지에 메인이 있는 경우를 대비해서 public 을 항상 붙여줘야 함


    // 이동 횟수 구하기 (제일 먼저 해야 할 부분. 아래 공통구현 할 세 부분에 필요함): 외부의 입력값으로 승객의 수가 필요
    public int getMoveCnt(int passCnt) {  // 외부(메인)에서 승객 숫자만 들어오면 이동 횟수 구할 수 있음.
        if (passCnt % seatCnt != 0) return (passCnt / seatCnt) + 1; // 나눠서 떨어지지 않으면 +1
        return passCnt / seatCnt;
    }
    // 공통적으로 구현해야 할 부분 : 총 이동 비용, 총 주유 횟수, 총 소요 시간.

    // 총 이동 비용은 매개변수로 거리와 이동 횟수가 필요
    public int getTotalCot(int dist, int moveCnt) {
        return (dist / fuelEff * 2000) * moveCnt;
    }

    // 총 주유 횟수 : 총 이동 거리를 구하고 이를 연비로 나누고 이를 다시 연료탱크 크기로 나눔
    public int getReFuelCnt(int dist, int moveCnt) {
        if(((dist * moveCnt) / fuelEff) % fuelTank != 0) // 나눠 떨어지지않고 조금이라도 남는다면 한번 더 주유가 필요함
            return(((dist * moveCnt) / fuelEff) / fuelTank) + 1; // 마지막에 연료통 크기로 또 나눠야 함 => 횟수 구해야 하니까 // 나눠 떨어지지 않으면 주유를 한번 더 해야 함
        return ((dist * moveCnt) / fuelEff) / fuelTank;
    }

    // 총 소요 시간
    public double getMoveTime(int dist, int moveCnt) { // 시,분을 표현하기 위한 double
        return(double) dist * moveCnt / speed;
    }
}

