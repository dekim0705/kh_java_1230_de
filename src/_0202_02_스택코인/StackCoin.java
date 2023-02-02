package _0202_02_스택코인;
import java.util.Stack;

public class StackCoin {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>(); // Stack 도 컬렉션프레임워크라서 <> 에 객체가 들어가야 함
        coinBox.push(new Coin(100)); // new Integer(100) (WrapperClass 로 인해서 new 가 생략 가능했지만 여기선 Coin 이 새로운 클래스이기 때문에 new 로 추가)
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // Stack 구조에 맞게 내부값에 접근 하는 법 : (for 문은 맞지 구조 개념에 맞지 않음)
        while(!coinBox.isEmpty()) { // (coinBox 가 비어있지 않으면~)
            Coin coin = coinBox.pop(); // (리턴값으로 결과값을 빼냄, 제일 위의 값)
            System.out.println(("꺼내온 동전 : " + coin.getValue()));
        }
    }
}

class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
