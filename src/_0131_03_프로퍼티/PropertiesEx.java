package _0131_03_프로퍼티;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;
// 키와 값이 모두 String 타입으로 제한된 Map 컬렉션이며, HashTable 에서 상속 받았습니다.
// 주로 문자열로 이루어진 파일에서 정보를 읽을 때 사용 합니다.
public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties(); // HashTable 에서 상속 받음
        String path = PropertiesEx.class.getResource("../database.properties").getPath(); // 불러올 파일이어디에 있는지. 현재 클래스(PropertiesEx)기준으로 어디에 있는지 알려줌.
//        String path = PropertiesEx.class.getResource("../회원정보종합예제/database.properties").getPath();  // database 파일이 '회원정보종합예제' 있을 경우

        // .getPath() -> 상대경로 (현재 나의 위치가 기준점)
        // ../ -> 상위 디렉토리로 이동
        // ./ -> 현재 위치
        path = URLDecoder.decode(path, "utf-8"); // 한글이 포함되는 이름 해석 위한 코드
        // path 가 한글인경우, 경로를 이해 할 수 없으니까 utf-8로 해석해서 path 를 가져오겠다는 뜻
        properties.load(new FileReader(path)); // 안될경우(?) IOException 으로 처리
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive    : " + driver);
        System.out.println("url      : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
