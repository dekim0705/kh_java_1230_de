package _0127_01_래퍼클래스;
// 래퍼클래스란? 기본타입을 객체타입으로 변환 시켜 주는 것
// 필요한 이유? 컬렉션프레임워크에서 사용되는 자료형은 모두 객체 타입이므로 기본타입을 사용할 수 없음
// 객체타이브로 사용하는 이유는 일반화 프로그램을 위해서이며, 일반화 프로그램은
// 여러가지 다양한 데이터 타입에 대해서 동일한 자료구조로 관리하기 위해서 ...

public class WrapperTest {
    public static void main(String[] args) {
        Integer num = 10; //
        // Integer num = new Integer(10); // 하나의 정수값을 만들더라도 객체타입이기 때문에 객체 생성 수 만들어 줬었음
        // int n = num.intValue(); 이런식으로 하던가 했었음
    }
}
