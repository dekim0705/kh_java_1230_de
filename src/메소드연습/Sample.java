package 메소드연습;
// 메소드 이름 규칙 : 변수 만드는 규칙과 동일 (대/소문자, _, $, 숫자 사용 가능 (숫자가 맨 앞에 오면 안됨))
// camel 표기법 사용
// 접근제한자 반환타입 메소드이름(매개변수목록) { 구현부; return }
public class Sample {
    // 접근제한자 붙이지 않으면 default 접근제한자 특성을 가짐(동일 패키지 내에서만 접근 가능)
        int sum(int a, int b) { // 메소드 호출 시 매개변수로 값을 전달함
            return a + b; // 메소드 호출 결과를 정수값으로 반환
        }
        // 매개변수(입력값)도 없고 반환값도 없는 메소드이다
        void say() {
            System.out.println("안녕하세요???????????");
        }

        String sayStr() {
            return "안녕하니???";
    }


}
