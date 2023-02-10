package _0210_06_직렬화연습_Write;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// (프로젝트가 2개 필요 : 1) 쓰는부분
//                     2) 읽는부분
public class SerialMenuWrite {
    static Map<String, CoffeeMenuInfo> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        menuWrite();
        selectMenu();
    }
    static void menuWrite() { // (Map 에서는 .put() 메소드사용!)
        map.put("Americano", new CoffeeMenuInfo("Americano", 2500, "Coffee", "그냥 커피" ));
        map.put("Espresso", new CoffeeMenuInfo("Espresso", 2500, "Coffee", "진한 커피" ));
        map.put("Latte", new CoffeeMenuInfo("Latte", 4500, "Coffee", "우유가 들어 있어요" ));
    }
    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("메뉴를 선택 하세요 : ");
            System.out.print("[1]메뉴 보기, [2]메뉴 추가, [3]종료 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1 :
                    System.out.println("======= 메뉴 보기 =======");
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getGroup());
                        System.out.println("설명 : " + map.get(e).getDesc());
                        System.out.println("---------------------");
                    }
                    break;
                case 2 :
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    String key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다."); // (메뉴가 이미 있다면 추가 X)
                    } else { // (메뉴가 없다면 ~ 추가 해주는데 key 값은 위와 동일하니까 바로 가격부터 입력)
                        System.out.print("가격 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 : ");
                        String grp = sc.next();
                        sc.nextLine(); // 버퍼비우기 (가격, 분류는 next 로 받다가 설명은 nextLine()으로 받아야 함)
                        System.out.print("설명 : ");
                        String desc = sc.nextLine(); // (여기까지 입력 해서 map 에 추가)
                        map.put(key, new CoffeeMenuInfo(key, price, grp, desc));
                    }
                    break;
                case 3 :
                    System.out.println("메뉴를 종료 합니다. 내용을 파일에 저장 합니다.");
                    FileOutputStream fos = new FileOutputStream("D:/직렬화파일/커피메뉴.bin");
                    ObjectOutputStream oos = new ObjectOutputStream(fos); // (직렬화를 해줘야 함)
                    oos.writeObject(map); // 객체를 직렬화해서 파일에 저장
                    oos.flush();
                    oos.close();
                    return;
            }
        }


    }
}
