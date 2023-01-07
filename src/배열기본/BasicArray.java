package 배열기본;

public class BasicArray {
    public static void main(String[] args) {
        int [] score = new int[3]; // 타입[] 참조변수 = new 타입[크기]; <-배열을 선언하는 첫번째 방법
        // score는 위치로봤을땐 지역변수라서 stack에 주소가 만들어짐. 그 주소는 heap에있는 메모리를 가리킴
        // new 로 할당이 되면 전부 heap에 만들어짐
        score[0] = 90; // 배열공간을 3으로 잡으면 인덱스는 0,1,2,로 나옴 0부터 시작하니까 . 배열공간 3은 갯수가 아니라 3개의 크기임
        score[1] = 88; //
        score[2] = 70; //
        int sum = 0;
        double average = 0;
        //int sum = score[0] + score[1] + score[2]; <- 얘랑 밑에 for문이랑 똑같앙
        for(int i = 0; i < score.length; i++) {//length가 배열의 크기(몇개인지)를 알려줌
            sum += score[i]; // sum = sum +score[i];
            for(int j = 0; j < score.length; j++)
                average = (double) sum / score.length;

        }
            System.out.println("총점 : " + sum);
            System.out.println("평균 : " + average);

            System.out.printf("평균 : %.2f\n", sum / (double)score.length);
    }
}




// sum = sum +score[i];
// 0+90 = 90
// 90+88= 178
// 178+70 = 248