package _0210_05_입출력실습;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
/*
1. 적절한 위치에 이름과 성적 파일 생성
-- TreeSet<클래스> ts = new TreeSet<>();
2. FileInputStream 으로 생성된 파일을 읽기 위한 스트림 생성
3. 파일을 스캐너에서 읽어 들이기 위해 스캐너 생성하고 스캐너의 입력으로 스트림 연결
4. 스캐너의 hasNextLine()메소드를 이용해 읽을 라인이 있는 동안 반복 수행
5. 스캐너의 nextLin()으로 라인별로 문자열을 읽어 들임 예) 안유진 98 87 45
6. 입력 받은 문자열을 split(" ")을 이용해 공백 기준으로 자르고 이를 문자열 배열에 대입 (요소가 4개인 배열이 생성)
7. 첫번째 요소는 문자열이기 때문에 변환이 필요없고 나머지는 연산을 위해 Integer.parseInt()로 변환 필요
8. ts.add(new 클래스(생성자)); 생성자에 이름과 변환된 정수값을 대입
9. 향상된 for 문을 순회하면서 결과 출력

1. 이름과 3개의 성적을 객체 단위로 관리 하기 위해 클래스 생성하고 정렬을 위해 Comparable 을 상속 받거나 Comparator 를~
2. Comparable 을 상 받아 정렬 기준에 대한 메소드를 오버라이딩 해 정렬에 대한 조건을 구현 하거나 Comparator 를 ~
3. 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같으면 이름순으로..)에 대한 정렬 조건 구현
 */
public class inOutStreamTest1 {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<StudentInfo> ts = new TreeSet<>();
        FileInputStream is = new FileInputStream("students.txt");
        Scanner sc = new Scanner(is);
        while(sc.hasNextLine()) { // 읽어들일 라인이 있으면 true
            String line = sc.nextLine();
            String[] strArr = line.split(" ");
            // (7번 부터는 StudentInfo 클래스의 정보가 필요 => 클래스 생성자까지 만들고 돌아오기)
            ts.add(new StudentInfo(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3]))); // (넣으면서 바로 변환..!)
        }
            // (1로 가서 정렬조건 만들어야 함! -> getName 만들기 -> 그리고 for 문 돌리기!)
        for(StudentInfo e : ts) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}


// (줄바꿈 -> lf(라인피드) => 아스키10번?)