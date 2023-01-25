package _0125_06_다운캐스팅;

import java.util.ArrayList;

// 다운캐스팅이란? 상위 클래스형으로 변환 되었던 하위클래스를 다시 원래 자료형으로 변환하는 것
// instanceOf? 형 변환 가능 여부를 확인하는 용도 (참조 변수가 참조하고 있는 객체의 실제 타입을 알아보기 위해 사용)
public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>();

    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
    }

    public void addAnimal() {
        aniList.add(new Human()); // ArraysList 에 추가되면서 타입이 Animal 형으로 변환. .add 하면 공간을 새로 만들면서 들어감, 원래 공간이 만들어져있지 X
        aniList.add(new Tiger()); //
        aniList.add(new Eagle());
        for (Animal e : aniList) e.move(); // 향상된 for 문 앞에는 element 타입을 넣어주는데 여기선 그게 Animal
    }

    public void testCasting() {
        for (int i = 0; i < aniList.size(); i++) { // ArrayList 는 length 대신 size 사용
            Animal ani = aniList.get(i); // List 해당 인덱스의 값을 가져 옴 => i 번째 값을 가져와서 넣음 = Animal 의 자손들 중 하나
            if (ani instanceof Human) {  // Human 타입으로 형 변환 가능 여부를 물어 봄 => ani 객체 중에 Human 이랑 일치하는게 있니? 부모클래스 중 자식 클래스와 일치하는게있(?)
                Human h = (Human) ani;
                h.readBook();
            }else if(ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            }else if(ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            }else{
                System.out.println("지원되지 않는 형 입니다.");
            }
        }
    }
}
