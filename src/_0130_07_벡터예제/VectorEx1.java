package _0130_07_벡터예제;
import java.util.List;
import java.util.Vector;
// Vector 는 ArrayList 내부적으로 동일한 구조 입니다. 메소드의 사용 방법도 완전히 동일 합니다. 멀티스레드에 안전합니다.
// 동시에 접근 불가능하도록 locking(크게잡고있음)을 잡기때문에 성능이 떨어짐.
public class VectorEx1 {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>(); // 명함 수정이 잦으면 LinkedList 등등 맞는 List 를 생각해서 써야 함.

        list.add(new NameCard("딸기고양이", "010-1234-1234", "strawberry@cat.com", "귀여움", "캣타워"));
        list.add(new NameCard("키위멍멍이", "010-1234-5678", "banana@dog.com", "깜찍함", "방석"));
        list.add(new NameCard("노랑병아리", "010-5678-5678", "yellow@chick.com", "귀요미", "엄마품"));
        // 생성자를 바로 집어 넣어도 되고, 외부에서 객체를 만든 후 매개변수를 넣을수도 있음.
        NameCard nameCard1 = new NameCard("추가명함", "010-0000-0000", "addition@namecard.com", "nameCard1", "새로운객체");
        list.add(nameCard1);

        for(NameCard e : list) {
            System.out.println("********** NAME CARD **********");
            System.out.println("이름 : " + e.name);
            System.out.println("번호 : " + e.phone);
            System.out.println("메일 : " + e.mail);
            System.out.println("직위 : " + e.position);
            System.out.println("주소 : " + e.address);
            System.out.println();
        }
    }
}

class NameCard {
    String name;
    String phone;
    String mail;
    String position;
    String address;


    public NameCard(String name, String phone, String mail, String position, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }
}

// Getter & Setter 는 값을 보호하기 위한 용도라서 여기서는 굳이 만들지 않음
// 프로그래밍 : (현대언어들의 특성) 최근에는 만들어진 data 를 가공 없이 사용만 하는 용도로 많이 쓰고 있음 (Read only)

