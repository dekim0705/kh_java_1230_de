package _0130_04_어레이리스트객체;

public class MenuInfo {
    String name;  // 메뉴의 이름
    int price;    // 메뉴의 가격
    String group; // 메뉴의 분류
    String desc;  // 메뉴에 대한 설명

    public MenuInfo(String name, int price, String group, String desc) { // constructor
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }
    public void getMenuInfo() {
        System.out.println("이름 : " + name);
        System.out.println("가격 : " + price + "원");
        System.out.println("분류 : " + group);
        System.out.println("설명 : " + desc);
    }
}
