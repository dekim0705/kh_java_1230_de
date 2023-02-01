package _0201_05_Comparator클래스정렬;


public class Fruit  { // (comparable 과는 다르게 자기 자신과 비교가 아니기 때문에 현재 클래스가 상속하지 X, 새로운 정렬용 클래스 생성)
    String name;
    int price;


    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
