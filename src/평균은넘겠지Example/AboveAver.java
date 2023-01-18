package 평균은넘겠지Example;
//  5 ==> 총 테스트 케이스
// 5 50 50 70 80 100 ==> 40.000% (학생수 성적 성적 성적 성적 성적) ==> 평균이 넘는 비율을 100분율로 표기

import java.util.Scanner;

public class AboveAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt(); // overRate를 구하는게 몇개가 필요하냐는 뜻.  ex) 총 테스트 케이스 => 5
        double[] rst = new double[testCnt]; // 결과를 더블형의 배열로 받을 예정 (?? 40.000%부분인가?)
        for(int i = 0; i < rst.length; i++) {
            rst[i] = overRate();
        }
        for(double e : rst) {
            System.out.printf("%.3f%%\n", e);
        }
    }
    // goal : 각 테스트 케이스에 대한 결과를 구해서 실수형태의 백분율로 반환
    // step 1 : 학생수를 입력 받고 입력 받은 학생수 만큼의 성적을 입력 받음
    // step 2 : 평균을 구하기 위해서 먼저 총점을 구하고 이를 나누어 평균을 구함
    // step 3 : 구해서 평균을 가지고 각각의 입력 받은 성적을 비교해 평균을 넘는 학생수를 구함
    // step 4 : 구해진 학생수를 100분율로 변환해서 반환
    static double overRate() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 학생의 수 입력
        int total = 0; // 총점을 구하기 위한 변수
        int overCnt = 0; // 평균을 넘는 학생의 수를 구하는 변수
        int[] score = new int[cnt]; // 학생의 수만큼 성적을 입력 받기 위한 배열 생성
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt(); // 학생의 수만큼 성적을 입력 받아 배열에 대입
            // total = total + score[i]; // total의 값을 누적하여 더해야 함. // total변수를 초기화를 안했으면 이 스텝에서 에러가 남. 초기화값이 없어서.
            // total을 초기화(=0)로 해야 함. 지역변수는 초기화가 안되면 쓰레기값이 들어갈 수 있음
            total += score[i]; // 일반적으로 복합대입연산자로 계산.// 학생의 수만큼 입력된 성적을 누적해서 총점을 구함
        } // the end of for

        // 평균은 소수점이 나올테니 더블로 받아야 함.
        double aver = (double)total / cnt; // 총점을 학생의 수로 나누어 평균을 구함
        for(int e : score) { // e는 배열에 포함되어 있는 각각의 학생 성적. // e는 index가 아닌 element(요소의 값)
            if(e > aver) overCnt++; // (e가 aver보다 크면) 평균을 넘는 학생의 수 구하기
        }
        // 리턴을 100분율로+소수점세자리로 해줘야 함.
        return (double)overCnt / cnt * 100;  // 100곱했기 때문에 40.0000000000000000~% 백분율로 반환
    }
}

// 총 입력할 테스트 케이스를 먼저 넣으면 main의 testCnt와 double배열까지 가고, overRate로 넘어가서 다시 학생 수 입력 후 성적 입력~