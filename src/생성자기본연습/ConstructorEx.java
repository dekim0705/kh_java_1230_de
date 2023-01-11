package 생성자기본연습;
// 생성자란? 클래스가 객체로 만들어 질 때 자동으로 호출(new 를 호출 할 때) 되며,
// 생성자는 인스턴스 필드를 초기화하는 것이 주 목적이다.
// 생성자 만드는 규칙 :
// 1. 생성자는 클래스 이름과 같아야 함.
// 2. 반환 타입은 없고 접근 제한자는 올 수 있으나 private 특별한 경우가 아니면 사용 안함. no need to return cuz it 'constructs'
// 3. 하나의 클래스는 여러개의 생성자를 가질 수 있습니다. (단, 오버로딩 생성 규칠에 맞아야 함)
public class ConstructorEx {
    public static void main(String[] args) {
// 밑에꺼 다 하고 Car로 새로운 변수를 만들어야 함
        Car ev6 = new Car(); // 아무것도 없는 생성자 호출
        Car kona = new Car("코나");
        Car sorento = new Car("쏘렌토", "2023");
        Car g90 = new Car("제네시스G90", "2022", "Blakc");
        ev6.getCar();
        kona.getCar();
        sorento.getCar();
        g90.getCar();

// 문자열의 기본값은 null



    }
}


/*
1. Car라는 class를 만듬
2. Car () {} 라는 생성자를 만듬 (아무것도 없는 생성자 = 매개변수가 없는 생성자)
3. 인스턴스 필드 생성
4. 또 Car() {}하면 안됨. 오버로딩 불가능 redefined됨. 그래서 타입이나 개수를 다르게 넣어줘야함
5. this사용해서 이름 넣어줌
 */
        class Car {
            String name; // 인스턴트 필드
            String year;
            String color;

            Car() {
            } // 아무것도 없는 생성자

            Car(String name) {
                this.name = name;
            }

            Car(String name, String year) {
                this.name = name;
                this.year = year;
            }

            Car(String name, String year, String color) {
                this.name = name;
                this.year = year;
                this.color = color;
            }
// getCar는 정보를 출력하기 위한 메소드
// 일반 메소드는 앞에 반환할게 없으면 void무조건 붙여줘야 함
            void getCar() {
                System.out.println("이름 : " + name);
                System.out.println("연식 : " + year);
                System.out.println("색상 : " + color);
                System.out.println("--------------");


            }

        }
