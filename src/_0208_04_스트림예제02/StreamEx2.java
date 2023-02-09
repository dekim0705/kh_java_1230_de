package _0208_04_스트림예제02;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("멍멍이", 89));
        list.add(new Student("야옹이", 99));
        list.add(new Student("꿀꿀이", 78));

        System.out.println("내부요소 : ");
        list.stream().forEach(s-> { // (forEach() 내부 요소 찍기)
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " - " + score);
        });
        System.out.println();
        System.out.println("병렬처리 : ");
        list.parallelStream().forEach(s-> { // (병렬처리)
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " - " + score + " " + Thread.currentThread().getName());
            // (운영체제에서 자신과 똑같은걸 복제하는걸 fork 한다 라고 함 (clone). 앞에 fork 가 붙어있으면 메인에서 복제되었다는 뜻 ?)
        });
        System.out.println();
        System.out.println("평균 구하기 : ");
        double avg = list.stream().mapToInt(s->s.getScore()) // (getScore() 은 중개연산)
                .average() // (최종연산)
                .getAsDouble(); // (더블로받는거)
        System.out.println("평균 점수 : " + avg);

        System.out.println();
        System.out.println("평균 구하기 (메소드참조) : "); // (Student class 소속의 getScore method 를 넣음)
        double avgMethod = list.stream().mapToInt(Student::getScore) // (getScore() 은 중개연산)
                .average() // (최종연산)
                .getAsDouble(); // (더블로받는거)
        System.out.println("평균 점수(메소드참조) : " + avgMethod);

    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}