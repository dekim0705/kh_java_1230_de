package 배열로또번호생성;

import java.sql.Array;
import java.util.Arrays;

// 1 ~ 45 사이의 임의의 수 6개로 구성
// 1. 배열로 로또 번호를 생성해 출력 하기
// 2. 배열로 로또 번호 생성 (중복 제거)
// 3. 다른 자료구조를 사용해 로또 번호 만들기(ArrayList, Set)
public class RandomLotto {
    public static void main(String[] args) {
        // 6개의 정수형 배열 생성, 갯수는 6개 (로또 번호 저장을 위한 공간)
        int [] lotto = new int[6];
        // 반복문(6회)을 만들어 순회 순회 하면서 1~45 사이의 임의의 숫자를 배열이 대입
        for(int i = 0; i < lotto.length; i++) {
            // v = (int)((math.random() * 45) +1);
            lotto[i] = (int)((Math.random() * 45) + 1);
        }

        // 배열의 요소를 출력
        //System.out.println(Arrays.toString(lotto));
        for(int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + ", "); // 따로 출력 한 이유는 중복을 없애려고
        }
        System.out.print("\b\b");
    }
}
