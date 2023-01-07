package 입출력예제;
import java.util.Scanner;
public class SystemInOut {
    public static void main(String[] args) {
        String name = "안녕하세요";
        String addr = "kh 강남"; // String은 문자열
        char gender = '여'; // "문자열로간주" '문자로간주' 문자자체인 캐릭터와 문자열은 처리방법이 다름 char는 내부적으로는 정수값이 움직임
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;

        // 자바 스타일 (메소드를 오버로딩 하는 방식)
        System.out.println("======== Java Style Output ========");
        System.out.print("Name : " + name + "\n\n"); //줄바꿈 가능
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + kor + eng + mat); //앞에 문자열로 시작하니까 문자열로 생각해서 그냥 붙여버린거.
        System.out.println("총점수 : " + (kor + eng + mat));
        System.out.println("평균 : " + ((double)(kor + eng + mat)/3)); // 다 더한 값을 더블로 형변환. 뒤집혀도 상관 X

        // C언어 스타일 (서식지정자를 사용)
        // 서식지정자 : %d(정수decimal), %ld, %u(부호없는정수), %f(float실수), %.2f(float소수점), %2d, %s, %c(char), %%(%)
        // 이스케이프시퀀스 : \n(newline), \r(carriage return), \t(tab), \b(backspace), \\
        // 서식은 printf에서만쓰임. 변수와 서식 수는 같아야 함
        System.out.printf("========C Style Output=======\n");
        System.out.printf("이름 : %s, 주소 : %s\n", name, addr);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점수 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + mat)/3);


        System.out.print("Apple\nBanana\nKiwi\n");
        System.out.print("Apple\tBanana\tKiwi\n");
        System.out.print("Apple\rBanana\tKiwi\n"); // /r은 애플을 써놓고 다시 커서를 앞으로 옮기는 개념이라서 Apple이 사라짐
        System.out.print("Apple\rBanana\tKiwi\b\b\n");
        System.out.println("\"Enter\"키를 입력 하시면 종료 됩니다."); // 쌍따옴표 넣어야할 때 / /로 감싸주기
        System.out.println("Hello \\Java");
        System.out.printf("오늘의 습도는 %d%%\n", 25);



        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n * n; i++) {
            System.out.printf("%4d", i);
            if (i % n == 0) System.out.println();
        }
    }
}
