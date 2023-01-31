package _0131_06_HashSet_Ex_Lotto;
import java.util.HashSet;
public class Lotto {
    public static void main(String[] args) {
        HashSet<Integer> lotto = new HashSet<>();
    int tmp;
    while(true) {
        tmp = (int)((Math.random() *45) + 1);
        // if(!lotto.contains(tmp)); lotto.add(tmp); // Set 은 어차피 중복이 나올 수 없기 때문에 list 에서 쓰던 조건문 필요 X
        lotto.add(tmp);
        if(lotto.size() == 6) break;
    }
    for(Integer e : lotto) System.out.print(e + " ");
    }
}
