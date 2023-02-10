//package _0209_입출력실습;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.*;
//
//public class IOPractice {
//    public static void main(String[] args) {
//        FileInputStream readTxt = null;
//        try {
//            readTxt = new FileInputStream("students.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        TreeSet<StudentInfo> ts = new TreeSet<>();
//        Scanner sc = new Scanner(readTxt);
//        String[] indArr = new String[4];
//        int[] num = new int[3];
//        while (sc.hasNextLine()) { // (다음에 읽을 라인이있으면 들어가구, 없으면 X)
//            String line = sc.nextLine();
//            indArr = line.split(" ");
//            num = Arrays.stream(indArr, 1, 4).mapToInt(Integer::parseInt).toArray();
//        }ts.add(new StudentInfo(indArr[0], num[0], num[1], num[2]));
//        System.out.print(ts.toArray());
//    }
//        }
//
//
//
//
//    class StudentInfo implements Comparable {
//        String name;
//        int eng;
//        int kor;
//        int math;
//
//        public StudentInfo(String name, int eng, int kor, int math) {
//            this.name = name;
//            this.eng = eng;
//            this.kor = kor;
//            this.math = math;
//        }
//
//        @Override
//        public int compareTo(Object o) {
//
//            return 0;
//        }
//    }
//
//// ts.add(new ㅋㄹ래스)생성자)
///*
//텍스트 파일에 쓰는거부터 시작할 수도 있긴한데... 미리텍스트 파일 만들어놓기 10ㅁ8ㅇ TreeSet 과 Scanner 사용?
//이름 국어 영어 수학
//스캐너사용 넥스트 라인으로 읽음. 문자열을 split 사용해서 공백기준으로 쪼갬 . 안유진 99 78 45 문자열 하나가 4개의 문자열로 나눠서 ㅂ열에 넣거나 객체에 바로 담거나 ~
//그럼 0번인 안유진은 두고 parseToString? 을 사용해서 문자를 정수로 바꿈
//
//객체를 만들어두고 거기다가 담음. 그다음에 성적순으로 sorting?
//
//해당 파일을 읽어 총점을 구ㅏ고 총점이 높은 사람 순으로 이름과 총점 보여주기
//// TreeSet<String> strTreeSet = new TreeSet<>();
//        // List<String> strList = new ArrayList<>();
// //            for(int i = 0; i < strArr.length; i++) {
////                 String[] line = new String[]{(Arrays.toString(strArr[i].split(" ")))};
////                }
//                // strTreeSet.add(Arrays.toString(strArr[i].split(" ")));
//               // strList.add(Arrays.toString(strArr[i].split(" ")));
//            } //System.out.println(strList);
//            //System.out.println(strTreeSet);
//            // System.out.println(Arrays.toString(strArr));
//            // System.out.println(strArr[0]); // (문자열)
//            System.out.println(indArr[0]); // 문자열 배열
//
//*/