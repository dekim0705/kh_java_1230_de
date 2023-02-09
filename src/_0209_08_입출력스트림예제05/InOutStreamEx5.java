package _0209_08_입출력스트림예제05;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// (jpg - 손실압축. png - 알파값(투명도)적용. gif - 움짤. 나머지 이미지들은 비트이미지인데 벡터이미지는 곡률계산이라 확대해도 픽셀 깨짐 X)
public class InOutStreamEx5 {
    public static void main(String[] args) throws IOException {
        String originalFileName = "src/_0209_08_입출력스트림예제05/study_0209.png";
        String targetFileName = "d:/clone_0209.png"; // ("C:\\"  = "C:/" 가능...이 아님 권한때문인가봄... d:/ 는 가능! )

        // 파일 복사
        FileInputStream fis = new FileInputStream(originalFileName); // (파일에서 읽어들임)
        FileOutputStream fos = new FileOutputStream(targetFileName); // (

        int readByteNo;
        int cnt = 0;
        byte[] buffer = new byte[100];
        while ((readByteNo = fis.read(buffer)) != -1) { // fis 에서 100 바이트 만큼 읽어들이고 -1이 되면 멈춤(?))
            fos.write(buffer,0, readByteNo); // (butter 의 맨 앞(0) 에서부터 얼마만큼 읽을건지 -> full)
            cnt++;
        }
        fos.flush();
        fos.close();
        fis.close();
        System.out.println("복사 완료, 버퍼 읽기 횟수 : " + cnt);
    }
}
