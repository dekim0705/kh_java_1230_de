package 다형성응용1;
// 매개변수의 다형성 예제
public class PolyBuyer {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(); // 구매를 하는 객체
        TV tv = new TV();
        Audio audio = new Audio();
        Computer computer = new Computer();
        buyer.buy(tv); // 물건을 사는 행위. buyer이 buy라는 행위(메소드)를 함. 매개변수??라서 부모클래스 밑에있는 세가지 메소드를 다 가져올 수 있음
        buyer.buy(audio);
        buyer.buy(computer);
        buyer.viewInfo();
        // 제품이 추가가 되어도 추가로 메소드를 만들 필요없이 buy메소드만 있으면 됨
    }
}

