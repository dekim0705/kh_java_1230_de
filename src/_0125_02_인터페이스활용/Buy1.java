package _0125_02_인터페이스활용;
// 디폴트 메소드가 중복되는 경우 : 예외적으로 인터페이스 메소드에 구현부가 있음
public interface Buy1 {
    void buy();
    default void order() {  // 디폴트라서 오버라이딩 해도되고 안해도 됨
        System.out.println("구매 주문");


    }
}
// 인터페이스 사용 이유 : 다중상속의

