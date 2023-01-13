package 오버라이딩제약;
// 오버라디잉은 부모가 가진 메소드를 재정의해서 사용하는 것
// 부모의 클래스가 실체가 있는 클래스이면 오버라이딩은 선택 사항 임
// 부모의 클래스에서 메소드 구현 시 상속 받은 자식에서 오버라이딩을 할 수 없도록 금지할수 있음
public class FinalOverriding {
    public static void main(String[] args) {
        SportsCar sportsCar =  new SportsCar("Ferrari"); //SportsCar은 클래스 sportsCar은 클래스에 대한 참조변수
        sportsCar.setTurbo(true);
        sportsCar.infoCar();
        sportsCar.accelerator();
        sportsCar.breakPanel();

        System.out.println();
        System.out.println("------------------------");
        System.out.println();


        ElectricCar electricCar = new ElectricCar("전기차얌!");
        electricCar.setAutoDrv(true);  // getAutoDrv말고 setAutoDrv가져와야 함
        electricCar.infoCar();
        electricCar.accelerator();
        electricCar.breakPanel();
    }
}
