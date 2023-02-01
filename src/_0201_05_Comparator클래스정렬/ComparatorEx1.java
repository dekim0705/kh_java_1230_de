package _0201_05_Comparator클래스정렬;

import java.util.TreeSet;

// Comparator 역시 정렬을 구현하는데 사용하는 인터페이스
public class ComparatorEx1 {
    public static void main(String[] args) {
        TreeSet<Fruit> ts = new TreeSet<>(new DescendingSort()); // (comparable 은 클래스 자체가 정렬조건을 상속하였었는데 여기서는 정렬조건을 명시해야 함)
//        TreeSet<Fruit> ts = new TreeSet<>(new DescendingSort().reversed()); // 뒤집힘
        ts.add(new Fruit("포도", 3000));
        ts.add(new Fruit("수박", 12000));
        ts.add(new Fruit("딸기", 16000));
        ts.add(new Fruit("키위", 16000));

        for(Fruit fruit : ts) {
            System.out.println("이름 : " + fruit.name + "  가격 : " + fruit.price);
        }
    }
}
