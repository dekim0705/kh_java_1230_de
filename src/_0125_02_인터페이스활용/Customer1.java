package _0125_02_인터페이스활용;

public class Customer1 implements Buy1, Sell1{
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() { // default void // 여기서 Override 하면 order 는 상속받은건 없어지고 고객주문 만 남음
                          // 모호성을 없애기 위해 재정의를 해줘야 함
        // Buy1.super.order();
        System.out.println("고객 주문");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}
// Buy1, Sell1 의 디폴트 order 때문에 누구껄 받아야 하맂 모르는 다종상속의 문제 발생
