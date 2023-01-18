package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton(); // 클래스 내에서 객체 생성. singleton 참조변수가 static=> 하나만 만들어 진다는 뜻
    // singleton은 new Singleton()으로 객체를 만들고 그 객체의 주소를 저장하고 있는 참조변수
    private  Singleton() { // 생성자를 통해서 객체가 생성되지 않도록 접근제한을 설정 // 생성자를 만들때는 대부분 public을 붙이는데 싱글톤을 만들때에만 private을 씀
        name = "test";
        id = 100;
    }
    // getSingleton() 메소드를 호출 시 반환 값으로 이미 만들어져 있는 싱글톤 객체의 참조 변수를 반환
    static Singleton getSingleton() { // 클래스 메소드. 반환타입이 Singleton. getSingleton이 불러지면 singleton의 참조변수의 주소를 보내주겠다는 뜻
        return singleton;
    }

}
