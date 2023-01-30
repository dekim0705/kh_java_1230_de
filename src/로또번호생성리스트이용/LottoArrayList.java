package 로또번호생성리스트이용;
import java.util.ArrayList;
import java.util.List;

public class LottoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // 갯수 지정 필요 없음
        // 01.30 : List 인터페이스가 부모이기때문에 ArrayList<>();를 Vector 나 LinkedList 로 바꿔도 값은 똑같이 나옴.
        int tmp; // 로또 번호를 임시로 저장하는 변수
        while(true) {
            tmp = (int)((Math.random() *45) + 1);
            if(!list.contains(tmp)); list.add(tmp);
            if(list.size() == 6) break;
        }
        for(Integer e : list) System.out.print(e + " ");
    }
}
