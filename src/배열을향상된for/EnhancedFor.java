package 배열을향상된for;
// 향상된 for 문은 배열의 요소를 처음부터 끝까지 자동 순회.
// 시작과 끝 지정 필요 X; index개념이 없음
// 임의조작 불가. ex)학번추가
//  배열의 내부의 값을 변경 할 수 없음
public class EnhancedFor {
    public static void main(String[] args) {
        int[] score = {50, 50, 50};
        int sum = 0;
        for(int e : score) {
            e +=10;
            sum += e;
        }


        /* 얘는 향상된for문이아닌듯?? 얘는 밑애에도 바꿔버림
        for(int i = 0; i < score.length; i++) {
            score[i] += 10;
            sum += score[i];
        }
         */

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", (double)sum / score.length);


        sum = 0; // sum 값을 다시 초기화해야함 여기서
        for(int i = 0; i < score.length; i++) {
                 sum += score[i];
        } // socre[i] +=10이 없어도 그대로 총점 180, 평균60 유지됨

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", (double)sum / score.length);

    }
}


// 학번을 젤 앞에 넣고 그거 빼고 더해서 평균넣는거 할 수 없음