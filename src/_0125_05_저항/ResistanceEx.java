package _0125_05_저항;
import java.util.Scanner;
// 전자 제품에는 저항이 들어 간다. 처음 색 2개는 저항의 값, 마지막은 곱해야 하는 값
// 색 : black, brown, red, orange, yellow, green, blue, violet, grey, white
// 값 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
// 곱 : 1, 10, 100, 1,000, 10,000, 100,000, 1,000,000, 10,000,000, 100,000,000, 1,000,000,000
// 입력 : yellow violet red
// 결과 : 4,700
// 입력 : orange red blue
// 결과 : 32,000,000
// 입력 : white white white
// 결과 : 99,000,000,000
public class ResistanceEx {
    public static void main(String[] args) {
        // 컬러값에 대한 문자열 배열 생성 : 문자열을 비교해서 인덱스를 찾기 위해
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int firstIdx = 0, secondIdx = 0, thirdIdx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("3가지 색상 입력 : ");
        String firstColor = sc.next();
        String secondColor = sc.next();
        String thirdColor = sc.next();
        for(int i = 0; i < color.length; i++) {
            if(firstColor.equals(color[i])) firstIdx = i; // 첫번째 입력 받은 컬러 문자열과 배열의 컬러 이름이 같으면 인덱스를 대입
            if(secondColor.equals(color[i])) secondIdx = i;
            if(thirdColor.equals(color[i])) thirdIdx = i;
            // ------여기까지 입력받은 문자열을 인덱스값으로 변환 완료------
        }
        // Math.pow(2, 4) => 2 * 2 * 2 * 2, 제곱함수를 사용해서 풀기
        // 정수값 범위를 벗어날 수 있으므로 long 으로 형변환
        System.out.println((long)((firstIdx * 10) + secondIdx) * (long)(Math.pow(10,thirdIdx))); // 10의 자리 숫자를 만들어줘야하니까 *10. secondIdx 는 1의자리 숫자니까 그냥 더해주기


  //      int[] multiply = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};




    }
}

