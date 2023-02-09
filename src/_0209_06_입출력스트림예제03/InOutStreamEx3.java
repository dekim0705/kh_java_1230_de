package _0209_06_입출력스트림예제03;
// 바이트 출력 스트림의 최상위 추상 클래스는 OutputStream 입니다.
// 문자 출력 스트림의 최상위 추상 클래스는 Write 입니다.

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class InOutStreamEx3 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt"); // (FileWriter 는 문자를 파일에 쓰는거)
         // 캐릭터 배열로 문자쓰기
        //char[] data = "야옹이는 귀여움 멍멍이도 귀여움".toCharArray(); // (toCharArray()는 문자열을 문자로 이루어진 문자열로 바꿈)
        String data1 = "멍멍 냥냥";
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]);
//        }
//        writer.write(data); // (for 문 불필요)
        writer.write(data1);
        writer.flush(); // write() 이후에 버퍼를 비움
        writer.close(); // 스트림의 자원을 반납하고 닫음
    } // (문자이기 때문에 내부가 읽히는데 (byte 는 안보임?))
}
