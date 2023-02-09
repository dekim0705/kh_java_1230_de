package _0209_02_스트림예제07;

import java.util.ArrayList;
import java.util.List;

public class StreamObjTest {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("야옹이", 21, 1000));
        customerList.add(new TravelCustomer("멍멍이", 38, 3000));
        customerList.add(new TravelCustomer("꿀꿀이", 17, 1600));
        customerList.add(new TravelCustomer("짹짹이", 18, 2000));
        System.out.println("고객 명단 출력");
        customerList.stream().map(c-> c.getName()).forEach(s->System.out.println(s));
                // (명단을 가져와야하니까 map 을 통해서 우리가 원하는걸 골라내야 함)
        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("총 여행 비용 : " + total);
        System.out.println("== 20세 이상 성인 출력 ==");
        customerList.stream()
//                .sorted()
                .filter(c->c.getAge() >=20)
                .map(c->c.getName())
                .sorted()
                .forEach(s->System.out.println(s));

    }
}


class TravelCustomer {
    String name;
    int age;
    int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
