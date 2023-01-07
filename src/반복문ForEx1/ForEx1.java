package 반복문ForEx1;
// for 반복문 : for(초기식;조건식;증감식) { 반복 수행 구간}
//                 명령문이 3개 라는 뜻
public class ForEx1 {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            // 변수 먼저 잡고; 조건식
            System.out.printf("%4d", i); // decimal; 4칸을 비우고 오른쪽으로 줄을 맞추겠다는의미
            if (i % 10 == 0) System.out.println(); // 10으로 나눠서 나머지가 이면 줄바꿈
        }
    }
}







        //더러운 코딩 쓰면 안됨
//int i = 1;
//for(;;) {
//    System.out.printf("%4d",i);
//    if(i % 10 == 0) System.out.println();
//    if(i == 100) break;
//    i++;
//}





//        for(int i = 1; i <= 100; i++) {
//            // 변수 먼저 잡고; 조건식
//            System.out.printf("%4d", i); // decimal; 4칸을 비우고 오른쪽으로 줄을 맞추겠다는의미
//            if (i % 10 == 0) System.out.println(); // 한 줄에 열개씩 찍으라는 뜻??언니이거모야 도와져
//        }







        //        int i = 1;
        //        for(;i <= 100;) {
//            System.out.printf("%4d", i);
//            if (i % 10 == 0) System.out.println();
//            1++;
//        }








//        int i = 1;
//        while(true) {
//            System.out.printf("%4d", i);
//            if(i %10 == 0) {
//                System.out.println();
//            }
//            if(i == 100) break;
//            i++;
//            }





//        int i = 1;
//        while(i <= 100) {
//            System.out.printf("%4d",i);
//            if(i % 10 == 0) System.out.println();
//            i++;
//        }
