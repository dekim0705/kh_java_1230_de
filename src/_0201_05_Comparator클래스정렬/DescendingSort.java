package _0201_05_Comparator클래스정렬;
import java.util.Comparator;
// 정렬 방식을 정하는 클래스
public class DescendingSort implements Comparator<Fruit> {// (매개변수 1 , 2를 비교해야함. Fruit 이라는 객체를 전달받아 정렬)
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price == o2.price) {
            return o1.name.compareTo(o2.name);
        }
        return o2.price - o1.price; // (o2가 크면 양수, o1이 크면 음수. 내림차순 정렬)
    }

    @Override
    public Comparator<Fruit> reversed() {
        return Comparator.super.reversed();
    }


}
