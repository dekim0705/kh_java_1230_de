//package _0131_07_HashSet응용;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.Scanner;
//
//// 문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램 작성
//// 1. 길이가 짧은 것 부터
//// 2. 길이가 같으면 사전 순위로
//// 3. 중복제거
//// 입력 : 13(개의 단어) but i wont hesitate no more no more it cannot wait im yours
//// 출력 : i am it no but more wait wont yours cannot hesitate
//public class HashSetApplyEx {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HashSet<Word> strHashSet = new HashSet<>();
//        String str;
//        while (true) {
//            str = sc.next();
//            strHashSet.add(new Word(str));
//            if (strHashSet.size() == 13) break;
//        } // for(String e : strHashSet) System.out.print(e + " "); // (배열로 만들어졌는지 확인)
//
//
//
//        @Override
//        public String hashCode() {
//            return
//        }
//        Arrays.sort(strHashSet, new Comparator<HashSet>() {
//            @Override
//            public int compare(HashSet o1, HashSet o2) {
//                if(o1.size() > o2.size()) return 1;
//                else {
//                    if(o1.size() == o2.size()) {
//                        return o1.equals(o2)
//                    }
//                }
//                return 0;
//            }
//        }
//    }
//}
//
//class Word {
//    String str;
//
//    public Word(String str) {
//        this.str = str;
//    }
//
//}
