package 아이패드만들기;

public class IPadMain {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            IPadMake iPad = new IPadMake("  "); // IPadMake라는 클래스(설계도)를 가져와서 new객체 만들기
            // 다른부분들은 사용자가 선택할거라서 괜찮은데 생성자name부분은 각인서비스라서 디폴트 설정이 있어야함
            if(!iPad.continueOrder()) break; // 주문을 안할꺼면 빠져나갈 조건을 만드려면 !(부정의논리연산자)를 붙여줌 = iPad.continueOrder() == false
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerialNum();
            iPad.inProductPad(); // throws InterruptedException 바깥으로 던지는거?
            iPad.productPad();

            // System.out.println(iPad.serialNum); 직접 인스턴스 필드접근해서 가져올 수 도 있음. 왜냐면 지금 접근제한자 특성이 디폴트이기때문에. 위에애들은 정해진 메소드
        }
    }
}
