package _0203_04_스레드예제5번;

public class ThreadB extends Thread{
    private WorkObject workObject; // (클래스의 이름을 가지고 참조변수를 만들었음 = 외부에서 객체의 요인을 주입(injection) 받는다는 뜻 / 주입을 하지 않으면 nullpointException(참조하고있는 주소에 아무것도 없다!) 이 나옴)
    public ThreadB(WorkObject workObject) {
        this.workObject = workObject; //(지역변수처럼 여길 벗어나면 사라져버리기때문에 workObject 를 인스턴스 workObject 에 대입해줘야 함)
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodB(); // (workObject 를 10번 부른다는 뜻)
        }
    }
}
