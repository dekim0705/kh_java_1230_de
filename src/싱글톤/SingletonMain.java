package 싱글톤;
// 싱글톤 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장하는 방법
// 사용하는 이유 : 메모리의 효율성과 데이터 공유의 이점이 있음
// 단점 : 구현이 까다로움, 데이터의 무결성이 깨질 수 있음(멀티쓰레드에서 사용 시 synchronized(동기화)가 필요)
public class SingletonMain {
    public static void main(String[] args) {
        ReferenceTest1 ref1 = new ReferenceTest1();
        ReferenceTest2 ref2 = new ReferenceTest2();
        ref1.setInfo("안유진", 21);
//        ref1.viewInfo();
//        ref2.setInfo("안녕", 22);
        ref2.viewInfo();
        // 같은 singleton을 공유 하는 중이라 값이 똑같아짐 Singleton = 공유 객체. singleton = 접근하는 참조변수
    }
}





/*
        // 이점 : 객체를 하나만 만들어서 여러군데에서 사용 가능
        // Singleton singleton = new Singleton(); // private 때문에 호출 X
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        if (singleton1 == singleton2) { //
            System.out.println("같은 싱글톤 객체를 참조 합니다.");
        } else {
            System.out.println("다른 싱글톤 객체를 참조 합니다.");
        }
        singleton1.id = 999;
        singleton1. name = "싱글톤";
        System.out.println(singleton1.id);
        System.out.println(singleton1.name);
        System.out.println(singleton2.id);
        System.out.println(singleton2.name);
 */
