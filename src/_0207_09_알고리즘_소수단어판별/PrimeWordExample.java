package _0207_09_알고리즘_소수단어판별;
import java.util.Scanner;
// a를 1로, b를 2로, …, z를 26으로, A를 27로, …, Z를 52로 하여 그 합을 구한다.
public class PrimeWordExample {
    public static void main(String[] args) {
        int sum = 0; // 각 영어 문자를 더해서 총 합계를 만드는 변수
        boolean isPrime = true; // 소수인 상태를 기본값으로 설정 (참과거짓을 구분하는 플래그)
        Scanner sc = new Scanner(System.in);
        System.out.print("영어 단어 입력 : ");
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }
        System.out.println("합 : " + sum);
        // 소수인지 아닌지 판별하기, 1은 소수로 정하기로 했기 때문에 조거에서 제외
        for(int i = 2; i < sum; i++) { // (1과 2는 제외하고 3부터 돌린거)
            if(sum % i == 0) isPrime = false; // 나눠떨어지면 소수가 아님
        }
        if(isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");

    }
}
