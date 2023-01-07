package 조건문연습문제1;

import java.util.Scanner;

// 성적을 입력 받음
// 입력 받은 값이 0 ~ 100사이가 아니면 "잘못 입력 하였습니다" 출력
// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 나머지는 F
public class ScoreGrade {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("성적을 입력 하세요 : ");
      int score = sc.nextInt();

      if(score >=0 && score <=100){
          if(score >=90) System.out.println("A"); // 중괄호 내부가 한줄인경우에는 중괄호 생략 가능
          else if(score >=80) System.out.println("B");
          else if(score >=70) System.out.println("C");
          else if(score >=60) System.out.println("D");
          else System.out.println("F");
      } else{
          System.out.println("잘못 입력 하였습니다");
      }
    }
}
// if문 내에 if문을 또 넣는것 : 중첩if문


// 스캐너 객체 생성
// 생성된 객체에서 정수값을 입력 받음
// 조건문에서 값이 0과 100사이인 경우 해당 학점 출력
//

 /* Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if(grade >=90){
            System.out.println("A");
        } else if(grade >=80) {
            System.out.println("B");
        } else if(grade >=70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        */


// if(score < 0 || score > 100) return; // return : 메소드를 끝낸다는 뜻
// if(score >=90) System.out.println("A"); // 중괄호 내부가 한줄인경우에는 중괄호 생략 가능
// else if(score >=80) System.out.println("B");
// else if(score >=70) System.out.println("C");
// else if(score >=60) System.out.println("D");
// else System.out.println("F");