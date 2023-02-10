package _0210_03_객체직렬화예제1번;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// (직렬화 => 메모리에 바이트 단위로 공백 없이 붙이는것)
// (직렬화의 단점 => Java 끼리만 사용 가능, 프엔하고 사용하려면 JSON 사용 해야 함)
// 직렬화란? 프로그램에서 사용되는 객체를 파일이나 네트워크로 전송하기 위해서 연속적인 바이트 형태로 변경하는 것
public class SerialStreamEx1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeList();
        List<Board> list = readList(); // (만들어진 테이터를 역으로 뽑아낼 때 쓰는 패턴, 중요! 기억하기!) (원래 있는 객체를 넘겨받는것 뿐이라서 new 연산자 필요 X)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Board e : list) {
            System.out.println("번호 : " + e.getNumber());
            System.out.println("제목 : " + e.getTitle());
            System.out.println("내용 : " + e.getContent());
            System.out.println("연출 : " + e.getWriter());
            System.out.println("시간 : " + sdf.format(e.getDate()));
            System.out.println("---------------------------------");
            // (new Date()가 getDate() 의 return 값으로 시간을 가지고 와서 sdf. 포맷을 찍어준것)
        }

    }
    static void writeList() throws IOException {
        List<Board> list = new ArrayList<>(); // (Board 클래스 타입의 List 생성, 크기는 정해지지 않은 상태)
        list.add(new Board(1, "일타스캔들", "로맨틱 코미디", "유제원", new Date())); // (현재시간을 가져오는 법)
        list.add(new Board(2, "대행사", "오피스 드라마", "이창민", new Date()));
        list.add(new Board(3, "재벌집 막내아들", "경제 드라마", "정대윤", new Date()));
        // (board 라는 객체들이 list 에 저장된 상태)
        // (이제 파일에 저장하기)
        FileOutputStream fos = new FileOutputStream("board.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list); // 객체 출력 스트림을 이용해 list 를 출력 (list 가 board.bin 에 쓰여짐)
        oos.flush(); // write 이후에는 반드시 flush
        oos.close();
    }
    static List<Board> readList() throws IOException, ClassNotFoundException { // (리턴타입을 List 로 받아야 하는 경우가 앞으로 많음. readList()의(?) 내부에서 결과를 받아서 List 를 만드는 것)
        FileInputStream fis = new FileInputStream("board.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // 파일의 바이너리를 역직렬화
        List<Board> list = (List<Board>) ois.readObject(); // (ArrayList 등 새로 생성하는거 안하고 읽어온 값을 바로 대입하기)
        // (List<Board> list = ois.readObject(); => List 타입을 원하는데 지금 넘어온건 Object type 이라서 형변환을 한번에 해줄 수 있음, 인텔리제이가 타입캐스팅)
        return list;
    }
}

/*
flush() 시험에 나올 예쩡!
 */