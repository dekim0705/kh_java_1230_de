package _0125_02_인터페이스활용;

public interface Sell1 {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}
