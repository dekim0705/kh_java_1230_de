package 주사위게임;
// 주사위 2개 던져서 합이 12이면 탈출하는 게임
public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;
        while (true) {  // 몇번만에 탈출할지 모르기때문에 while true넣고 시작
            cnt++;
            rand1 = (int) ((Math.random() * 6) + 1); // 랜덤 함수는 실수형으로 값이 생성되므로 형변환 필요.  0부터 1미만의 실수로 만들어짐. 소수점 이하는 필요 X. 0,1,2,3,4,5 가 만들어지기때문에 +1
            rand2 = (int) ((Math.random() * 6) + 1);
            if((rand1 + rand2) == 12) {
                System.out.printf("무인도를 %d 번만에 탈출 합니다.\n",cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }
        }
    }
}

// 회원전체 번호를 index를 주고 랜덤 돌려서 해당하는 번호가 나오면 경품줄수있음