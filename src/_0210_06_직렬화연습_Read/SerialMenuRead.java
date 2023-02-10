package _0210_06_직렬화연습_Read;

import _0210_06_직렬화연습_Write.CoffeeMenuInfo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SerialMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        getMenuList();
    }

    static void getMenuList() throws IOException, ClassNotFoundException { // (메뉴를 읽으려면 파일인풋!)
        FileInputStream fis = new FileInputStream("D:/직렬화파일/커피메뉴.bin");
        ObjectInputStream ois = new ObjectInputStream(fis); // (역직렬화)
//        Map<String, CoffeeMenuInfo> map = new HashMap<>(); // (HashMap 메모리 잡기)
//        map = (Map<String, CoffeeMenuInfo>)ois.readObject(); // (형변환 해주면 이때 역직렬화가 일어남)
        Map<String, CoffeeMenuInfo> map =(Map<String, CoffeeMenuInfo>)ois.readObject(); // (이렇게도 가능, 어차피 만들어져 있어서, HashMap 굳이 필요 X )
        for(String e : map.keySet()) {
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getGroup());
            System.out.println("설명 : " + map.get(e).getDesc());
            System.out.println("---------------------");
        }
        fis.close();
        ois.close();
    }
}
