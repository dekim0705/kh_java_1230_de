package ContinueEx1;

public class ContinueEx1 {
    public static void main(String[] args) {
        for(int i = 1; i < 100; i++) {
            if(i % 3 == 0) continue; // 나머지 2하면 홀수만 나오고 나머지 3 하면 3의 배수를 빼겠다는 뜻
            System.out.println(i);
        }
    }
}
