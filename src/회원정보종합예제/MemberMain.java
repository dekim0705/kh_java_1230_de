package 회원정보종합예제;
// main은 프로그램의 시작과 끝.
// 기능과 기능은 느슨하게 결합이 되어야 함.
public class MemberMain {
    public static void main(String[] args) {
    MemberInfo memberInfo = new MemberInfo(); // MemberInfo 클래스를 객체로 만듬
//  클래스이름   객체이름  그래서 클래스이름은 대문자로 해야함 : 객체참조타입의 변수
// 클래스를 가지고 객체를 만들려면 메모리를 할당받아야 실체가 생김. 그 작업을 인스턴스화/실체화 한다고 함; new MemberInfo();부분
        memberInfo.setName(); // 이름을 저장하는 메소드 호출
        memberInfo.setAge();  // 나이를 저장하는 메소드 호출
        memberInfo.setGender(); // 성별을 저장하는 메소드 호출
        memberInfo.setJobs();
        memberInfo.viewInfo();
    }
}
