package _0208_06_스트림예제04;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
// 파일로부터 스트림 얻기
public class StreamEx4 {
    public static void main(String[] args) throws IOException {
        System.out.println(" * 파일로부터 스트림 얻기 * ");
        Path path = Paths.get("src/_0208_06_스트림예제04/chicken.txt");
        Stream<String> stream = Files.lines(path, Charset.defaultCharset()); // (파일을 라인단위로 읽어서 스트림으로 만들기)
        stream.forEach(System.out::println);
        System.out.println();


    }
}
