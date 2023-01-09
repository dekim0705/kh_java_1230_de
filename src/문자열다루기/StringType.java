package 문자열다루기;

import jdk.jshell.tool.JavaShellToolBuilder;

// equals 메소드 : 두개의 문자열이 동일한지 비교하여 결과값을 리턴
// 메소드? 객체나 클라스에 포함되어있는 행위를 해주는 함수
public class StringType {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
       // equals 메소드로 문자열을 비교하는 것
        System.out.println(a.equals(b)); // a의 문자열과 b의 문자열을 비교. (a라는 문자와 ()안에 매개변수로 들어오는 문자를 비교)
        System.out.println(a.equals(c)); // a와 c를 비교
        System.out.println(a.equalsIgnoreCase("HELLO")); // 대소문자 구분 안함
        System.out.println(a==c); // 이렇게 하면 안됨. 참조자이기때문에 문자열의 내용이 아닌 주소를 비교하는 것임
                                  // 이건 문자열의 내용을 비교하는 것이 아니고 문자열의 참조, 즉 주소를 비교하는 것

        String d = "Hello JavJava";
        // indexOf : 문자열에 특정 문자 혹은 문자열이 시작되는 인덱스(0부터시작한다)를 리턴
        System.out.println(d.indexOf("Java"));


        // contains : 문자열에서 특정 문자열의 포함여부를 리턴 (포함되어 있으면 부름)
        System.out.println(d.contains("Hello")); // 대소문자 구분 함

        // charAt : 문자열에서 특정 위치의 문자를 리턴 함
        System.out.println(d.charAt(1));

        // replaceAll : 문자열 중 특정 문자열을 다른 문자열로 대체 할 때 사용 (정규식 regular expression) (아이디 비번 입력시에 사용됨)
        // replace : 단순히 문자열을 바꿔주는 것
        String language = "Java, Python, C, C++, JavaScript, Kotlin, Swift";
        System.out.println(language.replace("Kotlin", "Jet Brain"));
        // replacement부분에 아무것도 안넣고 ""만 넣어두면 문자열 지우기도 가능

        // substring: 문자열에서 특정 문자열을 뽑아낼 때 사용
        String e = "Hello Java";
        System.out.println(e.substring(6)); // 시작 인덱스부터 끝까지 추출함
        System.out.println(e.substring(0,5)); // 시작 인덱스 부터 종료 인덱스 미만까지 추출
                                              // 범위를 정할때는 자동으로 미만 개념

        // toUpperCase / toLowerCase : 문자열을 모두 대문자 또는 소문자로 변경
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());

        // trim : 문자열의 앞 뒤에 있는 공백 제거
        String str = " 자바 프로그래밍      !!!!!    ";
        System.out.println(str.trim());

        // 문자열 포맷팅이란? 문자열에 특정 문자를 삽입하는 방법 (삽입을 위해서는 서식이 필요)
        System.out.printf("자바 프로그램을 %s 합니다\n", "열심히 공부"); // 결과를 찍기 위한 포맷


        String newStr = ""; // 결과를 찍기 위한 포맷이 아닌 새로운 문자열을 만들기 위한 서식
        int number = 10;
        String day = "three";
        newStr = String.format("I ate %d apples. so I was sick for %s days.\n", number, day);
        System.out.println(newStr);

        String newStr2 = "I  ate " + number + " apples. so I was sick for " + day + " days";
        System.out.println(newStr2);

        // toCharArray () : 문자열을 문자 배열 반환
        String name = "곰돌이사육사";
        char[] arrName = name.toCharArray(); // 문자열을 문자 배열을 만든 것
        System.out.println(name);
        System.out.println(arrName);


    }
}

// equalsIgnoreCase : 대소문자 무시
