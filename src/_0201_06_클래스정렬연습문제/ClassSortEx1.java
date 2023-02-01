package _0201_06_클래스정렬연습문제;
import _0201_07_클래스정렬연습문제Try.StudentInformation;

import java.util.*;

// 학생의 수를 입력 받기
// 학생의 수 만큼의 객체를 생성하여 정보를 입력 (이름 성적 학번)
// 학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번순으로 정렬
// 그리고 출력시 등수가 표기 되도록 할 것
// [입력 예시]
// 학생 수 입력 : sc.nextInt()
// 멍멍이 99 202301
// 야옹이 98 202302
// 짹짹이 97 202303
// [출력 예시]
// ======= 학생 성적 출력 =======
// ----------------------------
// 석차   성적   이름      학번
// ----------------------------
//  1     99   멍멍이    202301


// 강사님 예제 Comparator 활용
// 현업에선 추가 클래스를 만들지 않기 위해 Comparable 이 더 많이 사용 됨
public class ClassSortEx1 {
    public static void main(String[] args) {
        TreeSet<StudentInfo> ts = new TreeSet<>(new GradeSort()); // (TreeSet 으로 만들어 질 객체들의 정렬 조건을 넣어줌)
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int num = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < num; i++) { // 입력 받은 학생 수 만큼 순회(하면서 입력받기)
            ts.add(new StudentInfo(sc.next(), sc.nextInt(), sc.nextLine()));
        }
        System.out.println("===== 학생 성적 출력 ====");
        System.out.println("-----------------------");
        System.out.println("석차   성적    이름    학번");
        System.out.println("-----------------------");
        for (StudentInfo e : ts) {
            System.out.printf("%2d%6d%5s%5s\n", ++cnt, e.grade, e.name, e.sNum);
            //System.out.println(" " + (++cnt) + "    " + e.grade + "    " + e.name + "    " + e.sNum);
        }
        System.out.println("------------------------");
        System.out.println();

    }
}


/*      이런걸..왜... StudentInfo 자체가 객체이기때문에 ts.add(new Student~)로 넣어주면 됨
        객체묶음 개념을 list 나 List 만으로 넣지 말길 TreeSet 도 binary search tree 로 연결이 됨! List 만들 필요 X!!
       List<StudentInfo> sInfoList = new ArrayList<>();
        while(true) {
            sInfoList.add(new StudentInfo(sc.next(), sc.nextInt(), sc.nextLine()));
            if(sInfoList.size() == num) break;
        }
 */
