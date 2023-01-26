package _0126_04_Math클래스;
// Math 클래스의 모든 메서드는 클래스 메서드 이므로 객체를 생성하지 않고 바로 사용 가능 (static)
// random() : 0.0 ~ 1.0 미만의 임의의 double 형 값을 생성해서 반환
public class MathRandom {
    public static void main(String[] args) {
// 7자리의 로또 번호 생성하기
// 7개의 배열을 만들고 첫번째 부터 여섯번째는 0 ~ 50 사이의 임의의 수 생성
// 마지막 일곱번째 자리는 50 ~ 100 사이의 임의의 수를 만들어서 대입하고, 한번에 출력, 단 중복은 허용

        int[] lotto = new int[7];
        for(int i = 0; i < 6; i++) { // ****인덱스번호 기억하기!
            lotto[i] = (int)(Math.random() * 51);
        }
        lotto[6] = (int)(Math.random() * 51) + 50; // 시작값을 바꾸기 위해서 +50
        for(int e : lotto) System.out.print(e + " ");

    }
}

/*
        // random() :  0 ~ 99 사이의 임의의 수 생성 하기
        for (int i = 0; i < 100; i++) {
            System.out.println((int) (Math.random() * 100));
        }
        // random() : 3 ~ 8 사이의 임의의 수 생성 하기
        System.out.println((int)(Math.random() * 6) + 3);
 */


/*
 int[] lotto = new int[7];
        for (int i = 0; i < 7; i++) {
            lotto[i] = ((int) (Math.random() * 51));
        }

        // since it's only one the value can just be assigned
        // NO NEED make it complex
        while (true) {
            for (int i = 7; i == 7; i++) {
                lotto[i] = ((int) (Math.random() * 101) + 1);
                if (lotto[i] < 50 || lotto[i] > 100) {
                    lotto[7] = lotto[i];
                } else return;
            }
        }
 */