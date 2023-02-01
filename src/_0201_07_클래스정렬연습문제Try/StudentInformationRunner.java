package _0201_07_클래스정렬연습문제Try;
import java.util.Scanner;
import java.util.TreeSet;
// 혼자 해본거 Comparable 활용
public class StudentInformationRunner {
    public static void main(String[] args) {
        TreeSet<StudentInformation> ts = new TreeSet<>();
        // StudentInformation stuInfo2 = new StudentInformation();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(true) {
            ts.add(new StudentInformation(sc.next(), sc.nextInt(), sc.next()));
            if(ts.size() == n) break;
        }
        // stuInfo2.getInfo();
        System.out.println("======== 학생 성적 출력 ========");
        System.out.println("------------------------------");
        System.out.println("석차  성적    이름      학번     ");
        System.out.println("------------------------------");
        for(StudentInformation e : ts) {
            System.out.println(" " + (++cnt) + "    "  + e.score + "    " + e.name + "     " + e.studentNumber);
        }

    }
}
