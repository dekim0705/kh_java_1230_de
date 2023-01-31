package _0131_02_커피메뉴만들기;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// [1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴수정, [6]종료

public class CoffeeMenuEx {
    Map<String, MenuInfo> map = new TreeMap<>(); // 밖에서도 사용 가능하도록 main 밖(외부)에서 만들기 (?)
        // key , class(object)
    public static void main(String[] args) { // main 을 포함하고 있는 클래스 자체를 객체로 만듬
        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();
    }

    void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본 커피 입니다.")); // 생성자를 호출하여 객체를 바로 집어 넣는 것
        map.put("Espresso", new MenuInfo("Espresso", 3000, "Coffee", "진한 커피 입니다."));
        map.put("Latte", new MenuInfo("Latte", 4500, "Coffee", "우유가 포함된 커피 입니다."));
    }

    void selectMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) { // 메뉴를 계속 부르기 위한 while
            System.out.println("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴수정, [6]종료");
            System.out.print("번호를 선택하세요 : ");
            int selMenu = sc.nextInt();
            String key = ""; // 자주 사용해야하니 switch(case2) 바깥에 만들어주기. " " 로 초기화

            switch (selMenu) {
                case 1 :
                    System.out.println("======== 메뉴 보기 ========"); // 내용은 map 내의 Entry 를 순회해서 보여주면 됨 -> enhanced for
                    for(String e : map.keySet()) { // key 가 3개 있으니까 세개가 넘어와서 세번 순회
                        System.out.println("메뉴 : " + map.get(e).name); // 객체 이니까 객체 내부로 들어가야 함
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).group);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("=========================");
                    }
                    break; // 여기서 break 안걸면 찍고 쭉 내려가서 return 문 만나고 끝나버림

                case 2 :
                    System.out.print("조회 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) { // map 내에 key 가 존재하는지 확인 (있으면 true)
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                        System.out.println("=========================");
                        // key 가 존재하면 보여주고, 없으면 else
                    }else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;

                case 3 :
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine(); // 버퍼 비우기
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, group, desc));
                    }
                    break;

                case 4 :
                    System.out.print("삭제할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + " 메뉴를 삭제 했습니다.");
                    } else System.out.println("삭제할 메뉴가 없습니다.");
                    break;

                case 5 :
                    System.out.print("수정할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine(); // 버퍼 비우기
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.replace(key, new MenuInfo(key, price, group, desc));
                    } else System.out.println("수정할 메뉴가 없습니다.");
                    break;

                case 6 :
                    System.out.println("종료 합니다.");
                    return; // break 사용하면 반복문을 벗어날 수 없음 (switch 에서 빠져나가도 while 있어서 못나감)
            }

        }
    }
}
