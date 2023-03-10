package _0127_05_스트링토큰;
import java.util.Scanner;
import java.util.StringTokenizer;
// StringTokenizer : 문자열이 특정 구분자로 연결되어 있는 경우, 구분자 기준으로 문자열을 관리 할 수 있음
// countTokens() : 남아 있는 토큰 수
// hasMoreTokens() : 남아 있는 토큰이 있는지 여부 확인 (있으면 true)
// nextToken() : 토큰을 하나씩 꺼내 옴
// String split() : 구분자 기준으로 문자열 자름
public class TokenTestEx {
    public static void main(String[] args) {
        // String split
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 :  ");
        String name = sc.nextLine(); // 문자열을 개행문자를 만날 때 까지 입력 받음
        String[] nameStr = name.split("/");
        for(String e : nameStr) System.out.print(e + " ");
    }
}




/* 배열 만들기 전 (배열 없이 출력)
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 :  ");
        String name = sc.nextLine(); // 문자열을 개행문자를 만날 때 까지 입력 받음
        StringTokenizer st = new StringTokenizer(name, "/"); // 배열과 구분자를 객체 생성시 넣어 줌
        while (st.hasMoreTokens()) { // (st.hasMoreTokens() => 남아있는 토큰이 있냐는 뜻)
            System.out.print(st.nextToken() + " ");
        }
 */


/*  배열에 담아서 출력
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 :  ");
        String name = sc.nextLine(); // 문자열을 개행문자를 만날 때 까지 입력 받음
        StringTokenizer st = new StringTokenizer(name, "/"); // 배열과 구분자를 객체 생성시 넣어 줌
        String[] nameStr = new String[st.countTokens()]; // 토큰의 개수 만큼의 문자열 배열 생성
        while (st.hasMoreTokens()) { // 남아 있는 토큰이 있는 동안 반복문 수행
            nameStr[idx++] = st.nextToken(); // 토큰을 꺼내서 배열에 담음
        }
        for(String e : nameStr) System.out.print(e + " ");
 */