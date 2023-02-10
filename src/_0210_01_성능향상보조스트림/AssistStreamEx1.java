package _0210_01_성능향상보조스트림;
import java.io.*;

public class AssistStreamEx1 {
    public static void main(String[] args) throws IOException {
        // 성능 향상을 하는것과 안하는것이 얼마나 차이나는지 확인
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;  // 입력에 대한 보조 스트림
        BufferedOutputStream bos = null; // 출력에 대한 보조 스트림

        int data = -1;  // 더 이상 읽을 데이터가 없음을 의미함. (데이터관련해서 읽을것 유무의 기본값은 주로 -1)
        long start = 0; // 경과 시간 계산을 위한 변수
        long end = 0;   // 경과 시간 계산을 위한 변수

        fis = new FileInputStream("src/_0210_01_성능향상보조스트림/studybear_0210.png");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("clone_studybear.png");
        // (읽을때는 버퍼를 통해서 읽고 fos 할때는 버퍼 X, 버퍼의 존재 유무에 따른 성능차이 비교)
        start = System.currentTimeMillis(); // 1970년 1월 1일 0시 0분 0초 부터 현재까지 경과 시간을 밀리초로 표시
        while ((data=bis.read()) != -1) { // (while 문은 실제 write 하는데 걸리는 시간)
            fos.write(data); // (계속 한바이트 씩 읽어내는 것)
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.print("버퍼 사용을 하지 않은 경우에 대한 시간 :  " + (end - start) + "ms\n");


//        fis = new FileInputStream("src/_0210_01_성능향상보조스트림/studybear_0210.png");
//        bis = new BufferedInputStream(fis);
//        fos = new FileOutputStream("clone_studybear.png");
//        bos = new BufferedOutputStream(fos);
//        start = System.currentTimeMillis();
//        while ((data=bis.read()) != -1) {
//            bos.write(data);
//        }
//        bos.flush();
//        end = System.currentTimeMillis();
//        bos.close();
//        fos.close();
//        bis.close();
//        fis.close();
//        System.out.print("버퍼 사용을 하는 경우에 대한 시간 :  " + (end - start) + "ms");
    }
}
