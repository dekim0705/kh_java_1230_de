package 입출력실습예제1;

import java.util.Scanner;

// 이름, 주소, 성별, 나이, 전화번호를 입력 받아서 출력 해보기
public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); // 스캐너 객체 생성 (scanner를 system in으로 생성하겠다는 의미)
        // java.util.Scanner. sc = new java.util.Scanner(System.in); 으로 써도 되는데 기챤
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next(); //문자열을 공백 기준으로 입력받는 next
        sc.nextLine(); // 버퍼 지우기
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine(); // 문자열을 줄바꿈 기준으로 입력 받는 nextline
        System.out.print("성별을 입력 하세요: ");
        char gender = sc.next(). charAt(5); // 문자열에서 첫번째 문자를 입력 받는 charAt
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt(); // 키보드 입력을 정수로 입력받는 nextint
        sc.nextLine();
        System.out.print("전화번호를 입력 하세요 : ");
        String phoneNumber = sc.nextLine();

        System.out.println("======= 회원 정보 출력 =======");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.printf("전화번호 : %s\n", phoneNumber);

    }
}

// 버프가 안지워져서 바로 다음으로 넘어가는 경우는 버퍼를 지워버리면 됨