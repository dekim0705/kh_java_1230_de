package _0131_02_커피메뉴만들기;

public class MenuInfo implements Comparable<MenuInfo> {
    String name;  // 메뉴명
    int price;    // 가격
    String group; // 분류
    String desc;  // 설명

    public MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }

    @Override
    public int compareTo(MenuInfo o) { // 가격으로 정렬
        return this.price - o.price;
    } // HashMap 은 정렬이 안되니까 TreeMap 을 가져와서 MenuInfo 상속 오버라이드

//    public int compareTo(MenuInfo o) { // 알파벳 순으로 정렬
//        return
//}

}
