package _0130_04_어레이리스트객체;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListObjectEx {
    public static void main(String[] args) {
        List<MenuInfo> menuInfoList = new ArrayList<>(); // 크기는 모르지만 배열을 잡은 상태. (제네릭타입으로 MenuInfo 타입을 명시적 지정해준 상태)
//        List menuInfoList = new ArrayList<>(); // 타입을 정하지 않은 상태여서
//        menuInfoList.add(Object e)             // 객체를 expecting 하는 상태
        menuInfoList.add(new MenuInfo("Americano", 4000, "Coffee", "깔끔한 아메리카노")); // 0 번 인덱스는 MenuInfo 에 대한 참조변수
        menuInfoList.add(new MenuInfo("Latte", 4500, "Coffee", "부드러운 라떼"));
        // 익숙한 방법
        MenuInfo menuTest = new MenuInfo("Espresso", 4200, "Coffee", "진한 에스프레소");
        menuInfoList.add(menuTest); // menuTest 에 있는 주소를 add 해준 것

        for(MenuInfo e : menuInfoList) {
            // System.out.println(e + " "); // 이렇게 하면 해시태그 나옴
            e.getMenuInfo(); // 리턴값없이 바로 찍어주기 때문에 System.out.println~ 필요 X
            System.out.println();
        }
    }
}






// 인덱스 자체는 직접적인 값이 아닌 객체의 참조 주소가 됨
// 기본 배열과는 다르게 (각 인덱스에 값이 있음) 배열에 값이 안들어오고 주소가 들어온다고 생각하기