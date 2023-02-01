package _0201_06_클래스정렬연습문제;
public class StudentInfo {
    String name;
    int grade;
    String sNum; // 학번은 변경되지 않을 고유값이기 때문에 String or int 둘중에 아무거나 해도 상관 X

    public StudentInfo(String name, int grade, String sNum) {
        this.name = name;
        this.grade = grade;
        this.sNum = sNum;
    }












    public void getInfo() {
        System.out.println("======= 학생 성적 출력 =======");
        System.out.println("----------------------------");
        System.out.println("석차   성적    이름      학번  ");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("");
    }

}
