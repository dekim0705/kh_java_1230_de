package _0125_02_인터페이스활용;
public class CustomerTest {
    public static void main(String[] args) {
    Customer1 customer1 = new Customer1();
    Buy1 buyer1 = customer1;
    buyer1.buy();
    buyer1.order(); // 재정의된 메소드가 호출 됨

    Sell1 seller1 = customer1;
    seller1.sell();
    seller1.order();
    }
}



// 형변환이 어떻게 일어나는지

//    Customer customer = new Customer();
//        Buy buyer = customer; // Customer Type 의 customer 참조변수를 Buy 인터페이스형 buyer 참조변수에 대입 (형변환이 일어남)
//        buyer.buy(); // buyer 는 Buy 인터페이스의 메소드만 호출 가능
////        Buy buyer = new Customer(); // 위와 똑같음?
////        buyer.buy();
//
//        Sell seller = customer; // 받는 순간 자동 형변환이 일어남
//        seller.sell();
//
//        Customer customer1 = (Customer) seller; // 다운캐스팅 => cast 눌러서 명시적으로 역 형변환
//        customer1.buy();
//        customer1.sell();
//        // instanceOf 를 사용해서 형변환 가능 여부를 확인 후 변환 하는 것이 좋음. 여기선 사용 안했음