package 배열기타문법;

import java.util.Arrays;

public class BasicArrayEtc02 {
    public static void main(String[] args) {
        String[] city = {"서울", "부산", "대구", "인천", "수원"};
        for(String e : city) System.out.print(e + " ");
        System.out.println();
        System.out.println(city[3]); //인천
    }
}
