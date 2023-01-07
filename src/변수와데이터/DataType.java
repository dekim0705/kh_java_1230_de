package 변수와데이터;

public class DataType  {//복합명사일때는 두번째도 대문자(camel 표기법)

    public static void main(String[] args) {
        int num1, num2; // 같은 타입으로 여러개의 변수를 선언. 콤마(,)로 구분. 값은 주어지지 않았지만 바이트 확보 상태
        double num3 = 3.14; // 실수 타입의 변수를 선언과 동시에 초기화
        int hour = 3;
        int minute = 5;

        System.out.println(hour + "시 " + minute + "분");
        NameCard nameCard = new NameCard();
        nameCard.name = "안녕하세요";
        nameCard.age = 123;
        nameCard.address = "서울시";
        nameCard.eMail = "dekim0705@gmail.com";
        nameCard.phoneNumber = "010-1234-1234";
        System.out.println(nameCard.name);
    }
}
// 사용자 정의 자료
class NameCard{
    String name;
    int age;
    String address;
    String eMail;
    String phoneNumber;
}


       /*
        int num1 = 32767; // byte형은 1bye크기이며 -128 ~ 127
        int num2 = -32768;
        num1++; // 증가연산자. 현재값을 1 증가시켜줌
        num2--; //

        System.out.println(num1);
        System.out.println(num2);


        double num1 = 0.1;
        for (int i = 0; i < 1000; i++)
            num1 += 0.1;
        System.out.println(num1); // 실수를 사용하면 절대값이 안나옴. 근사치로 나옴., 실수연산은 컴퓨터에게 매우 부담이 됨
                                  // 실수를 기준값으로 사용하면 X. 꼭 필요하지 않으면 실수형은 사용 X

       int age = 100; // 정수값을 저장할 수 있는 age라는 변수를 선언하고 초기값으로 100을 대입 (4byte공간 확보해주께~ 약쏚)
                       // 변수 이름은 정확한 의미를 가지게끔 지어야 함 ex)taxRate
        double value = 0.0; // 실수값을 저장할 수 있는 value라는 변수를 선언하고 초기값으로 0.0을 대입

        System.out.println(age);


           */