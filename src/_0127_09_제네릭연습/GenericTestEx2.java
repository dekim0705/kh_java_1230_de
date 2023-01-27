package _0127_09_제네릭연습;
// 제네릭 타입 : 타입변수를 사용해 다형성 구현(?)
public class GenericTestEx2 {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("딸기고양이");
        System.out.println(p1.info);

        Person<Integer> p2 = new Person<>(1234);
        System.out.println(p2.info);

        // 다형성은 아닌데 다형성처럼 작용됨 ~ !
        // int 는 값을 넣는(대입)거고, Integer 는 주소를 가지고 있는거임
    }
}

// 'T' 타입변수라고 하며, 임의의 참조형타입을 의미, 'T'는 변수명을 의미하며 아무이름으로 지어도 됨(일반적으로는 대문자 T)
class Person <T> {
    public T info; // info 라는 변수의 타입이 T 인 상태 -> 들어오는 타입에 따라서 타입이 정해짐
    Person(T info) {
        this.info = info;
    }


}

