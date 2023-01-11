package 소수판별하기;

import java.util.Scanner;

// 소수란? 1과 자기자신 이외에는 나누어 지지 않는 수
// 소수 판별하기 :
// 원래는 입력한거 미만의 소수를 다 더해서 나오는 값을 구하는거였눈뎅 넘 어려워가지궁 걍 소수 판별하기

public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        boolean rst = isPrime(number);
        System.out.println("소수 여부 : " + rst);
    }

    // static 키워드로 선언되면 객체 생성시 생성이 안되고 클래스 생성 시 단 한번 만들어 짐
    // 해당 메소드 수행 후 반환 값이 true/false임
    // 정수 값을 입력 받아 해당 정수가 소수인지 아닌지 판별 후 결과를 반환함
    static boolean isPrime(int n)   {
        // 1과 입력받은 값을 제외, 즉 2 ~ 입력 받은 값 미만
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false; // 전달 받은 수를 1과 자기 자신을 제외하고 나누어 지는 경우를 의미 ; 여러번 돌려서 한번이라도 나눠지면 false

        }
        return true;
    }


}


/* 나의 흔적,,,,
    static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if (n - i == 0) ;
        }
        return true;
    }
 */







/*
//        PrimeEx1 primeEx1 = new PrimeEx1();
//        primeEx1. isPrime(100); // 원래 객체 만드는 법 두줄. 원래 객체를 만들어야 하는데 객체를 안만들고, 값도 필요없고 메소드만 필요할 경우에는 앞에 static을 붙여서 메모리에 넣어버림
        isPrime(100); // 소속이 객체가 아닌 클래스에 붙어있기 때문에 여러번 사용 X 한번만 사용 가능


    }

    static boolean isPrime(int n) {
        return true;
    }

 */