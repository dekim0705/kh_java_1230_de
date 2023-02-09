package _0209_04_입출력스트림예제01;
import java.io.*;
// 입출력 스트림 : 컴퓨터 내부와 외부장치 간에 데이터를 주고 받는 것을 의미하며,
//               입출력 데이터를 공통적인 방법으로 처리하기 위한 스트림을 제공 합니다. (공통적인 방법 -> 추상화 개념))
// 바이트 스트림 : 바이트 단위로 데이터를 전송 하는 것, 성능이 우수하고, 파일로 저장 시 결과 확인 불가(바이트단위이기때문에...)
//               바이트 스트림의 최상위 추상 클래스는 OutputStream.
public class InOutStreamEx1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test.bin");
        byte[] array = {10,20,30,40,50};
        os.write(array); // 문자 배열을 write 하기
        // (os.write(array); 는 array 라는 참조타입이 넘어가는거고, array[0]로 찍어서 쓰면 해당 값이 들어감)

        os.write(array,1,3); // 배열 1부터 4개를 출력

        os.flush(); // write() 이후에는 반드시 버퍼를 비우는 동작이 필요 (write 할 때 쓰여진 값이 남아있는 경우가 있어서 버퍼를 비우는 것)
        os.close(); // 자원 반납 및 스트림 닫기
    }
}


        /*
        //  D:\Dev\work_java\Java_Big_Data_1230 에 test.bin 파일이 생겼음!
        OutputStream os = new FileOutputStream("test.bin");
        byte a = 10;
        byte b = 20;
        byte c = 30;
        os.write(a); // (개별 요소로 write)
        os.write(b);
        os.write(c);

        os.flush(); // write() 이후에는 반드시 버퍼를 비우는 동작이 필요
        os.close(); // 자원 반납 및 스트림 닫기
         */

