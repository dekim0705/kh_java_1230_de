package _0125_03_중첩클래스;

public class OuterClass {
    private int num = 10; // 인스턴스 변수
    private static int sNum = 20; // 정적 변수 (클래스 소속의 변수)
    InnerClass innerClass; // 아직 내부 클래스를 만들지 않았음
    public OuterClass() { // 외부 클래스에 대한 생성자 호출
        innerClass = new InnerClass(); // 만들어진 내부클래스에대한 객체
    }

    class InnerClass {
        int inNum = 100;
        // static int sInNum = 200; // 클래스 변수는 원래 내부클래스에는 넣을 수 없게 되어있음 jdk16부터는 가능
                                    // JDK 11버전 기준으로는 내부 클래스에 정적변수를 선언 할 수 없음
        void inTest(){
            System.out.println("외부클래스의 인스턴스 변수 : " + num);
            System.out.println("외부클래스의 정적 변수 : " + sNum);

        }
        // static void sTest(){} // JDK 11버전 기준으로는 내부 클래스에 정적변수를 선언 할 수 없음

    }
    public void usingClass() {
        innerClass.inTest();
    }
}
