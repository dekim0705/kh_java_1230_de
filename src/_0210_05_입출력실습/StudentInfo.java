package _0210_05_입출력실습;

public class StudentInfo implements Comparable<StudentInfo>{// (<StudentInfo>는 해당 타입만 받겠다는 뜻)
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public StudentInfo(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    int getTotal() {
        return kor + eng + mat;
    }
    String getName() {
        return name;
    }
    @Override
    // 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같으면 이름순으로..)
    // (getTotal 만들고 해야 함! => 총점 필요)
    public int compareTo(StudentInfo o) {
        if(this.getTotal() == o.getTotal()) return this.name.compareTo(o.name); // (사전순 정렬)
        return o.getTotal() - this.getTotal(); // 내림차순 정렬
    }
}
