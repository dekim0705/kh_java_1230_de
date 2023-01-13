package 상속기본;

public class Animal {
    String name;
    void setName(String name) { // 이런걸 setter라고 함: 필드의 값을 설정하는 것
        this.name = name;

    }
}

// 상속을 받기 위해서는 extends 라는 키워드 사용
// Animal class 로부터 상속을 받아 Dog class 를 생성
// Dog class 에서 아무런 기능을 구현하지 않아도 자동으로 부모의 필드와 메소드가 포함되어 있음
class Dog extends Animal {
    void sleep() { // sleep 이라는 새로운 기능 추가 -> name(상속) + sleep(추가)
        System.out.println(name + "가 잠을 잡니당. 밖은 넘 추워용ㅠㅠ");
    }
}

class HouseDog extends Dog {
    // name,sleep + sleep이라는 기능이 이미 Dog에 있었기 때문에 안만들어도 되지만 새로 sleep을 만든다면? = 오버라이딩(재정의)
    // 부모가 가진 메소드를 물려받아서 재정의를 하는 것 = 오버라이딩
    // 나중에 오버라이딩 한 메소드가 우선권을 가짐
    @Override // annotation : 구현에 있어서 문법적인 큰 역할은 아니고 메타데이터 같은 부가 정보를 제공해줌. 스프링에서는 많이 사용 됨
              //        용도 : override 관계가 있는지 없는지 확인해주는 용도. 오버라이드가 없는 상태이면 에러가 뜸 like Grammarly
    void sleep() { // **부모와 자식관계는 오버라이드 성립
        System.out.println(name + "가 집에서 잠을 잡니당. 따뜻~");
    }
    void sleep(int time) { // ** 여기서는 오버로딩 성립
        System.out.println(name + "가 " + time + "시간 동안" + " 집에서 잠을 잡니당. 따뜻~");
    }
}




/*
 생성자 초기화는 클래스가 객체로 만들어 질 때 값을 집어넣는 것
 세터는 원할 때 값을 넣는 것?? 의존성주입 찾아보기????
 */




