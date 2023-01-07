package 타입변환;
// 타입 변환이란? 하나의 타입을 다른 타입으로 변경 하는 것
// 묵시적 형변환(Auto, 자동) : 컴파일러가 유리한 방향으로 형을 변경해주는 것
// 명시적 형변환 : 개발자가 의도한대로 형변환을 하는 것
// 메소드를 이용한 형변환 : Integer.parseInt(); 문자열을 정수 타입으로 변경
//                      Double.parseSouble() : 문자열을 실수 타입으로 변경
public class TypeEx1 {
    public static void main(String[] args) {

        /*
        int num1 = 1, num2 = 4;
        double rst1 = num1 / num2;
        System.out.println(rst1);
        // 문제가 발생하는 코드. 정수형은 소수점이하가 없음. 결과값을 더블로 받았지만 정수값만 가져올수있어서 소수점을 날려버림
         */

        int num1 = 1, num2 = 4;
        double rst1 = num1 / num2;
        double rst2 = (double)num1 / num2;
        // (double)넣어준게 명시적 형변환을 해서 num1과 num2의 형이 달라짐. 컴파일러가 더 유일한 형으로 바꿔줌 (실수 정수 중에 실수로 바꿈 -> 더 큰 데이터)
        // (double)num1은 명시적 형변환. num2는 묵시적 형변환 (num1으로 인해 일어나는)
        System.out.println(rst1);
        System.out.println(rst2);

        double rst3 = 100 + 100.1; //묵시적 형변환
        System.out.println(rst3);


        String phoneNumber = "0101241234"; // 숫자처럼 구성되었지만 연산이 불가한 문자열
        String name = "안녕하세요";          //  문자로 구성된 문자열

        int number = Integer.parseInt(phoneNumber); // parse는 변경한다는 의미
        System.out.println(number); // 제일 앞에 온 의미 없는 0 날려버림. 숫자가 되었기 때문에. 숫자로 구성된 문자열이 숫자로 변환 됨



     }
}


// 진수 표현 : 16진수 10진수, 8진수 2진수