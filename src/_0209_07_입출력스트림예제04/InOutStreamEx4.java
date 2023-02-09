package _0209_07_입출력스트림예제04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// Reader 는 문자 스트림의 최상위 추상 클래스 입니다.
public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
        int readNo;
        char[] cBuf = new char[256];
        String data = " ";
        while (true) {
            readNo = reader.read(cBuf); // (256문자를 한번에 들여와서 읽음)
            if(readNo == -1) break;
            data += new String(cBuf, 0, readNo); // (0부터 길이만큼의 문자열을 이어 붙입)
        }
        System.out.println(data);
        reader.close();
    }
}

/*
        Reader reader = new FileReader("test.txt");
        int readData;
        while (true) {
            readData = reader.read(); // 한 개의 문자(2byte(캐릭터니까))를 읽어서 4byte int 타입으로 반환 ( 그래서 받을때 int 로 받아야 함 - int readData;)
            if(readData == -1) break;
            System.out.print((char)readData); // (문자를 int 로 읽었기 때문에 다시 char 로 형변환 해줘야 함)
        }
        reader.close();
 */