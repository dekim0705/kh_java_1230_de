package 배열로또번호생성;

import java.util.Arrays;

public class RandomLottoNo중복 {
    public static void main(String[] args) {
        // 정수형 배열 생성, 갯수는 6개 (로또 번호 저장을 위한 공간)
        int[] lotto = new int[6];
        int tmp; // 생성된 로또 번호를 배열에 넣기전에 임시로 저장; 임시공간은 하나만있어도 됨 한번에 하나만 생성되니까
        boolean isExist = false; //번호의 중복 여부 확인
        int index = 0;
        while (true) {
            tmp = (int) ((Math.random() * 45) + 1);
            // 중복확인 구간
            for (int i = 0; i < lotto.length; i++) { // ***** 1++는 돈다는 뜻
                if (lotto[i] == tmp) isExist = true; // 배열에 생성된 로또번호가 있으면 true
            }
            // 생성된 번호가 배열내에 없으면 저장하는데, 인덱스 계산 해줘야 함
            if (isExist == false) lotto[index++] = tmp;
                                       // 후위연산자 넣고 한칸 옆으로~~ 중복되지 않도록~~
            // 로또번호가 5개 만들어 졌으면 반복문 탈출
            if (index == lotto.length) break; // lotto.length대신 6을써도됨
            // 존재 여부 확인하는 변수를 초기화 시킴
            isExist = false;
        }
        System.out.println(Arrays.toString(lotto));
    }
}