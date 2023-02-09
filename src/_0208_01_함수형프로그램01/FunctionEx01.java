package _0208_01_함수형프로그램01;
// 함수형 프로그램이란? : 자바 8에서 도입, 수학공식과 유사, 불변성의 우너칙, 조건문, 반복문 사용 금지 등의 특징을 가짐
// 람다(Lambda) : 화살표 표현식으로 사용 됩니다. 생략 가능한 모든 것을 생략하는 것을 기본원칙으로 합니다.
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재 할수 없으므로 함수형 인터페이스가 필요 합니다.

@FunctionalInterface // (함수형 프로그램을 위해 만들었다는 어노테이션. 함수형인터페이스에는 메서드가 하나밖에 못옴. sum 을 위해 인터페이스가 필요했음)
interface Calculator { // (sum 이라는 항수 만들고 상속 해줘야함! 구현을 해야하니까)
    int sum(int a, int b);
//    int sub(int a, int b); // (에러. @FuncInt~가 안된다고 잡아줌. 없으면 안잡아주니까 걸어주는게 더 안전 )
}
// 기존 방법 **
class MyCalculator implements Calculator {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
@FunctionalInterface // (두번째 예제)
interface MyFuncInterface {
    void method(int x); // 매개변수가 있는 타입
}

@FunctionalInterface
interface MyFuncInterface1 { // (세번째 예제)
    int min(int x, int y); // 반환타입이 있는 형태
}



public class FunctionEx01 {
    public static void main(String[] args) {
        // 기존 방법 **
        System.out.println("-----------기존방법--------------");
        MyCalculator mc = new MyCalculator();
        int rst = mc.sum(3,4);
        System.out.println(rst);
        System.out.println();


        // 람다식
        System.out.println("------------람다식---------------");
        Calculator mcLambda = (int a, int b) -> a + b; // (1. 선언)
        // 인터페이스 Calculator 를 상속 받아서 클래스 만들지 말고 람다 만들기
        int rstLambda = mcLambda.sum(3,4); // (2. 실제 호출부. 불러줘야 의미를 가짐. 타입 추론 가능)
        System.out.println(rstLambda);
        System.out.println();


        System.out.println("------예제2 매개변수가 있는 타입-------");
        MyFuncInterface fi = x -> { // (선언부. 호출 해줘야 함)
          int result = x * 5;
          System.out.println(result);
        };
        fi.method(2); // (호출!)
        System.out.println();

        System.out.println("------예제3 반환타입이 있는 형태-------");
        MyFuncInterface1 fi1 = (x,y) -> x < y ? x : y; // 구현부 (참인경우 x, 거짓인 경우 y가 반환됨)
        System.out.println(fi1.min(3,4)); // (반환값이 있기 때문에 바로 찍어줘도 됨)
        System.out.println();



    }
}


// 왜 자바 8 or 11 ? -> lts : long term support

/*


---------MAIN------------
// 기존 방법 **
        MyCalculator mc = new MyCalculator();
        int rst = mc.sum(3,4);
        System.out.println(rst);

        // 람다식
        Calculator mcLambda = (int a, int b) -> a + b; // (1. 선언)
            // 인터페이스 Calculator 를 상속 받아서 클래스 만들지 말고 람다 만들기
        int rstLambda = mcLambda.sum(3,4); // (2. 실제 호출부. 불러줘야 의미를 가짐. 타입 추론 가능)
        System.out.println(rstLambda);
 */
