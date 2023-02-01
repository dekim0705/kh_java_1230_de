package _0201_06_클래스정렬연습문제;
import java.util.Comparator;
// 학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번순으로 정렬
public class GradeSort implements Comparator<StudentInfo> {

    @Override
    public int compare(StudentInfo o1, StudentInfo o2) {
        if(o1.grade == o2.grade) {
            return o1.sNum.compareTo(o2.sNum); // 성적이 같은 경우 학번순 정렬
        } //(else 굳이 안해줘도 됨)
        return o2.grade - o1.grade; // 성적 내림차순
    }

}
