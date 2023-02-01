package _0201_07_클래스정렬연습문제Try;


public class StudentInformation implements Comparable<StudentInformation> {
    String name;
    int score;
    String studentNumber;

    public StudentInformation (String name, int score, String studentNumber) {
        this.name = name;
        this.score = score;
        this.studentNumber = studentNumber;
    }

    public StudentInformation() {
    }

    public void getInfo() {
        System.out.println("======== 학생 성적 출력 ========");
        System.out.println("------------------------------");
        System.out.println("석차  성적    이름      학번     ");
        System.out.println("------------------------------");
        System.out.println();
    }
    @Override
    public int compareTo(StudentInformation o) {
        if(this.score == o.score){
           return this.studentNumber.compareTo(o.studentNumber);
        }return o.score - this.score;
    }
}
