package 메소드연습;

public class Sample {
    String name; // 인스턴스 필드

    // 생성자 : 클래스 이름과 동일하고 반환 타입이 없음, 클래스가 객체로 생성될 때 자동으로 호출
    // 생성자의 주요 목적은 클래스 내부의 인스턴스 필드를 초기화 함
    Sample() {
        name = "anonymous";
    }


    // 동일 이름의 생성자가 여러개 만들어 지면 생성자 오버로딩 관계가 만들어 진다.
    Sample(String name) {
        this.name = name; // this는 추후에 설명
    }



    // 이름을 읽는 메소드 (Getter)
    String getName() {
        return name;
    }



    // 접근제한자 붙이지 않으면 default 접근제한자 특성을 가짐(동일 패키지 내에서만 접근 가능)
        int sum(int a, int b) { // 메소드 호출 시 매개변수로 값을 전달함

        return a + b; // 메소드 호출 결과를 정수값으로 반환
        }




    // 같은 이름의 sum 변수 가능. 컴파일러가 자동으로 매개변수 매칭 후 호출. sum은 오버로딩 형태임. int a, int b를 넣으면 위에꺼가 나오고 아님 밑에꺼가나옴
    // 메소드의 매개변수는 일반적으로 개수가 정해져 있음. 경우에 따라 개수를 알수 없는 경우 ...을 사용 하면 됨
    int sum(int...values) { // 갯수가 애매할때 는 -> ...; 적절한 값이 들어오면 처리 하겠다는 뜻
        int sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
                return sum;
    }



    // 매개변수(입력값)도 없고 반환값도 없는 메소드이다
        void say() {
            System.out.println("안녕하세요???????????");
        }


        String sayStr() {
            return "안녕하니???";
    }
}
